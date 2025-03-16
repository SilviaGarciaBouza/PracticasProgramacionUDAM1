/*
Realiza un programa que poida al ususario una frase e imprima por pantalla la frase invertida 
haciendo uso de una funcion. Evita el uso de arrays y del metodo reverse().
a- se define la funcion invertirFraseq toma una cadena como entrada y utiliza un bucle para 
construir una nueva cadenacon los caracteres invertidos.
b- la funcion se llama correctamente.
c-la salida es correcta.

 */
package com.examen1;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cadenaOriginal;
        System.out.println("Escribe una cadena de caracteres: ");
        cadenaOriginal= teclado.nextLine();
        System.out.println(invertirFrase(cadenaOriginal));

    }

    static public String invertirFrase(String cadenaOriginal) {
        StringBuilder cadenaNueva = new StringBuilder();
        for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
            cadenaNueva.append(cadenaOriginal.charAt(i));
        }
        return cadenaNueva.toString();
    }

}
