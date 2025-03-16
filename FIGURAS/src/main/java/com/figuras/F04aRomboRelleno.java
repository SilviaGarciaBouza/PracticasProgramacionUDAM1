/*
Rombo relleno
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F04aRomboRelleno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 boolean numeroCorrecto = false;
int numFilasRombos; 
char relleno;
 // Solicitar al usuario el simbolo para el relleno
        System.out.print("Ingrese un simbolo  para el arelleno del rombo: ");
        relleno = teclado.nextLine().charAt(0);
        do {
            System.out.print("Introduce el número de filas (natural e impar): ");
            numFilasRombos = Integer.parseInt(teclado.nextLine());
            if(numFilasRombos>0 && numFilasRombos%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);
         

        System.out.println("");

       
        
        int numFilas = numFilasRombos/2 + 1;
                 
        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print(relleno);
            }
            System.out.println("");         
        }
         
        numFilas--;
         
        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            //simbolo
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}

       
      
         
       
        