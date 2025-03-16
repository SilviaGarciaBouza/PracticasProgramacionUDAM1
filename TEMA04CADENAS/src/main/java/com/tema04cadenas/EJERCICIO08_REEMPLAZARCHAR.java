/*
Realizar un programa que solicite una cadena, un número que indica una posición de la
cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la
posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con
StringBuilder. 
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO08_REEMPLAZARCHAR {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        //Con string
        String cadenaIntroducida;
        String cadenaModificada;
        char letra;
        int numero;
        
        System.out.println("Indica una cadena de caracteres: ");
        cadenaIntroducida= teclado.nextLine();
        System.out.println("Escribe una letra: ");
        letra= teclado.nextLine().charAt(0);
        System.out.println("Escribe un numero que indique la posicion: ");
        numero= Integer.parseInt(teclado.nextLine());
        
        cadenaModificada= cadenaIntroducida.replace(cadenaIntroducida.charAt(numero), letra);
        System.out.println(cadenaModificada);
        
        //Con stringbuilder
        StringBuilder cadenaIntroducida2= new StringBuilder();
        
        char letra2;
        int numero2;
        
        System.out.println("Indica una cadena de caracteres: ");
        cadenaIntroducida2.append(teclado.nextLine());
        System.out.println("Escribe una letra: ");
        letra2= teclado.nextLine().charAt(0);
        System.out.println("Escribe un numero que indique la posicion: ");
        numero2= Integer.parseInt(teclado.nextLine());
        
        cadenaIntroducida2.deleteCharAt(numero);
        cadenaIntroducida2.insert(numero2, letra2);
        System.out.println(cadenaIntroducida2);
        
    }
    
}
