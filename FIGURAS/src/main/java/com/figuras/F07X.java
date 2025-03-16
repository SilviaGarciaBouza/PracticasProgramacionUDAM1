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
public class F07X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroAltura;
        Scanner teclado = new Scanner(System.in);
        char caracter;

        System.out.println("Escribe un numero para la altura: ");
        numeroAltura = Integer.parseInt(teclado.nextLine());
        System.out.println("Imprime un caracter: ");
        caracter = teclado.nextLine().charAt(0);

        for (int i = 1; i <= numeroAltura; i++) {
            System.out.println(" ");
            for (int j = 1; j <= numeroAltura; j++) {
                if (j == i) {
                    System.out.print(caracter);

                } else if (j == numeroAltura - i + 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }

        }

    }
}
