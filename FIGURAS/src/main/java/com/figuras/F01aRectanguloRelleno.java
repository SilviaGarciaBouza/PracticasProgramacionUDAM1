/*
Rectangulo relleno
 */

package com.figuras;

import java.util.Scanner;
/**
 *
 * @author silvia
 */
public class F01aRectanguloRelleno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int anchoTotal;
        char relleno;

        // Solicitar al usuario el tamaño del lado del rectangulo
        System.out.print("Ingrese un número entero para el tamaño del lado del rectangulo: ");
         lado = Integer.parseInt(teclado.nextLine());

        // Solicitar al usuario el ancho total del rectangulo
        System.out.print("Ingrese un número entero para el ancho total del rectangulo: ");
         anchoTotal = Integer.parseInt(teclado.nextLine());
         
          // Solicitar al usuario el simbolo para el relleno
        System.out.print("Ingrese un simbolo  para el arelleno del rectangulo: ");
         relleno = teclado.nextLine().charAt(0);

        // Dibujar el rectangulo proporcional
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < anchoTotal; j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }

        teclado.close();
    }
}
