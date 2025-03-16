/*

 */
package com.arrays.parking2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainEj07Parking2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        Ej07ARRAYParking2 parking2 = new Ej07ARRAYParking2();
        String matricula;
        do {
            System.out.println("Que quieres hacer? ");
            System.out.println("1-Aparcar, 2-Desaparcar; 3-Ver dinero recaudado, 4-Estado del parqking, Otro numero-Salir");
            eleccion = Integer.parseInt(teclado.nextLine());
            switch (eleccion) {
                case 1 -> {
                    if(parking2.contadorPlazasOcupadas()<20){
                    System.out.println("Escribe el numero de la matricula: ");
                    matricula = teclado.nextLine();
                    parking2.aparcar(matricula);
                    System.out.println(Arrays.toString(parking2.estadoParking()));
                    }else{
                        System.out.println("El parking esta lleno");
                    }
                }
                case 2 -> {
                    if(parking2.contadorPlazasOcupadas()!=0){
                   
                    System.out.println(parking2.desaparcar());
                    }else{
                        System.out.println("El parking esta vacio");
                    }
                }
                case 3 -> {
                    System.out.println(parking2.getRecaudado());
                }
                case 4 -> {
                    System.out.println(Arrays.toString(parking2.estadoParking()));

                }
            
            default -> {
                }
            }
        } while (eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4);
            System.out.println("Has salido del programa");
        }

    }
