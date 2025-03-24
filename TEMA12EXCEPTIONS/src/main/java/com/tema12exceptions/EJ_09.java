/*
Modificar la clase MasterMindExcep entregada por el profesor, para que si el número
ingresado por el usuario (cada intento) no cumple alguno de los requisitos, genere una excepción.
Habrá una excepción “Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si tiene
caracteres no numéricos y una tercera excepción “Valores repetidos” si contiene algún dígito
repetido.
Crea un programa copiándolo del entregado por el profesor: MasterMindExcepMain, que hace uso
de esta clase, y provoca las excepciones propuestas para ver su funcionamiento. A continuación,
modifícalo para que capture estas excepciones sin producir una salida abrupta del programa.
 */
package com.tema12exceptions;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        String cadenaIntroducida="0000";

        do {
            System.out.println("Indica la lomngitud de la cadena: ");
            longitud = Integer.parseInt(teclado.nextLine());
        } while (longitud <= 0 || longitud > 10);

        MasterMindException mastermind = new MasterMindException(longitud, cadenaIntroducida);
        for (int i = 1; i <= 10; i++) {

            do {
                System.out.println("Introduce una cadena de digitos(con la longitud seleccionada), sin repetir");
                cadenaIntroducida = teclado.nextLine();
                if (cadenaIntroducida.length() != longitud) {
                    System.out.println("Intento no valido");
                }
            } while (cadenaIntroducida.length() != longitud);

            
            System.out.println(mastermind.getNumeroAleatorio());
            System.out.println(mastermind.getNumeroAciertosMismoLugar() + " aciertos en el lugar correcto y " + mastermind.getNumeroAciertosDiferenteLugar() + " aciertos en diferente lugar.");
        }
    }
    
}
