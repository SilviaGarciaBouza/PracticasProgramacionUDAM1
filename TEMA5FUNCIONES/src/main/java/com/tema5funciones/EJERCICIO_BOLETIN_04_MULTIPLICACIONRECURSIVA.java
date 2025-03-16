/*
4. La multiplicación se puede programar de forma recursiva a través de la suma. Multiplicar un
número por otro es el mismo resultado que si sumamos el primer número a la multiplicación del
primer número por el anterior del otro, hasta llegar a que el otro número sea 1. Por ejemplo, 2 * 4 =
2 + 2 * 3.
Haz un programa donde se haga la multiplicación de manera recursiva.
IMPORTANTE: Si el primer número es menor que el segundo, podemos camb0
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO_BOLETIN_04_MULTIPLICACIONRECURSIVA {

    /**
     *COMPROBAR Q SON NUMEROS POSTITIVOS Y SINO HACER VERSION PARA NEG
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introduce un numero positivo: ");
        numero1=Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce un numero positivo: ");
        numero2=Integer.parseInt(teclado.nextLine());
        System.out.println(multiplicacionRecursiva(numero1, numero2));
    }
    
    public static int multiplicacionRecursiva(int numero, int numero2){
        if(numero==0||numero2==0){
            
            return 0;
        }else if(numero==1){
            return numero2;
        }else if(numero2==1){
            return numero;
        }
        return numero+multiplicacionRecursiva(numero, numero2-1);
        
        
        
    }
    
}
