/*
• Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.

 */
package com.arrays.primitiva;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainEj05PrimitivaAciertos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej05ARRAYPrimitiva ganadoraPrimitiva= new Ej05ARRAYPrimitiva();
        int[] miPrimitiva;
        miPrimitiva= new int[6];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros de tu boleto para saber cuantos numeros acertaste");
        for(int i= 0; i<miPrimitiva.length;i++){
            System.out.println("Introduce un numero: ");
            miPrimitiva[i]= Integer.parseInt(teclado.nextLine());
        }
        System.out.println("Acertaste: "+ ganadoraPrimitiva.numeroAciertos(miPrimitiva)+ " numeros.");
        
    }
    
}
