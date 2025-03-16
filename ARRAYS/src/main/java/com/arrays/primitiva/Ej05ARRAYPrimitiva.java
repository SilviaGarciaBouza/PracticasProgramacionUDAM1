/*
Realizar una clase Primitiva que tenga definido un Array privado de 6 elementos con el
resultado de un sorteo de la primitiva (serán 6 enteros con valores comprendidos entre 1 y 49 y sin
repetidos). La clase dispondrá de un constructor en el que se generan y almacenen esos números
al azar, también tendrá un método al que se le pase una combinación jugada como parámetro (no
necesariamente ordenada) y devuelva el número de aciertos. Realiza tres programas distintos que
usen esa clase:
• Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.
• Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos hay con 3,
4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar
boletos al azar).
Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos boletos has
tenido que crear? 
 */
package com.arrays.primitiva;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Ej05ARRAYPrimitiva {
     
    //ATRIBUTO
   private int[] arrayGanadorPrimitiva;
   Random random= new Random();
   
   //CONSTRUCTOR
    public Ej05ARRAYPrimitiva() {
        arrayGanadorPrimitiva= new int[6];
        
        arrayGanadorPrimitiva[0]= random.nextInt(1,50);
        for(int i=1; i<arrayGanadorPrimitiva.length; i++){
            for(int j=i-1; j>=0; j--){
                do{
                  arrayGanadorPrimitiva[i]= random.nextInt(1,50);  
                }while(arrayGanadorPrimitiva[i]==arrayGanadorPrimitiva[j]);
            }
        }     
    }
    //METODO Nº ACIERTOS
    public int numeroAciertos(int[] arrayPrimitiva){
        int numeroAciertos=0;
        if(arrayPrimitiva.length==6){
            for(int i=0; i<arrayGanadorPrimitiva.length;i++){
                for(int j=0; j<arrayPrimitiva.length; j++){
                    if(arrayPrimitiva[j]==arrayGanadorPrimitiva[i]){
                        numeroAciertos++;
                        break;
                    }
                }
            }
        }       
        return numeroAciertos;
    }
    //GENERA ARRAY PARA NUEVO BOLETO
    public int[] generaNuevoBoleto(){
         int[] arrayBoletoPrimitiva=new int[6];
        
        
        arrayBoletoPrimitiva[0]= random.nextInt(1,50);
        for(int i=1; i<arrayBoletoPrimitiva.length; i++){
            for(int j=i-1; j>=0; j--){
                do{
                  arrayBoletoPrimitiva[i]= random.nextInt(1,50);  
                }while(arrayBoletoPrimitiva[i]==arrayBoletoPrimitiva[j]);
            }
        } 
        return arrayBoletoPrimitiva;
    }
   
    
}



    



















    
//    //numero de aciertos
//    public int numeroAciertos(int[] miBoleto){
//        int contador=0;
//        for(int i=0; i<this.resultado.length; i++ ){
//            for(int j= 0; j<miBoleto.length; j++){
//                if(miBoleto[j]==this.resultado[i]){
//                    contador++;
//                    miBoleto[j]=51;
//                }
//            }
//        }
//        return contador;
//    }
 
   