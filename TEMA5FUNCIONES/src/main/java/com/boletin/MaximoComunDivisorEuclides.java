/*
El máximo común divisor se puede calcular de forma recursiva con el algoritmo de Euclides que
afirma que:
mcd(a,b) = mcd(min(a,b), |a-b|)
El caso base será cuando ambos números sean iguales, ya que el mcd(a, a) = a.
IMPORTANTE: Solo se calcula el mcd para números positivos.
 */
package com.boletin;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MaximoComunDivisorEuclides {

    public static void main(String[] args) {
        Scanner teclaco=new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Escribe el primer numero: ");
        numero1=Integer.parseInt(teclaco.nextLine());
        System.out.println("Escribe el segundo numero: ");
        numero2=Integer.parseInt(teclaco.nextLine());
        System.out.println(maximoComunDivisorEuclides(numero1, numero2));
        
    }
    //TODO hacer la funcion
    static int maximoComunDivisorEuclides(int numero1, int numero2){
        if(numero1==numero2){
            return numero1;
        }
        return 1;
    }
    
}
