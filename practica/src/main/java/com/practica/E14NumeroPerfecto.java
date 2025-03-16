/*
Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un
número perfecto si es igual a la suma de todos los divisores menores que él.
 */
package com.practica;

public class E14NumeroPerfecto {

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }

}
