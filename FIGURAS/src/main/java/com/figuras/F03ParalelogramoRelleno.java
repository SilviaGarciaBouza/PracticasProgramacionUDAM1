/*
Paralelogramo Relleno
 */
package com.figuras;
import java.util.Scanner;
/**
 *
 * @author silvia
 */
public class F03ParalelogramoRelleno {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ancho;
        int altura;
        char caracter;

        // Solicitar al usuario el ancho del paralelogramo
        System.out.print("Ingrese el ancho del paralelogramo: ");
        ancho = teclado.nextInt();

        // Solicitar al usuario la altura del paralelogramo
        System.out.print("Ingrese la altura del paralelogramo: ");
        altura = teclado.nextInt();

        // Solicitar al usuario el carácter para dibujar el paralelogramo
        System.out.print("Ingrese el carácter para dibujar el paralelogramo: ");
         caracter = teclado.next().charAt(0);

        // Dibujar el paralelogramo
        for (int i = 0; i < altura; i++) {
            // Imprimir espacios en blanco según la fila
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Imprimir el carácter según el ancho
            for (int k = 0; k < ancho; k++) {
                System.out.print(caracter);
            }

            System.out.println();
        }

    }
}