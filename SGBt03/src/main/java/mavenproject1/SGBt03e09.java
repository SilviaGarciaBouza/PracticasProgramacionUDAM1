/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de
los mismos valga más de 100. */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e09 {

    public static void main(String[] args) {
        int num=0, sumaNums = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            
            for (int i = sumaNums; sumaNums <= 100; sumaNums += num) {
                System.out.print("Introduce otro número: ");
                num = teclado.nextInt();
                

            }
            System.out.println("La suma de los numeros introducidos ya es mayor a 100");

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
