/*

 */
package com.tema06clases;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO002_FUNCIONESSTRINGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir al usuario una frase
        Scanner teclado = new Scanner(System.in);
        String miCadena;
        System.out.println("Escribe una frase");
        miCadena= teclado.nextLine();
        System.out.println(invertirCadena(miCadena));
        
        
    }
    
    
    
    public static String invertirCadena(String cadena){
        StringBuilder nuevaCadena= new StringBuilder();
        for(int i=cadena.length()-1; i>=0;i--){
            nuevaCadena.append(cadena.charAt(i));
        }
        
        return nuevaCadena.toString();
    }
    
}
