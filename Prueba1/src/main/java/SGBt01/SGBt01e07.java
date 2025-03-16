/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: queremos realizar un pequeño programa para introducirlo en el ordenador de a bordo de
nuestro coche y que nos informe del consumo medio del coche cada 100 km. Diseña un programa
al que le introduzcamos el kilometraje de la última vez que se repostó, el kilometraje actual, los litros
de gasolina que tenía al finalizar la última vez que repostó y la cantidad de gasolina actual.
 */
package SGBt01;

import java.util.Scanner;

public class SGBt01e07 {

    public static void main(String[] args) {
        Scanner miConsola = new Scanner(System.in);
        double kmUltimoRepostaje, litrosUltimoRepostaje, kmActuales, litrosActuales, consumoMedio100Km;

        try {
            System.out.print("Escribe el kilometraje de la última vez que se repostó: ");
            kmUltimoRepostaje = miConsola.nextDouble();
            System.out.print("Escribe el kilometraje actual: ");
            kmActuales = miConsola.nextDouble();
            System.out.print("Escribe los litros de gasolina tras el último repostaje: ");
            litrosUltimoRepostaje = miConsola.nextDouble();
            System.out.print("Escribe los litros de gasolina actuales: ");
            litrosActuales = miConsola.nextDouble();
            consumoMedio100Km = (100 * (litrosUltimoRepostaje - litrosActuales)) / (kmActuales - kmUltimoRepostaje);
            System.out.println("\nEl consumo medio del coche cada 100 km: " + consumoMedio100Km);
        } catch (Exception e) {
            System.out.println("\n Se ha producido un error: " + e);
        }

    }

}
