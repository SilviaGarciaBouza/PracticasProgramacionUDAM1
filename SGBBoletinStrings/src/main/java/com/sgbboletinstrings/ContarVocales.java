/*
3. Escribe un programa que cuente las vocales y cuente las consonantes de un texto introducido.
 */
package com.sgbboletinstrings;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class ContarVocales {

    public static void main(String[] args) {
        String palabraIntroducida;
        Scanner teclado = new Scanner(System.in);
        int contadorVocales = 0, contadorConsonantes = 0;

        System.out.println("Introduce un texto: ");
        palabraIntroducida = teclado.nextLine();

        for (int i = 0; i < palabraIntroducida.length(); i++) {
            if (palabraIntroducida.charAt(i) == 'a' || palabraIntroducida.charAt(i) == 'e' || palabraIntroducida.charAt(i) == 'i' || palabraIntroducida.charAt(i) == 'o' || palabraIntroducida.charAt(i) == 'u') {
                contadorVocales++;
            } else if (Character.isLetter(palabraIntroducida.charAt(i))) {
                contadorConsonantes++;
            }
        }

        System.out.println("Consonantes: " + contadorConsonantes);
        System.out.println("Vocales: " + contadorVocales);
    }

}
