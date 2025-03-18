/*
. Duplica las interfaces y las clases del ejercicio anterior (añadiéndoles el sufijo _v2) Modifica la
interfaz Saltador_v2 añadiéndole el método saltaPertiga que recibe como parámetro una altura en
centímetros y devuelve true si ha logrado el salto y false si no lo ha logrado ¿Qué ocurre con la clase
TriAtleta_v2? Desarrolla saltaPertiga como método default en la interfaz de forma que por defecto
devuelva false.
• Haz una nueva versión de TriAtleta (sufijo _v2b) que implemente saltaPertiga con este
criterio: para saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la
mitad de las veces y por debajo de 5 metros devuelve siempre true.
• Haz un programa que cree una instancia de Triatleta_v2 y otra de Triatleta_v2b y que
muestre el resultado de ambos atletas saltando: 100cm, 550cm, 560cm, 580cm, 700cm. 
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
      Triatleta_v2 triatleta1= new Triatleta_v2();
        System.out.println(triatleta1.saltaPertiga(100));
         System.out.println(triatleta1.saltaPertiga(550));
          System.out.println(triatleta1.saltaPertiga(560));
           System.out.println(triatleta1.saltaPertiga(700));
   }
    
}
