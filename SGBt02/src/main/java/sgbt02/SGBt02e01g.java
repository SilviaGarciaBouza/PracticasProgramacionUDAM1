/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer dos números enteros y diga si uno y solo uno es mayor de 10.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e01g {

    public static void main(String[] args) {
        int numero1, numero2;
        Boolean unoSoloMayor10;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe un numero entero: ");
            numero1 = teclado.nextInt();
            System.out.print("Escribe otro numero entero: ");
            numero2 = teclado.nextInt();
            unoSoloMayor10 = (((numero1 > 10) && (numero2 <= 10)) || ((numero2 > 10) && (numero1 <= 10)));
            if (unoSoloMayor10) {
                System.out.printf("De los números %d y %d , es solo uno de los dos mayor de 10",numero1,numero2);
            } else {
                System.out.printf("De los números %d y %d , no es solo uno de los dos mayor de 10", numero1,numero2);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
