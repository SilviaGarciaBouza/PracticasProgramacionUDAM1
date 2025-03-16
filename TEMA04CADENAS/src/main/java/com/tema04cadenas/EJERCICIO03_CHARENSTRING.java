/*
Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos
muestre cuantas veces está contenido el carácter en la cadena. 
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO03_CHARENSTRING {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        char caracteraBuscar;
        int contadorCaracter=0;
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida= teclado.nextLine();
        System.out.println("Introduce el caracter a buscar en la cadena: ");
        caracteraBuscar= teclado.nextLine().charAt(0);
        
        for(int i=0; i<cadenaIntroducida.length();i++){
            if(cadenaIntroducida.charAt(i)==caracteraBuscar){
                contadorCaracter++;
            }
        }
        System.out.println("EL caracter "+caracteraBuscar+" se encuentra "+contadorCaracter+" veces.");
        
    }
    
}
