/*
Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones
impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g”
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E15ReplaceImparesAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        StringBuilder cadenaIntroducida= new StringBuilder();
        System.out.println("Introduce una cedena");
        cadenaIntroducida.append(teclado.nextLine());
        for(int i=0; i<cadenaIntroducida.length();i++){
            if(i%2==0){
                cadenaIntroducida.repeat(i, '*');
            }
        }
        System.out.println(cadenaIntroducida);
    }
    
}
