/*
Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado. La
función controlará las posibles excepciones (por ejemplo caracteres no numéricos).*/
package com.tema12exceptions;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_06 {

    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int max, min, numero = 0;
        boolean esCorrecto;
        System.out.println("Introduce un valor maximo: ");
        max = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un valor minimo: ");
        min = Integer.parseInt(scanner.nextLine());
        if (min > max) {
            min = min + max;
            max = min - max;
            min = min - max;
        }

        do {
            try {
                int numeroIntroducido;
                System.out.println("Escribe un numero entero: ");
                numeroIntroducido = Integer.parseInt(scanner.nextLine());
                numero = leerEntero(max, min, numeroIntroducido);
                esCorrecto = true;
            } catch (RangoExcepcion ex) {
                esCorrecto = false;
                System.out.println("Error: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
                esCorrecto = false;
            }
        } while (esCorrecto == false);

        System.out.println("Numero correcto: " + numero);
    }

    static public int leerEntero(int max, int min, int numeroIntroducido) throws NumberFormatException, RangoExcepcion {

        if (numeroIntroducido > max || numeroIntroducido < min) {
            throw new RangoExcepcion();
        }
        return numeroIntroducido;
    }

    static class RangoExcepcion extends Exception {

        @Override
        public String getMessage() {
            return "Numero fuera de rango";
        }

    }
}

//version 2
//
//package com.tema12;
//
//import java.util.Scanner;
//
//public class EJ06 {
//
//    static public Scanner scaner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//      int numeroValido;
//        try {
//            numeroValido = leerEntero(10, 1);
//            System.out.println("Numero valido: " + numeroValido);
//        } catch (NumberFormatException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    
//    }
//
//   static public int leerEntero(int max, int min) throws NumberFormatException {
//        int numero = 0;
//        boolean esCorrecto = false;
//        do {
//            try {
//                System.out.println("Introduce un valor entre " + min + " y " + max);
//                numero = Integer.parseInt(scaner.nextLine());
//                if (numero < min || numero > max) {
//                    throw new ExcepcionRango();
//                }
//                esCorrecto = true;
//            } catch (ExcepcionRango e) {
//                System.out.println(e.getMessage());
//            } catch (NumberFormatException ex) {
//                System.out.println("Error: " + ex.getMessage());
//                System.out.println("Introduce un numero correcto");
//            }
//        } while (!esCorrecto);
//        return numero;
//    }
//
//    static class ExcepcionRango extends Exception {
//
//        @Override
//        public String getMessage() {
//            return "Numero fuera de rango";
//        }
//    }
//
//}
//version3
//import java.util.Scanner;
//import org.w3c.dom.ranges.RangeException;
//
///**
// *
// * @author silvia.garciabouza
// */
//public class EJ06_v2 {
//
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int max, min, numeroIntroducido = 0;
//        System.out.println("Escribe un numero para el rango mayor: ");
//        max = Integer.parseInt(scanner.nextLine());
//        System.out.println("Escribe un numero para el rango menos: ");
//        min = Integer.parseInt(scanner.nextLine());
//        if (min > max) {
//            min = max + min;
//            max = min - max;
//            min = min - max;
//        }
//        boolean esCorrecto;
//        do {
//            try {
//                leerEnteros(max, min);
//                esCorrecto = true;
//            } catch (RangoExcepcion ex) {
//                esCorrecto = false;
//                System.out.println("Error: "+ex.getMessage());
//            }
//        } while (esCorrecto == false);
//
//    }
//
//    static public void leerEnteros(int max, int min) throws RangoExcepcion {
//        int numeroIntroducido;
//        boolean esCorrecto = false;
//
//        System.out.println("Escribe un numero: ");
//        numeroIntroducido = Integer.parseInt(scanner.nextLine());
//        if (numeroIntroducido < min || numeroIntroducido > max) {
//            throw new RangoExcepcion();
//        }
//
//    }
//
//    static public class RangoExcepcion extends Exception {
//
//        @Override
//        public String getMessage() {
//            return "Fuera de Rango";
//        }
//
//    }
//}
////sanitizar los imputs sanitiza los ciber ataques de inyeccionde codigo
