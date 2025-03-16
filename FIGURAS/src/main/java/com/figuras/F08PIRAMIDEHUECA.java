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
public class F08PIRAMIDEHUECA {
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