/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un
número entero positivo tecleado previamente (ojo: el número x puede ser par o impar) 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e25 {

    public static void main(String[] args) {

        int numero, contador;

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Escribe un numero entero positivo: ");
            numero = teclado.nextInt();
            while (numero <= 0) {
                System.out.println("El numero introducido es incorrecto.\n");
                System.out.println("Escribe un numero entero positivo: ");
                numero = teclado.nextInt();
            }

            for (int i = 1; i <= numero; i++) {
                if(i%2==0){
                  System.out.println("adios");  
                }else{
                System.out.println("hola");}
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
