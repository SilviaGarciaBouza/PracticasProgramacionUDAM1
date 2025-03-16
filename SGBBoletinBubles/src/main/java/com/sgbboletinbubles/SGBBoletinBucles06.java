/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do
while.

 */
package com.sgbboletinbubles;

public class SGBBoletinBucles06 {

    

    public static void main(String[] args) {
        int number=320;
        try{
            
            do{
                System.out.println(number);
                number-=20;
            }while(number>=160);
        }catch(Exception e){
            System.out.println("Se ha producido un error "+e);
        }
    }

}
