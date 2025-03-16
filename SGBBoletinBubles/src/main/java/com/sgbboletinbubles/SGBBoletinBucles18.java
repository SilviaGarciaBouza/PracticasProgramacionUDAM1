/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:  Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el menor
de los enteros introducidos e ir incrementando de 7 en 7.

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles18 {

    
    public static void main(String[] args) {

        int number1, number2;
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Escribe el primer numero: ");
        number1= Integer.parseInt(keyboard.nextLine());
        do{
        System.out.println("Escrube el segundo numero distinto al primero: ");
        number2= Integer.parseInt(keyboard.nextLine());
        if(number2==number1){
            System.out.println("Numero incorrecto");
        }
        }while(number2==number1);
        
        if(number2<number1){
            number2+=number1;
            number1= number2-number1;
            number2= number2-number1;
        }

        for(int i= number1;i<=number2;i+=7 ){
            System.out.println(i);
        }

    }
    
}
