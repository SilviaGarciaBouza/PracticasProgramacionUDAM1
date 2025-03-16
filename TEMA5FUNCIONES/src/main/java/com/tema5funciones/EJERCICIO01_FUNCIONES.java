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
mayores que cero, en caso contrario devuelve -1) 
 */
package com.tema5funciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO01_FUNCIONES {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        double numero1, numero2, numero3;
        long long1,long2;
        String cadena;
        int entero1, entero2;
        
        
        System.out.println("Introduce un numero: ");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println(par(numero));

        System.out.println("Introduce un numero: ");
        numero1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce un numero: ");
        numero2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce un numero: ");
        numero3 = Double.parseDouble(teclado.nextLine());
        System.out.println(mayor(numero1, numero2, numero3));
        
        System.out.println("Introduce un numero: ");
        long1 = Long.parseLong(teclado.nextLine());
        System.out.println("Introduce un numero: ");
        long2 = Long.parseLong(teclado.nextLine());
        System.out.println(sumaIntervalo(long1, long2));
        
        System.out.println("Escribe una cadena: ");
        cadena= teclado.nextLine();
        System.out.println(sumarCeros(cadena));
        
         System.out.println("Introduce un numero: ");
        entero1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce un numero: ");
        entero2 = Integer.parseInt(teclado.nextLine());
        System.out.println(aleatorio(entero1, entero2));

    }

    //• Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo
    //es.
    static boolean par(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
    static double mayor(double numero1, double numero2, double numero3) {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                return numero1;
            } else {
                return numero3;
            }
        } else {
            if (numero2 > numero3) {
                return numero2;
            } else {
                return numero3;
            }
        }
    }

    //Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma
    //de los números comprendidos entre los números pasados (el primero es menor que el
    //segundo, y ambos mayores que cero, en caso contrario devuelve -1)
    static long sumaIntervalo(long long1, long long2) {
        long suma = 0;
        if (long2 < long1 || long1 <= 0 || long2 < 00) {
            return -1;
        } else {
            for (long i = long1; i <= long2; i++) {
                suma += i;
            }
        }
        return suma;
    }
    
    //• Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros
    //que tiene.
    static int sumarCeros(String cadena){
        int suma=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='0'){
                suma++;
            }
        }
        
        
        return suma;
    }
    
    //• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al
    //azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos
    //mayores que cero, en caso contrario devuelve -1) 
    static int aleatorio(int entero1, int entero2){
        Random random=new Random();
        if(entero2<entero1|| entero1<=0||entero2<=0){
            return -1;
        }else{
            return random.nextInt(entero1, entero2+1);//los incluyo
        }
    }

}
