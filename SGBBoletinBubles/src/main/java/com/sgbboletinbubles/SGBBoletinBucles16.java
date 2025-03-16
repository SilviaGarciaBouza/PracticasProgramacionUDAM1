/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:  Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad.
 */
package com.sgbboletinbubles;

import java.util.Scanner;


public class SGBBoletinBucles16 {

 
    public static void main(String[] args) {

        int number;
        Scanner keyboard = new Scanner(System.in);
        boolean esprimo= true;
        
        System.out.println("Escribe un numero: ");
        number= Integer.parseInt(keyboard.nextLine());
        if(number==0||number==1){
            esprimo=false;
        }
        else if(number!=2){
            for(int i=2; i<number;i++){
                if(number%i==0){
                    esprimo=false;
                }
            }
                
        }
        System.out.println(esprimo);
        

    }
    
}
