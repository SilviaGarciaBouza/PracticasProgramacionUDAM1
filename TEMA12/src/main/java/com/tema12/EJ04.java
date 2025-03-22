/*
13.4. Haz un programa que tenga definido un Array de 7 posiciones de double que representa la
temperatura media en una ciudad durante una semana (puedes generar valores al azar entre 0 y 40
para llenarlo). Se le solicitará al usuario que introduzca dos posiciones (entre 0 y 6), y calculará la
temperatura media entre esos días de la semana, ambos inclusive. Si los valores introducidos no son
válidos, por estar fuera de los límites del array se capturará la excepción y la media será cero. 
 */
package com.tema12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ04 {

    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int posicion1, posicion2;

        System.out.println("Introduce una posicion (entre 0 y 6): ");
        posicion1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce una segunda posicion (entre 0 y 6): ");
        posicion2 = Integer.parseInt(scanner.nextLine());
        if (posicion1 > posicion2) {
            posicion1 += posicion2;
            posicion2 = posicion1 - posicion2;
            posicion1 -= posicion2;
        }

        double[] temperaturasMedias = new double[7];
        for (int i = 0; i < temperaturasMedias.length; i++) {
            temperaturasMedias[i] = random.nextDouble(0, 40);
        }
       calcularTemperaturaMedia(temperaturasMedias,posicion1,posicion2);
        

    }

    static double calcularTemperaturaMedia(double[] temperaturasMedias, int posicion1, int posicion2) throws ArrayIndexOutOfBoundsException{
        double suma = 0;
        double mediaCalculada;
        try{
        if (posicion1 < 0 || posicion1 > 6 || posicion2 < 0 || posicion2 > 6) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = posicion1; i <= posicion2; i++) {
            suma += temperaturasMedias[i];
        }

        mediaCalculada = suma / ((double) posicion2 - (double) posicion1);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: numero fuera del rango");
            suma= 0;
        }
        return suma;
            
    }



}
