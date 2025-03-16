/*
Realizar un programa que tenga una función a la que se le pasa un Array con las edades de
los alumnos de una clase y nos devuelva la edad media. Añadir una función a la que se le pasa un
Array con las edades de los alumnos y nos devuelva un Array solo con los mayores de edad. 
 */
package com.arrays;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class Ej09ArrayEdades {

    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

int[] edades;
int numero;
        System.out.println("Cuantos alumnos son: ");
        numero= Integer.parseInt(teclado.nextLine());
        edades= new int[numero];
        for(int i=0; i<edades.length;i++){
        System.out.println("Escribe la edad de un alumno: ");
         edades[i]= Integer.parseInt(teclado.nextLine());
        
        }
        System.out.println("Edad media alumnos: "+edadMedia(edades));
        System.out.println("Edad media alumnos mayores de edad: "+edadMediaMayores(edades));

    }

    static public double edadMedia(int[] edades) {
        double media = 0;
        double suma = 0;
        double contador = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
            contador++;
        }
        if (contador != 0) {
            media = suma / contador;
        }
        return media;
    }

    static public double edadMediaMayores(int[] edades) {
        double media = 0;
        double suma = 0;
        double contador = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                suma += edades[i];
                contador++;
            }
        }
        if (contador != 0) {
            media = suma / contador;
        }
        return media;
    }

}
