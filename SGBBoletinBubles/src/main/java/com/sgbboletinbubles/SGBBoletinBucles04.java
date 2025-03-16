/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle
for
 */

package com.sgbboletinbubles;

public class SGBBoletinBucles04 {

    public static void main(String[] args) {

        
        try{
            for(int i=320; i>=160;i-=20){
                System.out.println(i);
            }
            
            
            
        }catch(Exception e){
            System.out.println("Se ha producido un error "+e);
        }
    }
    
}
