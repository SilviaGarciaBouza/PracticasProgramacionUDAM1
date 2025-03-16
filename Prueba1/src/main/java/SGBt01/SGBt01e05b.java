/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: un departamento de climatología ha realizado recientemente su conversión al sistema
métrico. Diseñar un algoritmo para realizar las siguientes conversiones:
• Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en
centímetros (25.5 mm = 1 pulgada). Resultado redondeado a un decimal.
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt01e05b {

    public static void main(String[] args) {
        final double MMPULGADA = 25.5;
        Scanner miConsola = new Scanner(System.in);
        double valorAguaEnPulgadas, valorAguaCentimetros;
        DecimalFormat df1decimal = new DecimalFormat("#.#");
   
        try {
            System.out.print("\nEscribe la cantidad de agua del pluviómetro en pulgadas: ");
            valorAguaEnPulgadas = miConsola.nextDouble();
            valorAguaCentimetros = (MMPULGADA / 10.0) * valorAguaEnPulgadas;
            System.out.print("Valor de la cantidad de agua del pluviómetros en centímetros: " + df1decimal.format(valorAguaCentimetros));
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
