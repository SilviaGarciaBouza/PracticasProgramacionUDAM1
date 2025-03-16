/*
Programa que se le introduzcan números por consola y que informe si están ordenados
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los
números no están ordenados.
Para cada número, puedo ver si es mayor que el anterior. En ese caso estarán
ordenados ascendentemente, en caso contrario no.
 */
package com.practica;

import java.util.Scanner;

public class E19VerificarNumerosOrdebadosAscendentes {

    public static void main(String[] args) {
        int numeroIntroducido = 0, numeroanterior = 0;
        boolean ascendente=true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numeroIntroducido = Integer.parseInt(teclado.nextLine());
        do {
            numeroanterior = numeroIntroducido;
            System.out.println("Introduce un numero: ");
            numeroIntroducido = Integer.parseInt(teclado.nextLine());
            if (numeroIntroducido!=0 &&numeroIntroducido < numeroanterior) {

                ascendente=false;
                
                break;
            }

        } while (numeroIntroducido != 0);
        
        System.out.printf("Esta ordenado ascendente: %b", ascendente);

    }

}
