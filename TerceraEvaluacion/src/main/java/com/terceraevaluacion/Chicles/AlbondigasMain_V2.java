/*
Ejercicio de Programación Java: La Carrera de Albóndigas y el Reparto Incierto (Versión Sin Cantidad del Ganador)
Descripción:

En un peculiar evento culinario, varias personas compiten por llegar primero a una mesa donde se encuentran una cantidad 
inicial de deliciosas albóndigas. El concursante que llega en primer lugar toma una cantidad de albóndigas para sí mismo, 
pero esta cantidad es desconocida para el resto. Las albóndigas restantes deben ser repartidas en partes iguales entre los 
demás concursantes.

Tu tarea es escribir un programa en Java que calcule la máxima cantidad posible de albóndigas que podría haber tomado el 
ganador, asumiendo que el resto de los concursantes recibieron una cantidad entera de albóndigas y que sobraron la menor 
cantidad posible (posiblemente cero).

Entrada:

El programa debe solicitar al usuario que ingrese los siguientes datos:

Cantidad inicial de albóndigas: (Número entero positivo)
Número total de concursantes: (Número entero positivo, mayor que 1)
Salida:

El programa debe mostrar en la consola la siguiente información:

Máxima cantidad de albóndigas que pudo tomar el ganador: (Número entero)
Cálculo y Lógica:

Para maximizar la cantidad de albóndigas que tomó el ganador, debemos minimizar la cantidad de albóndigas que se repartieron
entre los demás y la cantidad sobrante.

Determina cuántos concursantes quedan para el reparto (el número total de concursantes menos 1).
Para que la cantidad sobrante sea mínima (idealmente cero), la cantidad de albóndigas restantes debe ser divisible por el 
número de concursantes restantes.
Encuentra el mayor múltiplo del número de concursantes restantes que sea menor o igual a la cantidad inicial de albóndigas. 
Esta cantidad representa la máxima cantidad que se pudo repartir entre los demás.
La diferencia entre la cantidad inicial de albóndigas y la cantidad máxima repartida será la máxima cantidad que pudo haber 
tomado el ganador.
Ejemplo de Interacción:

Ingrese la cantidad inicial de albóndigas: 50
Ingrese el número total de concursantes: 5

Máxima cantidad de albóndigas que pudo tomar el ganador: 14
 */
package com.terceraevaluacion.Chicles;

/**
 *
 * @author silvia
 */
public class AlbondigasMain_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
