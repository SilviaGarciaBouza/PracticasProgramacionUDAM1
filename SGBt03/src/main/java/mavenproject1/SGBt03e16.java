/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá
que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor
o si ha acertado. Se dispone de un máximo de 5 intentos. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e16 {

    public static void main(String[] args) {
        int numeroRandom;//0-99
        int numeroJugador;
        Scanner teclado = new Scanner(System.in);

        try {

            numeroRandom= (int) (Math.random()*99);//(Math.random()*99)+1;+1 si no quieres q incluya el 0
            
            for(int i=0; i<5;i++){
                System.out.printf("Adivina el numero aleatorio del 0 al 99 (tienes %d intentos): ", (5-i));
            numeroJugador = teclado.nextInt();
                if(numeroJugador==numeroRandom){
                System.out.println("¡Enhorabuena! has acertado el numero");
                        break;
            }else if(numeroJugador>numeroRandom){
                System.out.println("¡Mala suerte, no has acertado! Tu numero es mayor al de la maquina");
            
            }else if(numeroJugador<numeroRandom){
                System.out.println("¡Mala suerte, no has acertado! Tu numero es menor al de la maquina");
            }
            }
            
                
                
            
                    

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
