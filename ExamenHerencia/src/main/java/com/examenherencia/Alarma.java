/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.examenherencia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author silvia.garciabouza
 */
public class Alarma {
//aTRIBUTOS

    private Sensor sensor= new Sensor();
    private Timbre timbre= new Timbre();
    private ArrayList<LocalDateTime> listaFechasHoras = new ArrayList<>();
    private double umbral;
    //constructor

    public Alarma(double umbral) {
        this.sensor.setValorActual(0);
        this.timbre.setActivar(false);
        this.umbral = umbral;
    }

    //Metodos
    public void activarDesactivarTimbre() {
        sensor.medir();
        System.out.println("Valor medido: " + this.sensor.getValorActual());
        if ((double)sensor.getValorActual() >= this.umbral) {
            this.timbre.setActivar(true);
            listaFechasHoras.add(LocalDateTime.now());
            
        }else{
            this.timbre.setActivar(false);
        }
    }

    public LocalDateTime ObtenerUltimaFechaHora() {
        return listaFechasHoras.get(listaFechasHoras.size() - 1);
    }

    public void ReiniciarAlarma() {
        System.out.println("Timbre desactivado");
        System.out.println("Alarma reestablecida");
        this.timbre.setActivar(false);
        listaFechasHoras.removeAll(listaFechasHoras);
         
    }

    public void multiplesMediciones(int numeroMediciones,int segundos) {
       for(int i=0; i<numeroMediciones;i++){
           System.out.println("Simunacion numero: "+(i+1));
           activarDesactivarTimbre();
           try{
               Thread.sleep(segundos*1000);
           }catch(InterruptedException ex){}
           }
       }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            //Logger.getLogger(Examen01.class.getName()).log(Level.SEVERE, null, ex);
//        }

    @Override
    public String toString() {
        return "Alarma{" + "sensor=" + sensor + ", timbre=" + timbre + ", listaFechasHoras=" + listaFechasHoras + ", umbral=" + umbral + '}';
    }
      
    
    //public 
    public void añadirHora(LocalDateTime a){
        this.listaFechasHoras.add(a);
    }
    
    
    //get set

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }

//    public ArrayList<LocalDateTime> getListaFechasHoras() {
//        if(this.listaFechasHoras.size()>0){
//        return listaFechasHoras;}
//        else
//    }

    public ArrayList<LocalDateTime> getListaFechasHoras() {
        return listaFechasHoras;
    }
    
     

    
    
    

    public void setListaFechasHoras(ArrayList<LocalDateTime> listaFechasHoras) {
        this.listaFechasHoras = listaFechasHoras;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }
    
}


