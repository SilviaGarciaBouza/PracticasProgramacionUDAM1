/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: queremos conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un
 *programa al que se le introduzcan por consola el número de suspensos, suficientes, notables y
 *sobresalientes de una asignatura, y nos calcule:
 *• El tanto por ciento de alumnos que han superado la asignatura.
 * • El tanto por ciento de notables y sobresalientes de la asignatura.
 *Trata de minimizar el número de operaciones realizadas. Los datos se introducen en variables sin
 *decimales, pero los porcentajes sí tienen decimales. ¿Tendría algún sentido pedirle al usuario que
 *introdujese el total de alumnos?
 */
package SGBt01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt01e04a {

    public static void main(String[] args) {
        int alumnosSuficientes, alumnosSuspensos, alumnosNotable, alumnosSobresaliente, alumnosTotales;

        double porcentajeAprobados, porcentajeNotables, porcentajeSobresalientes;
        Scanner miConsola = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {

            System.out.print("Introduce el número de alumnos suspensos: ");
            alumnosSuspensos = miConsola.nextInt();
            System.out.print("Introduce el número de alumnos aprobados con suficiente: ");
            alumnosSuficientes = miConsola.nextInt();
            System.out.print("Introduce el número de alumnos aprobados con notable: ");
            alumnosNotable = miConsola.nextInt();
            System.out.print("Introduce el número de alumnos aprobados con sobresaliente: ");
            alumnosSobresaliente = miConsola.nextInt();
            
            alumnosTotales =alumnosSuspensos + alumnosSuficientes + alumnosNotable + alumnosSobresaliente;
            
            porcentajeAprobados = (((double) alumnosSuficientes + alumnosNotable + alumnosSobresaliente) * 100.0) / alumnosTotales;
            porcentajeNotables = ((double) alumnosNotable * 100.0) / alumnosTotales;
            porcentajeSobresalientes = ((double) alumnosSobresaliente * 100.0) / alumnosTotales;

            System.out.println("\nPorcentaje de alumnos aprobados: " + df.format(porcentajeAprobados) + "%");
            System.out.println("Porcentaje de alumnos aprobados con notable: " + df.format(porcentajeNotables) + "%");
            System.out.println("Porcentaje de alumnos aprobados con sobresaliente: " + df.format(porcentajeSobresalientes) + "%");

        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);

        }
    }
}
