/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pClasesApoyo.pMates;

import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class Calculadora {
    public ArrayList<Integer> listaEnteros= new ArrayList<>();
    private int sumar(){
        int suma=0;
        for(int i=0; i<listaEnteros.size();i++){
            suma+=listaEnteros.get(i);
        }
        return suma;
    }
    protected int menor(){
        int min= listaEnteros.get(0);
        for(int i=0; i<listaEnteros.size();i++){
            if(listaEnteros.get(i)<min){
                min= listaEnteros.get(i);
            }
        }
        return min;
    }
    public int media(){
        return sumar()/listaEnteros.size();
    }

    public ArrayList<Integer> getListaEnteros() {
        return listaEnteros;
    }

    public void setListaEnteros(ArrayList<Integer> listaEnteros) {
        this.listaEnteros = listaEnteros;
    }
    
            
}
