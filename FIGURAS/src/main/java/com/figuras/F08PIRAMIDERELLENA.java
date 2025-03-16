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
public class F08PIRAMIDERELLENA {

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
        //media piramide
        System.out.println("Introduce un caracter: ");
        myChar = keyboard.nextLine().charAt(0);
        for (int i = 1; i <= hight; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(myChar);
            }
        }
        System.out.println("");
        //piramide entera:
      System.out.println();
        for(int i = 1; i<=hight; i++){
            //Espacios en blanco
            for(int j = 1; j<=hight-i; j++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}