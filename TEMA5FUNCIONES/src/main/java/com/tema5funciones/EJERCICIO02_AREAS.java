/*
Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –
necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará
base y altura – d) Salir. Usar funciones para cada una de las 3 opciones. 
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO02_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccion;
        double radio;
        double lado;
        double base;
        double altura;
        
        
        do{
        System.out.println("De que quieres calcular el area?");
        System.out.println("1-circulo, 2-cuadrado, 3-triangulo, 4-salir");
        seleccion= Integer.parseInt(teclado.nextLine());
        switch (seleccion) {
            case 1 -> {
                System.out.println("Area del circulo");
                System.out.println("Escribe el tamalo del radio");
                radio=Double.parseDouble(teclado.nextLine());
                System.out.println(areaCirculo(radio));
            }
            case 2 -> {
            System.out.println("Area del cuadrado");
                System.out.println("Escribe el tamalo del lado");
                lado=Double.parseDouble(teclado.nextLine());
                System.out.println(areaCuadrado(lado));
            }
            case 3 -> {
            System.out.println("Area del triangulo");
                System.out.println("Escribe el tamalo de la base");
                base=Double.parseDouble(teclado.nextLine());
                System.out.println("Escribe el tamalo de la altura");
                altura=Double.parseDouble(teclado.nextLine());
                System.out.println(areaTriangulo(base, altura));
            }
            case 4 -> {
                System.out.println("Has salido del programa");}
        }
        
        }while(seleccion!=4);
        
        
        
        
    }
    
    
    static double areaCirculo(double radio){
        return Math.PI+Math.pow(radio, 2);
    }
    
    static double areaCuadrado(double lado){
        return Math.pow(lado, 2);
    }
    
    static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    
}
