/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos
de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario
siempre las notas de los nueve módulos?
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e17 {

    public static void main(String[] args) {
        double notaModulo;
        int modulo = 1;
        boolean todoAprobado = true;
        Scanner teclado = new Scanner(System.in);

        try {

            do {
                System.out.println("Escribe la nota del modulo " + modulo + ": ");
                notaModulo = teclado.nextDouble();

                if (notaModulo > 10 || notaModulo < 0) {
                    System.out.println("La nota introducida no es correcta");
                } else if (notaModulo < 5) {
                    modulo++;
                    //Si suspende uno de los modulos ya no hay que seguir preguntando por el resto de modulos 
                    //porque ya no estar
                    todoAprobado = false;
                    break;
                } else {
                    modulo++;
                }
            } while (notaModulo < 0 || (notaModulo >= 5 && modulo <= 9));

            System.out.printf("Puede ir al FCT: %b", todoAprobado);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
