/*
Triangulo Rectangulo Relleno String
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F02bTrianguloRectanguloRellenoString {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        int alto;
//        int ancho;
        String relleno;
//          // Solicitar al usuario la ancho
//        System.out.print("Ingrese un número entero para el ancho del triangulo: ");
//         ancho = Integer.parseInt(teclado.nextLine());
//
//        // Solicitar al usuario el ancho
//        System.out.print("Ingrese un número entero para el alto del triangulo: ");
//         alto = Integer.parseInt(teclado.nextLine());
         
         // Solicitar al usuario la string 
        System.out.print("Ingrese la string del  triangulo: ");
         relleno = teclado.nextLine();
        
        
        int total = relleno.length();
        for (int i = total - 1; i >= 0; i--)
        {
            System.out.println(relleno.substring(i, total));
        }

    }
    
}
