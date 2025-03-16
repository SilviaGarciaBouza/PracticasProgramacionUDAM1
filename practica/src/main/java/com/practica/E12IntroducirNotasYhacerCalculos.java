/*
Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con
decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de
notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el
porcentaje de aprobados. Hay que validar que estén entre 0 y 10.
- Hay que pensar primero el bucle: el código ser repite mientras..... Una vez aclarado esto, puedes
pensar qué es lo que se hace cada vez (en este caso, qué hago con cada nota introducida)
- Para calcular la nota máxima hay que tener guardada en una variable la máxima hasta ese
momento y al leer una nueva nota, compararla la nueva con la guardada, y si la nueva es mayor
que la guardada, guardamos la nueva, ya que ahora es la máxima y así para todas las iteraciones
del bucle (para empezar puedes decir que la máxima nota es -1)
- Para calcular la media hay que ir acumulando los valores y la cantidad de elementos, y al final
dividir lo acumulado entre la cantidad de elementos.

 */
package com.practica;

import java.util.Scanner;

public class E12IntroducirNotasYhacerCalculos {

    public static void main(String[] args) {

        double nota, notaminima = 10, notaMaxima = 0, suma = 0, aprob = 0;
        int contador = 0;
        boolean hay5 = false;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escribe una nota: ");
            nota = Double.parseDouble(teclado.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Nota incorrecta");

            } else {
                suma += nota;
                contador++;
                if (notaminima > nota) {
                    notaminima = nota;
                }
                if (notaMaxima < nota) {
                    notaMaxima = nota;
                }

                if (nota >= 5) {
                    aprob++;
                    if (nota == 5) {
                        hay5 = true;
                    }
                }
            }

        } while (nota != -1);

        System.out.println("Total notas: " + contador);
        System.out.println("Nota minima: " + notaminima);
        System.out.println("Nota maxima: " + notaMaxima);
        System.out.println("Hay 5 exacto: " + hay5);
        if (contador != 0) {
            System.out.println("Media: " + (suma / contador));
        }
        System.out.println("Porcebntaje aprobados: "+(aprob*100/contador));

    }

}
