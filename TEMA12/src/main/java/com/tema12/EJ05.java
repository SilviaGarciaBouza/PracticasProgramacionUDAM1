/*
Haz un programa que, desde el main(), solicite al usuario que introduzca tres enteros,
correspondientes a día, mes y año de una fecha. Realiza una función llamada validarFecha() que
reciba esos tres valores e intentar construir una fecha con LocalDate.of devolviendo true si la fecha
es válida o false si la fecha es inválida, es decir si se produce una excepción al construirla.
• En caso de que los valores introducidos no sean enteros, el main() avisará de tal situación
capturando la excepción en tipos de datos incorrectos al hacer el nextInt().
• Si la función no es capaz de crear la fecha porque los valores no se corresponden con valores
válidos, capturará esa excepción. Así pues, habrá un try…catch en el main() y otro en la
función. 
 */
package com.tema12;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ05 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.println("Introduce la fecha:");
        try {
            System.out.println("Intoduce el numero del dia: ");
            dia = Integer.parseInt(scaner.nextLine());
            System.out.println("Intoduce el numero del mes: ");
            mes = Integer.parseInt(scaner.nextLine());
            System.out.println("Intoduce el año: ");
            año = Integer.parseInt(scaner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("La fecha es valida: "+validarFecha(dia, mes, año));
    }

    static public boolean validarFecha(int dia, int mes, int año) {

        try {
            LocalDate fecha = LocalDate.of(año, mes, dia);
        } catch (DateTimeException ex) {
            return false;
        }
        return true;
    }

}
