/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer un número entero y determinar si es mayor de 10.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        Boolean mayor10;

        try {
            System.out.print("Escribe un número entero: ");
            numero = teclado.nextInt();
            mayor10 = numero > 10;
            System.out.printf("El número es mayor de 10: %b", mayor10);
        } catch (Exception e) {
            System.out.println("Se ha producido un error " + e);
        }

    }
}
