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

public class SGBt02e13a {

    public static void main(String[] args) {

        int nota;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce la nota: ");
            nota = teclado.nextInt();
            if (nota <= 2 && nota >= 0) {
                System.out.print("La nota es: muy deficiente");
            } else if (nota <= 4 && nota >= 3) {
                System.out.println("La nota no es: insuficiente");
            }else if(nota <= 6 && nota >= 5){
                System.out.println("La nota es: aprobado");
            }else if(nota <= 8 && nota >= 7){
                System.out.println("La nota es: notable");
            }else if(nota <= 10 && nota >= 9){
                System.out.println("La nota es: sobresaliente");
            }else{
                System.out.println("La nota no es correcta");
            }

           

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }

    }
}
