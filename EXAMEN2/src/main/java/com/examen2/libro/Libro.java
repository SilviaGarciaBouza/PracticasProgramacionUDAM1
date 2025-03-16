package com.examen2.libro;

/*
: Crear una clase Libro que contenga los siguientes atributos privados:
● ISBN
● Titulo
● Autor
● Número de páginas
● Contador (de tipo public y static) -> atributo de clase
Se implantaran varios constructores:
○ Un constructor por defecto.
○ Un constructor con el Titulo, el autor y el resto por defecto.
○ Un constructor con todos los atributos como parámetro.
El atributo contador se incrementa cada vez que se crea un nuevo objeto de la clase Libro.
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el
método toString() para mostrar la información relativa al libro con el siguiente formato:
«El libro con ISBN creado por el autor tiene páginas»
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
pantalla.
Imprimir por pantalla el valor del atributo contador sin necesidad de usar una instancia de la
clase Libro.
Por último, indicar cuál de los 2 tiene más páginas.
 */

/**
 *
 * @author silvia
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    static public int contador=0;

    public Libro() {
        contador++;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        contador++;
    }

    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        contador++;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Libro.contador = contador;
    }

    @Override
    public String toString() {
        return "«El libro con ISBN "+ISBN+" creado por el autor "+ autor+ " tiene "+numeroPaginas+" páginas»" ;
    }
    
    
    
}
