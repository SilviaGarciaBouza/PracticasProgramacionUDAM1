/*
Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean
dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta
que lo haga correctamente. 
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO12_CADENADIGITOSNOREPETIDOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String cadena;
        boolean esdigito= true;
        boolean esRepetido=false;
        do{
            esdigito=true;
            esRepetido=false;
        System.out.println("Introduce una cadena de caracteres de 6 digitos no repetidos: ");
        cadena=teclado.nextLine();
        if(cadena.length()==6){
            for(int i=0; i<cadena.length();i++){
                if(Character.isDigit(cadena.charAt(i))==false){
                    esdigito=false;
                    break;
                }
                for (int j= i+1; j<cadena.length();j++){
                    if(cadena.charAt(i)==cadena.charAt(j)){
                        esRepetido=true;
                        break;
                    }
                }
                
                
            }
            
         
            
     
        }
        
        
        }while(cadena.length()!=6 || esdigito==false|| esRepetido==true);
        
        
        System.out.println("Cadena correcta");
        
    }
    
}
