/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-22
 * Ejercicio: 
 *¿Qué tipos de datos se necesitan para calcular la suma y la media de cuatro números de
tipo int? Escribe un programa para comprobarlo.
 */
package sgbt01ampliacion;

//PAra calculae la suma y la media de cuatro numeros se necesitan datos tipo int para las edades y la suma y tipo double para la media
import java.util.Scanner;

public class SGBt01Ampliacione03 {

    public static void main(String[] args) {
        int edad;
        double media;
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");

        try {
            System.out.print("Escribe el valor de la primera edad: ");
            edad = teclado.nextInt();
            System.out.print("Escribe el valor de la segunda edad: ");
            edad += teclado.nextInt();
            System.out.print("Escribe el valor de la tercera edad: ");
            edad += teclado.nextInt();
            System.out.print("Escribe el valor de la cuarta edad: ");
            edad += teclado.nextInt();
            System.out.printf("La suma de las 4 edades es: %d", edad);
            media = (double) edad / 4.0;
            System.out.printf("\nLa media de las cuatro edades es: %.2f", media);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
