/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01m {

    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un número entero: ");
            numero1 = teclado.nextInt();
            System.out.print("Escribe un número entero: ");
            numero2 = teclado.nextInt();
            System.out.print("Escribe un número entero: ");
            numero3 = teclado.nextInt();
            if (numero1 > 0 || numero2 > 0 || numero3 > 0) {
                if (numero1 > 0 && numero2 > 0 && numero3 > 0) {
                    System.out.println("Alguno de los valores introducidos es mayor de 0 pero no todos: falso");
                } else {
                     System.out.println("Alguno de los valores introducidos es mayor de 0 pero no todos: verdadero");
                }
            } else {
                System.out.println("Alguno de los valores introducidos es mayor de 0 pero no todos: falso");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
