/*
Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que
el segundo. No incluir en los cálculos los números introducidos, solo los intermedios.
 */
package com.practica;

import java.util.Scanner;


public class E28SumaYMediaDeNumerosIntroducidos {

   
    public static void main(String[] args) {

        int numero1, numero2, suma=0, contador=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un numero entero: ");
        numero1=Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un segundo numero entero: ");
        numero2= Integer.parseInt(teclado.nextLine());
        if(numero1>numero2){
            numero1+=numero2;
            numero2=numero1-numero2;
            numero1=numero1-numero2;
        }
        for(int i= numero1+1; i<numero2;i++){
            if(i%2==0){
                contador++;
                suma+=i;
            }
        }
        
        if(contador!=0){
            System.out.printf("Suma = %d y media = %.2f", suma, ((double)suma/contador));
            
        }else{
            System.out.println("No hay numeros paresentre esos dos numeros introducidos, por lo que suma = 0 y media = 0");
        }

    }
    
}
