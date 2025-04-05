/*
/*14.1. Realizar un programa que escriba distintas líneas con un texto cualquiera (con eñes y acentos)
en un fichero llamado fich01.txt especificando la codificación UFT-8. El fichero estará almacenado en
la carpeta archivos creada previamente. Una vez que funcione realiza los siguientes cambios:
a) Incorpora File.separator para componer la ruta del archivo.
b) Modifica la codificación, pasándola a ISO-8859-1. 
 */
package com.tema14ficheros.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author silvia
 */
public class EJ01 {

    public static void main(String[] args) {
        //la carpeta
        String carpeta = "archivos";
        //el archivo
        String nombreFichero = "fich01.txt";
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
        //    escribirFichero();
        System.out.println("Fichero creado. Nombre: " + rutaFicheroUTF8);
        //b) Modifica la codificación, pasándola a ISO-8859-1.
        escribirFichero(rutaFicheroUTF8, "ISO-8859-1");
        System.out.println("Se sobreescribe el fichero con la nueva codificacion (\"ISO-8859-1\")");

    }

    public static void escribirFichero(String rutaFichero, String codificacion) {
        File f = new File(rutaFichero);
        try (FileOutputStream fos = new FileOutputStream(f); OutputStreamWriter osw = new OutputStreamWriter(fos, codificacion); BufferedWriter bwr = new BufferedWriter(osw)) {
            bwr.write("Esta es la línea con eñes (ñ) y acentos (áéíóú).");
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
    }

}
//try (FileInputStream fis = new FileInputStream(f);
// InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); //"ISO-8859-1"
// BufferedReader bfr = new BufferedReader(isr)) {
// while((cadena=bfr.readLine()) != null)
// //tratamiento, por ejemplo: System.out.println(cadena);
// }
// catch (IOException ex) {
// System.err.printf("Error:%s\n",ex.getMessage());
// }
