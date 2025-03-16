/*
Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos
de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario
siempre las notas de los nueve módulos?
 */
package com.practica;

import java.util.Scanner;


public class E17IntroducirMOduloSaberSiPuuedenELTFG {

   
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        boolean hacerFCT= true;
       
         for(int i= 1; i<=9; i++){
             System.out.printf("Escribe la nota del modulo %d: ", i);
             nota = Integer.parseInt(teclado.nextLine());
             if(nota<5){
                 hacerFCT =false;   
                 break;
             }
         }
        System.out.printf("Puede hacer el tCf: %b", hacerFCT);
    }
    
}
