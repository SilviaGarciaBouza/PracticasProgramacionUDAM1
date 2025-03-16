/*
La multiplicación se puede programar de forma recursiva a través de la suma. Multiplicar un
número por otro es el mismo resultado que si sumamos el primer número a la multiplicación del
primer número por el anterior del otro, hasta llegar a que el otro número sea 1. Por ejemplo, 2 * 4 =
2 + 2 * 3.
Haz un programa donde se haga la multiplicación de manera recursiva.
IMPORTANTE: Si el primer número es menor que el segundo, podemos cambiarlos de orden para
que se hagan menos llamadas recursivas. Por ejemplo, 2 * 4 es igual a 4 * 2.
 */
package com.boletin;

import java.util.Scanner;

/**
 *
 * @author silvia
 */

public class MultiplicacionRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido1;
        int numeroIntroducido2;
        do{
        System.out.println("Introduce un primer numero: ");
        numeroIntroducido1=Integer.parseInt(teclado.nextLine());
            if (numeroIntroducido1 < 0) {
                System.out.println("El numero introducido debe ser mayor a 0");
            }
        }while(numeroIntroducido1<0);
        do{
        System.out.println("Introduce un segundo numero: ");
        numeroIntroducido2=Integer.parseInt(teclado.nextLine());
        if(numeroIntroducido2<0){
            System.out.println("El numero introducido debe ser mayor a 0");
        }
        }while(numeroIntroducido2<0);
        System.out.println(multiplicacionRecursiva(numeroIntroducido1, numeroIntroducido2));
    }
    static int multiplicacionRecursiva(int numero1, int numero2){
        if(numero1>numero2){
            numero1=numero1+numero2;
            numero2=numero1-numero2;
            numero1=numero1-numero2;
        if(numero1==1){
            return numero2;
        }
        if(numero2==1){
            return numero1;
        }
        if(numero1==0||numero2==0){
            return 0;
        }
        
        }
         return numero1+multiplicacionRecursiva(numero1, numero2-1);
    }
    
}
/*

public class E04MultiplicacionRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Escribe un numero: ");
        numero1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe otro numero: ");
        numero2 = Integer.parseInt(teclado.nextLine());
        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;

        System.out.println(multiplicacionRecursiva(numero1, numero2));

    }

    static int multiplicacionRecursiva(int numero1, int numero2) {
       if(numero1>numero2){
        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;
       }

        
        if(numero1>=0&&numero2>=0){
        if (numero1 == 1) {
            return numero2;
        } 
        if (numero2 == 1) {
            return numero1;
        } 
        if (numero1 == 0 || numero2 == 0) {
           return 0;
        } 
        return numero1 +multiplicacionRecursiva(numero1, numero2-1);
    }else if(numero1<0&&numero2<0){
        
    }
    
}
    
}


*/
