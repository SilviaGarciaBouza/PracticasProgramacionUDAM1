/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-22
 * Ejercicio: realiza un programa en Java que calcule el área de un cuadrado dado el lado. El valor del
lado será uno cualquiera
 */
package sgbt01ampliacion;

import java.util.Scanner;

public class SGBt01Ampliacione01 {

    public static void main(String[] args) {
        double ladoCuadrado, areaCuadrado;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe el valor del lado del cuadrado: ");
            ladoCuadrado = teclado.nextDouble();
            areaCuadrado = Math.pow(ladoCuadrado, 2);

            System.out.printf("El area del cuadraco con lado %.2f es: %.2f", ladoCuadrado, areaCuadrado);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }
    }
}
