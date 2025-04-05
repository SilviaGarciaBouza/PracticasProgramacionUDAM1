/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author silvia
 */
public class Yogur extends ProductoLacteo{
    private String sabor;

    public Yogur(String nombre,String sabor, double litrosUsados, double precioVenta) {
        super(nombre,"Yogur", litrosUsados, precioVenta);
        this.sabor = sabor;
    }
    
    
     @Override
    public String mostrarInfo() {
        return "Nombre"+super.getNombre()+"Tipo: "+super.getTipo()+", maduracion: "+this.sabor+", litros usados: "+super.getLitrosUsados()+", precio venta: "+super.getPrecioVenta();
    }
}

