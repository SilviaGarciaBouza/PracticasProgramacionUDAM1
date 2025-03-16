/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.practica;

import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        //Mostrar por pantalla la frase “esto es un bucle” 10 veces.
        for (int i = 0; i < 10; i++) {
            System.out.println("esto es un bucle");
        }
        //Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado previamente.

        int numero;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escribe un numero positivo:");
            numero = Integer.parseInt(teclado.nextLine());
            if (numero <= 0) {
                System.out.println("numero incorrecto, el numero debe ser entero y mayor a 0");
            }
        } while (numero <= 0);

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        //Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a
        //uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos
        //versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) 
        int numeroParImpar;
        do {
            System.out.println("Escribe un numero positivo para averiguar si es par o impar(negativo para finalizar:)");
            numeroParImpar = Integer.parseInt(teclado.nextLine());
            if (numeroParImpar > 0 && numeroParImpar % 2 == 0) {
                System.out.printf("El numero %d es par\n", numeroParImpar);
            } else if (numeroParImpar > 0 && numeroParImpar % 2 != 0) {
                System.out.printf("El numero %d es impar\n", numeroParImpar);
            } else if (numeroParImpar == 0) {
                System.out.println("numero incorrecto");
            }
        } while (numeroParImpar >= 0);
        //y otra versión en la que la lectura de datos se haga únicamente al principio del bucle.

        int numerImparPar = 1;
        while (numerImparPar >= 0) {
            System.out.println("Escribe un numero");
            numerImparPar = Integer.parseInt(teclado.nextLine());
            if (numerImparPar > 0 && numeroParImpar % 2 == 0) {
                System.out.printf("El numero %d es par\n", numerImparPar);
            } else if (numerImparPar > 0 && numeroParImpar % 2 != 0) {
                System.out.printf("El numero %d es impar\n", numerImparPar);
            } else if (numerImparPar == 0) {
                System.out.println("numero incorrecto");
            }
        }

        //Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre
        //1 y 10, y mostrar su tabla de multiplicar.
        int numer110;
        do {
            System.out.println("Escribe un numero menor o igual a 10 y mayor o igual a 1: ");
            numer110 = Integer.parseInt(teclado.nextLine());
            if (numer110 >= 1 && numer110 <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n", numer110, i, (numer110 * i));
                }
            } else {
                System.out.println("numero incorrecto");
            }
        } while (numer110 < 1 || numer110 > 10);
        
        //Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta
        //que se teclee el -1.
        int numbersumando;
        int suma=0;
        do{
        System.out.println("Introduce un numero, los positivos se suman, -1 para salir");
        numbersumando=Integer.parseInt(teclado.nextLine());
        if(numbersumando>0){
            suma+=numbersumando;
        }
        
        }while(numbersumando!=-1);
        
        

    }
}
