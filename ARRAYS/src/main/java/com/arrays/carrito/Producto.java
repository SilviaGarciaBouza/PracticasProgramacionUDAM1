/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrays.carrito;

/**
 *
 * @author silvia
 */
public class Producto {
    //código del producto, la descripción, el precio unitario y la cantidad de unidades compradas y el precio total de ese producto
private String codigo;
private double precio;
private int cantidadUnidadesCompradas;
private double precioTotal;

    public Producto(String codigo, double precio, int cantidadUnidadesCompradas) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadUnidadesCompradas = cantidadUnidadesCompradas;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadUnidadesCompradas() {
        return cantidadUnidadesCompradas;
    }

    public double getPrecioTotal() {
        this.precioTotal= this.precio*this.getCantidadUnidadesCompradas();
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Producto: " + "codigo=" + codigo + ", precio=" + precio + ", cantidadUnidadesCompradas=" + cantidadUnidadesCompradas + ", precioTotal=" + precioTotal + "\n";
    }
    

}
