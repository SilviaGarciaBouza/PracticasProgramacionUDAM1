/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio:realizar un programa que informe si un año introducido previamente es bisiesto o no. Son
bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400
también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y
otra más sofisticada con una sola. No usar las clases de fechas de Java.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e07 {

    public static void main(String[] args) {
        
        int añoIntroducido;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce un año: ");
            añoIntroducido = teclado.nextInt();
            
            if ((añoIntroducido % 4 == 0 && !(añoIntroducido % 100 == 0)) || añoIntroducido % 400 == 0) {
                System.out.println(añoIntroducido+" es un año bisiesto");

            } else {

                System.out.println(añoIntroducido+" no es un año bisiesto");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
