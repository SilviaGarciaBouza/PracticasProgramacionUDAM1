/*
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


public class SGBt01e04b {

    public static void main(String[] args) {
        int alumnosTotales, alumnosSuspensos, alumnosNotable, alumnosSobresaliente;
        //int alumnosSuficientes;
        double porcentajeAprobados, porcentajeNotables, porcentajeSobresalientes;
        Scanner miConsola = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        /*No es necesario pedir el total de alumnos, porque es un dato que podemos obtener al sumar el número de alumnos por notas.
        Al introducir más datos puede producir más errores humanos.
        Si de todas formas se decide añadir el número total de alumnos no es necesario pedir también el número de alumnos aprobados con suficiente, y así evitamos otra variable.
        Se podría pedir de todas formas el número de alumnos con suficientes para hacer alguna comprobación como por ejemplo 
        para verificar que el numero total de alumnos y la suma de los alumnos por notas es el mismo(dejo esa opción comentada).
         */
        
        try {
            System.out.print("Introduce el número de alumnos totales: ");
            alumnosTotales = miConsola.nextInt();
            if (alumnosTotales > 0) {
                System.out.print("Introduce el número de alumnos suspensos: ");
                alumnosSuspensos = miConsola.nextInt();
               // System.out.print("Introduce el número de alumnos aprobados con suficiente: ");
               // alumnosSuficientes = miConsola.nextInt();
                System.out.print("Introduce el número de alumnos aprobados con notable: ");
                alumnosNotable = miConsola.nextInt();
                System.out.print("Introduce el número de alumnos aprobados con sobresaliente: ");
                alumnosSobresaliente = miConsola.nextInt();
               // if (alumnosTotales == (alumnosSuspensos + alumnosSuficientes + alumnosNotable + alumnosSobresaliente)) {
                    porcentajeAprobados = (((double) alumnosTotales - alumnosSuspensos) * 100.0) / alumnosTotales;
                    porcentajeNotables = ((double) alumnosNotable * 100.0) / alumnosTotales;
                    porcentajeSobresalientes = ((double) alumnosSobresaliente * 100.0) / alumnosTotales;

                    System.out.println("\nPorcentaje de alumnos aprobados: " + df.format(porcentajeAprobados) + "%");
                    System.out.println("Porcentaje de alumnos aprobados con notable: " + df.format(porcentajeNotables) + "%");
                    System.out.println("Porcentaje de alumnos aprobados con sobresaliente: " + df.format(porcentajeSobresalientes) + "%");
                } else {
                    System.out.println("\nSe ha producido un error: el número de alumnos totales no coincide con los números de alumnos divididos por notas");
                }
           // } else {
                //System.out.println("\nEl número total de alumnos debe ser mayor de 0");
           // }
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error: " + e);
        }

    }

}
