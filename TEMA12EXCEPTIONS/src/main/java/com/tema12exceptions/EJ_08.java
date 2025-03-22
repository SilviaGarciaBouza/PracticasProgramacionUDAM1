/*
Realiza una función/método que se le pase por parámetro una cadena que representa una
dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de
un email, se generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que
tener una dirección de email podrían ser: número mínimo de caracteres=5, una arroba y al menos
un punto después de la arroba. Hacer también un programa que llame a la función anterior y capture
la excepción generada.
En el tercer trimestre veremos las expresiones regulares que facilitan estas tareas de validación 
 */
package com.tema12exceptions;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe un email: ");
            email = scanner.nextLine();
            validarCadena(email);
             System.out.println("Email valido!");
        } catch (FormatoExcepcion ex) {
            System.out.println("Error: " + ex.getMessage());
        }
       

    }

    public static void validarCadena(String email) throws FormatoExcepcion {
        if (email.length() < 5 || email.indexOf("@") == -1 || email.indexOf(".") == -1 || email.indexOf("@") > email.indexOf(".")) {
            throw new FormatoExcepcion();
        }
    }

    static class FormatoExcepcion extends Exception {

        @Override
        public String getMessage() {
            return "Formato email inválido";
        }

    }
}



/*
public class Ej08 {

    
    public static void main(String[] args) {
        String email;
        try{
        Scanner scaner= new Scanner(System.in);
        email= scaner.nextLine();
        verificaCadena(email);

        }catch(FormatoEmailExcepcion ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
    }
    
    static public void verificaCadena(String email)throws FormatoEmailExcepcion{
        
            if(email.length()<5||email.indexOf("@")==-1||email.indexOf(".")==-1||email.indexOf("@")>email.indexOf(".")){
                throw new FormatoEmailExcepcion();
            }
       
    }
   static class FormatoEmailExcepcion extends Exception{

        @Override
        public String getMessage() {

            return "Formato email inválido";
        }
        
    }
    
}
*/