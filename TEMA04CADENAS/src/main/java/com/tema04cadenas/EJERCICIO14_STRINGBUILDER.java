/*
4.14. Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a
StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
a. Borrar el carácter que haya en la posición 3.
b. Insertar una ‘x’ en la posición 5.
c. Sustituir el carácter de la posición 1 por una ‘z’.
d. Borrar los caracteres entre la posición 5 y 10.
e. Darles la vuelta a todos los caracteres del StringBuilder.
f. Convertir el StringBuilder en cadena.
Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de
la posición indicada, sino producirá errores. 

 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO14_STRINGBUILDER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        StringBuilder nuevaCadena = new StringBuilder();

        System.out.println("Introduce una cadena de caracteres: ");
        cadena = teclado.nextLine();
        nuevaCadena.append(cadena);
        //a. Borrar el carácter que haya en la posición 3.
        if (nuevaCadena.length() >= 4) {
            nuevaCadena.deleteCharAt(3);
            System.out.println(nuevaCadena);
        }
         //b. Insertar una ‘x’ en la posición 5.
         if (nuevaCadena.length() >= 6) {
            nuevaCadena.insert(5,'x');
             System.out.println(nuevaCadena);
        }
         //c. Sustituir el carácter de la posición 1 por una ‘z’.
          if (nuevaCadena.length() >= 2) {
            nuevaCadena.setCharAt(1, 'z');
             System.out.println(nuevaCadena);
        }
        //d. Borrar los caracteres entre la posición 5 y 10.
        
         if (nuevaCadena.length() >= 11) {
            nuevaCadena.delete(5, 10);
             System.out.println(nuevaCadena);
        }
        
        //e. Darles la vuelta a todos los caracteres del StringBuilder.
         nuevaCadena.reverse();
             System.out.println(nuevaCadena);
        
        //f. Convertir el StringBuilder en cadena.
        
         nuevaCadena.toString();
             System.out.println(nuevaCadena);
    }
   

}
