/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: mostrar por pantalla los n primeros números naturales(positivos, el 0 no se incluye), siendo n el valor tecleado
previamente. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e02 {

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero natural: ");
            n = teclado.nextInt();
            if(n<=0){
        do {
            System.out.print("Ese numero es incorrecto, escribe un numero natural: ");
            n = teclado.nextInt();
        } while (n <= 0);}
        for (int numero = n; numero < n + 10; numero++) {
            System.out.printf("\n%d", numero);
        }
    }

}
