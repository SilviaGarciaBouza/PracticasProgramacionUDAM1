/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres.
Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000
números enteros positivos. 
 */
package mavenproject1;

public class SGBt03e27 {

    public static void main(String[] args) {
        int sumadigitos = 0;
        boolean esIgual = false;
        try {
            for (int i = 3; i <= 10000; i += 3) {
                for (int j = i; j > 0; j /= 10) {
                    sumadigitos += (j % 10);

                }
                esIgual = (sumadigitos % 3) == 0;
                if (esIgual == false) {
                    break;
                } else {
                    System.out.println(i + ":en este caso la suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres: " + esIgual);
                }

            }
            System.out.println("");
            System.out.println("Conclusión: la suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres: " + esIgual);

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
