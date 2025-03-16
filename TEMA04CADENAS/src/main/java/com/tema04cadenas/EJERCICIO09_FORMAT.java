/*
Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con
el método System.out.printf.
Hola, me llamo Pepe Pérez López y tengo 20 años
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO09_FORMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCompleto;
        String resultado;
        int edad;
        
        System.out.println("Introduce tu nombre completo: ");
        nombreCompleto= teclado.nextLine();
        System.out.println("Introduce tu edad: ");
        edad= Integer.parseInt(teclado.nextLine());
        // System.out.printf.
        System.out.printf("Hola, me llamo %s y tengo %d años", nombreCompleto, edad);
        System.out.println("");
        //Format
        resultado= String.format("Hola, me llamo %s y tengo %d años", nombreCompleto, edad);
        System.out.println(resultado);
    }
    
}
