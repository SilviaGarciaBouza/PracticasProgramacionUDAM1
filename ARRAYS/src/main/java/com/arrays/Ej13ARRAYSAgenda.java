/*
Realizar un programa que tenga un Array con una agenda de teléfonos simple con unos
valores cualquiera. Por ejemplo: 
Al programa se le pasará como parámetro un nombre. Si el nombre está en la agenda, mostrará su
teléfono, y en caso contrario informará que no existe dicha persona. java prog Ana.
En el tercer trimestre veremos que este tipo de estructuras, como la agenda, que no
van orientadas a una numeración específica, se almacenan mejor en estructuras llamadas
“Map”. 
Marta 666111222
Miguel 981981981
Ana 900900900
Daniel +34881000001 
 */
package com.arrays;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class Ej13ARRAYSAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] agenda = new String[2][4];
        agenda[0][0] = "Marta";
        agenda[1][0] = "666111222";
        agenda[0][1] = "Miguel";
        agenda[1][1] = "981981981";
        agenda[0][2] = "Ana";
        agenda[1][2] = "900900900";
        agenda[0][3] = "Daniel";
        agenda[1][3] = "+34881000001";

        String nombre;
        int eleccion;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1-Consultar telefono, Otro numero-Salir");
            eleccion = Integer.parseInt(teclado.nextLine());
            if (eleccion == 1) {
                System.out.println("Escribe un nombre: ");
                nombre = teclado.nextLine();
                boolean existe=false;
                for (int i = 0; i < 4; i++) {
                    if (agenda[0][i].equals(nombre)) {
                        System.out.println(agenda[1][i]);
                        existe=true;
                    }
                }
                if(existe==false){
                    System.out.println("El contacto no existe");
                }
            }
        } while (eleccion==1);
        System.out.println("Has salido del programa");

    }

}
