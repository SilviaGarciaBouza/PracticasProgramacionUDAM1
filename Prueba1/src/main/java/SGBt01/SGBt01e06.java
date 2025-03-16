/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: el coste de un automóvil nuevo para un comprador es la suma total del coste de fábrica del
vehículo, más el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de fábrica) y
añadiéndole finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con
beneficio de la tienda).
Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa que lea por
consola el coste inicial del automóvil y calcule el coste para el consumidor.
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt01e06 {

    public static void main(String[] args) {
        final double PORCENTAGEGANANCIAEMPRESA = 0.10;
        final double PORCENTAJEIMPUESTOS = 0.20;

        double costeTotalAuto, costeFabrica, gananciaEmpresa, impuestos;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            System.out.print("Escribe el precio del automóvil: ");
            costeFabrica = teclado.nextDouble();
            if (costeFabrica >= 0) {
                gananciaEmpresa = PORCENTAGEGANANCIAEMPRESA * costeFabrica;
                impuestos = PORCENTAJEIMPUESTOS * (costeFabrica + gananciaEmpresa);
                costeTotalAuto = costeFabrica + gananciaEmpresa + impuestos;
                System.out.print("\nEl coste final del automóvil: " + df.format(costeTotalAuto));

            } else {
                System.out.println("\nSe ha producido un error, el valor debe ser positivo.");
            }
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);

        }

    }}
