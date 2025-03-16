/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si
lo que forman es un cuadrado o un rectángulo y calcule el área del mismo. 
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e04 {

    public static void main(String[] args) {
        double coordenadaXPrimerPunto, coordenadaYPrimerPunto, coordenadaXSegundoPunto, coordenadaYSegundoPunto, base, altura, area;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe la coordenada X del primer punto: ");
            coordenadaXPrimerPunto = teclado.nextDouble();
            System.out.print("Escribe la coordenada Y del primer punto: ");
            coordenadaYPrimerPunto = teclado.nextDouble();
            System.out.print("Escribe la coordenada X del segundo punto: ");
            coordenadaXSegundoPunto = teclado.nextDouble();
            System.out.print("Escribe la coordenada Y del segundo punto: ");
            coordenadaYSegundoPunto = teclado.nextDouble();
            base = Math.abs(coordenadaXSegundoPunto - coordenadaXPrimerPunto);
            altura = Math.abs(coordenadaYSegundoPunto - coordenadaYPrimerPunto);
            area = base * altura;
            if (base == altura) {
                System.out.println("Los puntos introducidos forman un cuadrado");
            } else {
                System.out.println("Los puntos introducidos forman un rectángulo");
            }
            System.out.println("El valor del área es: "+area);

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
