package com.tema04cadenas;

import java.util.Scanner;

/*
Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio
es decir, lo que está entre la arroba y el punto (Ejemplo: info@mundo-r.com mostraría mundo-r ).
Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el
dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r ) 
 */
/**
 *
 * @author silvia
 */
public class EJERCICIO06_EMAIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder emailintroducido = new StringBuilder();
        
        //Sin guardar en una variable y sin modificar el stringbuilder
        System.out.println("Introduce un email: ");
        emailintroducido.append(teclado.nextLine());
        System.out.println(emailintroducido.substring(emailintroducido.indexOf("@") + 1, emailintroducido.indexOf(".")));
        
        //modificanso el stringbuilder
        emailintroducido.delete(0, emailintroducido.indexOf("@")+1);
        emailintroducido.delete(emailintroducido.indexOf("."), emailintroducido.length());
        System.out.println(emailintroducido);
        
        //pudiendo haver mas de un punto
        StringBuilder segundoEmail= new StringBuilder();
        System.out.println("Escribe otro email: ");
        segundoEmail.append(teclado.nextLine());
        segundoEmail.delete(0, segundoEmail.indexOf("@")+1);
        segundoEmail.delete(segundoEmail.lastIndexOf("."), segundoEmail.length());
        System.out.println(segundoEmail);
    }

}
