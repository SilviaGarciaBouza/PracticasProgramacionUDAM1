/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:    Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado


 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles11 {

   
    public static void main(String[] args) {
        int number;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        number= Integer.parseInt(keyboard.nextLine());
        for(int i=0; i<5; i++){
            System.out.printf("%d %d %d\n", number, (number*number), (number*number*number));
            number++;
        }
        
    }
    
}
