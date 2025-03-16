/*
• Desarrolla una clase TriAtleta que implemente las tres interfaces, con los criterios que tu
consideres (pueden devolver valores aleatorios entre unos mínimos y máximos que tú
decidas o tener en cuenta otros parámetros como edad, sexo, etc.).
• Realiza un programa sencillo que cree instancias de delfines, ballenas azules y triatletas y
use los métodos desarrollados.*/
package EJERCICIO09;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Triatleta implements Nadador,Ciclista,Saltador{

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
    
}
