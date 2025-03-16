/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por
ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25


 */
package com.sgbboletinbubles;

import java.util.Scanner;


public class SGBBoletinBucles15 {

    public static void main(String[] args) {

        int numberBase, numberexponent;
       long numberPotencia=1;
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Escribe un nuemro para la base: ");
        numberBase= Integer.parseInt(keyboard.nextLine());
        System.out.println("Escribe un numero para el exponente: ");
        numberexponent= Integer.parseInt(keyboard.nextLine());
        
        for(int i= 1; i <=numberexponent;i++){
            numberPotencia*=numberBase;
            System.out.println(numberPotencia);
        }
        





    }
    
}
