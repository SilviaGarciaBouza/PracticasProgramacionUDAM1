/*
5. Escribe un programa que verifique si una contraseña es segura o no. Consideramos una
contraseña segura cuando tiene, al menos:
- 8 caracteres
- una mayúscula
- una minúscula
- un número
- un carácter especial (signo de puntuación, etc …)
En el caso de que no sea así, si no alcanza la longitud mínima, se informará con un mensaje.
Si supera la longitud míni
 */
package com.sgbboletinstrings;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class VerificaContraseñaSegura {

    public static void main(String[] args) {

        int contadorMayuscula=0;
        int contadorMinusculas= 0;
        int contarorNumero=0;
        int contadorCaracter=0;
        Scanner teclado = new Scanner(System.in);
        String contraseñaIntroducida;
        System.out.println("Escribe una contraseña: ");
        contraseñaIntroducida = teclado.nextLine();
        if (contraseñaIntroducida.length() < 8) {
            System.out.println("La contraseña no es segura, debe contener al menos 8 caracteres");
        } else {
            for (int i = 0; i < contraseñaIntroducida.length(); i++) {
                if (Character.isUpperCase(contraseñaIntroducida.charAt(i))) {
                    contadorMayuscula++;
                    
                }
                else if(Character.isLowerCase(contraseñaIntroducida.charAt(i))){
                    contadorMinusculas++;
                }else if(Character.isDigit(contraseñaIntroducida.charAt(i))){
                    contarorNumero++;
                }else{
                    contadorCaracter++;
                }
            }
            if (contadorMayuscula!=0&&contadorMinusculas!=0&&contadorCaracter!=0&&contarorNumero!=0){
                System.out.println("La contraseña es segura");
            }else{
                System.out.println("La contraseña no es segura");
            }
            
        }

    }

}
