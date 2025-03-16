/*
Hacer un programa que permita calcular el sueldo final de los vendedores de un
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al
menos introducen los datos de un empleado).
En este tipo de ejercicios hay que distinguir el bucle (repito el proceso mientas.....)
y luego las operaciones que hago con cada uno.
 */
package com.practica;

import java.util.Scanner;

public class E22CalcularSueldo {

    public static void main(String[] args) {

        int sueldoBase, horasExtras, ventas, pagoVentas, sueldoFinal, masventas=0, sueldoMasVentas=0, horasMasVentas=0;
        Scanner teclado = new Scanner(System.in);
        boolean masEmpleados = true;

        do {
            System.out.println("Escribe el sueldo base:");
            sueldoBase = Integer.parseInt(teclado.nextLine());
            System.out.println("Horas Extras: ");
            horasExtras = Integer.parseInt(teclado.nextLine());
            System.out.println("numero de ventas: ");
            ventas = Integer.parseInt(teclado.nextLine());
            if(ventas>masventas){
                masventas=ventas;
                sueldoMasVentas=sueldoBase;
                horasMasVentas=horasExtras;
            }
            
           

            System.out.println("¿introducir nuevo empleado? (si->true, no->false)");

            masEmpleados = Boolean.parseBoolean(teclado.nextLine());

        } while (masEmpleados == true);
         if (masventas > 10 && ventas <= 20) {
                pagoVentas = 500;
            } else if (masventas > 21 && ventas <= 30) {
                pagoVentas = 1000;
            } else if (masventas > 30) {
                pagoVentas = 1300;
            } else {
                pagoVentas = 0;
            }
        sueldoFinal = sueldoMasVentas + (horasMasVentas * 100) + pagoVentas;
        System.out.println("Salario final del empleado con mas ventas es: "+ sueldoFinal);
        System.out.println("Total ventas del empleado con mas ventas es: "+ masventas);

    }

}
