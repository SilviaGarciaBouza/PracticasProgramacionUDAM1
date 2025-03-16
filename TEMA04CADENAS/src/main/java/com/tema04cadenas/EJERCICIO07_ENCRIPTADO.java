/*
Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a
lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa
a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números,
espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas. 
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO07_ENCRIPTADO {

    /**
     * A por F, las B por X, las C por M
     */
    public static void main(String[] args) {
        // Todo lo que no sea mayusculas queda intacto
        Scanner teclado = new Scanner(System.in);
        String cadena;
        String cadenaEncriptada;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena= teclado.nextLine();
        cadenaEncriptada= cadena.replaceAll("A", "F").replaceAll("B", "X").replaceAll("C", "M");
        System.out.println(cadenaEncriptada);
        
       //Sin importalr mayusculas:
       
         String cadena2;
        String cadenaEncriptada2;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena2= teclado.nextLine();
        cadenaEncriptada2= cadena2.replaceAll("A", "F").replaceAll("B", "X").replaceAll("C", "M").replaceAll("a", "f").replaceAll("b", "x").replaceAll("c", "m");
        System.out.println(cadenaEncriptada2);
        
        //convirtiendo en mayusculas 
        
        String cadena3;
        String cadenaEncriptada3;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena3= teclado.nextLine();
        cadenaEncriptada3= cadena3.toUpperCase().replaceAll("A", "F").replaceAll("B", "X").replaceAll("C", "M");
        System.out.println(cadenaEncriptada3);
    }
    
}
