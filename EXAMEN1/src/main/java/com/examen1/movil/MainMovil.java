/*
(0’5 puntos) Haz un programa que:

Cree una instancia del MovilPrepago con el constructor programado en este ejercicio.

Haga dos llamadas, una de 2 minutos, otra de 5 minutos.

Navegue 500 MB

Muestre la autonomía que le queda y el saldo.
 */
package com.examen1.movil;

/**
 *
 * @author silvia
 */
public class MainMovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    long numeroMovil, float costeEstablecLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo, float autonomia) {

       MovilPrepago movil1= new MovilPrepago(666666668, 0.2f, 0.1f, 0.3f, 500f, 500f);
       movil1.efectuarLlamada(120);
       movil1.efectuarLlamada(300);
       movil1.navegar(500);
        System.out.println("autonomia: "+movil1.getAutonomia());
        System.out.println("saldo: "+movil1.getSaldo());
    }
    
}
