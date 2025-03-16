/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tema06clases;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO001_OPERACIONCONNUMERO {

    public static void main(String[] args) {
        //rEALIZA un programa que pida un numero menor de 50 y haga lo siguiente:
        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplos7=0;
        int sumaMultiplos7=0;
        double raizSumaMulti;
        double division;
        
        do{
        System.out.println("Escribe un numero menor de 50: ");
        numero= Integer.parseInt(teclado.nextLine());
        }while(numero>=50);
        
        //busque los multiplos de 7 que hay entre 0 y ese numero( los incluyo)
        //sume los multiplos de 7
        for(int i =0; i<=numero; i++){
            if(i%7==0){
                multiplos7++;
                sumaMultiplos7+=i;
            }
        }
        System.out.println("Desde 0 hasta "+numero+" hay "+multiplos7+" multiplos de 7");
        System.out.println("La suma de los multiplos de 7 es : " + sumaMultiplos7);
        //raiz cuadrada de la suma:
        
        raizSumaMulti= Math.sqrt((double) sumaMultiplos7);
                System.out.printf("La raiz de la suma es "+ raizSumaMulti);
        //dividir la raiz entre el numero de multiplos
        
        division= raizSumaMulti/(double)multiplos7;
        System.out.println("");
        //Devuelve el resultado redondeado a 3 decimales
        System.out.printf("La division entre raiz y  suma es %.3f", division);
        
        
        
        
    }
    
    
    
    
}
