/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terceraevaluacion;

/**
 *
 * @author silvia
 */
public class Smarphone extends Dispositivo{
  
    private String sistemaOperativo;

    public Smarphone(String sistemaOperativo) {
        super("Smarphone");
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(super.getNombre());
    }
    
}