/*
5.2. Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –
necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará
base y altura – d) Salir. Usar funciones para cada una de las 3 opciones. 
 */
package com.sgbt05funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class SGBt05e02Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     
     char numeroOpcion;
        System.out.println("¿De que quieres calcular el area?");
        do{
        System.out.println("circulo(1)-cuadrado(2)-trianguno(3)-salir(4)");
        numeroOpcion=teclado.nextLine().charAt(0);
        if(numeroOpcion!='1'&&numeroOpcion!='2'&&numeroOpcion!='3'&&numeroOpcion!='4'){
            System.out.println("Opcion ");
        }
        }while(numeroOpcion!='1'&&numeroOpcion!='2'&&numeroOpcion!='3'&&numeroOpcion!='4');
        if(numeroOpcion=='1'){
            System.out.println("Escribe el valor del radio: ");
            int radio= Integer.parseInt(teclado.nextLine());
            System.out.println(areaCirculo(radio));
            
        }else if(numeroOpcion=='2'){
            System.out.println("Escribe el valor del lado: ");
            int lado=Integer.parseInt(teclado.nextLine());
            System.out.println(areaCuadrado(lado));
            
        }
        else if(numeroOpcion=='3'){
            System.out.println("Escribe la base: ");
            int base= Integer.parseInt(teclado.nextLine());
            System.out.println("Escribe la altura: ");
            int altura=Integer.parseInt(teclado.nextLine());
            System.out.println(areaTriangulo(base, altura));
            
        }else if(numeroOpcion=='4'){
            System.out.println("Fin del programa");
        }
    }

    static double areaCirculo(int radio) {
        return (3.14*Math.pow(radio,2d));
    }
   
    static double areaCuadrado(int lado){
        return lado*lado;
        
    }
    static double areaTriangulo(int base, int altura){
        return (base*altura)/2;
        
    }
    
}
