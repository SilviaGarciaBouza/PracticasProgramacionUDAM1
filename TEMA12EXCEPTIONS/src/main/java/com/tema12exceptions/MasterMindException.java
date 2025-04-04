/*
Modificar la clase MasterMindExcep entregada por el profesor, para que si el número
ingresado por el usuario (cada intento) no cumple alguno de los requisitos, genere una excepción.
Habrá una excepción “Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si tiene
caracteres no numéricos y una tercera excepción “Valores repetidos” si contiene algún dígito
repetido.
Crea un programa copiándolo del entregado por el profesor: MasterMindExcepMain, que hace uso
de esta clase, y provoca las excepciones propuestas para ver su funcionamiento. A continuación,
modifícalo para que capture estas excepciones sin producir una salida abrupta del programa.Modificar la clase MasterMindExcep entregada por el profesor, para que si el número
ingresado por el usuario (cada intento) no cumple alguno de los requisitos, genere una excepción.
Habrá una excepción “Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si tiene
caracteres no numéricos y una tercera excepción “Valores repetidos” si contiene algún dígito
repetido.
Crea un programa copiándolo del entregado por el profesor: MasterMindExcepMain, que hace uso
de esta clase, y provoca las excepciones propuestas para ver su funcionamiento. A continuación,
modifícalo para que capture estas excepciones sin producir una salida abrupta del programa.
 */
package com.tema12exceptions;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class MasterMindException {

    private int longitud;
    private String numeroAleatorio;
    // private String cadenaIntroducida;
    //  private int numeroAciertosMismoLugar;
    //  private int numeroAciertosDiferenteLugar;

    public MasterMindException(int longitud) {

        this.longitud = longitud;
        this.numeroAleatorio = numeroAleatorio(longitud);

        //this.numeroAciertosMismoLugar = aciertosMismoLugar(cadenaIntroducida, this.numeroAleatorio);
        //this.numeroAciertosDiferenteLugar = aciertosCualquierLugar(cadenaIntroducida, this.numeroAleatorio);
    }

    public String getNumeroAleatorio() {
        return numeroAleatorio;
    }

    static public String numeroAleatorio(int longitud) {
        StringBuilder cadena = new StringBuilder();
        StringBuilder numerosCadena = new StringBuilder("123456789");
        int numero;
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            numero = random.nextInt(0, numerosCadena.length());
            cadena.append(numerosCadena.toString().charAt(numero));
            numerosCadena.deleteCharAt(numero);
        }
        return cadena.toString();
    }
    

    public int aciertosMismoLugar(String cadenaIntroducida) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (this.numeroAleatorio.charAt(i) == cadenaIntroducida.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    public int aciertosCualquierLugar(String cadenaIntroducida) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {

            for (int j = 0; j < this.numeroAleatorio.length(); j++) {
                if (cadenaIntroducida.charAt(i) == this.numeroAleatorio.charAt(j)) {
                    contador++;
                    break;
                }
            }

        }
        return contador;
    }

    public int getLongitud() {
        return longitud;
    }
    
    

}

class TamañoIncorrectoException extends Exception {

    @Override
    public String getMessage() {
        return "Tamaño incorrecto";
    }

}

class ValoresInvalidosException extends Exception {

    @Override
    public String getMessage() {
        return "Valores invalidos";
    }

}

class ValoresRepetidosException extends Exception {

    @Override
    public String getMessage() {
        return "Valores repetidos";
    }

}


