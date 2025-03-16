/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio:   Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.


 */
package com.sgbboletinbubles;

import java.util.Random;
import java.util.Scanner;

public class SGBBoletinBucles07 {

    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner keyboard = new Scanner(System.in);
        int myPassword, triedPassword;
        myPassword= myRandom.nextInt(0,10000);
        
        try {
            for (int i = 0; i < 4; i++) {
                System.out.printf("Introduce la conbinación de la caja fuerte (te quedan %d intentos) de cuatro cifras: ", 4 - i);
                triedPassword = Integer.parseInt(keyboard.nextLine());
                if (triedPassword == myPassword) {
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                    break;
                } else {
                    System.out.println("Lo siento, esa no es la combinación");

                }

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error " + e);
        }
    }

}
