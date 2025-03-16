/*
Programa una función recursiva para el cálculo de una potencia. Para pensarlo de forma
recursiva, una potencia de un número es lo mismo que multiplicar la base por un exponente una
unidad menor. Por ejemplo, 24
 = 2 * 23
. Como caso base, cuando el exponente es 1, el resultado de
la potencia es la base, y cuando el exponente es 0, el resultado de la potencia es 1.
 */
package com.boletin;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class PotenciaRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base;
        int exponente;
        
        System.out.println("Escribe la base: ");
        base=Integer.parseInt(teclado.nextLine());
       
        //para que solo valgan los exponentes igual o mayor a 0
        do{
        System.out.println("Escribe el exponente: ");
        exponente=Integer.parseInt(teclado.nextLine());
        if(exponente<0){
            System.out.println("El numero tiene que ser meyor o igual a 0");
        }
        }while(exponente<0);
        System.out.println(potenciaRecursiva(base, exponente));
        System.out.println(potenciaRecursivatbNegativo(2, -3));
    }
    
    static int potenciaRecursiva(int base, int exponente){
        if(exponente==0){
            return 1;
        }
        if(base==0){
            return 0;
        }
        if(exponente==1){
            return base;
        }
        if(exponente>1){
        return base*potenciaRecursiva(base, exponente-1);
    }
        base=1/base;
    return base*potenciaRecursiva(base, exponente-1);
       
    }
    //tambien exponentes negativos:
        static double potenciaRecursivatbNegativo(double base, int exponente){
        if(exponente==0){
            return 1;
        }
        if(base==0){
            return 0;
        }
        if(exponente==1){
            return base;
        }
        if(exponente>1){
        return base*potenciaRecursivatbNegativo(base, exponente-1);
    }
        base=1/base;
        exponente=-exponente;
    return base*potenciaRecursivatbNegativo(base, exponente-1);
       
    }
    
}
