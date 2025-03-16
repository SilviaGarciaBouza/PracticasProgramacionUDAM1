/*
Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y que tiene
los siguientes atributos:
- Título de libro (se le pone en el momento del alta)
- Fecha de adquisición (es la fecha del sistema en el momento del alta)
- Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios ejemplares)
- Prestado (sí /no). Inicialmente no está prestado.
Además, tiene los siguientes métodos:
- Constructor 1: cuando es el primer ejemplar de un determinado título, se le pasa como parámetro solo
el título del libro. El resto de datos los puede calcular él.
- Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos salvo el número de
ejemplar que será 1 más el del libro pasado.
- prestar (): si no está prestado lo marca como prestado y devuelve true¸ si está prestado no hace nada
y devuelve false.
- devolver (): si está prestado lo marca como no prestado y devuelve true¸ si no está prestado no hace
nada y devuelve false.
- toString (): Genera un String con el nombre, la fecha entre paréntesis y el número de ejemplar entre
corchetes. Este método se usará para sacar por pantalla de forma cómoda los datos de un libro.
Haz un main() que cree 4 libros (probando ambos constructores), que realice algún préstamo y
devolución, y finalmente muestre los libros -con toString()-.
 */
package sgbt06e08libro;

import java.time.LocalDate;

/**
 *
 * @author silvia.garciabouza
 */
public class EjemplarLibro {

    //atributos
    private String tituloLibro;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private String prestado="no";
    //constructor para el primer ejemplar
    public EjemplarLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
        this.fechaAdquisicion= LocalDate.now();
        this.numeroEjemplar=1;
    }
    //constructor para los siguientes ejemplares
    public EjemplarLibro(EjemplarLibro libro) {
        this.tituloLibro= libro.tituloLibro;
        this.fechaAdquisicion= libro.fechaAdquisicion;
        this.numeroEjemplar= libro.numeroEjemplar+1;
    }
    //método prestar
     public boolean prestar(){
        if(this.prestado.equals("no")){
            this.prestado="si";
            return true;
        }else{
            return false;
        }
    }
     //metodo devolver
     public boolean devolver(){
         if(this.prestado.equals("si")){
             this.prestado="no";
             return true;
         }else{
             return false;
         }
     }
    //toString
     
    @Override
    public String toString() {
        return tituloLibro + "(=" + fechaAdquisicion + ") {" + numeroEjemplar + "}";
    }
     
    
}
