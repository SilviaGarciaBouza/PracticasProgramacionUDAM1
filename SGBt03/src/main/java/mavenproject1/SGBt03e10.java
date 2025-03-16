/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe
si hay alguno menor de edad.
En cuanto encuentre un menor de edad, la respuesta va a ser “Sí hay alguno”,
aunque luego sigamos introduciendo edades, esta situación ya no va a cambiar, ojo
al hacer el “if” */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e10 {

    public static void main(String[] args) {
        int num;
        boolean menorEdad = false;
        Scanner teclado = new Scanner(System.in);
        try {
            do {

                System.out.println("Introduce la edad del alumno: ");
                num = teclado.nextInt();

                if (num < -1 || num > 100) {
                    System.out.println("La edad del alumno no es correcta");
                } else if (num>0&&num < 18) {
                    menorEdad = true;
                    
                }

            } while (num != -1);

            System.out.printf("Hay algún alumno menor de edad: %b", menorEdad);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
