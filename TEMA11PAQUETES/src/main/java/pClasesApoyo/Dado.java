/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pClasesApoyo;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Dado {

    static public int lanzar(){
        Random random = new Random();
        return random.nextInt(1, 7);
    }
}
