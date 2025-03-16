/*
(Opcional) Realizar una clase carritoCompra que mantenga las compras realizadas por un
cliente en un Array. Cada posición del Array contendrá el código del producto, la descripción, el
precio unitario y la cantidad de unidades compradas y el precio total de ese producto (cantidad x
precio unitario). Se permite comprar como máximo de 100 artículos diferentes. Además de la lista
de productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado.
Necesitamos los métodos:
a. Mostrar por consola el estado actual del carrito.
b. Añadir producto.
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.
Nota: Pensar en crear un método .toString() para facilitar el mostrar por pantalla cada producto comprado
 */
package com.arrays.carrito;

import java.util.Arrays;

/**
 *
 * @author silvia
 */
public class Ej08ARRAYCarritoCompra {

//código del producto, la descripción, el precio unitario y la cantidad de unidades compradas y el precio total de ese producto
    private Producto[] productos;
    int identificadorProducto=0;

    private double importeTotal = 0;

    public Ej08ARRAYCarritoCompra() {
    }

    public void añadirProducto(Producto producto) {
        productos = new Producto[100];
        productos[identificadorProducto]= producto;
        identificadorProducto++;
    }
    public Producto[] estadoCarrito(){
        return productos;
    }

    @Override
    public String toString() {
        return "Productos=" + Arrays.toString(productos) ;
    }

}






//class CarritoCompra{
//   private String[] compras;
//
//    public CarritoCompra() {
//        this.compras =new String[100];
//    }
//    
//    public String[] mostrarCarrito(){
//        return this.compras;
//    }
//    public void añadirProducto(String codigo, String descripcion, double precioUnid,int cant){
//        double precioTotal = precioUnid*(double)cant;
//        for(int i= 0;i<this.compras.length;i++){
//            if(compras[i]==null){
//                compras[i]= codigo+" "+descripcion+" "+precioUnid+" "+cant+" "+ precioTotal;
//            }
//        }
//        
//    }
//    
//    
//}