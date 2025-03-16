/*
Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a
lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa
a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números,
espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E7Encriptado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida = teclado.nextLine();
        
        System.out.println(cadenaIntroducida.replace("A", "F").replace("B", "X").replace("C", "M"));
        
        System.out.println("Introduce otra cadena de caracteres: ");
        cadenaIntroducida= teclado.nextLine();
        System.out.println(cadenaIntroducida.replace("A", "F").replace("B", "X").replace("C", "M").replace("a", "F").replace("b", "X").replace("c", "M"));
        
    }
    
}
