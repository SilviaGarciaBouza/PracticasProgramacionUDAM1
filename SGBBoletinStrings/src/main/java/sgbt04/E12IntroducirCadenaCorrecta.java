/*
Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean
dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta
que lo haga correctamente.
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E12IntroducirCadenaCorrecta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        boolean cadenaCorrecta = true;

        do {
            
            System.out.println("Introduce una cadena de caracteres: ");
            cadenaIntroducida = teclado.nextLine();

            if (cadenaIntroducida.length() == 6) {
                cadenaCorrecta=true;
                for (int i = 0; i < cadenaIntroducida.length(); i++) {
                    
                    if (Character.isDigit(cadenaIntroducida.charAt(i)) == true) {
                        for (int j = 0; j < i; j++) {
                            if (cadenaIntroducida.charAt(i) == cadenaIntroducida.charAt(j)) {
                                cadenaCorrecta = false;
                                break;
                            }
                        }
                    }else{
                        cadenaCorrecta=false;
                        break;
                    }
                }

            } else {
                cadenaCorrecta = false;
            }

        } while (cadenaCorrecta == false);
        System.out.println(cadenaCorrecta);
    }

}
