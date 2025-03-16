/*
ROmbo*/

package com.figuras;
import java.util.Scanner;
/**
 *
 * @author silvia
 */
public class F04bRomboVacio {

    public static void main(String[] args) {
        //Declaramos un entero, cantidad de elementos.
        int numero;
        char simbolo;
        //Utilizamos Scanner para capturar datos del teclado.
        Scanner teclado = new Scanner(System.in);  
        //El try sirve para capturar las excepciones de entrada de datos.
       
            System.out.print("Ingresa el tamaño del lado para el rombo: ");
            numero = Integer.parseInt(teclado.nextLine());
            
            System.out.print("Ingresa un simbolo para dibujar el rombo: ");
            simbolo= teclado.nextLine().charAt(0);
            
            //Llamamos la función pasando el entero capturado como argumento.
            rombo(numero, simbolo );
            
            
            
            
            
            
            
     
    }
    //Creamos la función al cual le pasamos un entero y el simbolo como argumento.
    static void rombo(int numero , char simbolo){
       
       
        //Creamos el primer for.
        //Se hace con un preincremento ++j.
        for (int i = 0; i < numero; ++i) {
            //Cada primer for, se hace un salto de línea.
            System.out.println();
            //Utilizamos dos "for" para lograr la forma.
            for (int j = 0; j < numero-i-1; ++j) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < 2*i+1; ++j){
                //Condición para imprimir solo los bordes.
                if ((i==0)||(j==0)||(j==2*i)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }                
            }            
        }
        //Se utiliza otro grupo de for para lograr la forma de "rombo"
        for (int j = numero-2; j >= 0; --j) {
            System.out.println();
            //Utilizamos dos "for" para lograr la forma.
            for (int i = 0; i < numero-j-1; ++i) {                
                System.out.print(" ");
            }
            for (int i = 0; i < 2*j+1; ++i) {
                //Condición para imprimir solo los bordes.
                if ((j==0)||(i==0)||(i==2*j)) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }                
            }
        }
        System.out.println();
    }}
