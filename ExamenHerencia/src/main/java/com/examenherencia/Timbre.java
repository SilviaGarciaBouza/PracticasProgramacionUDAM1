/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenherencia;

/**
 *
 * @author silvia.garciabouza
 */
public class Timbre {
    //atributos
    private boolean Activar;
    //get set
    public boolean isActivar() {
        return Activar;
    }
    public void setActivar(boolean Activar) {
        this.Activar = Activar;
    }
    @Override
    public String toString() {
        return "Timbre{" + "Activar=" + Activar + '}';
    }
    
    
}
