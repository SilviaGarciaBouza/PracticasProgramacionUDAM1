/*
Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos
muestre cuantas veces está contenido el carácter en la cadena.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E3NumeroDeVecesCaracterENCAdena {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        char caracterIntroducido;
        int numeroCaracter=0;
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida = teclado.nextLine();
        System.out.println("Introduce un catracter: ");
        caracterIntroducido= teclado.nextLine().charAt(0);
        
        for(int i=0; i<cadenaIntroducida.length();i++){
            if(cadenaIntroducida.charAt(i)==caracterIntroducido){
                numeroCaracter++;
            }
        }
        System.out.println(numeroCaracter);
        

    }
    
}
