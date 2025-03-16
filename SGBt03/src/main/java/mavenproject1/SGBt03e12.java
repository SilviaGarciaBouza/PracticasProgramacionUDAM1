/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con
decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de
notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el
porcentaje de aprobados. Hay que validar que estén entre 0 y 10.
- Hay que pensar primero el bucle: el código ser repite mientras….. Una vez aclarado esto, puedes
pensar qué es lo que se hace cada vez (en este caso, qué hago con cada nota introducida)
- Para calcular la nota máxima hay que tener guardada en una variable la máxima hasta ese
momento y al leer una nueva nota, compararla la nueva con la guardada, y si la nueva es mayor
que la guardada, guardamos la nueva, ya que ahora es la máxima y así para todas las iteraciones
del bucle (para empezar puedes decir que la máxima nota es -1)
- Para calcular la media hay que ir acumulando los valores y la cantidad de elementos, y al final
dividir lo acumulado entre la cantidad de elementos.   */
package mavenproject1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt03e12 {

    public static void main(String[] args) {
        double nota, notaMinima = 10, notaMaxima = 0, cantidadAprobados = 0, suma=0;
        boolean hay5Exacto = false;
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            do {
                System.out.println("Introduce una nota: ");
                nota = teclado.nextDouble();
                if (nota <= 10 && nota >= 0) {
                    i++;
                    suma+=nota;
                    notaMaxima = (nota > notaMaxima) ? nota : notaMaxima;
                    notaMinima = (nota < notaMinima) ? nota : notaMinima;
                    if (nota == 5.00) {
                        hay5Exacto = true;
                        cantidadAprobados += nota;
                    } else if (nota > 5) {
                        cantidadAprobados += nota;
                    }

                } else if (nota < -1 || nota > 10) {
                    System.out.println("La nota introducida no es correcta");
                }
            } while (nota != -1);

            System.out.printf("\nEl numero total de notas introducido es: %d", i);
            System.out.printf("\nLa nota máxima introducida es: %.2f", notaMaxima);
            System.out.printf("\nLa nota mínima introducida es: %.2f", notaMinima);
            System.out.printf("\nhay algún 5 exacto: %b", hay5Exacto);
            System.out.printf("\nLa media de las notas introducidas es: %.2f", suma/i);
            System.out.println("\nEl porcentaje de aprobados es: " + df.format(cantidadAprobados * 100 / i));

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
