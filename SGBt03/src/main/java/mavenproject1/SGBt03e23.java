/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que
solicite un numero de más o bien que no sume correctamente)
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e23 {

    public static void main(String[] args) {

        double numero=0, suma=0;
        int contador=1;

        Scanner teclado = new Scanner(System.in);

        try {

            do{
                
            System.out.println("Introduce un numero menor o igual a 1000: ");
            numero = teclado.nextDouble();
            contador++;
            if(numero<=1000){
            suma+=numero;}
            }while(numero<=1000&&contador<=15);
            System.out.printf("La suma de los numeros introducidos es: %.2f", suma);
            
            

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}