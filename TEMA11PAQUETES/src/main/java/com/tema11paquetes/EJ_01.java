/*
Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
métodos de Calculadora (primero creando una instancia con un ArrayList con unos valores
cualquiera) y luego intentando llamar a sus tres métodos: sumar(), menor(),media().
Comenta los problemas de acceso que te encuentres y sus causas.  */
package com.tema11paquetes;

import java.util.ArrayList;
import pClasesApoyo.pMates.Calculadora;

/**
 *
 * @author silvia
 */
public class EJ_01 {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(0);
        listaNumeros.add(-1);
        Calculadora calculadora = new Calculadora();
        calculadora.setListaEnteros(listaNumeros);
        //System.out.println("Suma: "+calculadora.sumar()); no se puede porque es un metodo privado
        //System.out.println("Menor: "+calculadora.menor());no se puede porque es un metodo  protected
        System.out.println("Media: " + calculadora.media());
    }
}
