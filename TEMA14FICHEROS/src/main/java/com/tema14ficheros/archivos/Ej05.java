/*
Haz una versión del ejercicio anterior que lea todas las líneas en una sola operación de lectura. 
 */
package com.tema14ficheros.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silvia
 */
public class Ej05 {

      public static void main(String[] args) {
        String carpeta = "archivos";
        String nombreFichero = "fich02.txt";
        String rutaFichero = carpeta + File.separator + nombreFichero;
        String cadena;
        File fichero = new File(rutaFichero);
        //uso el arraylist
        ArrayList<String> lineas = new ArrayList<>();

        if (fichero.exists()==false) {
            System.out.println("Error: El fichero '" + nombreFichero + "' no existe en la carpeta '" + carpeta + "'.");
          
        }

        try (FileInputStream fis = new FileInputStream(fichero);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader bfr = new BufferedReader(isr)) {

            while ((cadena = bfr.readLine()) != null) {
                lineas.add(cadena); // Leer todas las líneas y almacenarlas en la lista
            }

            System.out.println("Contenido en mayusculas de '" + nombreFichero);
            for (String linea : lineas) {
                System.out.println(linea.toUpperCase());
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
