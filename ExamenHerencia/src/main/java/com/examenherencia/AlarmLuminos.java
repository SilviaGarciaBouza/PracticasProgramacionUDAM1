/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenherencia;

import java.time.LocalDateTime;

/**
 *
 * @author silvia.garciabouza
 */
public class AlarmLuminos extends Alarma{
    private Luz luz= new Luz();

    public AlarmLuminos( double umbral) {
        super(umbral);
        this.luz.setEncender(false);
    }

    @Override
    public void activarDesactivarTimbre() {
        super.getSensor().medir();
        System.out.println("Valor medido: " + super.getSensor().getValorActual());
        if((double)getSensor().getValorActual()>=super.getUmbral()){
            super.getTimbre().setActivar(true);
            this.luz.setEncender(true);
            super.añadirHora(LocalDateTime.now());
        }
    }

    @Override
    public String toString() {
        return "AlarmLuminos{" + "luz=" + luz + '}';
    }

    @Override
    public void ReiniciarAlarma() {
     
        super.getTimbre().setActivar(false);
        this.luz.setEncender(false);
        super.getListaFechasHoras().removeAll(super.getListaFechasHoras());
            System.out.println("Timbre desactivado");
         System.out.println("Luz apagada");
        System.out.println("Alarma reestablecida");
    }
    
    
    
    
    
}

