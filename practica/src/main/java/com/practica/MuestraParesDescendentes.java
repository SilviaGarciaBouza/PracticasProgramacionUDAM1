/*
Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden
descendente.
 */
package com.practica;

public class MuestraParesDescendentes {

    
    public static void main(String[] args) {

        for(int i= 100; i>=1; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
