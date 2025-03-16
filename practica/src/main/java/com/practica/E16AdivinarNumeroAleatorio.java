/*
Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá
que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor
o si ha acertado. Se dispone de un máximo de 5 intentos.
 */
package com.practica;

import java.util.Scanner;

public class E16AdivinarNumeroAleatorio {

    public static void main(String[] args) {

        int num;
        int numRandom = (int) (Math.random() * 99);//(Math.random()*99)+1;+1 si no quieres q incluya el 0

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Escribe un numero tienes %d intentos: ", 5-i);
            num = Integer.parseInt(teclado.nextLine());

            if (num == numRandom) {
                System.out.println("Acertaste!");
                break;
            } else if (num < numRandom) {
                System.out.println("EL numero introducido es menor");
            }else{
                System.out.println("El numero introducido es mayor");
            }

        }
    }

}
