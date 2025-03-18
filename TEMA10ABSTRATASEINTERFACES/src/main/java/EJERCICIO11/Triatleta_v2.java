/*
Haz una nueva versión de TriAtleta (sufijo _v2b) que implemente saltaPertiga con este
criterio: para saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la
mitad de las veces y por debajo de 5 metros devuelve siempre true.
*/
package EJERCICIO11;

import EJERCICIO09.Nadador;
import EJERCICIO09.Saltador;
import EJERCICIO09.Ciclista;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class Triatleta_v2 implements Nadador_v2,Ciclista_v2,Saltador_v2{

    @Override
    public double nadar(int metros) {
        return (double)metros/11000d*3600d;
    }

    @Override
    public int recorrer(int numeroKm, String tipoTerreno) {
        if(tipoTerreno.equals("facil")){
            return (numeroKm/12)*3600;
        }else{
            return (numeroKm/9)*3600;
        }
    }

    @Override
    public int saltarAltura() {
         Random rd= new Random();
        return rd.nextInt(1,5);
    }

    @Override
    public boolean saltaPertiga(int alturaCM) {
        if(alturaCM<500){
        return true;
        }else if(alturaCM==500||alturaCM==600){
            Random rd = new Random();
              return rd.nextBoolean(); // 50% de probabilidad de true
        }
        
        else{
            return false;
        }
    }
   
    
}
