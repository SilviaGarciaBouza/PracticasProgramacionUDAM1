/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un
número perfecto si es igual a la suma de todos los divisores menores que él. 
 */
package mavenproject1;

public class SGBt03e14 {

    public static void main(String[] args) {
        int suma = 0;

        try {

            for (int j = 1; j <= 10000; j++) {
                suma = 0;
                for (int i = 1; i < j; i++) {
                    if (j % i == 0) {
                        suma += i;

                    }
                }
                if (suma == j) {
                    System.out.println(j);

                }

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}
