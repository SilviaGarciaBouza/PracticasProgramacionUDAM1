/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class DomoticaMain {

    public static void main(String[] args) {
        ArrayList<Domotica> listaDomotica = new ArrayList<>();
        listaDomotica.add(new Dial());
        listaDomotica.add(new Ascensor());
        listaDomotica.add(new Termostato());

        Scanner teclado = new Scanner(System.in);
        int eleccion;
        int eleccionDomotica;
        do {
            do {
                System.out.println("Que quieres hacer?");
                System.out.println("1-subir, 2-bajar, 3-reset, 4-verEstado,5-revisar,6-salir");
                eleccion = Integer.parseInt(teclado.nextLine());
                if (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 && eleccion != 5 && eleccion != 6) {
                    System.out.println("Opcion incorrecta!");
                }
            } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 && eleccion != 5 && eleccion != 6);
            switch (eleccion) {
                case 1 -> {
                    System.out.println("A que le quieres subir?");
                    int count = 0;
                    do {
                        for (Domotica elemento : listaDomotica) {
                            System.out.println(count + "-" + elemento.toString());
                            count++;
                        }
                        eleccionDomotica = Integer.parseInt(teclado.nextLine());
                    } while (eleccionDomotica < 0 || eleccionDomotica >= listaDomotica.size());
                    listaDomotica.get(eleccionDomotica).subir();
                    System.out.println(listaDomotica.get(eleccionDomotica).verEstado());
                }
                case 2 -> {
                    System.out.println("A que le quieres bajar?");
                    int count = 0;
                    do {
                        for (Domotica elemento : listaDomotica) {
                            System.out.println(count + "-" + elemento.toString());
                            count++;
                        }
                        eleccionDomotica = Integer.parseInt(teclado.nextLine());
                    } while (eleccionDomotica < 0 || eleccionDomotica >= listaDomotica.size());

                    listaDomotica.get(eleccionDomotica).bajar();
                    System.out.println(listaDomotica.get(eleccionDomotica).verEstado());
                }
                case 3 -> {
                    System.out.println("A que le quieres resetear?");
                    int count = 0;
                    do {
                        for (Domotica elemento : listaDomotica) {
                            System.out.println(count + "-" + elemento.toString());
                            count++;
                        }
                        eleccionDomotica = Integer.parseInt(teclado.nextLine());
                    } while (eleccionDomotica < 0 || eleccionDomotica >= listaDomotica.size());

                    listaDomotica.get(eleccionDomotica).reset();
                    System.out.println(listaDomotica.get(eleccionDomotica).verEstado());
                }
                case 4 -> {
                    System.out.println("A que le quieres ver el estado?");
                    int count = 0;
                    do {
                        for (Domotica elemento : listaDomotica) {
                            System.out.println(count + "-" + elemento.toString());
                            count++;
                        }
                        eleccionDomotica = Integer.parseInt(teclado.nextLine());
                    } while (eleccionDomotica < 0 || eleccionDomotica >= listaDomotica.size());

                    System.out.println(listaDomotica.get(eleccionDomotica).verEstado());
                }
                case 5 -> {
                    System.out.println("A que le quieres revisar?");
                    int count = 0;
                    do {
                        for (Domotica elemento : listaDomotica) {
                            System.out.println(count + "-" + elemento.toString());
                            count++;
                        }
                        eleccionDomotica = Integer.parseInt(teclado.nextLine());
                    } while (eleccionDomotica < 0 || eleccionDomotica >= listaDomotica.size());

                    listaDomotica.get(eleccionDomotica).revisar();
                    System.out.println(listaDomotica.get(eleccionDomotica).verEstado());
                }
                case 6 -> {
                    //salir   ;
                }
                default -> {
                }
            }
        } while (eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4 || eleccion == 5);
        System.out.println("Has salido del programa!");
    }
}
