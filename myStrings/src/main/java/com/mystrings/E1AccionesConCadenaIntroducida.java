/*
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
i. HEXADECIMAL Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
la A a F.
j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
k. Decir si la primera posición de la cadena es igual a la última.
l. Decir cuántos dígitos numéricos hay en la cadena. 
m. PALINDROMOSDecir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
 */
package com.mystrings;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E1AccionesConCadenaIntroducida {

    public static void main(String[] args) {

        String cadenaIntroducida;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        cadenaIntroducida = teclado.nextLine();
        // a1. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas
        System.out.println(cadenaIntroducida.toUpperCase());
        //a2. Mostrar por pantalla el contenido de la cadena pasada a minúsculas.
        System.out.println(cadenaIntroducida.toLowerCase());
        //b. Decir si en la cadena aparece el carácter ‘x’.
        System.out.println(cadenaIntroducida.contains("x"));
        //c. Decir si la cadena tiene más de 10 posiciones.
        System.out.println(cadenaIntroducida.length() > 10);
        //d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        if (cadenaIntroducida.indexOf("x", 4) != -1) {
            System.out.println("La cadena contiene el carácter ‘x’ a partir de la cuarta posición");

        } else {
            System.out.println("La cadena no contiene el carácter ‘x’ a partir de la cuarta posición");

        }
        //e. Crear una cadena formada por las 5 primeras posiciones de la cadena.
        if (cadenaIntroducida.length() >= 5) {
            System.out.println(cadenaIntroducida.substring(0, 5));
        } else {
            System.out.println("La cadena no contiene 5 caracteres");
        }
        //f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
        if (cadenaIntroducida.length() >= 5) {
            System.out.println(cadenaIntroducida.substring(cadenaIntroducida.length() - 5));
        } else {
            System.out.println("La cadena no contiene 5 caracteres");
        }

        //g. Decir si la cadena es igual a la cadena “hola”.
        System.out.println(cadenaIntroducida.equals("hola"));
        //h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
        boolean esEntero = true;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (Character.isDigit(cadenaIntroducida.charAt(i)) == false) {
                esEntero = false;
                break;
            }
        }
        if (esEntero == true) {
            System.out.println(Integer.parseInt(cadenaIntroducida));
        } else {
            System.out.println("La cadena no es un numero");
        }

        //i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
        //la A a F.
        boolean esHexadecimal = true;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (Character.isDigit(cadenaIntroducida.charAt(i)) == false
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'A'
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'B'
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'C'
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'D'
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'E'
                    && cadenaIntroducida.toUpperCase().charAt(i) != 'F') {

                esHexadecimal = false;
                break;
            }
        }
        if (esHexadecimal == true) {
            System.out.println(Integer.parseInt(cadenaIntroducida.toUpperCase(), 16));

        } else {
            System.out.println("La cadena no es un numero hexagesimal");
        }

        //j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
        System.out.println(cadenaIntroducida.replace("prueva", "prueba"));

        //k. Decir si la primera posición de la cadena es igual a la última.
        System.out.println(cadenaIntroducida.charAt(0) == cadenaIntroducida.charAt(cadenaIntroducida.length() - 1));
        //COn compare:
        if (Integer.compare(cadenaIntroducida.charAt(0), cadenaIntroducida.charAt(cadenaIntroducida.length() - 1)) == 0) {
            System.out.println("El primer y ultimo caracter son iguales");
        } else {
            System.out.println("El primer y ultimo caracter NO son iguales");

        }
        //l. Decir cuántos dígitos numéricos hay en la cadena. 
        int contadorCaracteresNumericos = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (Character.getType(cadenaIntroducida.charAt(i)) == 9) {
                contadorCaracteresNumericos++;
            }
        }
        System.out.println(contadorCaracteresNumericos);
        //m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
        boolean esPalindromo = true;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {

            if (cadenaIntroducida.charAt(i) != cadenaIntroducida.charAt(cadenaIntroducida.length() - 1 - i)) {
                esPalindromo = false;
                break;

            }
        }
        if (esPalindromo == false) {
            System.out.println("No son palindromos");
        } else {
            System.out.println("Son palindromos");
        }

        //n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
        //intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
        System.out.println(cadenaIntroducida.charAt(cadenaIntroducida.length() - 1) + cadenaIntroducida.substring(1, cadenaIntroducida.length() - 2) + cadenaIntroducida.charAt(0));

    }

}
