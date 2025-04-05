/*
Basándote en el ejercicio anterior, hay un programa en el usuario introduzca palabras o frases
y se vayan escribiendo como líneas separadas en un fichero llamado fich02.txt. El programa finaliza
cuando el usuario teclee “fin”. Para definir el objeto teclado para introducir texto especifica la
codificación de la consola mediante: Scanner teclado = new Scanner(System.in, "ISO-8859-1");*/
package com.tema14ficheros.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class Ej02 {

    //scanner con "ISO-8859-1"
    public static Scanner teclado = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        //la carpeta
        String carpeta = "archivos";
        //el archivo
        String nombreFichero = "fich02.txt";
        //crea carpeta si no existe
        File directorio = new File(carpeta);//le pasas la carpeta de paramtro
        if (directorio.exists() == false) {
            if (directorio.mkdir() == true) {
                System.out.println("Creada la carpeta");
            } else {
                System.out.println("Error al crear la carpeta");
            }
        }
        //crear el fichero xon UTF-8
        //a) Incorpora File.separator para componer la ruta del archivo.
        String rutaFicheroUTF8 = carpeta + File.separator + nombreFichero;
        //    escribirFichero()la codificación, pasándola a ISO-8859-1.
        escribirFichero(rutaFicheroUTF8, "ISO-8859-1");

    }

    public static void escribirFichero(String rutaFichero, String codificacion) {
        String lineaTexto;

        File f = new File(rutaFichero);
        try (FileOutputStream fos = new FileOutputStream(f); OutputStreamWriter osw = new OutputStreamWriter(fos, codificacion); BufferedWriter bwr = new BufferedWriter(osw)) {
            //que introduzca lineas de texto
            do {
                System.out.println("Escribe el texto (fin para terminar)");
                lineaTexto = teclado.nextLine();
                bwr.write(lineaTexto);
            } while (lineaTexto.equals("fin") == false);
            
            
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
    }

}
