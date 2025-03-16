/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.figuras;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class F06CuadradoVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numeroAltura;
        char charCaracter;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Escribe un numero para la altura del cuadrado: ");
        numeroAltura= Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe un caracter: ");
        charCaracter= teclado.nextLine().charAt(0);
        
        for(int i= 1; i<=numeroAltura;i++){
            System.out.println("");
            for(int j=1; j<=numeroAltura; j++){
                if(j==1){
                    System.out.print(charCaracter);     
                }else if(i==1||i==numeroAltura){
                    System.out.print(charCaracter);
                }else if(j==numeroAltura){
                    System.out.print(charCaracter);
                }else{
                    System.out.print(" ");
                }
                
            }
        }
        
    }
}