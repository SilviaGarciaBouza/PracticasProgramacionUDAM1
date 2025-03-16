/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer tres números enteros y diga si hay alguno mayor que cero.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01l {

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
                System.out.println("Alguno de los valores introducidos es mayor de 0");
            } else{
                System.out.println("Ninguno de los valores introducidos es mayor de 0");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
