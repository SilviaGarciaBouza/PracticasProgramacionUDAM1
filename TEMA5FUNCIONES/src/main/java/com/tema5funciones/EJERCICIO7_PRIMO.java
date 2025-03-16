/*
Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando
la función del programa anterior, haz un programa que muestre la suma de los números primos
comprendidos entre 1 y 1000. 
 */
package com.tema5funciones;

import static com.tema5funciones.EJERCICIO6_CANTIDADDIVISORES.cantidadDivisores;

/**
 *
 * @author silvia
 */
public class EJERCICIO7_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sumaPrimos=0;
       for(int i=1; i<=1000; i++){
           if(cantidadDivisores(i)==2){
               sumaPrimos+=i;
           }
       }
        System.out.println(sumaPrimos);
    }
    
}

        