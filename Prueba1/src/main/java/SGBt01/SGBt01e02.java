/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 * Ejercicio: realiza un programa que lea por consola un valor en dólares y lo convierta a euros (suponer
 * que 1 euro es igual a=1,14 dólares).
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SGBt01e02 {

   
    public static void main(String[] args) {

        final double EUROCONVERSOR = 1.14;
        Scanner teclado = new Scanner(System.in);
        double valorEuros, valorDolares;
        String valorEuroFormato;
        DecimalFormat df = new DecimalFormat("#.##");
        try {
            System.out.print("Escribe tu valor en dólares: ");
            valorDolares = teclado.nextDouble();
            valorEuros = valorDolares / EUROCONVERSOR;
            if (valorEuros >= 0) {
                valorEuroFormato = df.format(valorEuros);
                System.out.println("\nValor en euros: " + valorEuroFormato);
            } else {
                System.out.println("\nSe ha producido un error porque el valor no es positivo");
            }
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);
        }

    }

}
