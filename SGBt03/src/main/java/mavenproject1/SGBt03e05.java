/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta
que se teclee el -1.
Para sumar valores e ir acumulando esa suma se suele emplear una estructura
con la siguiente forma. Antes del bucle: acumulador = 0. Y dentro del bucle
acumulador = acumulador + nuevo valor. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e05 {

    public static void main(String[] args) {
        double acumulador = 0.00, numeroIntroducido;
        Scanner teclado = new Scanner(System.in);
        try {
            do {

                System.out.println("Introduce un número positivo (-1 para finalizar): ");
                numeroIntroducido = teclado.nextDouble();
                if (numeroIntroducido <= 0 && numeroIntroducido != -1) {
                    System.out.println("Numero incorrecto.");
                } else if(numeroIntroducido>=1){
                    acumulador += numeroIntroducido;
                }
            } while (numeroIntroducido != -1);

            System.out.println("La suma de los numeros introducidos es: " + acumulador);


        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);

        }

    }
}
