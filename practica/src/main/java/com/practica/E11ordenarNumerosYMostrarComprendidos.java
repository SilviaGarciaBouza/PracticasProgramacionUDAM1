/*
 Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números
comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de
esos números al cuadrado. No se sabe si m > n, pero se desea utilizar una sola sentencia repetitiva
tanto si m > n como si m < n.
 */
package com.practica;

import java.util.Scanner;


public class E11ordenarNumerosYMostrarComprendidos {

    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe en numero 1: ");
        num1= Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe el segundo numero: ");
        num2= Integer.parseInt(teclado.nextLine());
        
        if(num1>num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        
        for(int i=num1; i<=num2; i++){
            System.out.printf("%d -> %.2f\n",i, Math.pow((double)i, 2.0));
        }
        
    }
    
}
