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
public class F05bCirculoRelleno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio;
        char simbolo;
        int centroX ;
        int centroY;

        System.out.print("Ingrese el radio del círculo:   ");
        radio = Integer.parseInt(teclado.nextLine());
          System.out.print("Ingrese el simbolo del círculo:   ");
        simbolo =teclado.nextLine().charAt(0);
  centroX = radio;
         centroY = radio;

        for (int y = 0; y < 2 * radio + 1; y++) {
            for (int x = 0; x < 2 * radio + 1; x++) {
                int distancia = (int) Math.sqrt((x - centroX) * (x - centroX) + (y - centroY) * (y - centroY));
                if (distancia <= radio) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
      

   