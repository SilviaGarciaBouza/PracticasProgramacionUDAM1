/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
cuántos son negativos.

 */
package com.sgbboletinbubles;

import java.util.Scanner;


public class SGBBoletinBucles13 {

   
    public static void main(String[] args) {
        int number, counter=0, addPosit=0, addNegat=0;
        Scanner keyboard = new Scanner(System.in);
        
        
        do{
            System.out.printf("Escribe un numero positivo o negativo, te queda %d numero: ", 10-counter);
            number=Integer.parseInt(keyboard.nextLine());
            if(number<0){
                addNegat+=number;
                counter++;
            }else if(number>0){
                addPosit+=number;
                counter++;
            }else{
                System.out.println("numero incorecto, el 0 no es positivo ni negativo");
            }
            
        }while(counter<10);
        System.out.printf("La suma de los numeros positivos ha sido %d", addPosit);
        System.out.printf("\nLa suma de los numeros negativos ha sido %d", addNegat);
        
    }
    
}
