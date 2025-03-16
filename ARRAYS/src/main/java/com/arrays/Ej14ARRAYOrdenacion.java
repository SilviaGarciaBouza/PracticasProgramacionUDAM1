/*
Realizar un programa que defina un Array con 10 elementos e introduzca valores
a azar entre 1 y 20 pero garantizando que no se introducen repetidos y una vez introducidos,
ordénalos ascendentemente programando un algoritmo de ordenación.
En el apartado siguiente veremos que mediante ArrayList disponemos de métodos que
ordenan por nosotros. 
 */
package com.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class Ej14ARRAYOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] elementos;
        elementos = new int[10];
        Random random = new Random();
         boolean esigual=false;

        do {
            elementos[0] = random.nextInt(1, 21);
           
            for (int i = 1; i < elementos.length; i++) {
                esigual = false;

                elementos[i] = random.nextInt(1, 21);
                for (int j = 0; j < i - 1; j++) {
                    if (elementos[i] == elementos[j]) {
                        esigual = true;
                        break;
                    }
                }
            } 
                
            
        }while (esigual==true);
        
        
        System.out.println("Array: "+Arrays.toString(elementos));
        
        
        
        int[]nuevoArray;
        nuevoArray= new int[10];
        
        
        //Orden ascendente
        for(int i=0; i<elementos.length-1; i++){
            for(int j=i; j<elementos.length; j++){
                if(elementos[j]<elementos[i]){
                    nuevoArray[i]=elementos[j];
                }
            }
        }
        
        
        System.out.println("Nuevo Array ordenado: "+Arrays.toString(nuevoArray));
    }

}
