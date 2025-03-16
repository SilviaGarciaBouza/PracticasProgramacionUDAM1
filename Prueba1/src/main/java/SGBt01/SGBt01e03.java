/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: realiza un programa que lea por consola dos números enteros (sin decimales) y nos muestre
 *los resultados de sumar, restar y dividir dichos números. Comprueba que la división responde con
 * decimales
 */
package SGBt01;

import java.util.Scanner;

public class SGBt01e03 {

    public static void main(String[] args) {

        int numero1, numero2, suma, resta;
        double division;
        Scanner miConsola = new Scanner(System.in);
        try {
            System.out.print("Escribe un número sin decimales: ");
            numero1 = miConsola.nextInt();
            System.out.print("Escribe otro número sin decimales: ");
            numero2 = miConsola.nextInt();
            suma = numero1 + numero2;
            resta = numero1 - numero2;
            division = (double) numero1 / numero2;

            System.out.println("\nSuma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("División: " + division);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
