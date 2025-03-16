/*
Escribe un programa que detecte si una palabra es anagrama de otra, es decir, si tiene las
mismas letras es distinta posición. Son ejemplo de anagrama, las palabras creativo y reactivo.
Suponemos que si tienen letras repetidas, en la otra palabra no se tienen que repetir en la misma
cantidad; es decir, damos por válido como anagrama el texto abba y aaab.

 */
package com.sgbt05boletinfunciones;
import java.util.Scanner;


public class Anagrama {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String primeraPalabra, segundaPalabra;
        System.out.println("Escribe una palabra: ");
        primeraPalabra = teclado.nextLine();
        System.out.println("Escribe otra palabra: ");
        segundaPalabra = teclado.nextLine();
        boolean esAnagrama = true;

     
        //Sin repetir
 
        if (primeraPalabra.length() == segundaPalabra.length()) {
            for (int i = 0; i < primeraPalabra.length(); i++) {
                if (primeraPalabra.length() - primeraPalabra.replace(Character.toString(primeraPalabra.charAt(i)), "").length()
                        != segundaPalabra.length() - segundaPalabra.replace(Character.toString(primeraPalabra.charAt(i)), "").length()) {
                    esAnagrama = false;
                    break;
                }
            }
        } else {
            esAnagrama = false;
        }

        if (esAnagrama == true) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }
        
        //repitiendo pueden ter dist numero de letras numero de letras
        int count1=0;
        int count2=0;

            for(int i=0; i<primeraPalabra.length(); i++){
                for(int j=0; j<segundaPalabra.length(); j++){
                  if(primeraPalabra.charAt(i)==segundaPalabra.charAt(j)){
                      count1++;
                      break;
                  }  
                }
                
            }
            
            for (int i=0; i<segundaPalabra.length();i++){
                for(int j=0; j<primeraPalabra.length(); j++){
                    if(segundaPalabra.charAt(i)== primeraPalabra.charAt(j)){
                        count2++;
                        break;
                    }
                }
            }
            
            if(count1==count2){
                System.out.println("Son anagramas");
            } else{
                System.out.println("No son anagramas");
            }                   
        
        //repitiendo mismo numero de letras
     
        if(primeraPalabra.length()==segundaPalabra.length()){
            for(int i=0; i<primeraPalabra.length(); i++){
                for(int j=0; j<segundaPalabra.length(); j++){
                   
                }
                
            }
            
          
                             
        }else{
            System.out.println("No son anagramas");
        }

    }

}

