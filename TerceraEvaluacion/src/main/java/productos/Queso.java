/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author silvia
 */
public class Queso extends ProductoLacteo{
    private int maduarcion;//en dias

    public Queso(String nombre,int maduarcion ,double litrosUsados, double precioVenta) {
        super(nombre,"Queso", litrosUsados, precioVenta);
        this.maduarcion = maduarcion;
    }
    @Override
    public String mostrarInfo() {
        return "Nombre"+super.getNombre()+"Tipo: "+super.getTipo()+", maduracion: "+this.maduarcion+", litros usados: "+super.getLitrosUsados()+", precio venta: "+super.getPrecioVenta();
    }
}
