/*
13.2. Haz un programa que solicite al usuario dos números double y los intente sumar. En caso de
que se introduzcan valores que no son enteros, por ejemplo, textos no numéricos, no provocará un
error en tiempo de ejecución, simplemente informará de que se ha producido un error y no mostrará
el resultado de la suma. 
 */
package com.tema12;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, resultado=0;
        try {
        System.out.println("Vamos a hacer una suma:");
        System.out.println("Escribe un numero con decimales: ");
        numero1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe un segundo numero con decimales: ");
        numero2 = Double.parseDouble(teclado.nextLine());
        
            resultado = numero1 + numero2;
        } catch (NumberFormatException ex) {
            System.out.println("Se ha producido un error y no se ha realizado la suma");
        } finally {
            System.out.println("Fin de la operacion");
        }
    }
    
}
