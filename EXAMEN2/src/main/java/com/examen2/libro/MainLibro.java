/*
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
pantalla.
Imprimir por pantalla el valor del atributo contador sin necesidad de usar una instancia de la
clase Libro.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package com.examen2.libro;

/**
 *
 * @author silvia
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1= new Libro("el pez", "Don pez");
        Libro libro2= new Libro("kldsmcal,", "el titulo", "elautor", 200);
        System.out.println("Libro 1"+libro1.toString());
         System.out.println("Libro 2"+libro2.toString());
        System.out.println(Libro.contador);
        if(libro1.getNumeroPaginas()>libro2.getNumeroPaginas()){
            System.out.println("El libro 1 tiene mas paginas");
        }else if(libro1.getNumeroPaginas()<libro2.getNumeroPaginas()){
            System.out.println("El libro 2 tiene mas paginas");
        }else{
            System.out.println("Tienen igual numero de paginas");
        }
        
                
    }
    
}
