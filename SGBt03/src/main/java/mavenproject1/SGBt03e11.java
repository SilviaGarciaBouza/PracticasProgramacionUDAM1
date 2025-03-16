/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números
comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de
esos números al cuadrado. No se sabe si m > n, pero se desea utilizar una sola sentencia repetitiva
tanto si m > n como si m < n.  */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e11 {

    public static void main(String[] args) {
        int m, n;

        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Introduzca el número m: ");
            m = teclado.nextInt();
            System.out.println("Introduzca el número n: ");
            n = teclado.nextInt();
            if (m < n) {
                m = m + n;
                n = m - n;
                m = m - n;
            }
            System.out.println("");
            for (int i = n+1; i < m; i++) {
                System.out.printf("\n%d; su valor elevado al cuadrado es %d", i, i*i);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
