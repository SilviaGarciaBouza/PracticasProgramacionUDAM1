/*
Realiza un progranma q pida al user un numero menor de 50 y que:
- busq los multiplos de 7 q hay entre 0 y ese numero
- sume los multiplos anteriores
- calcule la raiz cuadrada de la suma anterior
divida la raiz cuadrada entre el numero total de multiplos de 7 encontrados en el primer paso
- devuelva el resultado anterior redondeDO A 3 decimales.
. El programa pide un numero repetidamente hasta que el valor es menor a 50
. el programa encuentra todos los multiplos de 7 y los acumula en una variable
. ell programa realiza correctamente la raiz cuadrada.
. el programa calcula correctamente el numero total de multiplos de 7
el programa devuelve el resultado redondeado en 3 decimales
 */
package com.examen1;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroMenor50;
        int coontadorMultiplos = 0;
        int sumaMultiplos = 0;
        double raizMultiplos;
        double division;

        do {
            System.out.println("Escribe un numero menor de 50: ");
            numeroMenor50 = Integer.parseInt(teclado.nextLine());
        } while (numeroMenor50 > 50);

//- busq los multiplos de 7 q hay entre 0 y ese numero
        for (int i = 0; i <= numeroMenor50; i++) {
            if (i % 7 == 0) {
                coontadorMultiplos++;
                sumaMultiplos += i;
            }
        }
        raizMultiplos = Math.sqrt((double) sumaMultiplos);
        division = raizMultiplos / coontadorMultiplos;

        System.out.printf("Hay %d multiplos de 7\n", coontadorMultiplos);
        System.out.println("La suma de los numeros multiplos de 7 es: " + sumaMultiplos);
        System.out.println("La raiz de la suma es: " + raizMultiplos);
        System.out.println(division);
        System.out.printf("%.3f", division);

    }
}
