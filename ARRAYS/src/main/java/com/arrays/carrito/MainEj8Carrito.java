/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.arrays.carrito;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainEj8Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej08ARRAYCarritoCompra miCarrito= new Ej08ARRAYCarritoCompra();
        Scanner teclado= new Scanner(System.in);
        int eleccion;
        do{
        System.out.println("Que quieres hacer?");
        System.out.println("1-Ver carrito, 2-Añadir producto, Otro numero-Salir");
        eleccion= Integer.parseInt(teclado.nextLine());
        switch(eleccion){
            case 1 ->{
                System.out.println(miCarrito.toString());
            }
            case 2 ->{
                //String codigo, double precio, int cantidadUnidadesCompradas
                System.out.println("Escribe el codigo del producto: ");
                String codigo= teclado.nextLine();
                System.out.println("Escribe el precio: ");
                double precio= Double.parseDouble(teclado.nextLine());
                System.out.println("Indica la cantidad comprada: ");
                int cantidad= Integer.parseInt(teclado.nextLine());
                Producto producto= new Producto(codigo, precio, cantidad);
                miCarrito.añadirProducto(producto);
            }
            default ->{}
        }
        }while(eleccion==1||eleccion==2);
        System.out.println("Has salido del programa!");
    }
    
}
