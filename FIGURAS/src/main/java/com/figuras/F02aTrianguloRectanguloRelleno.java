/*
Triangulo Rectangulo Relleno
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F02aTrianguloRectanguloRelleno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alto;
        int ancho;
        char relleno;
          // Solicitar al usuario la ancho
        System.out.print("Ingrese un número entero para el ancho del triangulo: ");
         ancho = Integer.parseInt(teclado.nextLine());

        // Solicitar al usuario el ancho
        System.out.print("Ingrese un número entero para el alto del triangulo: ");
         alto = Integer.parseInt(teclado.nextLine());
         
          // Solicitar al usuario el simbolo para el relleno
        System.out.print("Ingrese un simbolo  para el arelleno del rectangulo: ");
         relleno = teclado.nextLine().charAt(0);
        
        
         for (int fila = 0; fila < alto; fila++)
        {
            for (int columna = 0; columna < ancho; columna++)
            {
                System.out.print(relleno);
            }
            
            System.out.println();
            ancho--;
        }
    }
    
}
