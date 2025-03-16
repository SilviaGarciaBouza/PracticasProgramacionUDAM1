/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO09;

/**
 *
 * @author silvia
 */
public class BallenaAzul implements Nadador{
    private int edad;

    public BallenaAzul(int edad) {
        this.edad = edad;
    }

    @Override
    public double nadar(int metros) {
        if(edad>5){
           return ((double)metros/10)*3600d/1000d;
        }else{
          return ((double)metros/13)*3600d/1000d;  
        }
    }
    
    
}