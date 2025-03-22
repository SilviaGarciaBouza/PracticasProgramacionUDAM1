/*
Añadir a la función anterior un parámetro de texto que represente el típico mensaje que se le
muestra al usuario antes de introducir un valor. La función hará el System.out.print de ese parámetro
y evitamos que lo tenga que hacer el programa que utiliza la función. Ejemplo:
int edad = leerEntero (“Introduzca su edad”, 0, 120);
ya no hay que hacer antes de la llamada System.out.print (“Introduzca su edad”); 
 */
package com.tema12exceptions;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJ_07 {
    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int max, min, numero=0;
        boolean esCorrecto;
        System.out.println("Introduce un valor maximo: ");
        max=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un valor minimo: ");
        min=Integer.parseInt(scanner.nextLine());
        if(min>max){
            min=min+max;
            max=min-max;
            min=min-max;
        }
        
        
        do{
        try{
            numero= leerEntero(max, min);
            esCorrecto=true;
        }catch(RangoExcepcion ex){
            esCorrecto=false;
            System.out.println("Error: "+ex.getMessage());
        }catch(NumberFormatException ex){
             System.out.println("Error: "+ex.getMessage());
             esCorrecto=false;
        }
        }while(esCorrecto==false);
        
        System.out.println("Numero correcto: "+numero);
    }

    static public int leerEntero(int max, int min)throws NumberFormatException, RangoExcepcion{
        int numeroIntroducido;
        System.out.println("Escribe un numero entero: ");
        numeroIntroducido= Integer.parseInt(scanner.nextLine());
        if(numeroIntroducido>max ||numeroIntroducido<min){
            throw new RangoExcepcion();
        }
        return numeroIntroducido;
    }
    
   static class RangoExcepcion extends Exception{

        @Override
        public String getMessage() {
            return "Numero fuera de rango";
        }
        
    }
}
