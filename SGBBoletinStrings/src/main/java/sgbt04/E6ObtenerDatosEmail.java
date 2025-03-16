/*
Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio
es decir, lo que está entre la arroba y el punto (Ejemplo: info@mundo-r.com mostraría mundo-r ).
Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el
dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )
 */
package sgbt04;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class E6ObtenerDatosEmail {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String emailIntroducido;
        System.out.println("Introduce el email: ");
        emailIntroducido = teclado.nextLine();
        //nos devuelva el nombre del dominio es decir, lo que está entre la arroba y el punto 
        System.out.println(emailIntroducido.substring(emailIntroducido.indexOf("@") + 1, emailIntroducido.indexOf(".")));

        //pueda haber varios puntos en el dominio
        System.out.println(emailIntroducido.substring(emailIntroducido.indexOf("@") + 1, emailIntroducido.lastIndexOf(".")));

    }
}
