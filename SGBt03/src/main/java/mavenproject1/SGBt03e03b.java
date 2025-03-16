/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a
uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra
versión en la que la lectura de datos se haga únicamente al principio del bucle. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e03b {
//la lectura de datos se haga únicamente al principio del bucle.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0.01;
        try {
            while (numero >= 0) {
                System.out.println("\nEscribe un numero positivo(negativo para finalizar): ");
                numero = teclado.nextDouble();

                if(numero==0){
                    System.out.println("El 0 no es un numero positivo ni negativo");
                }else{
                if (numero > 0) {
                    if (numero % 2 == 0) {
                        System.out.printf("%.2f es un nuemro par", numero);
                    } else {
                        System.out.printf("%.2f es un numero impar", numero);
                    }
                }}

            }
            System.out.println("Programa finalizado");
        } catch (Exception e) {
            System.out.println("Se ha producido un error" + e);
        }
    }}
