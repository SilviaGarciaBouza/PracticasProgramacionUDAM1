/*
Haz un programa que introducido un texto lo escriba sin las vocales que tenía.
 */
package com.sgbboletinstrings;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class BorrarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoUsuario;
        String nuevoTexto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un texto: ");
        textoUsuario = teclado.nextLine();
       
        
        nuevoTexto = textoUsuario.replaceAll("[a,e,i,o,u]", "");
        System.out.println(nuevoTexto);
    }
    
}
