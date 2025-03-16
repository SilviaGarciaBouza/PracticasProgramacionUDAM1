/*
 . Vamos a crear un programa en Java que, a partir de una frase, realice con ella las siguientes
operaciones:
a) Muestre en pantalla la frase original.
b) Elimine los espacios en blanco que contenga al principio y al final de la frase. Mostrará la frase
así convertida.
c) Calcule y muestre el número de letras que contiene dicha frase.
d) Muestre la frase después de invertir todas las letras, es decir, la primera letra en la frase original
será la última en la frase resultado.
e) Escriba cada una de las palabras de la frase de forma separada.
f) Cuente el número de palabras de la frase.
g) Indique la posición de la primera y última vocal en la frase.
h) Indique si la primera letra de la frase es mayúscula o minúscula.
i) Escriba la frase con todas las letras en mayúscula.
j) Escriba la frase con todas las letras en minúscula.
k) Devuelva la cadena como un vector de letras y muestre ese vector.



Para hacer esto, crea una clase llamada Frase con los siguientes atributos y métodos:
Atributo
● cadena: Contendrá un String. Será private
Métodos
● Constructor Frase: inicializa el atributo cadena con el argumento que recibe.
● obtenerFrase(): devuelve el atrituto cadena.
● eliminarBlancos(): eliminará los espacios en blanco al principio y al final de la frase contenida en el
atributo cadena.
● contarLetras(): devuelve el número de letras de la frase contenida en el atributo cadena. Se
entiende por letras cualquier carácter diferente del espacio en blanco, la coma, el punto, el punto y
coma y los 2 puntos.
● invertirFrase(): devuelve un StringBuffer con la cadena invertida.
● contarPalabras(): devuelve el número de palabras de la cadena.
● separarPalabras(): devuelve un array de String conteniendo las palabras de la cadena separadas.
● primeraVocal(): devuelve la primera posición de una vocal en la frase
● ultimaVocal(): devuelve la ultima posición de una vocal en la frase.
● comprobarMayuscula(): devuelve true si la primera letra es mayúscula y false si no lo es.
● convertirMayuscula(): devuelve un StringBuffer con la cadena en mayúscula.
● convertirMinuscula(): devuelve un StringBuffer con la cadena en minúscula.
● vectorizar():devuelve la cadena como un vector de letras (array de char).
Para probar el funcionamiento de la clase, crea otra llamada TestFrase que contenga el método main y
que haga las operaciones relacionadas al comienzo creando para ello un objeto de la clase Frase y usando
los métodos anteriores.
En la siguiente captura se puede ver un ejemplo de ejecución del programa para la frase
" Como me gusta programar en Java ":
 */
package com.clases1.FRASE;

/**
 *
 * @author silvia
 */
public class Frase {

    private String cadena;

    public Frase(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public String eliminarBlacos() {
        StringBuilder cadenasinespacios = new StringBuilder();
        int contadorEspaciosantes = 0;
        int contadorEspaciosFinal = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            if (this.cadena.charAt(i) == ' ') {
                //cadenasinespacios.append(this.cadena.charAt(i));
                contadorEspaciosantes++;
            } else {
                break;
            }
        }
        for (int i = this.cadena.length() - 1; i >= 0; i--) {
            if (this.cadena.charAt(i) == ' ') {
                contadorEspaciosFinal++;
            } else {
                break;
            }
        }

        cadenasinespacios.append(this.cadena.substring(contadorEspaciosantes, this.cadena.length() - contadorEspaciosFinal));

        return cadenasinespacios.toString();
    }

    public int contarLetras() {
        int numeroLetras = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            if (this.cadena.charAt(i) == ' ' || this.cadena.charAt(i) == ',' || this.cadena.charAt(i) == '.' || this.cadena.charAt(i) == ';' || this.cadena.charAt(i) == ':') {

            } else {
                numeroLetras++;
            }
        }

        return numeroLetras;
    }

    // invertirFrase(): devuelve un StringBuffer con la cadena invertida.
    public StringBuffer invertirFrase() {
        StringBuffer cadenaInvertida = new StringBuffer();
        cadenaInvertida.append(this.cadena);
        cadenaInvertida.reverse();
        return cadenaInvertida;
    }

    public int contarPalabras() {
        int numeroPalabras = 0;
        int numeroBlancos = 0;

        for (int i = 0; i < eliminarBlacos().length(); i++) {
            if (eliminarBlacos().charAt(i) == ' ') {
                numeroBlancos++;
            }
        }
        numeroPalabras = numeroBlancos + 1;
        return numeroPalabras;
    }

    //● separarPalabras(): devuelve un array de String conteniendo las palabras de la cadena separadas.
    public String[] separarPalabras() {
        String[] palabras;
        palabras = new String[contarPalabras()];
        palabras = eliminarBlacos().split(" ");

        return palabras;
    }

//● primeraVocal(): devuelve la primera posición de una vocal en la frase
    public int primeraVocal() {
        int posicion = -1;
        String cadenaMAyuString = this.cadena.toUpperCase();

        for (int i = 0; i < cadenaMAyuString.length(); i++) {
            if (cadenaMAyuString.charAt(i) == 'A' || cadenaMAyuString.charAt(i) == 'E' || cadenaMAyuString.charAt(i) == 'I' || cadenaMAyuString.charAt(i) == 'O' || cadenaMAyuString.charAt(i) == 'U') {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

//● ultimaVocal(): devuelve la ultima posición de una vocal en la frase.
    public int ultimaPosicion() {
        String cadenaMAy = this.cadena.toUpperCase();
        int posicion = -1;
        for (int i = cadenaMAy.length()-1; i >=0; i--) {
            if (cadenaMAy.charAt(i) == 'A' || cadenaMAy.charAt(i) == 'E' || cadenaMAy.charAt(i) == 'I' || cadenaMAy.charAt(i) == 'O' || cadenaMAy.charAt(i) == 'U') {
                posicion=i;
                break;
            }

            }
        return posicion;
        }
//● comprobarMayuscula(): devuelve true si la primera letra es mayúscula y false si no lo es.
   public boolean comprobarMayuscula(){
       if(Character.isUpperCase(eliminarBlacos().charAt(0))){
           return true;
       }else{
           return false;
       }
   }
//● convertirMayuscula(): devuelve un StringBuffer con la cadena en mayúscula.
   public StringBuffer convertirMayusculas(){
       StringBuffer cadenaMay= new StringBuffer();
       cadenaMay.append(this.cadena.toUpperCase());
       return cadenaMay;
   }
//● convertirMinuscula(): devuelve un StringBuffer con la cadena en minúscula.
    public StringBuffer convertirMinusculas(){
       StringBuffer cadenaMay= new StringBuffer();
       cadenaMay.append(this.cadena.toLowerCase());
       return cadenaMay;
   }
//● vectorizar():devuelve la cadena como un vector de letras (array de char).
    public char[] vectorizar(){
        char[] cadenaChr;
        int sinEspacios=0;
         for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==' '){
            sinEspacios++;
            }
        }
        int contador=0;
        cadenaChr= new char[cadena.length()-sinEspacios];
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)!=' '){
            cadenaChr[contador]= cadena.charAt(i);
            contador++;
            }
            
        }
        return cadenaChr;
    }
   
    

    }
