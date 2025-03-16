/*
Serie fibonacci 20 primeros numeros
 */
package com.practica;

public class E21Fibonacci {

    public static void main(String[] args) {


        int numeroanterior=1, numeroanteanterios=0, suma;
        for(int i=1; i<=20; i++){
            System.out.println(numeroanteanterios);
            suma= numeroanteanterios+numeroanterior;
            numeroanteanterios=numeroanterior;
            numeroanterior=suma;
        }
       
    }
    
}
