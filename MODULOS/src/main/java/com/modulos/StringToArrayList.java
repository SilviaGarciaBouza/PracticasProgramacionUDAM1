/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.modulos;

import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class StringToArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String miString= "1234";
        ArrayList<Integer> miarrayList= new ArrayList<>();
        for (int i = 0; i < miString.length(); i++) {
                miarrayList.add(Integer.parseInt(Character.toString(miString.charAt(i))));
            }
    }
    
}
