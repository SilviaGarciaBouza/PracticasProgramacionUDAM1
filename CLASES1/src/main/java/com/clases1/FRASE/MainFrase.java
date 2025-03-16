/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.clases1.FRASE;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fraseIntroducida;

        System.out.println("Escribe una frase: ");
        fraseIntroducida = teclado.nextLine();
        Frase frase1 = new Frase(fraseIntroducida);
        System.out.println(frase1.eliminarBlacos());
        System.out.println(frase1.contarLetras());
        System.out.println(frase1.invertirFrase());
        System.out.println(frase1.contarPalabras());
        System.out.println(Arrays.toString(frase1.separarPalabras()));
        String[] micadenaArray = frase1.separarPalabras();
         for (String i : micadenaArray) {
            System.out.println(i);
        }
        System.out.println(frase1.primeraVocal());
        System.out.println(frase1.ultimaPosicion());
        System.out.println(frase1.comprobarMayuscula());
        System.out.println(frase1.convertirMayusculas());
         System.out.println(Arrays.toString(frase1.vectorizar()));
    }

}
