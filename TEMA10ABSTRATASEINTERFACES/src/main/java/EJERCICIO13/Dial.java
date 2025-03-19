/*
El dial de radio va desde 88.0 a 104.0
avanzando de décima en décima, siendo el valor inicial 88.0.
 */
package EJERCICIO13;

import java.time.LocalDate;

/**
 *
 * @author silvia
 */
public class Dial implements Domotica{
    private double dialActual;//88-104 de dec en dec inicial 88
     private LocalDate fechaUltimaRevision;

    public Dial() {
        this.dialActual = 88;
    }
     
     
  
    
    @Override
    public boolean subir() {
        if(dialActual<104){
            dialActual+=0.1;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean bajar() {
        
         if(dialActual>88){
            dialActual-=0.1;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        dialActual=88;
    }

    @Override
    public String verEstado() {
        return "dial "+dialActual;
    }

    @Override
   
    public void revisar() {
        fechaUltimaRevision= LocalDate.now();
    
    }
    
    @Override
    public String toString() {
        return "Dial{" + '}';
    }
}
