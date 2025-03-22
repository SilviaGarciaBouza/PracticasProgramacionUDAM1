/*
Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado. La
función controlará las posibles excepciones (por ejemplo caracteres no numéricos).
 */
package com.tema12;

import java.util.Scanner;
import org.w3c.dom.ranges.RangeException;

/**
 *
 * @author silvia.garciabouza
 */
public class EJ06_v2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int max, min, numeroIntroducido = 0;
        System.out.println("Escribe un numero para el rango mayor: ");
        max = Integer.parseInt(scanner.nextLine());
        System.out.println("Escribe un numero para el rango menos: ");
        min = Integer.parseInt(scanner.nextLine());
        if (min > max) {
            min = max + min;
            max = min - max;
            min = min - max;
        }
        boolean esCorrecto;
        do {
            try {
                leerEnteros(max, min);
                esCorrecto = true;
            } catch (RangoExcepcion ex) {
                esCorrecto = false;
                System.out.println("Error: "+ex.getMessage());
            }
        } while (esCorrecto == false);

    }

    static public void leerEnteros(int max, int min) throws RangoExcepcion {
        int numeroIntroducido;
        boolean esCorrecto = false;

        System.out.println("Escribe un numero: ");
        numeroIntroducido = Integer.parseInt(scanner.nextLine());
        if (numeroIntroducido < min || numeroIntroducido > max) {
            throw new RangoExcepcion();
        }

    }

    static public class RangoExcepcion extends Exception {

        @Override
        public String getMessage() {
            return "Fuera de Rango";
        }

    }
}
//sanitizar los imputs sanitiza los ciber ataques de inyeccionde codigo