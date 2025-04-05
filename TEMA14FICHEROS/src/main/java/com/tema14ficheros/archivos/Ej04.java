/*
14.4. Realizar un programa que lea secuencialmente el fichero fich02.txt línea a línea y lo muestre
por pantalla, con el texto en mayúscula. 
 */
package com.tema14ficheros.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author silvia
 */
public class Ej04 {

       public static void main(String[] args) {
        String carpeta = "archivos";
        String nombreFichero = "fich02.txt";
        String rutaFichero = carpeta + File.separator + nombreFichero;
        String cadena;
        File fichero = new File(rutaFichero);

        if (fichero.exists()==false) {
            System.out.println("Error: El fichero '" + nombreFichero + "' no existe en la carpeta '" + carpeta + "'.");
        }

        try (FileInputStream fis = new FileInputStream(fichero);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader bfr = new BufferedReader(isr)) {

            System.out.println("Contenido en mayusculas de '" + nombreFichero );
            while ((cadena = bfr.readLine()) != null) {
                System.out.println(cadena.toUpperCase());
            }

        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
}
