
/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: /*
Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan
los 30 trabajadores.
Usar tipo char para almacenar sexo.
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e24 {

    public static void main(String[] args) {

        char sexo = 'm', sexoComparador = 'm';

        int edad = 0, edadComparador = 70, sumaEdadMujeres = 0, contadorMujeres = 0;
        boolean trabajadoresMas60 = false;

        Scanner teclado = new Scanner(System.in);

        try {

            for (int contador = 1; contador <= 30; contador++) {
                do {
                    System.out.printf("Trabajador numero %d \n", contador);
                    System.out.println("Introduce su edad entre 16 y 70 (0 para finalizar): ");
                    edad = teclado.nextInt();
                    if ((edad != 0 && (edad < 16 || edad > 70))) {
                        System.out.println("La edad introducida no es correcta");
                    }
                } while (edad != 0 && (edad < 16 || edad > 70));
                if (edad == 0) {
                    break;
                }

                do {
                    System.out.println("Introduce su sexo (h/m): ");
                    sexo = teclado.next().charAt(0);
                    if (sexo != 'h' && sexo != 'm') {
                        System.out.println("El sexo introducido no es correcto");
                    }
                } while (sexo != 'h' && sexo != 'm');

                if (edad > 60) {
                    trabajadoresMas60 = true;
                }
                if (edad <= edadComparador) {
                    edadComparador = edad;
                    sexoComparador = sexo;
                }
                if (sexo == 'm') {
                    sumaEdadMujeres += edad;
                    contadorMujeres++;
                }

            }

            System.out.printf("Edad del trabajador mas joven: %d", edadComparador);
            System.out.printf("\nEl sexo del trabajador mas joven es: %c", sexoComparador);
            System.out.printf("\nLa media de edad de las mujeres es de: %.2f", ((double) sumaEdadMujeres / contadorMujeres));
            System.out.printf("\nHay trabajadores con mas de 60 años: %b", trabajadoresMas60);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
