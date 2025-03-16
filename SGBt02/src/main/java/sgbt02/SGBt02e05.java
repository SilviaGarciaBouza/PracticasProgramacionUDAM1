/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de
segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java.
23:59:57 será una hora correcta y 25:61:88 será una hora incorrecta 
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e05 {

    public static void main(String[] args) {
        int horaActual, minutoActual, segundoActual, segundosTranscurridos;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe el valor de la hora mostrado en un reloj digital: ");
            horaActual = teclado.nextInt();
            System.out.print("Escribe el valor de los minutos mostrado en un reloj digital: ");
            minutoActual = teclado.nextInt();
            System.out.print("Escribe el valor de los segundos mostrado en un reloj digital: ");
            segundoActual = teclado.nextInt();
            if ((horaActual >= 0 && horaActual < 24)&&(minutoActual>=0 &&minutoActual<60)&&(segundoActual>=0&&segundoActual<60)) {
                segundosTranscurridos=horaActual*60*60+minutoActual*60+segundoActual;
                System.out.println("Desde el inicio del día han transcurrido: "+segundosTranscurridos+" segundos");
               
            } else {
                System.out.println("Alguno de los valores intruducidos no es correcto");
            }
            

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
