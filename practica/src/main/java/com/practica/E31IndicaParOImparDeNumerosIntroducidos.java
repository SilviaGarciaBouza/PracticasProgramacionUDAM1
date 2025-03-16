/*
Programa al que se le introduzcan 30 números y si la suma de los mismos es par nos muestre
los 3 primeros que introducimos, y si es impar nos muestre los tres últimos que introducimos. Hay
que garantizar que cada uno de dichos números está comprendido entre 0 y 1000.
 */
package com.practica;

import java.util.Scanner;

public class E31IndicaParOImparDeNumerosIntroducidos {

    public static void main(String[] args) {

        int numero, suma = 0, numero1=0, numero2=0, numero3=0, numero30=0, numero29=0, numero28=0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            do {
                System.out.println("Introduce un numero entre 0 y 1000");
                numero = Integer.parseInt(teclado.nextLine());
            } while (numero < 0 || numero > 1000);//entre 0 y 1000 incluidos
            suma += numero;
            switch (i) {
                case 1 -> numero1=numero;
                case 2 -> numero2=numero;
                case 3 -> numero3=numero;
                case 28 -> numero28=numero;
                case 29 -> numero29=numero;
                case 30 -> numero30=numero;
                default -> {
                }
            }
        }
        if (suma % 2 == 0) {
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);

        } else {
            System.out.println(numero28);
            System.out.println(numero29);
            System.out.println(numero30);

        }

    }

}
