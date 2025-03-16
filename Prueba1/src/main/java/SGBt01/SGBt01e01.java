/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 * Ejercicio: realiza un programa que lea por consola un valor en euros y lo convierta a dólares (suponer
 * que 1 euro es igual a 1,14 dólares).
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt01e01 {

    public static void main(String[] args) {

        final double DOLARCONVERSOR = 1.14;

        double valorEuros, valorDolar;
        String valorDolarFormato;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            System.out.print("Escribe un valor en euros: ");
            valorEuros = teclado.nextDouble();
            if (valorEuros >= 0) {
                valorDolar = valorEuros * DOLARCONVERSOR;
                valorDolarFormato = df.format(valorDolar);
                System.out.println("\nValor en dólares: " + valorDolarFormato);
            } else {
                System.out.println("\nSe ha producido un error porque el valor no es positivo");
            }
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);
        }
    }

}
