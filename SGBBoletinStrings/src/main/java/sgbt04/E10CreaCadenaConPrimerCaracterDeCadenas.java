/*
Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una
cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E10CreaCadenaConPrimerCaracterDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder cadenaCreada = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce una cadena de caracteres: ");
            cadenaCreada.append(teclado.nextLine().charAt(0));

        }
        System.out.println(cadenaCreada);
    }

}
