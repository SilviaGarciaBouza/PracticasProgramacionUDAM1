/*
Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con
el método System.out.printf.
Hola, me llamo Pepe Pérez López y tengo 20 años
suponiendo que se introduce Pepe Pérez López como nombre completo y 20 como edad.
 */
package sgbt04;

import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E9Formaty {

    
    public static void main(String[] args) {
        Scanner teclaso = new Scanner(System.in);
        String nombreIntrducido;
        int edad;
        
        
        System.out.println("Introduce tu nombre completo: ");
        nombreIntrducido= teclaso.nextLine();
        System.out.println("Introduce tu edad: ");
        edad= Integer.parseInt(teclaso.nextLine());
        //Con printf
        System.out.printf("Hola, me llamo %s y tengo %d años", nombreIntrducido,edad);
        //Con Format
        System.out.println("");
        System.out.println(String.format("Hola, me llamo %s y tengo %d años", nombreIntrducido,edad));
    }
    
}
