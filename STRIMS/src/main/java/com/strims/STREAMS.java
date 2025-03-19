/*
1. Filtrar y mapear una lista de números enteros
Dada una lista de números enteros, filtra los que sean pares, multiplícalos
por 2 y devuelve una nueva lista con los resultados.
static List<Integer> procesarNumeros(List<Integer> numeros) {...}
Ejemplo de entrada: List<Integer> numeros1 = List.of(1, 2, 3, 4, 5, 6);
Salida esperada: [4, 8, 12]

2. Suma de los cuadrados de los números impares
Dado un array de números enteros, calcula la suma de los cuadrados de los
números impares.
static int sumaCuadradosImpares(int[] numeros) {...}
Ejemplo de entrada: int[] numeros2 = {1, 2, 3, 4, 5};
Salida esperada: 35 // (1*1 + 3*3 + 5*5 = 1 + 9 + 25 = 35)

3. Calcular el promedio de una lista de números decimales
Dado un List<Double>, calcula el promedio de los valores contenidos en él,
retornando el resultado como un OptionalDouble (si la lista está vacía, el
resultado será NULL).
static OptionalDouble calcularPromedio(List<Double> numeros) {...}
Ejemplo de entrada: List<Double> numeros = List.of(10.5, 20.0, 30.5);
Salida esperada: OptionalDouble[20.333333333333332]
 */

package com.strims;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

/**
 *
 * @author silvia
 */
public class STRIMS {

    public static void main(String[] args) {
        //EJ1
       List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(imprimirNewList(listaNumeros));
        //EJ2
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(imprimirInt(numeros));
    
    
    }
    //EJ1
    static List<Integer> imprimirNewList( List<Integer> listaNumeros){
        return listaNumeros.stream()
               .filter(n->n%2==0)
               .map(m->m*2)
               .collect(Collectors.toList());
    }
    static int imprimirInt( int[] numeros){
        return Arrays.stream(numeros)
               .filter(n->n%2!=0)
               .map(m->m*m)
               .sum();
    }
}
