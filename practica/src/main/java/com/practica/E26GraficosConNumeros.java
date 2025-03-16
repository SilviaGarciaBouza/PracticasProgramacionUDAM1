/*
Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
a)0000000000
  1111111111

b)1
  22
  333

c)1111111111
  222222222
  33333333

d)9
  98
  987
 */
package com.practica;


public class E26GraficosConNumeros {


    public static void main(String[] args) {

        
        //Programa a
        for(int i=0; i<9; i++){
            System.out.println("");
            for(int j=0; j<=9; j++){
                System.out.print(i);
            }
        }
        
        System.out.println("");
        
        //programa b
        for(int i= 1; i<=9; i++){
            System.out.println("");
            for(int j= 1; j<=i; j++){
                System.out.print(i);
            }
        }
        
        
        System.out.println("");
        
        //programa c
        for(int i=1; i<=9; i++){
            System.out.println("");
            for(int j= 1; j<=10-i; j++){
                System.out.print(i);
                        
            }
        }
        
        System.out.println("");
        
        //programa d
        for(int i= 1; i<=9; i++){
            System.out.println("");
            for (int j= 9;j>(9-i);j-- ){
                    System.out.print(j);
                }
        }
        
          
        
    }
    
}
