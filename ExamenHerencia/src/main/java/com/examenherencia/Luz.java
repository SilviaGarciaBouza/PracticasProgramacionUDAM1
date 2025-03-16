/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenherencia;

/**
 *
 * @author silvia.garciabouza
 */
public class Luz {
    //atributos
    private boolean encender;
    //get set
    public boolean isEncender() {
        return encender;
    }
    public void setEncender(boolean encender) {
        this.encender = encender;
    }
    //toString
    @Override
    public String toString() {
        return "Luz{" + "encender=" + encender + '}';
    }
}
