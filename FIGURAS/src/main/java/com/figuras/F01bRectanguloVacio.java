/*
Rectangulo vacio
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F01bRectanguloVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner teclado = new Scanner(System.in);
        int alto;
        int ancho;
        char trazo;

        // Solicitar al usuario el tamaño del lado del rectangulo
        System.out.print("Ingrese un número entero para el alto del rectangulo: ");
         ancho = Integer.parseInt(teclado.nextLine());

        // Solicitar al usuario el ancho total del rectangulo
        System.out.print("Ingrese un número entero para el ancho del rectangulo: ");
         alto = Integer.parseInt(teclado.nextLine());
         
          // Solicitar al usuario el simbolo para el relleno
        System.out.print("Ingrese un simbolo  para el arelleno del rectangulo: ");
         trazo = teclado.nextLine().charAt(0);
        
         // Dibujar el cuadrado hueco
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (i == 1 || i == alto || j == 1 || j == ancho) {
                    System.out.print(trazo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
