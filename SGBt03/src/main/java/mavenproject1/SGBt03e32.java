/*
  Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  (Opcional) Programa al que se le pase un número entero y que lo muestre en binario. Deberá
hacer divisiones sucesivas e ir componiendo un número (long) con los restos obtenidos hasta que el
cociente será cero. Pista: cada cero y uno obtenido como resto hay que situarlo en la posición
adecuada del resultado: unidades, decenas, centenas, etc. 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e32 {

    public static void main(String[] args) {

        long numero;
        long numeroBinario = 0;

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero entero para convertirlo en binario: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                for (int i = 0; numero > 0; i++) {

                    numeroBinario += ((numero % 2) * (long) Math.pow(10.0, i));
                    numero /= 2;
                }
                System.out.println("El numero en binario es: "+numeroBinario);

            } else {
                numero = Math.abs(numero);

                for (int i = 0; numero > 0; i++) {

                    numeroBinario += ((numero % 2) * (long) Math.pow(10.0, i));
                    numero /= 2;
                }
                System.out.println("El numero en binario es: -"+numeroBinario);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
