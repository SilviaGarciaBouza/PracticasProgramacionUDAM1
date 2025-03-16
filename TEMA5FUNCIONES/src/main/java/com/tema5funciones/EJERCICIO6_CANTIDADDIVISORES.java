/*
Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número
entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en
un main.
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO6_CANTIDADDIVISORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        System.out.println("Introduce un nuemro: ");
        numero= Integer.parseInt(teclado.nextLine());
        System.out.println(cantidadDivisores(numero));
    }
    
    public static int cantidadDivisores(int numero){
        int suma=0;
        if(numero<0){
            return 0;
        }else{
            for(int i=1; i<=numero;i++){
                if(numero%i==0){
                    suma++;
                }
            }
        }
        return suma;
    }
    
}
 