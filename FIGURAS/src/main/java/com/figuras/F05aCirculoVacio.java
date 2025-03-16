/*
circulo vacio
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F05aCirculoVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio;
        char simbolo;

        System.out.print("Ingrese el radio del círculo:   ");
        radio = Integer.parseInt(teclado.nextLine());
          System.out.print("Ingrese el simbolo del círculo:   ");
        simbolo =teclado.nextLine().charAt(0);

        for (int i = 0; i< 2 * radio + 1; i++) {
            for (int j = 0; j < 2 * radio + 1; j++) {
                // Ajustamos los índices para centrar el círculo
                int x = i - radio;
                int y = j - radio;

                // Calculamos la distancia al centro (0, 0)
                double distancia = Math.sqrt(x * x + y * y);

                // Si la distancia está dentro del rango del círculo, imprimir '*'
                if (distancia >= radio - 0.5 && distancia <= radio + 0.5) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
