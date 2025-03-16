/*
5. Programa una función recursiva para el cálculo de una potencia. Para pensarlo de forma
recursiva, una potencia de un número es lo mismo que multiplicar la base por un exponente una
unidad menor. Por ejemplo, 24
 = 2 * 23
. Como caso base, cuando el exponente es 1, el resultado de
la potencia es la base, y cuando el exponente es 0, el resultado de la potencia es 1.
En una mejora del programa, prográmalo también para una potencia de exponente negativo
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO_BOLETIN_05_POTENCIARECURSIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero1;
        long numero2;
        System.out.println("Introduce un numero positivo: ");
        numero1 = Long.parseLong(teclado.nextLine());
        System.out.println("Introduce un numero positivo: ");
        numero2 = Long.parseLong(teclado.nextLine());
        System.out.println(potenciaRecursiva(numero1, numero2));
    }

    public static long potenciaRecursiva(long numero1, long exponente) {

        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return numero1;
        } else if (numero1 == 0) {
            return 0;
        } else if (numero1 == 1) {
            return 1;
        } else if (exponente > 1) {
            return numero1 * potenciaRecursiva(numero1, exponente - 1);
            
            
            
        }else if(exponente==-1){
             return 1/numero1;
        }else {
             return 1/(numero1 * potenciaRecursiva(numero1, exponente - 1));
        }
    

    }

}
