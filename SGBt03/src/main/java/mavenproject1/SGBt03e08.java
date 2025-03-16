/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: calcula la suma de los 100 numeros siguientes (no incluye el numero tecleado)a uno introducido por el teclado */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e08 {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            int sumaNums = 0;
            for (int i = 1; i <= 100; i++) {
                sumaNums += (num + i);

            }
            System.out.println("La suma de los 100 numeros siguientes al introducido por el teclado es: " + sumaNums);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
