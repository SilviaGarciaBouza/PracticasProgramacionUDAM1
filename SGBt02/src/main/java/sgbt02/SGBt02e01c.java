/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer un número entero y determinar si se trata de un número par o impar.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01c {

    public static void main(String[] args) {
        int numero1;
        boolean esPar;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un número entero: ");
            numero1 = teclado.nextInt();
            esPar = numero1 % 2 == 0;
            if (esPar) {
                System.out.printf("%d es un número par", numero1);
            } else {
                System.out.printf("%d es un número impar", numero1);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
