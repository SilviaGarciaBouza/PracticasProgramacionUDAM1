/*
Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de hacer
es pedir la cantidad de entradas que se pondrán a la venta, después irá solicitando la cantidad de
entradas que quiere comprar, estando limitado a un máximo de 10 por cliente. El programa finalizará
cuando se agoten las entradas mostrando la cantidad de entradas que se ha llevado el que más ha
comprado. Pensar primero el bucle y luego lo que hay que hacer en cada iteración
 */
package com.practica;

import java.util.Scanner;

public class E29E30CompraEntradasLimitadas {

    public static void main(String[] args) {

        int cantidadEntradas, cantidadEntradasCompra, maximasCompradas = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escribe el numero de entradas a la venta: ");
            cantidadEntradas = Integer.parseInt(teclado.nextLine());
            if (cantidadEntradas <= 0) {
                System.out.println("El numero de entradas a la venta es incorrecto, debe ser mayor a 0");
            }
        } while (cantidadEntradas <= 0);

        do {
            System.out.printf("Cuantas entradas quieres comprar (maximo 10), quedan %d entradas: \n", cantidadEntradas);
            cantidadEntradasCompra = Integer.parseInt(teclado.nextLine());
            if (cantidadEntradasCompra < 0) {
                System.out.println("El numero de entradas compradas debe ser mayor o igual a 0");
            } else if (cantidadEntradasCompra > 10) {
                System.out.println("Limite de entradas compradas por persona: 10");

            } else if (cantidadEntradasCompra > cantidadEntradas) {
                System.out.println("No se pueden comprar tantas entradas");
            } else {
                if (cantidadEntradasCompra > maximasCompradas) {
                    maximasCompradas = cantidadEntradasCompra;
                }
                cantidadEntradas -= cantidadEntradasCompra;

            }

        } while (cantidadEntradas > 0);
        System.out.println("Entradas agotadas");
        System.out.printf("La cantidad de entradas que se ha llevado el que mas ha comprado ha sido: %d", maximasCompradas);

    }

}
