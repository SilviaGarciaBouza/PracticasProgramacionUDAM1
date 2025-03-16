/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.modulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class M04Collection {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> COLLECTIONS= new ArrayList<>();
        COLLECTIONS= añadirValores(COLLECTIONS, 1000);
                ArrayList<Integer> cantidadNumerosRepetidos= new ArrayList<>();

        for(int i=1; i<=6; i++){
            cantidadNumerosRepetidos.add(vecesResultado(COLLECTIONS, i));
        }
        int indice=1;
        for(int elemento: cantidadNumerosRepetidos){
            System.out.println(indice+": "+elemento);
            indice++;
        }
        
        
        System.out.println("max"+Collections.max(cantidadNumerosRepetidos));
                System.out.println("min"+Collections.min(cantidadNumerosRepetidos));
                        System.out.println("Diferencia"+(Collections.max(cantidadNumerosRepetidos)-Collections.min(cantidadNumerosRepetidos)));


    }
    
    public static ArrayList<Integer> añadirValores(ArrayList<Integer> miArrayl, int longutud){
        Random r= new Random();
        for(int i=0; i<longutud;i++){
            miArrayl.add(r.nextInt(1,7));
        }
        return miArrayl;
    }
//    public static int vecesResultado(ArrayList<Integer> miArrayl, int numeroAbuscar){
//        int contador=0;
//        for(int i=0; i<miArrayl.size();i++){
//            if(miArrayl.get(i)==numeroAbuscar){
//                contador++;
//            }
//        }
//        return contador;
//    }
      public static int vecesResultado(ArrayList<Integer> miArrayl, int numeroAbuscar){
       int contador= Collections.frequency(miArrayl, numeroAbuscar);
        return contador;
    }
    
}



//// Crear un ArrayList para almacenar los resultados de los lanzamientos
//        List<Integer> lanzamientos = new ArrayList<>();
//        Random random = new Random();
//
//        // Llenar el ArrayList con 10.000 números aleatorios entre 1 y 6
//        for (int i = 0; i < 10000; i++) {
//            lanzamientos.add(random.nextInt(6) + 1);
//        }
//
//        // Crear un ArrayList para almacenar la frecuencia de cada número
//        List<Integer> frecuencia = new ArrayList<>(Collections.nCopies(6, 0));
//
//        // Contar la frecuencia de cada número
//        for (int lanzamiento : lanzamientos) {
//            frecuencia.set(lanzamiento - 1, frecuencia.get(lanzamiento - 1) + 1);
//        }
//
//        // Mostrar la distribución de resultados
//        System.out.println("Distribución de resultados:");
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Número " + (i + 1) + ": " + frecuencia.get(i) + " veces");
//        }
//
//        // Encontrar el máximo y el mínimo
//        int max = Collections.max(frecuencia);
//        int min = Collections.min(frecuencia);
//
//        // Calcular la diferencia entre el máximo y el mínimo
//        int diferencia = max - min;
//        System.out.println("La diferencia entre el número que más salió y el que menos salió es: " + diferencia);
//    }