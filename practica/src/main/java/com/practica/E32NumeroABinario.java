/*
Programa al que se le pase un número entero y que lo muestre en binario. Deberá
hacer divisiones sucesivas e ir componiendo un número (long) con los restos obtenidos hasta que el
cociente será cero. Pista: cada cero y uno obtenido como resto hay que situarlo en la posición
adecuada del resultado: unidades, decenas, centenas, etc.
 */
package com.practica;

import java.util.Scanner;

public class E32NumeroABinario {

    public static void main(String[] args) {

        int numeroIntroducido;
        long numeroBinario = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numeroIntroducido = Integer.parseInt(teclado.nextLine());
        if (numeroIntroducido >= 0) {

            for (int i = 0; numeroIntroducido > 0; i++) {

                numeroBinario += ((numeroIntroducido % 2) * (long) Math.pow(10.0, i));
                numeroIntroducido /= 2;

            }
            System.out.println(numeroBinario);
        } else {
           numeroIntroducido=Math.abs(numeroIntroducido);
            
            for (int i = 0; numeroIntroducido > 0; i++) {

                numeroBinario += ((numeroIntroducido % 2) * (long) Math.pow(10.0, i));
                numeroIntroducido /= 2;

            }
            

            System.out.println("-"+numeroBinario);
        }

        

    }
}
