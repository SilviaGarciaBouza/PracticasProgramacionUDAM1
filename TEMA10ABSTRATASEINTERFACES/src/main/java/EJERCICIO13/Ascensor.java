/*
El ascensor tiene una planta en la que se encuentra,
pudiendo ser desde 0 a 8. La planta inicial es la cero. 
• subir(), incrementa una unidad el elemento domótico. Devuelve true si la operación se realiza
correctamente o false si no se puede hacer por estar al máximo.
• bajar(): decrementa una unidad el elemento domótico. Devuelve true si la operación se realiza
correctamente o false si no se puede hacer por estar al mínimo.
• reset(): pone en la situación inicial el elemento domótico. No devuelve nada.
• verEstado(): Devuelve un String con el tipo de dispositivo y su estado actual.
Además, el termostato debe incluir un nuevo método:
• revisar(). Fija a la fecha de revisión a la fecha actual. No devuelve nada.
 */
package EJERCICIO13;

import java.time.LocalDate;

/**
 *
 * @author silvia
 */
public class Ascensor implements Domotica{
    private int plantaActual;//0-8, inicial 0
 private LocalDate fechaUltimaRevision;
    public Ascensor() {
        this.plantaActual = 0;
    }
    

    @Override
    public boolean subir() {
        if(plantaActual<8){
            plantaActual+=1;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean bajar() {
        
         if(plantaActual>0){
            plantaActual-=1;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        plantaActual=0;
    }

    @Override
    public String verEstado() {
        return "Ascensor "+plantaActual;
    }

    @Override
    public void revisar() {
        fechaUltimaRevision= LocalDate.now();
    }
    
    @Override
    public String toString() {
        return "Ascensor{" + '}';
    }
    
}
