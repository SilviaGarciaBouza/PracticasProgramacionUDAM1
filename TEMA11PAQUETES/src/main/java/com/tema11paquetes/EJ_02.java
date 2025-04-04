/*
11.2. Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
métodos de CalculadoraPro (primero creando una instancia con un ArrayList con unos valores
cualquiera) y luego llamando a sus tres métodos. Comenta los problemas de acceso y sus causas.
 */
package com.tema11paquetes;

import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class EJ_02 {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(0);
        listaNumeros.add(-1);
      //   El acceso default (o acceso a nivel de paquete) significa que una clase solo es visible dentro del mismo paquete en el que está declarada
//        CalculadoraPro calculadora = new CalculadoraPro();
//        calculadora.setListaEnteros(listaNumeros);
        //System.out.println("Suma: "+calculadora.sumar()); no se puede porque es un metodo privado
        //System.out.println("Menor: "+calculadora.menor());no se puede porque es un metodo  protected
       // System.out.println("Media: " + calculadora.media());
    }
    
}
