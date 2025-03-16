/*
Programa que calcule el factorial de números menores de 20. El programa permite al usuario
meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20.
Crea las funciones que consideres útiles y que puedas reutilizar en otros programas. 
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO5_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido;

        do {
            System.out.println("Introduce un numero(<0 || >20 para finalizar): ");
            numeroIntroducido = Integer.parseInt(teclado.nextLine());
            if (numeroIntroducido < 0 || numeroIntroducido > 20) {
                System.out.println("Fin del programa");

            } else {
                System.out.println(facorial(numeroIntroducido));

            }
        } while (numeroIntroducido > 0 && numeroIntroducido < 20);

    }

    static int facorial(int numeroIntroducido) {
        if (numeroIntroducido == 0) {
            return 1;
        }
        return numeroIntroducido * facorial(numeroIntroducido - 1);

    }
}
