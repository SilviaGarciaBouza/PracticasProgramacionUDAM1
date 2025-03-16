/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Hacer un programa que permita calcular el sueldo final de los vendedores de un
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al
menos introducen los datos de un empleado).
En este tipo de ejercicios hay que distinguir el bucle (repito el proceso mientas…..)
y luego las operaciones que hago con cada uno.  
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e22 {

    public static void main(String[] args) {
        int sueldoBase, numeroHorasExtra, numeroVentas, numeroVentasComparacion = 0, aumentoPorNumeroDeVentas, sueldoFinal = 0;
        boolean masVendedores = false;

        Scanner teclado = new Scanner(System.in);

        try {

            do {
                System.out.println("Introduce el sueldo base: ");
                sueldoBase = teclado.nextInt();
                System.out.println("Introduce el numero de horas extra: ");
                numeroHorasExtra = teclado.nextInt();
                System.out.println("Introduce el numero de ventas: ");
                numeroVentas = teclado.nextInt();
                if (numeroVentas >= numeroVentasComparacion) {
                    numeroVentasComparacion = numeroVentas;

                    if (numeroVentasComparacion <= 20 && numeroVentasComparacion >= 10) {
                        aumentoPorNumeroDeVentas = 500;
                    } else if (numeroVentas <= 30 && numeroVentas >= 21) {
                        aumentoPorNumeroDeVentas = 1000;
                    } else if (numeroVentas > 30) {
                        aumentoPorNumeroDeVentas = 1300;
                    } else {
                        aumentoPorNumeroDeVentas = 0;
                    }

                    sueldoFinal = sueldoBase + (numeroHorasExtra * 100) + aumentoPorNumeroDeVentas;

                }

                System.out.println("¿Hay mas vendedores a tratar? (true/false)");
                masVendedores = teclado.nextBoolean();
            } while (masVendedores == true);
            System.out.println("total de ventas del vendedor con mas ventas: " + numeroVentasComparacion);

            System.out.println("Sueldo final del vendedor con mas ventas: " + sueldoFinal);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
