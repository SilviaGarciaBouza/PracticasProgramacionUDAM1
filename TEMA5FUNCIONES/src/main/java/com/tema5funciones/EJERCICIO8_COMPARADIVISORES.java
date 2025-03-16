/*
Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál
de los dos tiene más divisores (usar función previa). 
 */
package com.tema5funciones;

import static com.tema5funciones.EJERCICIO6_CANTIDADDIVISORES.cantidadDivisores;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO8_COMPARADIVISORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero;
        int entero2;

        do {
            System.out.println("Introduce un numero positivo: ");
            entero = Integer.parseInt(teclado.nextLine());
        } while (entero <= 0);
        do {
            System.out.println("Introduce un numero positivo: ");
            entero2 = Integer.parseInt(teclado.nextLine());
        } while (entero <= 0);

        if (cantidadDivisores(entero) < cantidadDivisores(entero2)) {
            System.out.println("Tiene mas divisores el segundo numero introducido");
        } else if (cantidadDivisores(entero) < cantidadDivisores(entero2)) {
            System.out.println("Tiene mas divisores el primer numero introducido");

        }else{
            System.out.println("Tienen igual numero de divisores");
        }

    }
}