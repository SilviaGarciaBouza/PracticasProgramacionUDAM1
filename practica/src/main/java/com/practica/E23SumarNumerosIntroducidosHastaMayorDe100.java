/*
Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que
solicite un numero de más o bien que no sume correctamente)
 */
package com.practica;

import java.util.Scanner;


public class E23SumarNumerosIntroducidosHastaMayorDe100 {

   
    public static void main(String[] args) {
        int numero, suma=0;
        Scanner teclado = new Scanner(System.in);

        for(int contador=1; contador<=15;contador++){
            System.out.println("Introduce un numero: ");
            numero=Integer.parseInt(teclado.nextLine());
            suma+=numero;
            if(suma>1000){
                break;
            }
            
        }
        System.out.printf("La suma de los numeros introducidos es %d", suma);
    }
    
}
