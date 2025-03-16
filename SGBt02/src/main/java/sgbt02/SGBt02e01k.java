/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer un número y decir si es múltiplo de 2, de 3 y/o de 10. Si no es múltiplo de 2 ya no
 * hay que mirar si lo es de 10.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01k {

    public static void main(String[] args) {
        double numero1;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un número: ");
            numero1 = teclado.nextDouble();
            if (numero1 % 2 == 0) {
                System.out.printf("\nEl numero %.2f es multiplo de 2", numero1);
                if (numero1 % 5 == 0) {
                    System.out.printf("\nEl numero %.2f es multiplo de 10", numero1);
                } else {
                    System.out.printf("\nEl numero %.2f no es multiplo de 10", numero1);
                }
            } else {
                System.out.printf("\nEl numero %.2f no es multiplo de 2", numero1);
                System.out.printf("\nEl numero %.2f no es multiplo de 10", numero1);
            }
            if (numero1 % 3 == 0) {
                System.out.printf("\nEl numero %.2f es multiplo de 3", numero1);
            } else {
                System.out.printf("\nEl numero %.2f no es multiplo de 3", numero1);

            }
        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
