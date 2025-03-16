/*
Escribe un programa que detecte si una palabra es anagrama de otra, es decir, si tiene las
mismas letras es distinta posición. Son ejemplo de anagrama, las palabras creativo y reactivo.
Suponemos que si tienen letras repetidas, en la otra palabra no se tienen que repetir en la misma
cantidad; es decir, damos por válido como anagrama el texto abba y aaab.

 */
package com.sgbboletinstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class anagrama {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String primeraPalabra, segundaPalabra;
        System.out.println("Escribe una palabra: ");
        primeraPalabra = teclado.nextLine();
        System.out.println("Escribe otra palabra: ");
        segundaPalabra = teclado.nextLine();
        boolean esAnagrama = true;

        if (primeraPalabra.length() == segundaPalabra.length()) {
            for (int i = 0; i < primeraPalabra.length(); i++) {
                if (primeraPalabra.length() - primeraPalabra.replace(Character.toString(primeraPalabra.charAt(i)), "").length()
                        != segundaPalabra.length() - segundaPalabra.replace(Character.toString(primeraPalabra.charAt(i)), "").length()) {
                    esAnagrama = false;
                    break;
                }
            }
        } else {
            esAnagrama = false;
        }

        if (esAnagrama == true) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }

    }

}
