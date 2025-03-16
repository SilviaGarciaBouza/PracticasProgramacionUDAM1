/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son
 * negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de
 * los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el
 * tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer
 * que el cero es un número positivo). Hacer el programa lo más sencillo posible.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e02 {

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

            if (numero1 < 0 && numero2 < 0 && numero3 < 0) {
                System.out.println("El producto de los tres números introducidos es: " + (numero1 * numero2 * numero3));
            } else if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
                System.out.println("La suma de los tres números introducidos es: " + (numero1 + numero2 + numero3));
            } else {
                System.out.println("La suma de los dos primeros números introducidos y multiplicada  por el tercer número introducido es : " + ((numero1 + numero2) * numero3));

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
