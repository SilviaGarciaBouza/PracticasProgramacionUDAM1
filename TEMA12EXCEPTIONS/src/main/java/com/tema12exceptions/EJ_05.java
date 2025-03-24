/*
Haz un programa que, desde el main(), solicite al usuario que introduzca tres enteros,
correspondientes a día, mes y año de una fecha. Realiza una función llamada validarFecha() que
reciba esos tres valores e intentar construir una fecha con LocalDate.of devolviendo true si la fecha
es válida o false si la fecha es inválida, es decir si se produce una excepción al construirla.
• En caso de que los valores introducidos no sean enteros, el main() avisará de tal situación
capturando la excepción en tipos de datos incorrectos al hacer el nextInt().
• Si la función no es capaz de crear la fecha porque los valores no se corresponden con valores
válidos, capturará esa excepción. Así pues, habrá un try…catch en el main() y otro en la
 */
package com.tema12exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia=0, mes=0, año=0;
        try{
        System.out.println("Vamos a escribir una fecha:");
        System.out.println("Escribe un numero etero para el dia: ");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un segundo numero etero para el mes: ");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un tercer numero etero para el año: ");
        año = Integer.parseInt(teclado.nextLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        System.out.println("La fecha es correcta: "+validadFecha(dia, mes, año));
    }
    
    static public boolean validadFecha(int dia, int mes, int año){
         LocalDate fecha=LocalDate.now();
         boolean esCorrecto;
        try{
         fecha = LocalDate.of(año,mes,dia);
         esCorrecto=true;
        }catch(DateTimeParseException ex){
            esCorrecto=false;
             System.out.println("Error: "+ex.getMessage());
        }catch(DateTimeException ex){
            esCorrecto=false;
             System.out.println("Error: "+ex.getMessage());
        }
        return esCorrecto;
    }

}
