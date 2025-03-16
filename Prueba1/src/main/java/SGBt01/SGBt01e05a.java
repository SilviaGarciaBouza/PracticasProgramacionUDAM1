/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: un departamento de climatología ha realizado recientemente su conversión al sistema
métrico. Diseñar un algoritmo para realizar las siguientes conversiones:
• Leer por consola la temperatura dada en la escala Celsius y mostrar su equivalente
Fahrenheit (la fórmula de conversión es “F=9/5 oC+32”). Resultado redondeado a dos
decimales.
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt01e05a {

    public static void main(String[] args) {
        Scanner miConsola = new Scanner(System.in);
        double valorCelsius, valorFahrenheit;
        DecimalFormat df2decimales = new DecimalFormat("#.##");
        

        try {
            System.out.print("Escribe el valor en Celsius: ");
            valorCelsius = miConsola.nextDouble();
            valorFahrenheit = 9.0 / 5.0 * valorCelsius + 32;
            System.out.print("\nValor en Fahrenheit: " + df2decimales.format(valorFahrenheit));
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);
        }
        

    }

}
