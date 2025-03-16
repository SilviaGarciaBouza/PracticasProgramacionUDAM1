/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO11;

import EJERCICIO09.Nadador;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class Delfin_v2 implements Nadador{

    @Override
    public double nadar(int metros) {
        Random rd= new Random();
        return (double)rd.nextInt(40,71);
    }
    
}
