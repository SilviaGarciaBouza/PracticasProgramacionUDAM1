/*
Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.
 */
package sgbt04;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class E4ContraseñaAleatoriaConLimitaciones {

   
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder contraseñaAleatoria= new StringBuilder();
        String aj="abcdefghij";
        int contraseñaLongitud= random.nextInt(5,11);
        for(int i=0;i<contraseñaLongitud;i++){
            contraseñaAleatoria.append(aj.charAt(random.nextInt(0,10)));
        }
        System.out.println(contraseñaAleatoria);
       
    }

}
