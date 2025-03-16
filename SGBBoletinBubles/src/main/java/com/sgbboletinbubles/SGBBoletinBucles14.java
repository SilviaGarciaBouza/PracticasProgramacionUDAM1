/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles14 {

    public static void main(String[] args) {
        double numberBase, numberexponente;
        long numberPotencia=1;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Escribe un numero para la base: ");
        numberBase = Double.parseDouble(keyboard.nextLine());
        System.out.println("Escribe un numero para el exponente: ");
        numberexponente = Double.parseDouble(keyboard.nextLine());
       // numberPotencia= (long)Math.pow(numberBase, numberexponente);
       //Sin math
       for(int i= 1;i<=numberexponente;i++){
           numberPotencia*=numberBase;
       }
       
       
       
        System.out.println(numberPotencia);
        
    }
    
}
