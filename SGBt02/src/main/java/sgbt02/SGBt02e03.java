/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la
nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes
situaciones:
• Nota examen mayor o igual a 5
• Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5.
• Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración
del trabajo en clase.
Diseñar un algoritmo al que se le introduzcan por consola la nota del examen, la valoración del
trabajo en clase y la nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en
con una sola sentencia condicional. 
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e03 {

    public static void main(String[] args) {
        double notaExamen, notaTrabajoClase, notaTrabajoPractico;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe la nota del examen: ");
            notaExamen = teclado.nextDouble();
            System.out.print("Escribe la nota del trabajo de clase: ");
            notaTrabajoClase = teclado.nextDouble();
            System.out.print("Escribe la nota del trabajo práctico: ");
            notaTrabajoPractico = teclado.nextDouble();

            if (notaExamen >= 5) {
                System.out.println("El alumno está aprobado");
            } else if (notaExamen == 4 && notaTrabajoClase > 5 && notaTrabajoPractico > 5) {
                System.out.println("El alumno está aprobado");

            } else if (notaExamen == 4 && (notaTrabajoClase > 8 || notaTrabajoPractico > 8)) {
                System.out.println("El alumno está aprobado");
            } else {
                System.out.println("El alumno no está aprobado");

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}


