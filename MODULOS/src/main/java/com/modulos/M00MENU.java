/*
MENU
 */

package com.modulos;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class M00MENU {

é
        menu();
    }
    
    
    
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        do {
            do {
                System.out.println("Que quieres hacer?");
                System.out.println("1-Opcion1, 2-Opcion2, 3-Opcion3, 4-Salir");
                eleccion = Integer.parseInt(teclado.nextLine());
                if(eleccion!=1 &&eleccion!=2 &&eleccion!=3 &&eleccion!=4 ){
                    System.out.println("Opcion incorrecta!");
                }
            } while(eleccion!=1 &&eleccion!=2 &&eleccion!=3 &&eleccion!=4 );
            switch (eleccion) {
                case 1 -> {
                    //Accion 1    ;
                }
                case 2 -> {
                    //Accion 2    ;
                }
                case 3 -> {
                    //Accion 3    ;
                }
                case 4 -> {
                    //Accion 4    ;
                }
                default -> {
                }
            }
        } while (eleccion == 1 || eleccion == 2 || eleccion == 3);
        System.out.println("Has salido del programa!");
    } 
    
    
   
    
}
