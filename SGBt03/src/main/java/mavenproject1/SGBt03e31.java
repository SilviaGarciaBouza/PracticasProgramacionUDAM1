/*
  Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: Programa al que se le introduzcan 30 números y si la suma de los mismos es par nos muestre
los 3 primeros que introducimos, y si es impar nos muestre los tres últimos que introducimos. Hay
que garantizar que cada uno de dichos números está comprendido entre 0 y 1000. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e31 {

    public static void main(String[] args) {

        int numero, primerNumero = 0, segundoNumero = 0, tercerNumero = 0, antepenultimoNumero = 0, penultimoNumero = 0, ultimoNumero = 0, contador = 1, suma = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            while (contador <= 30) {
                System.out.println("Introduce un numero entre 0 y 1000: ");
                numero = teclado.nextInt();
                if (numero > 1000 || numero < 0) {
                    System.out.println("El numero introducido no es correcto.");
                } else {
                    switch (contador) {
                        case 1 ->
                            primerNumero = numero;
                        case 2 ->
                            segundoNumero = numero;
                        case 3 ->
                            tercerNumero = numero;
                        case 28 ->
                            antepenultimoNumero = numero;
                        case 29 ->
                            penultimoNumero = numero;
                        case 30 ->
                            ultimoNumero = numero;

                    }
                    suma += numero;
                    contador++;

                }
            }
            if (suma % 2 == 0) {
                System.out.printf("Los tres primeros numeros introducidos han sido: %d, %d, %d ", primerNumero, segundoNumero, tercerNumero);
            } else {
                System.out.printf("Los tres ultimos numeros introducidos han sido: %d, %d, %d ", antepenultimoNumero, penultimoNumero, ultimoNumero);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
