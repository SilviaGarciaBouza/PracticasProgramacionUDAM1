/*
Escribe un programa que borre de un texto una palabra que indique el usuario.
 */

package com.sgbboletinstrings;

import java.util.Scanner;

public class borrarPalabra {

    public static void main(String[] args) {
        
        String palabraUsuario;
        String textoUsuario;
        String nuevoTexto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un texto: ");
        textoUsuario = teclado.nextLine();
        System.out.println("Escribe una palabra: ");
        palabraUsuario = teclado.nextLine();
        
        nuevoTexto = textoUsuario.replace(palabraUsuario, "");
        System.out.println(nuevoTexto);
        
        
        
    }
}
