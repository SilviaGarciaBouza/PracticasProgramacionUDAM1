/*
11.4. Realiza un programa que utilizando el método lanzar() de la clase Dado anterior y la constante
PI de la clase Math, simule que lanzamos un dado y muestre el área del círculo que tuviera por radio
el valor obtenido en el dado. Ejemplo: si sale en el dado un 3, el área sería 3* 3 * PI. Se pide que no
haga falta añadir el prefijo con la clase ni al método lanzar() ni a la constante PI.
 */
package com.tema11paquetes;

import java.text.DecimalFormat;
import pClasesApoyo.Dado;

/**
 *
 * @author silvia
 */
public class EJ_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat dc= new DecimalFormat("0.00");
        Dado dado = new Dado();
        int radio;
        final double PI = Math.PI;
        double area;
        radio = dado.lanzar();

        area = PI * (double) radio * (double) radio;
        System.out.println("Area: " + dc.format(area));
    }

}
