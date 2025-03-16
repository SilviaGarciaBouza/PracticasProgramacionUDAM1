/*
Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos hay con 3,
4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar
boletos al azar).
.
 */
package com.arrays.primitiva;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class MainEj05PrimitivaGenerador {

    public static void main(String[] args) {

        Ej05ARRAYPrimitiva ganadoraPrimitiva = new Ej05ARRAYPrimitiva();
        Random random = new Random();
       
        int count3Aciertos = 0;
        int count4Aciertos = 0;
        int count5Aciertos = 0;
        int count6Aciertos = 0;
        int count = 0;
        int numeroAciertos;
        do {
            numeroAciertos= ganadoraPrimitiva.numeroAciertos(ganadoraPrimitiva.generaNuevoBoleto());

            count++;
            if (numeroAciertos == 3) {
                count3Aciertos++;
            }
            if (numeroAciertos == 4) {
                count4Aciertos++;
            }
            if (numeroAciertos == 5) {
                count5Aciertos++;
            }
            if (numeroAciertos == 6) {
                count6Aciertos++;
            }
        } while (count < 1000);
        System.out.println("Han tenido 3 aciertos " + count3Aciertos);
        System.out.println("Han tenido 4 aciertos " + count4Aciertos);
        System.out.println("Han tenido 5 aciertos " + count5Aciertos);
        System.out.println("Han tenido 6 aciertos " + count6Aciertos);

    }

}
