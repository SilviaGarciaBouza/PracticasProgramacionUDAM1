/*
• Realiza un programa sencillo que cree instancias de delfines, ballenas azules y triatletas y
use los métodos desarrollados.

Empleando las tres clases definidas en el ejercicio anterior (Delfín, BallenaAzul y TriAtleta) y la
interfaz Nadador, realiza un programa que contenga un ArrayList de nadadores (polimorfismo de
interfaces) con tres elementos, uno de cada tipo, esto es un Delfín, una BallenaAzul y un TriAtleta.
A continuación, recorre el ArrayList con un bucle for…each, mostrando cuánto tarda cada uno de
ellos en recorrer un kilómetro. 
*/
package EJERCICIO11;

import EJERCICIO09.Nadador;
import EJERCICIO09.Delfin;
import EJERCICIO09.BallenaAzul;
import EJERCICIO09.Triatleta;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class DeporteMain_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Delfin delfin1= new Delfin();
        BallenaAzul ballena1= new BallenaAzul(4);
        Triatleta triatleta1= new Triatleta();
        System.out.println(delfin1.nadar(4)); 
        System.out.println(triatleta1.nadar(4)); 
        System.out.println( ballena1.nadar(4));
        System.out.println("--------------------------------");
        //Ej10:
    ArrayList<Nadador> listaNadadores= new ArrayList<>();
    listaNadadores.add(delfin1);
    listaNadadores.add(ballena1);
    listaNadadores.add(triatleta1);
    for(Nadador elemento : listaNadadores){
        System.out.println(elemento.nadar(5));
    }
        
        
   }
    
}
