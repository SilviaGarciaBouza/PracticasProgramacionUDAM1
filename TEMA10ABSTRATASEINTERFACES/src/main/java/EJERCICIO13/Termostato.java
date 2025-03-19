/*
Se desea desarrollar un programa gestione los dispositivos domóticos de un edificio. Para
ello tendremos un ArrayList que contenga en principio 3 elementos, uno para el termostato de la
calefacción, otro para el ascensor y otro para el dial de la radio del hilo musical, pero en el futuro
podríamos tener más elementos.
El termostato tiene una fecha de última revisión, un valor entero en grados centígrados: mínimo 15,
máximo 80 y la temperatura inicial es 20. El ascensor tiene una planta en la que se encuentra,
pudiendo ser desde 0 a 8. La planta inicial es la cero. El dial de radio va desde 88.0 a 104.0
avanzando de décima en décima, siendo el valor inicial 88.0.



Una vez definido el sistema, crea un programa que inicie un ArrayList con una instancia de cada
uno de los 3 dispositivos y luego mediante un menú nos permita hacer operaciones, primero qué
operación queremos realizar (0:Salir, 1:subir un dispositivo, 2:bajar un dispositivo, 3: resetear un
dispositivo, 4:revisar termostato) y luego seleccionar sobre que elemento queremos trabajar
(verificando que sea un valor entre 0 y el tamaño del ArrayList -1)
• El menú, además de las opciones nos mostrará siempre el estado de todos los dispositivos. 
 */
package EJERCICIO13;

import java.time.LocalDate;

/**
 *
 * @author silvia
 */
public class Termostato implements Domotica{
    private LocalDate fechaUltimaRevision;
    private int gradosCentigrados;//min 15, max 80 inicial 20

    public Termostato() {
        this.gradosCentigrados = 20;
    }
    
    @Override
    public boolean subir() {
        if(gradosCentigrados<80){
            gradosCentigrados+=1;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean bajar() {
        
         if(gradosCentigrados>15){
            gradosCentigrados-=1;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        gradosCentigrados=20;
    }

    @Override
    public String verEstado() {
        return "termostato "+gradosCentigrados;
    }

    @Override
   
    public void revisar() {
        fechaUltimaRevision= LocalDate.now();
    
    }

    @Override
    public String toString() {
        return "Termostato{" + '}';
    }
    
    
    
    
}
