/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio: Escribe un programa que calcule la media de un conjunto de números positivos introducidos
por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.


 */
package com.sgbboletinbubles;

import java.util.Scanner;


public class SGBBoletinBucles10 {

    public static void main(String[] args) {
        int number, suma = 0;
        double cont=0;
        
        Scanner keyboard=new Scanner(System.in);  
        do{
            System.out.println("Escribe un número positivo (negativo para finalizar: ");
            number= Integer.parseInt(keyboard.nextLine());
            if(number==0){
                System.out.println("El 0 es un numero incorrecto, no es positivo ni negativo. ");
            }else if(number>0){
                suma+=number;
                cont++;
            }
            
        }while(number>=0);
        System.out.printf("La media de los numeros introducidos es: %.2f", suma/cont);
    }
    
}
