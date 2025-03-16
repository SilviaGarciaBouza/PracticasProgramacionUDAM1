/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-20
 * Ejercicio: diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste
en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String) 
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e14 {

    public static void main(String[] args) {

        int dni, numeroResto;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduce tu número de dni: ");
            dni = teclado.nextInt();
            numeroResto = dni % 23;
            switch (numeroResto) {
                case 0 ->  {
                    System.out.print("La letra para este número de dni es: T");
                }
                case 1 ->  {
                    System.out.print("La letra para este número de dni es: R");
                }
                case 2 ->  {
                    System.out.print("La letra para este número de dni es: W");
                }
                case 3 ->  {
                    System.out.print("La letra para este número de dni es: A");
                }
                case 4 ->  {
                    System.out.print("La letra para este número de dni es: G");
                }
                case 5 ->  {
                    System.out.print("La letra para este número de dni es: M");
                }
                case 6 ->  {
                    System.out.print("La letra para este número de dni es: Y");
                }
                case 7 ->  {
                    System.out.print("La letra para este número de dni es: F");
                }
                case 8 ->  {
                    System.out.print("La letra para este número de dni es: P");
                }
                case 9 ->  {
                    System.out.print("La letra para este número de dni es: D");
                }
                case 10 ->  {
                    System.out.print("La letra para este número de dni es: X");
                }
                case 11 ->  {
                    System.out.print("La letra para este número de dni es: B");
                }
                case 12 ->  {
                    System.out.print("La letra para este número de dni es: N");
                }
                case 13 ->  {
                    System.out.print("La letra para este número de dni es: J");
                }
                case 14 ->  {
                    System.out.print("La letra para este número de dni es: Z");
                }
                case 15 ->  {
                    System.out.print("La letra para este número de dni es: N");
                }
                case 16 ->  {
                    System.out.print("La letra para este número de dni es: Q");
                }
                case 17 ->  {
                    System.out.print("La letra para este número de dni es: V");
                }
                case 18 ->  {
                    System.out.print("La letra para este número de dni es: H");
                }
                case 19 ->  {
                    System.out.print("La letra para este número de dni es: L");
                }
                case 20 ->  {
                    System.out.print("La letra para este número de dni es: C");
                }
                case 21 ->  {
                    System.out.print("La letra para este número de dni es: K");
                }
                case 22 ->  {
                    System.out.print("La letra para este número de dni es: E");
                }
                default -> {
                    System.out.print("No hay letra para ese número de dni");
                }

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }

    }
}
