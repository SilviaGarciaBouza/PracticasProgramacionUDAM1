/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la
media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. ¿Sería
posible hacerlo con una sola variable?
 */
//Versión con 2 variables:
package SGBt01;

import java.util.Scanner;

public class SGBt01e08b {

    public static void main(String[] args) {
        Scanner miConsola = new Scanner(System.in);
        int edadPersona, sumaEdades;

        try {

            System.out.print("Escribe la edad de la primera persona: ");
            edadPersona = miConsola.nextInt();
            sumaEdades = edadPersona;
            System.out.print("Escribe la edad de la segunda persona: ");
            edadPersona = miConsola.nextInt();
            sumaEdades += edadPersona;
            System.out.print("Escribe la edad de la tercera persona: ");
            edadPersona = miConsola.nextInt();
            sumaEdades += edadPersona;
            System.out.print("Escribe la edad de la cuarta persona: ");
            edadPersona = miConsola.nextInt();
            sumaEdades += edadPersona;

            System.out.println("\nLa edad media de las cuatro personas es de: " + (sumaEdades / 4.0));

        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);
        }
    }

}
