/*
Ejercicio 1: Crear una clase Libro que contenga los siguientes atributos privados:
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
package zboletin;

/**
 *
 * @author silvia.garciabouza
 */
//poner la clase main a parte y la otra clase publica
public class LibroMain{
    public static void main(String[] args) {
        Libro libro= new Libro(5, 3,2,"titulo", "autor");
        System.out.println(libro.toString());
        System.out.println(" ");
        Libro libro2 = new Libro(11111, 22222, 3333, "TTTT", "AAAAA");
        Libro libro3= new Libro(99999, 8888, 77777, "SSSSS", "OOOOOO");
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(" ");
        System.out.println(libro2.contador);
        System.out.println(libro3.contador);
        System.out.println(" ");
        if(libro2.getNumeroPaginas()<libro3.getNumeroPaginas()){
            System.out.println("Tiene mas paginas libro3");
        }else if(libro2.getNumeroPaginas()>libro3.getNumeroPaginas()){
            System.out.println("Tiene mas paginas libro2");
        }else{
            System.out.println("Tienen el mismo numero de paginas");
        }
   }
}


class Libro {
    public static int contador;
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //al escribir otro constructor de elimina el vacio por defecto así que hay q construirlo:
    //contador++ cada vez que crea un new objeto
    Libro(){
    contador++;};
    //this el de la clase, sin this el del constructor
    Libro(String titulo, String autor){
        this.titulo= titulo;
        this.autor= autor;
    }
    Libro(int contador, int ISBN, int numeroPaginas, String titulo, String autor){
        this.contador= contador;
        this.ISBN= ISBN;
        this.autor= autor;
        this.numeroPaginas= numeroPaginas;
        this.titulo= titulo; 
        contador++;
    }

    public static int getContador() {
        return contador;
        
    }
//borro el setcontador pq no tiene sentido
    public static void setContador(int contador) {
        Libro.contador = contador;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
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

    @Override
    public String toString() {
        return "«El libro con "+getISBN()+" creado por "+ this.getAutor()+" tiene "+this.getNumeroPaginas()+" páginas»" ;
    }
   //this. es need para metodos static
    
    
}


