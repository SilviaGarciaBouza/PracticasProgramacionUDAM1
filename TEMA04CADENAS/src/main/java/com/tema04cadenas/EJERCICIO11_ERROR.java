/*
Describe que realiza el código siguiente e indica si contiene algún error.
 java.util.Scanner teclado = new java.util.Scanner(System.in);
 System.out.println("Introduce una cadena:");
 String cadena = teclado.nextLine();
 StringBuilder cadenaSB = new StringBuilder(cadena);
 int pos;
 do {
 pos = cadenaSB.indexOf(" ");
 if (pos!=-1) cadenaSB.deleteCharAt(pos);
 } while (pos != -1);
 System.out.println(cadenaSB); 
 */
package com.tema04cadenas;

/**
 *
 * @author silvia
 */
public class EJERCICIO11_ERROR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
