/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
Hay que realizar el ejercicio utilizando bucles. La única limitación en el número de dígitos
la establece el tipo de dato que se utilice (int o long).


 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles09 {

    

    public static void main(String[] args) {
        long number;
        int contador=0;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        number= Long.parseLong(keyboard.nextLine());
        do{
            number/=10;
            contador++;
        }while (number>0);         
        System.out.printf("EL numero tiene %d cifras", contador);
    }

}
