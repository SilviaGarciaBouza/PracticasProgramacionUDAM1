/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author silvia
 */
public class ProductoLacteo {
    //atributos
    private String tipo;
    private double litrosUsados;
    private double precioVenta;
   private String nombre;
    
    
    //constructor

    public ProductoLacteo(String nombre, String tipo, double litrosUsados, double precioVenta) {
        this.nombre=nombre;
        this.tipo = tipo;
        this.litrosUsados = litrosUsados;
        this.precioVenta = precioVenta;
    }

    
    
    //metodos
    public String mostrarInfo(){
        return "Nombre: "+this.tipo+", litros usados: "+this.litrosUsados+", precio venta: "+this.precioVenta;
    }
    
    public double calcularPrecioVenta(){
        return this.precioVenta;
    }
    
    //get set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLitrosUsados() {
        return litrosUsados;
    }

    public void setLitrosUsados(double litrosUsados) {
        this.litrosUsados = litrosUsados;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
