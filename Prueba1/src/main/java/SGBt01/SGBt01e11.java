/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 * Ejercicio: diseñar un programa al que se le introduzca la longitud de dos catetos de un ángulo recto y
 * nos devuelva el valor de la hipotenusa. Busca en internet como calcular en Java potencias y raíces
 * cuadradas para aplicar el teorema de Pitágoras. Investiga también si existe en Java alguna utilidad
 * que nos haga este cálculo automáticamente.
 */
package SGBt01;

import java.util.Scanner;

public class SGBt01e11 {

    public static void main(String[] args) {

        Scanner miConsola = new Scanner(System.in);
        double primerCateto, segundoCateto, hipotenusa1, hipotenusa2;

        System.out.print("Ingresa la longitud del primer cateto:");
        primerCateto = miConsola.nextDouble();
        System.out.print("Ingresa la longitud del segundoncateto:");
        segundoCateto = miConsola.nextDouble();
        //Cálculo en Java de potencias y raíces cuadradas para aplicar el teorema de Pitágoras
        hipotenusa1 = Math.sqrt(Math.pow(primerCateto, 2) + Math.pow(segundoCateto, 2));
        System.out.println("\nLa longitud de la hipotenusa calculada con potencias y raíces cuadradas en Java es: " + hipotenusa1);

        //Cálculo directo com Math.sqrt
        hipotenusa2 = Math.sqrt(primerCateto * primerCateto + segundoCateto * segundoCateto);
        System.out.println("\nLa longitud de la hipotenusa calculada automáticamente es: " + hipotenusa2);
    }

}
