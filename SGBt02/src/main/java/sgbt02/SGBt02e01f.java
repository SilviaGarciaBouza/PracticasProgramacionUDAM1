/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos). 
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01f {

    public static void main(String[] args) {
        int numero1;
        Boolean entre10Y20;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un número entero: ");
            numero1 = teclado.nextInt();
            entre10Y20 = numero1>= 10 && numero1<=20;
            if (entre10Y20) {
                System.out.printf("%d es un número comprendido entre 10 y 20 (ambos incluidos)", numero1);
            } else {
                System.out.printf("%d no es un número comprendido entre 10 y 20 (ambos incluidos)",numero1);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}

