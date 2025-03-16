/*
Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.

4.5. (Opcional) Realiza un programa que muestre una contraseña generada aleatoriamente
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre
la ‘a’ y la ‘j’ pero sin letras repetidas. 
 */
package com.tema04cadenas;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class EJERCICIO04_CONTRASEÑA {

   
    public static void main(String[] args) {
        //Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
        //siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.
        Random random= new Random();
        String cadenaLetras="abcdefghij";
        int longitud;
        StringBuilder contraseña= new StringBuilder();
        
        longitud= random.nextInt(5, 11);
        for(int i=0; i<longitud; i++){
            contraseña.append(cadenaLetras.charAt(random.nextInt(0,10)));
        }
        System.out.println("La contraseña generada es: "+contraseña);
        
        //Realiza un programa que muestre una contraseña generada aleatoriamente
        //teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre
        //la ‘a’ y la ‘j’ pero sin letras repetidas. 
        StringBuilder cadenaLetras2=new StringBuilder("abcdefghij");
        int longitud2;
        StringBuilder contraseña2= new StringBuilder();
        
          longitud= random.nextInt(5, 11);
        for(int i=0; i<longitud; i++){
            int nuemro=random.nextInt(0,cadenaLetras2.length());
            contraseña2.append(cadenaLetras2.charAt(nuemro));
            cadenaLetras2.deleteCharAt(nuemro);
            
        }
        System.out.println("La contraseña generada es: "+contraseña2);
        
    }
    
}
