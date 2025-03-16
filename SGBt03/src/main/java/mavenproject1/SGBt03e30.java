
/*
  Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  Modificar el programa anterior para que si un cliente introduce un número negativo o mayor
que 10 le informe de su error y le obligue a meter correctamente las entradas que desea, las veces
que sea necesario hasta que lo haga bien. 
package mavenproject1;
 */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e30 {

    public static void main(String[] args) {

        final int MAXCLIENTE = 10;
        int cantidadTotalEntradas, cantidadEntradasCompradasCliente, cantidadCompradaMax = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            do {
                System.out.println("Inserta la cantidad de entradas que se pondrán a la venta: ");
                cantidadTotalEntradas = teclado.nextInt();
            } while (cantidadTotalEntradas < 0);

            do {
                System.out.println("Inserta la cantidad de entradas que quieres comprar: ");
                cantidadEntradasCompradasCliente = teclado.nextInt();
                if (cantidadEntradasCompradasCliente > MAXCLIENTE || cantidadEntradasCompradasCliente <= 0) {
                    System.out.printf("No se pueden comprar ni menos de 1 entradas ni más de %d entradas\n", MAXCLIENTE);
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
