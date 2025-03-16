/*
Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a
dichas funciones:
• Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo
es.
• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
• Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma
de los números comprendidos entre los números pasados (el primero es menor que el
segundo, y ambos mayores que cero, en caso contrario devuelve -1)
• Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros
que tiene.
• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al
azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos
mayores que cero, en caso contrario devuelve -1) */
package com.sgbt05funciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class SGBt05e01par {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroPArImpar;
        //• Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo es.
        System.out.println("Escribe un numero para comprobar si es par: ");
        numeroPArImpar=Integer.parseInt(teclado.nextLine());
        System.out.println(par(numeroPArImpar));
        //• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
        double numero1;
        double numero2;
        double numero3;
        System.out.println("Escribe el primer numero de tres para comprobar cual es mayor");
        numero1= Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el segundo numero de tres para comprobar cual es mayor");
        numero2= Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el terner numero de tres para comprobar cual es mayor");
        numero3= Double.parseDouble(teclado.nextLine());
        System.out.println(mayor(numero1,numero2,numero3));
        //Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma
        //de los números comprendidos entre los números pasados (el primero es menor que el
        //segundo, y ambos mayores que cero, en caso contrario devuelve -1)
        long primerNumero;
        long segundoNumero;
        System.out.println("Escribe un primer numero: ");
        primerNumero= Long.parseLong(teclado.nextLine());
        System.out.println("Escribe un segundo numero: ");
        segundoNumero= Long.parseLong(teclado.nextLine());
        System.out.println(sumaIntervalo(primerNumero, segundoNumero));
        // Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros
        //que tiene.
        String ceros;
        System.out.println("Escribe una cadena: ");
        ceros= teclado.nextLine();
        System.out.println(contarCeros(ceros));
        //• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al
        //azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos
        //mayores que cero, en caso contrario devuelve -1)
        int numero1aleatorio;
        int numero2aleatorio;
        System.out.println("Escribe el primer numero: ");
        numero1aleatorio= Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe el segundo numero: ");
        numero2aleatorio= Integer.parseInt(teclado.nextLine());
        System.out.println(aleatorio(numero1aleatorio, numero2aleatorio));
    }

    static boolean par(int par) {
        return par % 2 == 0;
    }
    
    static double mayor(double numero1, double numero2, double numero3){
        if((numero1>numero2 )&& (numero1>numero3)){
            return numero1;
        }
        if((numero2>numero1)&&(numero2>numero3)){
            return numero2;
        }
        return numero3;
    }
    static long sumaIntervalo(long numero, long numero2){
        // incluyo los numeros
        long suma=0;
        if((numero==0||numero2==0)|| (numero>numero2)){
            return -1;
        }
        for(long i= numero; i<=numero2;i++){
            suma+=i;
        }
        return suma;
    }
    static int contarCeros(String cadena){
        int contador=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='0'){
                contador++;
            }
        }
        return contador;
    }
    
    static int aleatorio(int numero1, int numero2){
        Random random= new Random();
        if((numero1==0||numero2==0)|| (numero1>numero2)){
            return -1;
        }
        int myRandom;
        myRandom= random.nextInt(numero1,(numero2+1));
        return myRandom;
    }
    
}
