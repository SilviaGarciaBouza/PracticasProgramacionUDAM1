/*
13.4. Haz un programa que tenga definido un Array de 7 posiciones de double que representa la
temperatura media en una ciudad durante una semana (puedes generar valores al azar entre 0 y 40
para llenarlo). Se le solicitará al usuario que introduzca dos posiciones (entre 0 y 6), y calculará la
temperatura media entre esos días de la semana, ambos inclusive. Si los valores introducidos no son
válidos, por estar fuera de los límites del array se capturará la excepción y la media será cero. 
 */
package com.tema12exceptions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_04 {

    public static Scanner scanner = new Scanner(System.in);
    public static int[] posiciones;

    public static void main(String[] args) {
        double[] temperaturasmedias = new double[7];
        int pos1, pos2;
        double media = 0;

        generarValoresArray(temperaturasmedias);
        //System.out.println(Arrays.toString(temperaturasmedias));
        try {
            posiciones = introducirDatos(temperaturasmedias);
        } catch (RangoExcepcion ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //System.out.println(Arrays.toString(posiciones));
        pos1 = posiciones[0];
        pos2 = posiciones[1];

        media = calcularMedia(pos1, pos2, temperaturasmedias);

        System.out.println("La media es: " + media);

    }

    static public double[] generarValoresArray(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(0, 40);
        }
        return array;
    }

    static public int[] introducirDatos(double[] miArray) throws RangoExcepcion {
        int pos1, pos2;
        posiciones = new int[2];
        System.out.println("Introduce una posicion (del 0 al 6)");
        pos1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce una segunda posicion (del 0 al 6)");
        pos2 = Integer.parseInt(scanner.nextLine());
        if (pos1 > pos2) {
            pos1 = pos1 + pos2;
            pos2 = pos1 - pos2;
            pos1 = pos1 - pos2;

        }
        if (pos1 < 0 || pos2 > miArray.length) {
            throw new RangoExcepcion();
        }
        posiciones[0] = pos1;
        posiciones[1] = pos2;
        return posiciones;
    }

    static public double calcularMedia(int pos1, int pos2, double[] miArray) {
        double suma = 0, media;
        try {
            for (int i = pos1; i < pos2; i++) {
                suma += miArray[i];
            }
            media = suma / ((double) pos2 - pos1);
        } catch (ArithmeticException ex) {
            media = 0;
            System.out.println("Error: " + ex.getMessage());

        }
        return media;

    }

    static public class RangoExcepcion extends Exception {

        @Override
        public String getMessage() {
            return "Numero fuera de rango";
        }

    }
}


//public class EJ04 {
//
//    static public Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        Random random = new Random();
//        int posicion1, posicion2;
//
//        System.out.println("Introduce una posicion (entre 0 y 6): ");
//        posicion1 = Integer.parseInt(scanner.nextLine());
//        System.out.println("Introduce una segunda posicion (entre 0 y 6): ");
//        posicion2 = Integer.parseInt(scanner.nextLine());
//        if (posicion1 > posicion2) {
//            posicion1 += posicion2;
//            posicion2 = posicion1 - posicion2;
//            posicion1 -= posicion2;
//        }
//
//        double[] temperaturasMedias = new double[7];
//        for (int i = 0; i < temperaturasMedias.length; i++) {
//            temperaturasMedias[i] = random.nextDouble(0, 40);
//        }
//       calcularTemperaturaMedia(temperaturasMedias,posicion1,posicion2);
//        
//
//    }
//
//    static double calcularTemperaturaMedia(double[] temperaturasMedias, int posicion1, int posicion2) throws ArrayIndexOutOfBoundsException{
//        double suma = 0;
//        double mediaCalculada;
//        try{
//        if (posicion1 < 0 || posicion1 > 6 || posicion2 < 0 || posicion2 > 6) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//
//        for (int i = posicion1; i <= posicion2; i++) {
//            suma += temperaturasMedias[i];
//        }
//
//        mediaCalculada = suma / ((double) posicion2 - (double) posicion1);
//        }catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println("Error: numero fuera del rango");
//            suma= 0;
//        }
//        return suma;
//            
//    }
//
//

//}