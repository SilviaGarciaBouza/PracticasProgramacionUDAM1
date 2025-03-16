/*

Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos boletos has
tenido que crear? 
 */
package com.arrays.primitiva;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class MainEj05PrimitivaGeneraGanador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Ej05ARRAYPrimitiva miprimitiva= new Ej05ARRAYPrimitiva();
         Random random= new Random();
       int numeroAciertos;
        int count=0;
        do{
            
        numeroAciertos=miprimitiva.numeroAciertos(miprimitiva.generaNuevoBoleto());
       
        
        count++;
        
       
        
        }while(numeroAciertos!=6);
        System.out.println("Se han creado: "+count);
    }
    
}
