/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles17 {

    public static void main(String[] args) {
        int number, suma=0;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Escribe un numero entero positivo: ");
            number = Integer.parseInt(keyboard.nextLine());
            if (number <= 0) {
                System.out.println("El numero introducido no es correcto.");
            }
        } while (number <= 0);
        //no incluye el numero
        for(int i=1; i<=100; i++){
            suma+= (number+i);
        }

        System.out.println(suma);
    }

}
