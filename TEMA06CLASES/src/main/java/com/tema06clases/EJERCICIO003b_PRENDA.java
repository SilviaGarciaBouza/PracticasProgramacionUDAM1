/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tema06clases;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class EJERCICIO003b_PRENDA {

    private String talla; //(XS, S, M, L, XL, 32, 34, 38,...)
    private char sexo; // 'H', 'M'
     private double precioSinIva;
    private double iva;
    //crea un atributo string llamado tipo  que se actualice a null si el 
    //introducido en el construnctor no coincide con: "falda", "pantalon" o "jersey"
    String tipo;
    //Crea un nuevo atributo stockPrenda que se actualice cada vez que se instancie la prenda:
    private int stockPrenda = 0;
    //Crea un atributo referencia que se establece automaticamente al crear una nueva instancia
    //generando un numero aleatorio de 5 cifras
    Random random = new Random();
    private int referencia;
    //crea atributo double precioConIva
    private double precioConIva;
    //modifica setPrecioConIva que solo se pueda accerder desde el constructor
    static public double setPrecioConIva(double precioSinIva, double iva) {
         double precioConIva= precioSinIva+iva;
         return precioConIva;
        
        
    }
    
    //Creacion del constructor segun lo establecido en los enunciador:
    public EJERCICIO003b_PRENDA(String tipo) {
        if (tipo.equals("jersey") || tipo.equals("falda") || tipo.equals("pantalon")) {
            this.tipo = tipo;
        } else {
            tipo = null;
        }
        this.stockPrenda++;
        this.referencia= random.nextInt(0, 100000);
        
    }
    //Constructor con atributos: y que inicialice todos los atributos incluidos precio con iva que no se le pasa

    public EJERCICIO003b_PRENDA(String talla, char sexo, double precioSinIva, double iva, String tipo) {
        this.talla = talla;
        this.sexo = sexo;
        this.precioSinIva = precioSinIva;
        this.iva = iva;
        
        this.precioConIva= setPrecioConIva(precioSinIva, iva);
        
        
         if (tipo.equals("jersey") || tipo.equals("falda") || tipo.equals("pantalon")) {
            this.tipo = tipo;
        } else {
            tipo = null;
        }
        this.stockPrenda++;
        this.referencia= random.nextInt(0, 100000);
    }
    
    //Otro constructor:

    public EJERCICIO003b_PRENDA(double precioSinIva, String tipo) {
        this.precioSinIva = precioSinIva;
         this.talla ="42";
        this.sexo = 'H';
        this.iva=21.0;
            if (tipo.equals("jersey") || tipo.equals("falda") || tipo.equals("pantalon")) {
            this.tipo = tipo;
        } else {
            tipo = null;
        }
        this.stockPrenda++;
        this.referencia= random.nextInt(0, 100000);
        
         this.precioConIva= setPrecioConIva(precioSinIva, iva);
        
        
    }
    
    
    //Crea toString con todos los atributos:

    @Override
    public String toString() {
        return "EJERCICIO003b_PRENDA{" + "talla=" + talla + ", sexo=" + sexo + ", precioSinIva=" + precioSinIva + ", iva=" + iva + ", tipo=" + tipo + ", stockPrenda=" + stockPrenda +  ", referencia=" + referencia + ", precioConIva=" + precioConIva + '}';
    }
    
    
    

    public String getTalla() {
        return talla;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public double getIva() {
        return iva;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

}
