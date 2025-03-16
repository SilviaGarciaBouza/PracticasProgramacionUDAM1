/*
Calcular la suma de los 100 números siguientes a uno tecleado previamente.
 */
package com.practica;

import java.util.Scanner;

public class E8Suma100NumerosSiguientes {

 
    public static void main(String[] args) {
        int num, sum=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num= Integer.parseInt(teclado.nextLine());
        for(int i= num; i<num+100; i++){
            sum +=i;
        }
        
        System.out.println(sum);
    }
    
}
