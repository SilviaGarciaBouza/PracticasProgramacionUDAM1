/*
13.3. Haz un programa que solicite al usuario dos números enteros y los intente dividir (división
entera, sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no
que capturará la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por
cero, informando al usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división,
que será cero en caso de cualquiera de los dos errores posibles. 
 */
package com.tema12;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        int numero1, numero2, resultado=0;
         try {
        System.out.println("Vamos a hacer una division:");
        System.out.println("Escribe un numero etero (numerador): ");
        numero1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un segundo numero etero (denominador): ");
        numero2 = Integer.parseInt(teclado.nextLine());
       
            resultado = numero1 / numero2;
        } catch (ArithmeticException ex) {
            resultado=0;
             System.out.println("Error: "+ex.getMessage());
        }  catch (NumberFormatException ex) {
            resultado=0;
            System.out.println("Error: "+ex.getMessage());
        } 
         finally {
            System.out.println("Resultado de la division: " + resultado);
        }

    }
    
}
