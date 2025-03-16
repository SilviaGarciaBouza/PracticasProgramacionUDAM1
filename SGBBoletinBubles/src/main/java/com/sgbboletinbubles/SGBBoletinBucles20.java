/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:  Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles20 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hight;
        char myChar;
        do {
            System.out.println("Introduce la altura: ");
            hight = Integer.parseInt(keyboard.nextLine());
            if (hight <= 0) {
                System.out.println("Numero incorrecto. El numero introducido debe ser positivoú");
            }
        } while (hight <= 0);
        System.out.println("Introduce un caracter: ");
        myChar = keyboard.nextLine().charAt(0);
        // piramide hueca
        int altura = 1;
        int espaciosPorDelante = hight - 1;
        int espaciosInternos = 0;

        while (altura < hight) {

            // inserta espacios delante
            for (int i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print(myChar);
            for (int i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }

            if (altura > 1) {
                System.out.print(myChar);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////

        // base de la pirámide
        for (int i = 1; i < altura * 2; i++) {
            System.out.print(myChar);
        }
    }
}
