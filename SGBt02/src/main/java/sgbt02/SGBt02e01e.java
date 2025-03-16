/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01e {

    public static void main(String[] args) {
        int numero1, numero2;
        Boolean mayor10;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un numero entero: ");
            numero1 = teclado.nextInt();
            System.out.print("Escribe otro numero entero: ");
            numero2 = teclado.nextInt();
            mayor10 = (numero1 > 10) || (numero2 > 10);
            if (mayor10) {
                System.out.printf( "%d y %d son al menos uno de los dos mayores de 10", numero1, numero2);
            } else {
                System.out.printf("%d y %d no son al menos uno de los dos mayores de 10", numero1,numero2);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
