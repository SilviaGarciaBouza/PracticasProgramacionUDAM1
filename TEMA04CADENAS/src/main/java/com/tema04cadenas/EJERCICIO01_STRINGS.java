/*
Por defecto usar clase String. Se especificará cuando se deba usar la clase StringBuilder.
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:
a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
b. Decir si en la cadena aparece el carácter ‘x’.
c. Decir si la cadena tiene más de 10 posiciones.
d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
g. Decir si la cadena es igual a la cadena “hola”.
h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
la A a F.
j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
k. Decir si la primera posición de la cadena es igual a la última.
l. Decir cuántos dígitos numéricos hay en la cadena.  */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO01_STRINGS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida = teclado.nextLine();

        //a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
        System.out.println("Cadena en mayusculas: " + cadenaIntroducida.toUpperCase());
        System.out.println("Cadena en minusculas: " + cadenaIntroducida.toLowerCase());
        //b. Decir si en la cadena aparece el carácter ‘x’.
        if (cadenaIntroducida.indexOf('x') != -1) {
            System.out.println("La cadena si contiene el caracter 'x'");
        } else {
            System.out.println("La cadena no contiene el caracter 'x");
        }
        //c. Decir si la cadena tiene más de 10 posiciones.
        if (cadenaIntroducida.length() > 10) {
            System.out.println("La cadena contiene mas de 10 posiciones");
        } else if (cadenaIntroducida.length() == 10) {
            System.out.println("La cadena contiene exactamente 10 posiciones");
        } else {
            System.out.println("La cadena contiene menos de 10 posiciones");
        }
        //d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        if (cadenaIntroducida.indexOf('x', 3) != -1) {
            System.out.println("La cadena si contiene el caracter x a partir de la cuarta posicion");
        } else {
            System.out.println("La cadena no contiene el caracter 'x' a partir de la cuarta posicion");
        }
        //e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
        String nuevaCadena;
        if (cadenaIntroducida.length() >= 5) {
            nuevaCadena = cadenaIntroducida.substring(0, 5);
            //f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
            System.out.println(nuevaCadena);
            nuevaCadena = cadenaIntroducida.substring(cadenaIntroducida.length() - 5);
            System.out.println(nuevaCadena);
        }
        //g. Decir si la cadena es igual a la cadena “hola”.
        if (cadenaIntroducida.equals("hola")) {
            System.out.println("Son dos cadenas iguales");
        } else {
            System.out.println("No son dos cadenas iguales");
        }
        //h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
        boolean esNumero = true;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (Character.isDigit(cadenaIntroducida.charAt(i)) == false) {
                esNumero = false;
                break;
            }

        }
        if (esNumero == true) {
            int cadenaNumeros;
            cadenaNumeros = Integer.parseInt(cadenaIntroducida);
            System.out.println(cadenaNumeros);
        }
        //i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
        //la A a F.
        boolean eshexadecimal = true;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (Character.isDigit(cadenaIntroducida.charAt(i)) == false && cadenaIntroducida.toLowerCase().charAt(i) != 'a' && cadenaIntroducida.toLowerCase().charAt(i) != 'b' && cadenaIntroducida.toLowerCase().charAt(i) != 'c' && cadenaIntroducida.toLowerCase().charAt(i) != 'd' && cadenaIntroducida.toLowerCase().charAt(i) != 'e' && cadenaIntroducida.toLowerCase().charAt(i) != 'f') {
                eshexadecimal = false;
                break;
            }
        }
        if (eshexadecimal == true) {
            int numeroHexadecimalCadena = Integer.parseInt(cadenaIntroducida, 16);
            System.out.println(numeroHexadecimalCadena);
        }

        //j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
        
        String cadenaSustituida;
        cadenaSustituida= cadenaIntroducida.replace("prueva", "prueba");
        System.out.println(cadenaSustituida);
        //k. Decir si la primera posición de la cadena es igual a la última.
        if(cadenaIntroducida.charAt(0)==cadenaIntroducida.charAt(cadenaIntroducida.length()-1)){
            System.out.println("EL primer caracter y el ultimo son iguales");
        }else{
            System.out.println("EL primer y el ultimo caracter no son iguales");
        }
        
        //l. Decir cuántos dígitos numéricos hay en la cadena.
        int contadorNumerico=0;
        for(int i=0; i<cadenaIntroducida.length();i++){
            if(Character.isDigit(cadenaIntroducida.charAt(i))==true){
                contadorNumerico++;
            }
        }
        System.out.println("La cadena tiene "+contadorNumerico+" caracteres numericos");
    }
}
