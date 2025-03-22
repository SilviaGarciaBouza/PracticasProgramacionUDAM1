/*
Cuestiones previas (entregar en PDF)
a) ¿Puede finalizar abruptamente esta porción de código?
 Scanner teclado = new Scanner(System.in);
 System.out.print("Num 1: ");int num1 = teclado.nextInt();
 System.out.print("Num 2: ");int num2 = teclado.nextInt();
 System.out.println("div=" + num1 / num2);
Si, por ejemplo si a num2 se le asugna el valor de 0.
b) ¿Qué muestra este código? ¿Finaliza el programa abruptamente?
int [] a = new int [] {1,2,3,4,5};
 int p = -1;
 try { System.out.print(a[p]); }
 catch (ArrayIndexOutOfBoundsException e ) {System.out.print("0"); }
Imprime por teclado 0, porque paso por la excepcion

1. Haz un programa que solicite al usuario dos números enteros y los intente dividir (división
entera, sin decimales). Si el denominador es cero, deberá capturar la excepción y decir que el
resultado de la división es cero, sin que el programa pare su ejecución abruptamente.
Nota: para provocar la excepción, hacemos la división de enteros, sin casting: double
res=num1 /num2; con num2=0. Si hiciésemos el casting: double res = (double) num1 / num2;
no se produce la excepción, informa que el resultado es ‘Infinity’. 
 */
package com.tema12;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Vamos a hacer una division:");
        System.out.println("Escribe un numero etero (numerador): ");
        numero1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un segundo numero etero (denominador): ");
        numero2 = Integer.parseInt(teclado.nextLine());
        dividir(numero1, numero2);
    }

    static int dividir(int numero1, int numero2) {
        int resultado=0;
        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException ex) {
            resultado = 0;
        } finally {
            System.out.println("Resultado de la division: " + resultado);
        }
        return resultado;
    }
}
