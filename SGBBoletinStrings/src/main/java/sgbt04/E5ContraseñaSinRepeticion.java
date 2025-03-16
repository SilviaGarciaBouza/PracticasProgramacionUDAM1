/*
(Opcional) Realiza un programa que muestre una contraseña generada aleatoriamente
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre
la ‘a’ y la ‘j’ pero sin letras repetidas.
 */
package sgbt04;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class E5ContraseñaSinRepeticion {

    public static void main(String[] args) {
        StringBuilder cadenaAleatoria = new StringBuilder();
        Random random = new Random();
        StringBuilder aj = new StringBuilder("abcdefghij");
        int longitud = random.nextInt(5, 11);

        for (int i = 0; i < longitud; i++) {
            int randomnumber= random.nextInt(0,aj.length());
            cadenaAleatoria.append(aj.charAt(randomnumber));
            aj.deleteCharAt(randomnumber);
        }
        System.out.println(cadenaAleatoria);

    }
}
