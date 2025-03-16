/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-20
 * Ejercicio: introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál de las dos es
mayor (agrupa las condiciones de día, mes y año en una sola sentencia condicional). Suponemos que
se introducen fechas válidas y no empleamos las clases de fecha de Java.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e12 {

    public static void main(String[] args) {

        int dia1, mes1, año1, dia2,mes2,año2;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce el dia de la primera fecha: ");
            dia1 = teclado.nextInt();
            System.out.print("Introduce el mes de la primera fecha: ");
            mes1 = teclado.nextInt();
            System.out.print("Introduce el año de la primera fecha: ");
            año1 = teclado.nextInt();
            System.out.print("Introduce el dia de la segunda fecha: ");
            dia2 = teclado.nextInt();
            System.out.print("Introduce el mes de la segunda fecha: ");
            mes2 = teclado.nextInt();
            System.out.print("Introduce el año de la segunda fecha: ");
            año2 = teclado.nextInt();

          

            if (año2>año1||(año2==año1&&(mes2>mes1||(mes2==mes1&&dia2>dia1)))) {
                System.out.println("Es mayor la segunda fecha");
                
                
                
            } else {
                System.out.println("Es mayor la primera fecha");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }

    }
}