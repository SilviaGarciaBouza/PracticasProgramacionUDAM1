/*
Haz un main() que cree 4 libros (probando ambos constructores), que realice algún préstamo y
devolución, y finalmente muestre los libros -con toString()-.
 
 */
package sgbt06e08libro;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class MainLibro {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tituloLibro;
        System.out.println("Escribe el título de un libro:");
        tituloLibro= teclado.nextLine();
        EjemplarLibro libro1= new EjemplarLibro(tituloLibro);
        EjemplarLibro libro2= new EjemplarLibro(libro1);
        EjemplarLibro libro3 = new EjemplarLibro(libro2);
        EjemplarLibro libro4= new EjemplarLibro(libro3);
        libro1.prestar();
        libro2.prestar();
        libro1.devolver();
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        
    }
    
}
