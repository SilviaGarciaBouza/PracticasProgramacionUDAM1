/*
. Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones
impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g”
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO15_SUSTITUIRASTERISCOS {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        String cadena;
        StringBuilder resultado= new StringBuilder();
        System.out.println("Introduce una cadena de caracteres: ");
        cadena= teclado.nextLine();
        for(int i= 1; i<=cadena.length();i++){
            if(i%2==0){
                resultado.append(cadena.charAt(i-1));
            }else{
                resultado.append('*');
            }
        }
        
        System.out.println(resultado);
        
    }
    
}
