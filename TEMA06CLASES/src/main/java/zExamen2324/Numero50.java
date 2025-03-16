/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zExamen2324;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class Numero50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int contador=0;
       int suma=0;
       double raiz;
       double division;
       int numeroIntroducido;
       do{
        System.out.println("Escribe un numero: ");
        numeroIntroducido= Integer.parseInt(teclado.nextLine());
        if(numeroIntroducido>50){
            System.out.println("El numero debe ser menor de 50");
        }
       }while(numeroIntroducido>50);
     
        for(int i=1; i<=numeroIntroducido; i++){
            if(i%7==0){
             
                contador++;
                suma+=i;
            }
        }
         //multiplos de 7
         System.out.println(contador);
        //suma
        System.out.println(suma);
        //raiz
        raiz= (double)Math.sqrt(suma);
        System.out.println(raiz);
        //division
        division=raiz/(double)contador;
        DecimalFormat formato= new DecimalFormat("0.000");
        System.out.println(formato.format(division));
                
        
        
        
        
    }
    
    
    
    
}
