/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-20
 * Ejercicio: realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2),
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con if
anidados, otra con switch + “case :” y otra con switch + “case ->”

 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e13b {

    public static void main(String[] args) {

        int nota;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce la nota: ");
            nota = teclado.nextInt();
           
            

            switch (nota) {
                case 0, 1, 2 -> {
                    System.out.print("La nota es: muy deficiente");
                }
                case 3, 4 ->
                    System.out.println("La nota no es: insuficiente");
                case 5, 6 ->
                    System.out.println("La nota es: aprobado");
                case 7, 8 ->
                    System.out.println("La nota es: notable");
                case 9, 10 ->
                    System.out.println("La nota es: sobresaliente");
                default ->
                    System.out.println("La nota es: incorrecta");

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }

    }
}
