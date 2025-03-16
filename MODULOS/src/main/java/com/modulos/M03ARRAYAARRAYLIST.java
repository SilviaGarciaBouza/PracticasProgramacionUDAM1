/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.modulos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author silvia
 */
public class M03ARRAYAARRAYLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] miArray = {1, 2, 3, 5, 4};
        ArrayList<Integer> miArrayList = new ArrayList<>();
        miArrayList.add(9);
 miArrayList.add(8);
  miArrayList.add(3);
        System.out.println(arrayToArrayLis(miArray));
        System.out.println(Arrays.toString(arrayLisToArray(miArrayList)));
    }

    //Pasar de Array a ArrayList
    static public ArrayList<Integer> arrayToArrayLis(int[] miarray) {
        ArrayList<Integer> miArrayList = new ArrayList<>();
        for (int i = 0; i < miarray.length; i++) {
            miArrayList.add(miarray[i]);
        }
        return miArrayList;
    }

    //Pasar de ArrayList a Array
    static public int[] arrayLisToArray(ArrayList<Integer> miArrayList) {
        int[] miArray = new int[miArrayList.size()];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = miArrayList.get(i);
        }
        return miArray;
    }

}
