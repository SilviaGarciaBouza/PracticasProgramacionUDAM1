/*
 Escribe una función en Java, calcularCoste(), con parámetros de entrada el peso y distancia del
servicio de mensajería. Ambos parámetros son decimales. El valor devuelto por la función también
será con decimales. La función dará por válidos los datos pasados, la validación de los datos se
hará antes de la llamada a la función.
El coste basado en el peso debe calcularse según los siguientes criterios:
- Cuando el peso del paquete es inferior o igual a 5 kilogramos, el cargo de mensajería será de 6 €
- Cuando el peso del paquete supera los 5 kilogramos, hay un cargo adicional de 1'2 € por cada
kilogramo adicional desde los 5 kilogramos
El coste basado en la distancia debe calcularse según las siguientes tarifas:
- Cuando la distancia es menor o igual a 6 kilómetros, el cargo de mensajería será de 4'2 €
- Cuando la distancia es superior a 6 kilómetros, hay un cargo adicional de 1'4 € por cada kilómetro
adicional
 */
package com.sgbt05boletinfunciones;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class E01CalcularCoste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso;
        float distancia;
        do{
        System.out.println("Introduce el peso: ");
        peso = Float.parseFloat(teclado.nextLine());
        if(peso<=0){
            System.out.println("El peso debe ser mayor de 0");
        }
        }while(peso<=0);
        do{
        System.out.println("Introduce la distancia: ");
        distancia = Float.parseFloat(teclado.nextLine());
        if(distancia<=0){
            System.out.println("Ladistancia debe ser mayor de 0");
        }
        }while(distancia<=0);
        System.out.println(calcularCoste(peso, distancia));
    }

    static float calcularCoste(float peso, float distancia) {
        float costePeso=0;
        float costeDistancia=0;
        if (peso <= 5) {
            costePeso = 6;
        } else if (peso > 5) {
            costePeso = (peso - 5) * 1.2f;
        }
        if (distancia <= 6) {
            costeDistancia = 4.2f;
        } else if (distancia > 6) {
            costeDistancia = (distancia - 6) * 1.4f;
        }
        return costePeso + costeDistancia;

    }
}
