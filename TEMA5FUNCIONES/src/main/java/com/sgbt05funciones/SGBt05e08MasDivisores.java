/*
 * Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál
de los dos tiene más divisores (usar función previa). 
 */
package com.sgbt05funciones;

import java.util.Scanner;
import static com.sgbt05funciones.SGBt05e06CantidadDivisores.cantidadDivisores;


/**
 *
 * @author silvia
 */
public class SGBt05e08MasDivisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero1;
        int numero2;
        do{
        System.out.println("Introduce un numero: ");
        numero1= Integer.parseInt(teclado.nextLine());
        }while(numero1<=0);
        do{
        System.out.println("Introduce otro numero: ");
        numero2= Integer.parseInt(teclado.nextLine());
        }while(numero2<=0);
        
        if(cantidadDivisores(numero1)>cantidadDivisores(numero2)){
            System.out.println("El primer numero introducido tiene mas numero de divisores");
        }  else if(cantidadDivisores(numero1)<cantidadDivisores(numero2)){
            System.out.println("El primer numero introducido tiene mas numero de divisores");
        }else{
            System.out.println("Tienen el mismo numero de divisores");
        }
        
    }
    
}
