/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir
 * divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer
 * un solo if
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01j {

    public static void main(String[] args) {
        double numero1, numero2;

        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un numero: ");
            numero1 = teclado.nextDouble();
            System.out.print("Escribe otro numero: ");
            numero2 = teclado.nextDouble();

            if ((numero1 != 0 && numero1 < numero2 && numero2 % numero1 == 0)) {
                System.out.printf("%.2f es divisor de %.2f", numero1, numero2);

            } else if (numero2 != 0 && numero2 < numero1 && numero1 % numero2 == 0) {
                System.out.printf("%.2f es divisor de %.2f", numero2, numero1);

            } else {
                System.out.printf("%.2f no es divisor de %.2f", numero1, numero2);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
