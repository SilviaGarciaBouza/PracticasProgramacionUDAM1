/*
11.3. Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
métodos lanzar() de la clase Dado y DadoFalso. ¿Algún problema de acceso? Enumera distintas
formas de solucionarlo: ¿cambiando el acceso a las clases? ¿cambiando de paquete el ejercicio? 
 */
package com.tema11paquetes;

import pClasesApoyo.Dado;

/**
 *
 * @author silvia
 */
public class EJ_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dado dadoEstandar= new Dado();//se importa la clase
      //  DadoFalso dadoFalso= new DadoFalso();// no se puede pq al ser una clase default solo se ouede usar dentro de su paquete.Se podria usar en el mismo paquete o cambiando el acceso a public.
    }
    
}
