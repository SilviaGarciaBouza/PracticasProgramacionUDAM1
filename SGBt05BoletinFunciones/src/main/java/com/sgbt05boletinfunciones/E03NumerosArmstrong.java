/*
Escribe una función, numerosArmstrong(), que tiene como parámetros dos números enteros,
uno de límite inferior y otro superior. La función no devuelve nada.
La función numerosArmstrong() escribe por pantalla los números Armstrong comprendidos entre el
límite inferior y el superior. Un número Armstrong es aquel que la suma de cada una de sus dígitos
elevada a la potencia de la cantidad de sus dígitos es igual al número.
Ejemplo:
4 = 41
153 = 13
 + 53
 + 33
 (elevamos a 3 porque tiene 3 dígitos)
8208 = 84
 + 24
 + 04
 + 84
 (elevamos a 4 porque tiene 4 dígitos)
 */
package com.sgbt05boletinfunciones;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class E03NumerosArmstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        do{
        System.out.println("Introduce un numero: ");
        numero1= Integer.parseInt(teclado.nextLine());
        if(numero1<0){
            System.out.println("El numero debe ser mayor o igual a 0");
        }
        }while(numero1<0);
        
        do{
        System.out.println("Introduce otro numero: ");
        numero2= Integer.parseInt(teclado.nextLine());
        if(numero2<0){
            System.out.println("El numero debe ser mayor o igual a 0");
        }
        }while(numero2<0);
        
        numerosArmstrong(numero1, numero2);
        
    }
      //Con numeros
    static void numerosArmstrong(int limiteInferior, int limiteSuperior){
       
        if(limiteInferior> limiteSuperior){
            limiteSuperior=limiteInferior+limiteSuperior;
            limiteInferior=limiteSuperior-limiteInferior;
            limiteSuperior= limiteSuperior-limiteInferior;
        }
        //incluyo el limite sup e inf
        
        for(int i=limiteInferior; i<=limiteSuperior; i++){
            int contadorCifras=0;
            for(int f=i; f>0; f/=10){
                contadorCifras++;
            }
            int numeroAms=0;
            for(int j=i; j>0; j/=10){
                numeroAms+= ((int) Math.pow(j%10, contadorCifras));
            }
            if (numeroAms==i){
                System.out.println(i);
            }
        }
    }
    
    //Con Strings
   
    
}
