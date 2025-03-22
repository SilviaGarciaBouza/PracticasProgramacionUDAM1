/*
13.2. Haz un programa que solicite al usuario dos números double y los intente sumar. En caso de
que se introduzcan valores que no son enteros, por ejemplo, textos no numéricos, no provocará un
error en tiempo de ejecución, simplemente informará de que se ha producido un error y no mostrará
el resultado de la suma. 
 */
package com.tema12exceptions;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_02 {

    static public double resultado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;
        try{
        System.out.println("Vamos a hacer una suma:");
        System.out.println("Escribe un numero : ");
        numero1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe un segundo numero : ");
        numero2 = Double.parseDouble(teclado.nextLine());
        resultado = sumar(numero1, numero2);
        System.out.println("Resultado de la suma: " + resultado);
        }catch(NumberFormatException ex){
            System.out.println("Error: "+ex.getMessage());
        }finally {
            System.out.println("Fin de la operacion");
        }
        
        
    }

    static public double sumar(double numero1, double numero2) {
       
        resultado = numero1 + numero2;
        
        return resultado;

    }

}
