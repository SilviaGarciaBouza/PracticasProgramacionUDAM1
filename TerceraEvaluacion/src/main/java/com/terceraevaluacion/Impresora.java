/*
Defina una interfaz llamada Conectable que declare un método conectar(String puerto) y un método desconectar(String puerto).
Cree una clase abstracta llamada Dispositivo que implemente la interfaz Conectable. Esta clase debe tener un atributo nombre (String) 
y un método abstracto mostrarInformacion() que imprima el nombre del dispositivo. Implemente los métodos conectar y desconectar 
para que impriman un mensaje indicando la acción y el puerto.
Cree dos clases concretas que hereden de Dispositivo: Impresora y Smartphone.
Impresora debe tener un atributo tipoImpresion (String) y una implementación específica para mostrarInformacion().
Smartphone debe tener un atributo sistemaOperativo (String) y una implementación específica para mostrarInformacion().
Implemente la interfaz java.io.Serializable en todas las clases anteriores.
Esc
 */
package com.terceraevaluacion;

/**
 *
 * @author silvia
 */
public class Impresora extends Dispositivo{
    private String sistemaOperativo;

    public Impresora(String sistemaOperativo) {
        super("Impresora");
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(super.getNombre());
    }
    
}
