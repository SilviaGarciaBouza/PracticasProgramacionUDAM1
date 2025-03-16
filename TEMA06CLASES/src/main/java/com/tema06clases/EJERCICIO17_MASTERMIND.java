/*
(Opcional) Haz el juego del “MasterMind” de la siguiente forma: la máquina genera al azar 4
dígitos entre 0 y 10 sin repetidos que es lo que se tendrá que adivinar. El jugador introducirá
combinaciones de 4 dígitos también sin repetidos hasta que lo adivine. Cada vez que introduce una
combinación el sistema le dirá cuántos dígitos de los introducidos están en la combinación a
descubrir distinguiendo si están en la misma posición o si están en la combinación, pero en otra
posición. Tiene 10 intentos para averiguarlo.
Ejemplo: combinación a adivinar: 9871 intento: 8471: 2 dígitos bien colocados, 1 dígito mal colocado
El sistema validará que las combinaciones introducidas sean de 4 posiciones y sin repetidos. Haz una
clase con la lógica del juego y un programa que la utilice pero solo como intermediario entre la clase
y el jugador. Trata también de hacer el ejercicio lo suficientemente flexible para que a futuro se
pudiese fácilmente cambiar a combinaciones de 5 dígitos (ó 6 ó 7 etc.) y también cambiar el número
de intentos. 
 */
package com.tema06clases;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO17_MASTERMIND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int longitud;
        String cadenaIntroducida="0000";

        do {
            System.out.println("Indica la lomngitud de la cadena: ");
            longitud = Integer.parseInt(teclado.nextLine());
        } while (longitud <= 0 || longitud > 10);

        MasterMind mastermind = new MasterMind(longitud, cadenaIntroducida);
        for (int i = 1; i <= 10; i++) {

            do {
                System.out.println("Introduce una cadena de digitos(con la longitud seleccionada), sin repetir");
                cadenaIntroducida = teclado.nextLine();
                if (cadenaIntroducida.length() != longitud) {
                    System.out.println("Intento no valido");
                }
            } while (cadenaIntroducida.length() != longitud);

            
            System.out.println(mastermind.getNumeroAleatorio());
            System.out.println(mastermind.getNumeroAciertosMismoLugar() + " aciertos en el lugar correcto y " + mastermind.getNumeroAciertosDiferenteLugar() + " aciertos en diferente lugar.");
        }

    }

}

class MasterMind {

    private int longitud;
    private String numeroAleatorio;
    private String cadenaIntroducida;
    private int numeroAciertosMismoLugar;
    private int numeroAciertosDiferenteLugar;

    public MasterMind(int longitud, String cadenaIntroducida) {
        this.longitud = longitud;
        this.numeroAleatorio = numeroAleatorio(longitud);
        this.cadenaIntroducida = cadenaIntroducida;
       
        this.numeroAciertosMismoLugar = aciertosMismoLugar(cadenaIntroducida, this.numeroAleatorio);
        this.numeroAciertosDiferenteLugar = publicaciertosDiferenteLugar(cadenaIntroducida, this.numeroAleatorio);
    }

    public String getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public int getNumeroAciertosMismoLugar() {
        return numeroAciertosMismoLugar;
    }

    public int getNumeroAciertosDiferenteLugar() {
        return numeroAciertosDiferenteLugar;
    }

    static public String numeroAleatorio(int longitud) {
        StringBuilder cadena = new StringBuilder();
        StringBuilder numerosCadena = new StringBuilder("123456789");
        int numero;
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            numero = random.nextInt(0, numerosCadena.length());
            cadena.append(numerosCadena.toString().charAt(numero));
            numerosCadena.deleteCharAt(numero);
        }
        return cadena.toString();
    }

    static public int aciertosMismoLugar(String cadenaIntroducida, String cadenaAleatoria) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            if (cadenaAleatoria.charAt(i) == cadenaIntroducida.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    static public int publicaciertosDiferenteLugar(String cadenaIntroducida, String cadenaAleatoria) {
        int contador = 0;
        for (int i = 0; i < cadenaIntroducida.length(); i++) {
            
            for (int j = 0; j < cadenaAleatoria.length(); j++) {
                if (cadenaIntroducida.charAt(i) == cadenaAleatoria.charAt(j)) {
                    contador++;
                    break;
                }
            }
          
        }
        return contador;
    }

}
