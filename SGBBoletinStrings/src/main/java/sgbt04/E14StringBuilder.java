/*
Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a
StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
a. Borrar el carácter que haya en la posición 3.
b. Insertar una ‘x’ en la posición 5.
c. Sustituir el carácter de la posición 1 por una ‘z’.
d. Borrar los caracteres entre la posición 5 y 10.
e. Darles la vuelta a todos los caracteres del StringBuilder.
f. Convertir el StringBuilder en cadena.
Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de
la posición indicada, sino producirá errores.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E14StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder cadenaIntroducida = new StringBuilder();

        System.out.println("Introduce una cadena: ");
        cadenaIntroducida.append(teclado.nextLine());
        //a. Borrar el carácter que haya en la posición 3.
        if (cadenaIntroducida.length() > 3) {
            System.out.println(cadenaIntroducida.deleteCharAt(3));
        } else {
            System.out.println("No puede puede realizar la operacion porque la longitud de la cadena es muy pequeña");
        }
        //b. Insertar una ‘x’ en la posición 5.
        if (cadenaIntroducida.length() > 5) {
            System.out.println(cadenaIntroducida.insert(5, 'x'));
        } else {
            System.out.println("No puede puede realizar la operacion porque la longitud de la cadena es muy pequeña");
        }
        //c. Sustituir el carácter de la posición 1 por una ‘z’.
        if (cadenaIntroducida.length() > 1) {
            System.out.println(cadenaIntroducida.repeat('z', 1));
        } else {
            System.out.println("No puede puede realizar la operacion porque la longitud de la cadena es muy pequeña");
        }
        //d. Borrar los caracteres entre la posición 5 y 10.
        if (cadenaIntroducida.length() > 10) {
            System.out.println(cadenaIntroducida.delete(5, 11));
        } else {
            System.out.println("No puede puede realizar la operacion porque la longitud de la cadena es muy pequeña");
        }
        //e. Darles la vuelta a todos los caracteres del StringBuilder.

        System.out.println(cadenaIntroducida.reverse());
        //f. Convertir el StringBuilder en cadena.
       System.out.println( cadenaIntroducida.toString());

    }

}
