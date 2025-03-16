/*
Amplia el programa anterior para que el usuario pueda introducir previamente la
base destino y el programa pueda pasar a binario (base 2), ternario (base 4) u octal (base 8).
 */
package com.practica;

import java.util.Scanner;

public class E33BinarioTernarioYMas {

    public static void main(String[] args) {

        int numeroIntroducido, base;
        long numeroFinal = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numeroIntroducido = Integer.parseInt(teclado.nextLine());
        
        
        
        
        
        
        
        
                

        do {
            System.out.println("Introduce la base: ");
            base = Integer.parseInt(teclado.nextLine());
        } while (base <= 0);

        if (numeroIntroducido >= 0) {
            for (int i = 0; numeroIntroducido > 0; i++) {

                numeroFinal = (numeroIntroducido % base) * (long) Math.pow(10.0, i);
                numeroIntroducido /= base;
            }
            System.out.println(numeroFinal);

        } else {
            numeroIntroducido = Math.abs(numeroIntroducido);

            for (int i = 0; numeroIntroducido > 0; i++) {

                numeroFinal = (numeroIntroducido % base) * (long) Math.pow(10.0, i);
                numeroIntroducido /= base;
            }
            System.out.println("-" + numeroFinal);

        }

    }
}
