/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle
while.

 */
package com.sgbboletinbubles;

public class SGBBoletinBucles05 {

    

    public static void main(String[] args) {
        
        try{
            int num = 320;
    while(num>=160){
            System.out.println(num);
        num -= 20;

    }
        }catch(Exception e){
            System.out.println("Se ha producido un error "+e);
        }
    }

}
