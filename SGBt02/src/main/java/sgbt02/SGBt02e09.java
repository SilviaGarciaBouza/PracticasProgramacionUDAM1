/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la
semana hay salida de bus (utilizar la tabla anterior).
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e09 {

    public static void main(String[] args) {

        int horaIntroducida;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce la hora: ");
            horaIntroducida = teclado.nextInt();
            
            
            

            if (horaIntroducida>= 0&&horaIntroducida<24) {
                switch (horaIntroducida) {
                    case 9->System.out.println("A la hora "+horaIntroducida+" hay bus el domingo");
                    case 10->System.out.println("A la hora "+horaIntroducida+" hay bus el lunes, el martes, el miescoles, el jueves, el viernes, el sabado y el domingo");
                    case 11->System.out.println("A la hora "+horaIntroducida+" hay bus el domingo");
                    case 12->System.out.println("A la hora "+horaIntroducida+" hay bus el jueves y el domingo");
                    case 13->System.out.println("A la hora "+horaIntroducida+" hay bus el domingo");
                    case 14->System.out.println("A la hora "+horaIntroducida+" hay bus el lunes, el martes, el miescoles, el jueves, el viernes y el domingo");
                    default ->System.out.printf("A la hora %d no hay buses ningun dia de la semana", horaIntroducida);

                }
               

            } else {

                System.out.println("El valor de la hora introducida no es correcto");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}

