/*
Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando
la función del programa anterior, haz un programa que muestre la suma de los números primos
comprendidos entre 1 y 1000. 76127
 */
package com.sgbt05funciones;
import static com.sgbt05funciones.SGBt05e06CantidadDivisores.cantidadDivisores;
/**
 *
 * @author silvia
 */
public class SGBt05e07SumaPrimos {

   
    public static void main(String[] args) {
        //incluyo los numeros
        int suma=0;
        for(int i=1;i<=1000;i++){
            if(cantidadDivisores(i)==2){
                suma+=i;
            }
        }
        System.out.println(suma);
        
    }
    
}
