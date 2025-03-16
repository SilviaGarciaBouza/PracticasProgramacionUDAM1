/*
  * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre
1 y 10, y mostrar su tabla de multiplicar. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e04 {

    public static void main(String[] args) {
        int numeroEntero;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Escribe un numero entero entre el 1 y el 10: ");
            numeroEntero = teclado.nextInt();
            while (numeroEntero > 10 || numeroEntero < 1) {
                System.out.println("Numero incorrecto. Escribe un numero entero entre el 1 y el 10: ");
                numeroEntero = teclado.nextInt();
            }

            if (numeroEntero >= 1 && numeroEntero <= 10) {
                for (int i = 0; i <= 10; i++) {
                    int producto = numeroEntero * i;
                    System.out.printf("\n%dx%d=%d", numeroEntero, i, producto);
                }
            } else {
                System.out.println("El numero introducido no se encuentra entre el 1 y el 10");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error" + e);
        }

    }

}
