/*
 y por último otra interfaz llamada Saltador con un método
saltarAltura que no recibe parámetros y que devuelve los centímetros saltados.


• Desarrolla una clase Delfin que implemente la interfaz Nadador. El tiempo en recorrer una
distancia es aleatorio entre 40km/h y 70km/hora
• Desarrolla una clase BallenaAzul que implemente la interfaz Nadador. El tiempo en recorrer
una distancia es de 10km/h para las mayores de 5 años y 13km/h para las menores.
 */
package EJERCICIO09;

import java.util.Random;

/**
 *
 * @author silvia
 */
public interface Saltador {
    int saltarAltura();//devuelve cm saltados
}


