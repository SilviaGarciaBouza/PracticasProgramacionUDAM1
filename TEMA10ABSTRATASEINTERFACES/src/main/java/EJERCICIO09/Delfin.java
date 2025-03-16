/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO09;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Delfin implements Nadador{

    @Override
    public double nadar(int metros) {
        Random rd= new Random();
        return (double)rd.nextInt(40,71);
    }
    
}
