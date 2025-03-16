/*
Realizar un programa que solicite una cadena, un número que indica una posición de la
cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la
posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con
StringBuilder.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E8CambiarCaracterEnPosicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        char caracterIntroducido;
        int numeroIntroducido;
        /*
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida = teclado.nextLine();
        System.out.println("Introduce un caracter: ");
        caracterIntroducido= teclado.nextLine().charAt(0);
        System.out.println("Introduce un numero: ");
        numeroIntroducido= Integer.parseInt(teclado.nextLine());
        //String
        System.out.println(cadenaIntroducida.replace(cadenaIntroducida.charAt(numeroIntroducido), caracterIntroducido));
        //StringBuilder
        */
        char caracterIntroducido2;
        int numeroIntroducido2;
        
        System.out.println("Introduce una cadena de caracteres: ");
        StringBuilder cadenaIntroducida2 = new StringBuilder(teclado.nextLine());
        System.out.println("Introduce un caracter: ");
        caracterIntroducido2= teclado.nextLine().charAt(0);
        System.out.println("Introduce un numero: ");
        numeroIntroducido2= Integer.parseInt(teclado.nextLine());
        System.out.println(cadenaIntroducida2.deleteCharAt(numeroIntroducido2).insert(numeroIntroducido2 , caracterIntroducido2));
    }
    
}
