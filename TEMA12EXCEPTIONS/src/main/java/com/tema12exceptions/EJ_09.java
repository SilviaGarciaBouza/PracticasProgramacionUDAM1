/*
Modificar la clase MasterMindExcep entregada por el profesor, para que si el número
ingresado por el usuario (cada intento) no cumple alguno de los requisitos, genere una excepción.
Habrá una excepción “Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si tiene
caracteres no numéricos y una tercera excepción “Valores repetidos” si contiene algún dígito
repetido.
Crea un programa copiándolo del entregado por el profesor: MasterMindExcepMain, que hace uso
de esta clase, y provoca las excepciones propuestas para ver su funcionamiento. A continuación,
modifícalo para que capture estas excepciones sin producir una salida abrupta del programa.
 */
package com.tema12exceptions;


import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_09 {
           public static MasterMindException mastermind;
           
           public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
     
        int longitud;
        String cadenaIntroducida="0000";
        System.out.println("Indica la longitud de la cadena: ");
        longitud = Integer.parseInt(teclado.nextLine());
     
          mastermind = new MasterMindException(longitud);

        for (int i = 1; i <= 10; i++) { 
        boolean esCorrecto=false;    
        do{    
        try{
            cadenaIntroducida=validarCadena();
            esCorrecto=true;
            
        }catch(TamañoIncorrectoException ex){
            System.out.println("Error: "+ex.getMessage());
        }catch(ValoresInvalidosException ex){
            System.out.println("Error: "+ex.getMessage());
        }catch(ValoresRepetidosException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        }while(!esCorrecto);
        
        
        
        
        
        
        
        
        
        }
    }
    static public String validarCadena() throws TamañoIncorrectoException,ValoresInvalidosException,ValoresRepetidosException{
           String cadenaIntroducida;
           
           System.out.println("Escribe un numero de "+mastermind.getLongitud()+" de longitud");
           cadenaIntroducida=teclado.nextLine();
          if(cadenaIntroducida.length()!=mastermind.getLongitud()){
              throw new TamañoIncorrectoException();
          }
          if(!sonDigitos(cadenaIntroducida)){
              throw new ValoresInvalidosException();
          }
          if(!noEstanRepetidos(cadenaIntroducida)){
              throw new ValoresRepetidosException();
          }
          return cadenaIntroducida;
    }
    
    
    static public boolean sonDigitos(String cadenaIntrocida){
        for(int i=0; i<cadenaIntrocida.length();i++){
            if(!Character.isDigit(cadenaIntrocida.charAt(i))){
                return false;
            }
        }
        return true;
    }
   static public boolean noEstanRepetidos(String cadenaIntroducida){
       for(int i=0; i<cadenaIntroducida.length()-1;i++){
            for(int j=i+1; j<cadenaIntroducida.length();j++){
                if(cadenaIntroducida.charAt(i)==cadenaIntroducida.charAt(j))
                    return false;
            }
        }
        return true;
   }
}


































