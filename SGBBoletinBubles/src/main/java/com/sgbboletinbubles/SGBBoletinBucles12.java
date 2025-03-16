/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-10-03
 *Ejercicio: Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144… El número n se debe introducir por teclado.

 */
package com.sgbboletinbubles;

import java.util.Scanner;

public class SGBBoletinBucles12 {


    public static void main(String[] args) {
        Scanner keyboar= new Scanner(System.in);
        int number, number1=0, number2=1;
        do{
        System.out.println("Escribe un numero mayor o igual a 0: ");
        number=Integer.parseInt(keyboar.nextLine());
        if(number<0){
            System.out.println("El numero introducido no es correcto.");
        }
        }while(number<0);
        
        if(number==0){
            
        }else if(number==1){
                   System.out.println(number1);
 
        }else if(number==2){
        System.out.println(number1);
        System.out.println(number2);}
        else{
            System.out.println(number1);
        System.out.println(number2);
        
        for(int i= 3; i<=number;i++){
            System.out.println(number1+number2);
            
          
            number2=number1+number2;
            number1= number2-number1;
        }

            
            
            
        }
        

    }
    
}
