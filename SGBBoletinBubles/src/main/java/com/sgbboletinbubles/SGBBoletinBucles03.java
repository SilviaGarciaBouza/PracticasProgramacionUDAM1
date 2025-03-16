/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:  Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
 */
package com.sgbboletinbubles;

public class SGBBoletinBucles03 {

    public static void main(String[] args) {
        int number=0;
        try {
            System.out.println("Los numeros multiplos de 5 comprendidos entre 0 y 100 (incluidos) son:");
           do{
               if(number>=0&&number<=100){
                   if(number%5==0){
                   System.out.println(number);
                   }
               }
               number ++;
           }while(number<=100);
        } catch (Exception e) {
            System.out.println("Se ha producido un error " + e);
        }
    }
}

