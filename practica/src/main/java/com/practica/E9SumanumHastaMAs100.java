/*
Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de
los mismos valga más de 100.
 */
package com.practica;

import java.util.Scanner;


public class E9SumanumHastaMAs100 {

   
    public static void main(String[] args) {
        int num, suma=0;
                Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Escribe un numero: ");
            num=Integer.parseInt(teclado.nextLine());
        if(num>0){
            suma+=num;
        }}while(suma<=100);
        System.out.println("La suma es mayor a 100");
        
    }
    
}
