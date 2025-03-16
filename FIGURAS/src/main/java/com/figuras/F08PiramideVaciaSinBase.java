/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F08PiramideVaciaSinBase {

    /**
     * @param args the command line arguments
     */




 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la pirámide: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el ancho de la base de la pirámide: ");
        int base = scanner.nextInt();

        // Dibujamos la pirámide
        for (int i = 1; i <= filas; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos de los lados y espacios internos
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}