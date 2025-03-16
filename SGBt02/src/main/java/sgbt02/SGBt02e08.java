/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: la tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al que se le
introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una
primera condición que haga la verificación de la entrada de datos y otra única condición para ver si
hay bus.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e08 {

    public static void main(String[] args) {

        int diaIntroducido, horaIntroducida;
        String nombreDia;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce un dia del 1 al 7: ");
            diaIntroducido = teclado.nextInt();
            System.out.print("Introduce una hora de 9 a 14: ");
            horaIntroducida = teclado.nextInt();
             nombreDia= switch (diaIntroducido) {

                case 1 ->
                    "lunes";
                case 2 ->
                    "martes";
                case 3 ->
                    "miercoles";
                case 4 ->
                    "jueves";
                case 5 ->
                    "viernes";
                case 6 ->
                    "sabado";
                case 7 ->
                    "domingo";
                default ->
                    "El dia introducido no es correcto";
       
            };

            if ((diaIntroducido > 0 && diaIntroducido <= 7) && (horaIntroducida >= 9 && horaIntroducida <= 14)) {
                if (diaIntroducido == 7 || horaIntroducida == 10 || (!(diaIntroducido == 6) && horaIntroducida == 14) || (diaIntroducido == 4 && horaIntroducida == 12)) {
                    System.out.println("El dia " + nombreDia + " a la hora " + horaIntroducida + " sí hay bus");
                } else {
                    System.out.println("El dia " + nombreDia + " a la hora " + horaIntroducida + " no hay bus");
                }

            } else {

                System.out.println("El valor del dia o de la hora introducidos no es correcto");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
