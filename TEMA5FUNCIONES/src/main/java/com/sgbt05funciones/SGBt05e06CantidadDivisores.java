/*
Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número
entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en
un main
 */
package com.sgbt05funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class SGBt05e06CantidadDivisores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido;
        do {
            System.out.println("Introduce un numero entero: ");
            numeroIntroducido = Integer.parseInt(teclado.nextLine());
            if (numeroIntroducido == 0) {
                System.out.println("El 0 tiene infinitos divisores");
            }
        } while (numeroIntroducido == 0);
        //El 0 tiene infinitos divisores
        System.out.println(cantidadDivisores(numeroIntroducido));

    }

    public static int cantidadDivisores(int numeroIntroducido) {
        int contador = 0;
        if (numeroIntroducido < 0) {
            return 0;
        }

        for (int i = 1; i <= numeroIntroducido; i++) {
            if (numeroIntroducido % i == 0) {
                contador++;
            }
        }
        return contador;

    }
}
