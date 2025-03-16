/*
Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un
número entero positivo tecleado previamente (ojo: el número x puede ser par o impar)
 */
package com.practica;

import java.util.Scanner;

public class E25MostrarHolaAdiosXLineas {

    public static void main(String[] args) {

        int numeroLineas, contador = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escribe un numero: ");
            numeroLineas = Integer.parseInt(teclado.nextLine());
            if(numeroLineas<=0){
                System.out.println("numero incorrecto");
            }
        } while (numeroLineas <= 0);

        do {
            contador++;
            System.out.println("hola");
            System.out.println("adios");

        } while (contador != numeroLineas / 2);
        if (numeroLineas % 2 != 0) {
            System.out.println("hola");
        }

    }

}
