/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos
 * números son iguales
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01h {

    public static void main(String[] args) {
        double numero1, numero2;

        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un numero: ");
            numero1 = teclado.nextDouble();
            System.out.print("Escribe otro numero: ");
            numero2 = teclado.nextDouble();
            
            if (numero1 > numero2) {
                System.out.printf("%.2f es mayor que %.2f",numero1,numero2);
            } else if (numero1 < numero2) {
                System.out.printf("%.2f es menor que %.2f",numero1,numero2);
            } else {
                System.out.println(numero1 + " es igual que "+numero2);
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
