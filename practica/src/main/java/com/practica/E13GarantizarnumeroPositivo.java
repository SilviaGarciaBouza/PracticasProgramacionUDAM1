/*
 Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo
introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario
hasta que se introduzca uno positivo.
Cuando tenemos que hacer algo una o más veces, pero por lo menos una, el do...while puede ser
mejor opción que el while.
 */
package com.practica;

import java.util.Scanner;


public class E13GarantizarnumeroPositivo {


    public static void main(String[] args) {

        double num;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un numero mayor a 0: ");
            num=Double.parseDouble(teclado.nextLine());
            if(num<=0){
                System.out.println("numero incorrecto");
            }
        }while (num<=0);
            
        System.out.println("El numero es positivo.");
    }
    
}
