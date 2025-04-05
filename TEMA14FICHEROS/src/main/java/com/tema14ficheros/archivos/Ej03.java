/*
14.3. (Opcional) Haz una versión del programa anterior, que compruebe previamente si el fichero
fich02.txt existe o no. En caso afirmativo hará una copia del archivo como fich02.bak y seguirá
añadiendo las líneas sobre fich02.txt . 
 */
package com.tema14ficheros.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author silvia
 */

public class Ej03 {

     //scanner con "ISO-8859-1"
    public static Scanner teclado = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        ArrayList<String>lineasIntroducidas= new ArrayList<>();
        String lineaTexto;
        //la carpeta
        String carpeta = "archivos";
        //el archivo
        String nombreFichero = "fich02.txt";
        //la copia del archivo
        String nombreFicheroBackup = "fich02.bak";
        
      
        //crear el fichero xon UTF-8
        //a) Incorpora File.separator para componer la ruta del archivo.
        String rutaFichero = carpeta + File.separator + nombreFichero;
        //ruta de la copia
         String rutaFicheroBackup = carpeta + File.separator + nombreFicheroBackup;
         
           //crea carpeta si no existe
        File directorio = new File(carpeta);//le pasas la carpeta de paramtro
        if (directorio.exists() == false) {
            if (directorio.mkdir() == true) {
                System.out.println("Creada la carpeta");
            } else {
                System.out.println("Error al crear la carpeta");
            }
        }
         
        //crea fichero, la representacion de memoria
         File f = new File(rutaFichero);
         //si el fichero existe (el fisico)hace lo copia
         if (f.exists()) {
            realizarBackup(f, new File(rutaFicheroBackup));
        }
         
         do {
 
                System.out.println("Escribe el texto (fin para terminar)");
                lineaTexto =teclado.nextLine();
                lineasIntroducidas.add(lineaTexto);
            } while (lineaTexto.equals("fin") == false);
       
         
        //    escribirFichero()la codificación, pasándola a ISO-8859-1. Añade las lineas sobre el anterior
        escribirFichero(lineasIntroducidas,rutaFichero, "ISO-8859-1",f);
        
        
        

    }

    public static void escribirFichero(ArrayList<String> a,String rutaFichero, String codificacion, File f) {
      

       // File f = new File(rutaFichero);
        try (FileOutputStream fos = new FileOutputStream(f); 
                OutputStreamWriter osw = new OutputStreamWriter(fos, codificacion); 
                BufferedWriter bwr = new BufferedWriter(osw)) {
            //que introduzca lineas de texto
            for(String elemento:a){
                bwr.write(elemento);
            }          
            } catch (IOException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
    }
   
    
     public static void realizarBackup(File ficheroOriginal, File ficheroBackup) {
        try {
            Files.copy(ficheroOriginal.toPath(), ficheroBackup.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Se ha realizado una copia de seguridad de '" + ficheroOriginal.getName() + "' como '" + ficheroBackup.getName() + "'.");
        } catch (IOException e) {
            System.err.println("Error al realizar la copia de seguridad: " + e.getMessage());
        }
    }


}
