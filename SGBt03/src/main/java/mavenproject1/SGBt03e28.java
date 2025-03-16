/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que
el segundo. No incluir en los cálculos los números introducidos, solo los intermedios. 
números enteros positivos. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e28 {

    public static void main(String[] args) {

        int primerNumero, segundoNumero, suma = 0, contador = 0;
        long producto = 1;
        Scanner teclado = new Scanner(System.in);
        try {do{
            System.out.println("Escribe un primer numero entero positivo: ");
            primerNumero = teclado.nextInt();
            System.out.println("Escribe otro número entero positivo: ");
            segundoNumero = teclado.nextInt();
            if(primerNumero<=0||segundoNumero<=0){
                System.out.println("Alguno de los numeros introducidos es incorrecto");
            }
        }while(primerNumero<=0||segundoNumero<=0);
        
            if (primerNumero > segundoNumero) {
                primerNumero += segundoNumero;
                segundoNumero = primerNumero - segundoNumero;
                primerNumero = primerNumero - segundoNumero;
            }
            for (int i = primerNumero+1; i < segundoNumero; i++) {
                if (i % 2 == 0) {
                    suma += i;
                    producto *= i;
                    contador++;
                }
                

            }

            if(!(contador==0)){
            
            System.out.printf("La suma de los numeros pares comprendidos entre los dos numeros introducidos es: %d\n", suma);
            System.out.printf("El producto de los numeros pares comprendidos entre los dos numeros introducidos es: %d\n", producto);
            System.out.printf("La media de los numeros pares comprendidos entre los dos numeros introducidos es: %.2f", (double)suma/contador);
            }else{
                System.out.println("No existe ningun numero par entre los numeros introducidos");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
