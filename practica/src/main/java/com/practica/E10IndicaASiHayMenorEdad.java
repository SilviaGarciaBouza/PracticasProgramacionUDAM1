/*
Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe
si hay alguno menor de edad.
 */
package com.practica;

import java.util.Scanner;


public class E10IndicaASiHayMenorEdad {

   
    public static void main(String[] args) {

        int edadAlumno;
        boolean menorEdad=false;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Introduce la edad: ");
            edadAlumno = Integer.parseInt(teclado.nextLine());
            if(edadAlumno!=-1&&edadAlumno<18){
                menorEdad=true;
                //break;
            }
        }while (edadAlumno !=-1);
        System.out.println(menorEdad);

    }
    
}
