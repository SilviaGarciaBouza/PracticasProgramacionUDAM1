/*
Ejercicio de Programación Java: La Carrera de Albóndigas y el Reparto Incierto
Descripción:

En un peculiar evento culinario, varias personas compiten por llegar primero a una mesa donde se encuentran una cantidad 
inicial de deliciosas albóndigas. 
El concursante que llega en primer lugar tiene el privilegio de tomar una cantidad desconocida de albóndigas para sí mismo. 
Las albóndigas restantes deben ser repartidas en partes iguales entre los demás concursantes.

Tu tarea es escribir un programa en Java que calcule cuántas albóndigas le corresponden a cada uno de los concursantes que 
no llegaron en primer lugar, y cuántas albóndigas sobrarán después del reparto (si las hay).

Entrada:

El programa debe solicitar al usuario que ingrese los siguientes datos:

Cantidad inicial de albóndigas: (Número entero positivo)
Número total de concursantes: (Número entero positivo, mayor que 1)
Cantidad de albóndigas que tomó el ganador: (Número entero positivo, menor o igual a la cantidad inicial de albóndigas)
Salida:

El programa debe mostrar en la consola los siguientes datos:

Cantidad de albóndigas para cada concursante (excepto el ganador): (Número entero)
Número de albóndigas sobrantes: (Número entero)
Cálculo y Lógica:

Calcula la cantidad de albóndigas que quedan después de que el ganador toma su parte.
Determina cuántos concursantes quedan para repartir las albóndigas restantes (el número total de concursantes menos 1).
Divide la cantidad restante de albóndigas entre el número de concursantes restantes para obtener la cantidad que le 
corresponde a cada uno.
Calcula el resto de la división para determinar si sobran albóndigas.
Ejemplo de Interacción:

Ingrese la cantidad inicial de albóndigas: 50
Ingrese el número total de concursantes: 5
Ingrese la cantidad de albóndigas que tomó el ganador: 10

Cantidad de albóndigas para cada concursante: 13
Número de albóndigas sobrantes: 0
Ingrese la cantidad inicial de albóndigas: 30
Ingrese el número total de concursantes: 4
Ingrese la cantidad de albóndigas que tomó el ganador: 7

Cantidad de albóndigas para cada concursante: 7
Número de albóndigas sobrantes: 2
Consideraciones Adicionales:

El programa debe asegurarse de que la cantidad de albóndigas que tomó el ganador sea válida (no mayor que la cantidad inicial). 
Puedes incluir validación de entrada.
Considera el uso de la división entera y el operador módulo (%) para realizar los cálculos.
Este enunciado presenta un problema sencillo de cálculo y lógica, ideal para practicar operaciones aritméticas básicas en Java. 
El contexto de la carrera de albóndigas le da un toque divertido.
 */
package com.terceraevaluacion.Chicles;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class ALbondigasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int albondigadIniciales, numeroConcuersantes, albondigasPrimerGanador;
        int numeroALbondigasCadaJugador, albondigasSobrantes;
        System.out.println("Ingrese la cantidad inicial de albóndigas: ");
        albondigadIniciales = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el número total de concursantes: ");
        numeroConcuersantes = Integer.parseInt(teclado.nextLine());
        do {
            System.out.println("Ingrese la cantidad de albóndigas que tomó el ganador: ");
            albondigasPrimerGanador = Integer.parseInt(teclado.nextLine());
        } while (albondigasPrimerGanador > albondigadIniciales);
        numeroALbondigasCadaJugador = calcularNumeroALbondigasCadaJugador(albondigadIniciales, albondigasPrimerGanador, numeroConcuersantes);
        albondigasSobrantes= calcularAlbondigasSobrantes(albondigadIniciales, albondigasPrimerGanador, numeroConcuersantes);
        System.out.println("Cantidad de albóndigas para cada concursante: " + numeroALbondigasCadaJugador);
        System.out.println("Número de albóndigas sobrantes: "+albondigasSobrantes);
    }

    static public int calcularNumeroALbondigasCadaJugador(int albondigadIniciales, int albondigasPrimerGanador, int numeroConcuersantes) {
        if (numeroConcuersantes > 0) {
            return (albondigadIniciales - albondigasPrimerGanador) / (numeroConcuersantes - 1);
        } else {
            return 0;
        }
    }

    static public int calcularAlbondigasSobrantes(int albondigadIniciales, int albondigasPrimerGanador, int numeroConcuersantes) {
        if (numeroConcuersantes > 0) {
            return (albondigadIniciales - albondigasPrimerGanador) % (numeroConcuersantes - 1);
        } else {
            return 0;
        }
    }
}
