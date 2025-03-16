/*
Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una
cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO10_CADENACONINICIODE10CADENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        StringBuilder cadenaCompleta= new StringBuilder();
        
        System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
         System.out.println("Escribe una cadena: ");
        cadenaCompleta.append(teclado.nextLine().charAt(0));
        System.out.println(cadenaCompleta);
    }
    
}
