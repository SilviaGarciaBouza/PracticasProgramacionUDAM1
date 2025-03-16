/*
Realiza un programa que tenga definido un Array como variable global llamado
temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada uno de los
meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones
que realicen las siguientes tareas:
a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
b) Mostrar por pantalla el contenido del Array.
c) Mostrar por pantalla el contenido del Array en orden inverso. 
 */
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class Ej01ARRAYTemperaturameses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] temperaturasMeses = new int[12];
        int eleccion;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1-Rellenar, 2-Mostrar, 3-Mostrar invertido, Otro numero-Salir");
            eleccion = Integer.parseInt(teclado.nextLine());

            switch (eleccion) {
                case 1 -> {
                    llenarArray(temperaturasMeses);
                }
                case 2 -> {
                    mostrarContenido(temperaturasMeses);
                }
                case 3 -> {
                    System.out.println(Arrays.toString(mostrarInvertido(temperaturasMeses)));
                }
                default -> {
                }

            }

        } while (eleccion == 1 || eleccion == 2 || eleccion == 3);
        System.out.println("Has salido del programa");
    }

    //a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
    //El tamaño del array se puede añadir si aun no se sabe (int[] arrayARellenar, int tamañoArray)
    static public void llenarArray(int[] arrayARellenar) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayARellenar.length; i++) {
            System.out.println("Escribe la temperatura del mes " + (i + 1));
            int valorTemperatura = Integer.parseInt(teclado.nextLine());
            arrayARellenar[i] = valorTemperatura;
        }
    }

//    b) Mostrar por pantalla el contenido del Array.
    static public void mostrarContenido(int[] arrayMostrar) {
        for (int i = 0; i < arrayMostrar.length; i++) {
            System.out.print(arrayMostrar[i]);
            System.out.print(", ");
        }
    }

//    c) Mostrar por pantalla el contenido del Array en orden inverso.
    static public int[] mostrarInvertido(int[] arrayMostrarInvertido) {
        int[] nuevoArray = new int[arrayMostrarInvertido.length];
        int indice = 0;
        for (int i = arrayMostrarInvertido.length - 1; i >= 0; i--) {
            nuevoArray[indice] = arrayMostrarInvertido[i];
            indice++;
        }
        return nuevoArray;
    }

}


















































// switch (eleccion) {
//                case 1 -> {
//                    System.out.println("Indica el numero del mes al que quieres introducir la temperatura: ");
//                    indiceMes = Integer.parseInt(teclado.nextLine()) - 1;
//                    System.out.println("Escribe la temperatura media: ");
//                    temperarutaescrita = Double.parseDouble(teclado.nextLine());
//                    temperaturaMeses[indiceMes] = temperarutaescrita;
//                }
//                case 2 -> {
//                    System.out.println(Arrays.toString(temperaturaMeses));
//                }
//                case 3 -> {
//
//                    for (int i = 0; i < temperaturaMeses.length; i++) {
//                        temperaturaInverso[i] = temperaturaMeses[temperaturaMeses.length - 1 - i];
//                    }
//                    System.out.println(Arrays.toString(temperaturaInverso));
//                }
//                default -> {
//                }
