/*
Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la
información del parking correspondiente a los métodos creados (los métodos no deben escribir nada
por consola, eso lo hace el programa que usa la clase)
Además del array, la clase Parking necesita una variable adicional, que le indique la posición en la que
aparcará el siguiente coche. Inicialmente vale cero, al aparcar un coche se incrementa y al desaparcar
se decrementa. Si vale 20 no cabrán más coches.
Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven esto de forma
más sencilla, se verá en el tercer trimestre. 
 */
package com.arrays.parking;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainEj06Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej06ARRAYParking parking1 = new Ej06ARRAYParking();
        String mimatricula;
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        do{
        System.out.println("Que quieres hacer?");
        System.out.println("1-Aparcar, 2-Desaparcar, 3-Mostrar plazas y matriculas ocupadas, 4-Plazas libres, otro numero-Salir");
        eleccion = Integer.parseInt(teclado.nextLine());
        switch (eleccion) {
            case 1 -> {
                if(parking1.plazasLibres()==0){
                    System.out.println("El parking esta lleno");
                }else{
                System.out.println("Escribe el numero de matricula: ");
                mimatricula = teclado.nextLine();

                System.out.println("Aparca en la plaza " + parking1.aparcar(mimatricula));
                }
                System.out.println(Arrays.toString(parking1.getMatriculas()));
            }
            case 2 -> {
                if(parking1.plazasLibres()==20){
                    System.out.println("No hay coches aparcados");
                }
                else{
                System.out.println("Desaparcado el coche con matricula "+parking1.desaparcar());
                
                System.out.println(Arrays.toString(parking1.getMatriculas()));
                }

            }
            case 3 -> {
                System.out.println("Las plazas ocupadas, con sus respectivos coches son: ");
                for(int i=0; i<parking1.muestraMatriculas().length;i++){
                    if(parking1.muestraMatriculas()[i]!=null){
                        System.out.println("Plaza "+(i+1)+": "+parking1.muestraMatriculas()[i]);
                    }
                }
            }
            case 4 -> {
                System.out.println("Las plazas libres son: "+ parking1.plazasLibres());
            }
            default -> {
            }

        }
        }while(eleccion==1||eleccion==2||eleccion==3||eleccion==4);
        System.out.println("Has salido del programa");
    }

}
