/*
(Opcional) Realizar un programa al que se le introduzca un número decimal y lo convierta a
un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las
clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de
decimal a hexadecimal.
Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes
obtenidos hasta que el cociente sea cero. El número será la concatenación de restos,
convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B...15->F
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E13Hexadecimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String numeroIntroducido;
        boolean numeroCorrecto;

        do{
            numeroCorrecto = true;
        System.out.println("Introduce un numero: ");
        numeroIntroducido = teclado.nextLine();
        for (int i = 0; i < numeroIntroducido.length(); i++) {
            if (Character.isDigit(numeroIntroducido.charAt(i)) == false) {
                System.out.println("Debes introducir un numero");
                numeroCorrecto=false;
            }
        }
        
        }while(numeroCorrecto==false);
        
        
    }
}