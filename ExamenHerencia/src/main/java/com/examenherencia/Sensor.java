/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenherencia;

import java.util.Random;

/**
 *
 * @author silvia.garciabouza
 */
public class Sensor {
    //atributos
    private int valorActual =0;
    
    //metodos
    public void medir(){
       Random random= new Random();
        this.valorActual= random.nextInt(0,101);
    }
//get set
    public int getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }
    
}
