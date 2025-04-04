/*
Defina una interfaz llamada Conectable que declare un método conectar(String puerto) y un método desconectar(String puerto).
Cree una clase abstracta llamada Dispositivo que implemente la interfaz Conectable. Esta clase debe tener un atributo nombre (String) 
y un método abstracto mostrarInformacion() que imprima el nombre del dispositivo. Implemente los métodos conectar y desconectar 
para que impriman un mensaje indicando la acción y el puerto.
Cree dos clases concretas que hereden de Dispositivo: Impresora y Smartphone.
Impresora debe tener un atributo tipoImpresion (String) y una implementación específica para mostrarInformacion().
Smartphone debe tener un atributo sistemaOperativo (String) y una implementación específica para mostrarInformacion().
Implemente la interfaz java.io.Serializable en todas las clases anteriores.
Escriba un programa que cree un ArrayList de Dispositivo conteniendo instancias de Impresora y Smartphone. Luego, serialice este ArrayList a un archivo llamado "dispositivos.ser". Finalmente, deserialice el archivo y muestre la información de cada dispositivo recuperado.
 */

package com.terceraevaluacion;

/**
 *
 * @author silvia
 */
public abstract class Dispositivo implements Conectable{
    private String nombre;
    
    public abstract void mostrarInformacion();

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void conectar(String puerto) {
        System.out.println("El puerto "+puerto+"se ha conectado");
    }

    @Override
    public void desconectar(String puerto) {
        System.out.println("El puerto "+puerto+"se ha desconectado");
    }
    
    
    
    
}
