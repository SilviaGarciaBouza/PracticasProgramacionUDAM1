/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de hacer
es pedir la cantidad de entradas que se pondrán a la venta, después irá solicitando la cantidad de
entradas que quiere comprar, estando limitado a un máximo de 10 por cliente. El programa finalizará
cuando se agoten las entradas mostrando la cantidad de entradas que se ha llevado el que más ha
comprado. Pensar primero el bucle y luego lo que hay que hacer en cada iteración 
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e29 {

    public static void main(String[] args) {

        final int MAXCLIENTE = 10;
        int cantidadTotalEntradas, cantidadEntradasCompradasCliente, cantidadCompradaMax = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Inserta la cantidad de entradas que se pondrán a la venta: ");
            cantidadTotalEntradas = teclado.nextInt();

            do {
                System.out.println("Inserta la cantidad de entradas que quieres comprar: ");
                cantidadEntradasCompradasCliente = teclado.nextInt();
                if (cantidadEntradasCompradasCliente > MAXCLIENTE) {
                    System.out.printf("No se pueden comprar más de %d entradas\n", MAXCLIENTE);
                } else if (cantidadEntradasCompradasCliente > cantidadTotalEntradas) {
                    System.out.printf("Compra inválida. Solo quedan %d entradas\n", cantidadTotalEntradas);
                } else {
                    cantidadTotalEntradas -= cantidadEntradasCompradasCliente;
                    if (cantidadEntradasCompradasCliente > cantidadCompradaMax) {
                        cantidadCompradaMax = cantidadEntradasCompradasCliente;
                    }
                }
            } while (cantidadTotalEntradas > 0);
            if (0 == cantidadTotalEntradas) {
                System.out.printf("Ya no quedan entradas\n");
                System.out.printf("La mayor cantidad de entradas compradas por un cliente ha sido: %d", cantidadCompradaMax);
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
