/*
/*Ejercicio de Programación Java: La Fábrica de Chicles y los Envoltorios Infinitos
Descripción:

En una misteriosa fábrica de chicles, existe una promoción especial: al reunir una cierta cantidad de envoltorios vacíos, 
se pueden canjear por una cantidad de chicles nuevos. Tu tarea es escribir un programa en Java que calcule cuántos chicles 
se pueden obtener en total y cuántos envoltorios sobrarán al final, dada la compra inicial de chicles y las reglas de canje. 
Además, deberás detectar si la situación lleva a un ciclo infinito de obtención de chicles.

Entrada:

El programa debe solicitar al usuario que ingrese los siguientes tres datos:

Chicles comprados inicialmente: (Número entero positivo)
Envoltorios necesarios para un chicle gratis: (Número entero positivo, mayor que 1)
Cantidad de chicles gratis por canje: (Número entero positivo)
Salida:

El programa debe mostrar en la consola los siguientes tres datos:

Total de chicles obtenidos: (Número entero)
Envoltorios sobrantes al final: (Número entero)
¿Canje infinito? (Booleano: true si se produce un canje infinito, false en caso contrario)
Cálculo y Lógica:

El programa debe simular el proceso de comer los chicles, acumular envoltorios y canjearlos por nuevos chicles hasta que no se puedan 
obtener más chicles gratis.

Condición de Canje Infinito:
Si hay canje infinito termina el programa

Se considera que hay un canje infinito si la cantidad de chicles gratis obtenidos por canje es igual o mayor que la cantidad de envoltorios 
necesarios para obtenerlos. En este escenario, cada canje generará suficientes envoltorios para otro canje, y así sucesivamente.
 */
 
package com.terceraevaluacion.Chicles;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class ChicleMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cCompradosIniciales, eNecesariosParaGratis, cGratisPorCanje;
        int totalChicles, envoltoriosSobrantes;
        System.out.println("Chicles comprados inicialmente: ");
        cCompradosIniciales= Integer.parseInt(teclado.nextLine());
        System.out.println("Envoltorios necesarios para un chicle gratis: ");
        eNecesariosParaGratis= Integer.parseInt(teclado.nextLine());
        System.out.println("Cantidad de chicles gratis por canje: ");
        cGratisPorCanje= Integer.parseInt(teclado.nextLine());
        if(esCanjeInfinito(eNecesariosParaGratis, cGratisPorCanje)){
            System.out.println("Hay un canje infinito!!");
            System.out.println("Fin del programa!");
        }else{
            
            totalChicles=cCompradosIniciales;
            envoltoriosSobrantes=cCompradosIniciales;
            
            do{
            totalChicles+=(cCompradosIniciales/eNecesariosParaGratis);
            envoltoriosSobrantes-=eNecesariosParaGratis;
            System.out.println("totalChicles "+totalChicles);
            System.out.println("envoltoriosSobrantes "+envoltoriosSobrantes);
            }while(envoltoriosSobrantes>=eNecesariosParaGratis);
            
            
            
            
        }
        
        
        
    }
    
    static public boolean esCanjeInfinito(int eNecesariosParaGratis, int cGratisPorCanje){
        return eNecesariosParaGratis<=cGratisPorCanje;
    }
    
}
