/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:  Muestra la tabla de multiplicar de un número introducido por teclado.

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles08 {

    

    public static void main(String[] args) {
        int number;
        Scanner keyboard= new Scanner(System.in);
        try{
            System.out.println("Escribe un numero para mostrar su tabla de multiplicar: ");
            number= Integer.parseInt(keyboard.nextLine());
            for(int i=1; i<=10; i++){
                System.out.printf("%d x %d = %d\n",number, i, number*i);
            }
            
            
        }catch(Exception e){
            System.out.println("Se ha producido un error "+e);
        }
    }

}
