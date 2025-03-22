/*
Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado. La
función controlará las posibles excepciones (por ejemplo caracteres no numéricos).
 */
package com.tema12;

import java.util.Scanner;

public class EJ06 {

    static public Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
      int numeroValido;
        try {
            numeroValido = leerEntero(10, 1);
            System.out.println("Numero valido: " + numeroValido);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    }

   static public int leerEntero(int max, int min) throws NumberFormatException {
        int numero = 0;
        boolean esCorrecto = false;
        do {
            try {
                System.out.println("Introduce un valor entre " + min + " y " + max);
                numero = Integer.parseInt(scaner.nextLine());
                if (numero < min || numero > max) {
                    throw new ExcepcionRango();
                }
                esCorrecto = true;
            } catch (ExcepcionRango e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
                System.out.println("Introduce un numero correcto");
            }
        } while (!esCorrecto);
        return numero;
    }

    static class ExcepcionRango extends Exception {

        @Override
        public String getMessage() {
            return "Numero fuera de rango";
        }
    }

}
