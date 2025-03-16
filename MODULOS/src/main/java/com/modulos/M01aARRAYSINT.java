/*
MEDIA
SUMA
BUSCAR:
    VALOR MAX
    VALOR MIN
ORDEN 
    ASCENDENTE
    DESCENDENTE
VERIFICAR QUE ESTA ORDENADOS
    ASCENDENTE
    DESCENDENTE
SEGUNDO VALOR MAS GRANDE 
MOVER 0 AL FINAL
Dos array y sumar para crear el array suma
CREAR ARRAYS DE NO REPETIDOS
array de divisores
ENCONTRAR LOS INDICES DE LOS VALORES MAYORES A 30<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */
package com.modulos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class M01aARRAYSINT {

    public static void main(String[] args) {
        int[] miArray = {0, 0, 3, 2, 8, 0, 8, 9};
//        MEDIA
        System.out.println(media(miArray));
//        SUMA
        System.out.println(suma(miArray));
//        BUSCAR:
//            VALOR MAX
        System.out.println(valormax(miArray));
//            VALOR MIN
        System.out.println(valorminimo(miArray));
//        ORDEN 
//            ASCENDENTE
        System.out.println(Arrays.toString(ordenAscendente(miArray)));

//            DESCENDENTE
        System.out.println(Arrays.toString(ordenDescendente(miArray)));

//        VERIFICAR QUE ESTA ORDENADOS
//            ASCENDENTE
        System.out.println(verificarOrdenAscendente(miArray));

//            DESCENDENTE
        System.out.println(Arrays.toString(miArray));

//        SEGUNDO VALOR MAS GRANDE
        System.out.println(segundoValorMayor(miArray));

//        MOVER 0 AL FINAL
        System.out.println(Arrays.toString(mover0Alfinal(miArray)));

//        Dos array y sumar para crear el array suma
        System.out.println(Arrays.toString(sumarElementosArrays(miArray, miArray)));
//        CREAR ARRAYS DE NO REPETIDOS
        System.out.println(Arrays.toString(sinRepetidos(4)));
    }

    //media
    static public double media(int[] miArray) {
        int suma = 0;
        double median = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        if (miArray.length != 0) {
            median = suma / miArray.length;
        }
        return median;
    }

    //Suma
    static public int suma(int[] miArray) {
        int suma = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        return suma;
    }

    //Buscar valor maximo
    static public int valorminimo(int[] miArray) {
        int valorMinimo = miArray[0];
        for (int i = 1; i < miArray.length; i++) {
            if (valorMinimo > miArray[i]) {
                valorMinimo = miArray[i];
            }
        }
        return valorMinimo;
    }

    //Busca el valor minimo
    static public int valormax(int[] miArray) {
        int valorMax = miArray[0];
        for (int i = 1; i < miArray.length; i++) {
            if (valorMax < miArray[i]) {
                valorMax = miArray[i];
            }
        }
        return valorMax;
    }
    //orden ascendente

    static public int[] ordenAscendente(int[] miArray) {

        for (int i = 0; i < miArray.length - 1; i++) {

            int min_idex = i;
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[j] < miArray[min_idex]) {
                    min_idex = j;
                }
            }
            int temporal = miArray[min_idex];
            miArray[min_idex] = miArray[i];
            miArray[i] = temporal;
        }
        return miArray;
    }

    static public int[] ordenDescendente(int[] miArray) {
        for (int i = 0; i < miArray.length - 1; i++) {
            int indiceMax = i;
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[j] > miArray[indiceMax]) {
                    indiceMax = j;
                }
            }
            int temporal = miArray[indiceMax];
            miArray[indiceMax] = miArray[i];
            miArray[i] = temporal;
        }
        return miArray;
    }

    //Verificar si esta ordenado ascendente
    static public boolean verificarOrdenAscendente(int[] miArray) {
        for (int i = 0; i < miArray.length - 1; i++) {
            if (miArray[i] > miArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //verificar orden descendente
    static public boolean verificarOrdenDescendente(int[] miArray) {
        for (int i = 0; i < miArray.length - 1; i++) {
            if (miArray[i] < miArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //encuentra el segundo valor mas grande
    static public int segundoValorMayor(int[] miArray) {
        int valormayor;
        int segundoValorMayo;
        if (miArray[0] < miArray[1]) {
            segundoValorMayo = miArray[0];
            valormayor = miArray[1];
        } else {
            segundoValorMayo = miArray[1];
            valormayor = miArray[0];
        }

        if (miArray.length <= 3) {
            for (int i = 2; i < miArray.length; i++) {
                if (miArray[i] > segundoValorMayo) {
                    if (miArray[i] > valormayor) {
                        miArray[i] += valormayor;
                        valormayor = miArray[i] - valormayor;
                        miArray[i] = miArray[i] - valormayor;
                    } else if (miArray[i] < valormayor) {
                        segundoValorMayo = miArray[i];
                    }

                }
            }

        }

        return segundoValorMayo;

    }

    //mover los 0 al final
    static public int[] mover0Alfinal(int[] miArray) {
        int[] nuevoArray = new int[miArray.length];
        int contador = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == 0) {
                contador++;
            }
        }
        int indice = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] != 0) {
                nuevoArray[indice] = miArray[i];
                indice++;
            }
        }
        while (contador > 0) {
            nuevoArray[nuevoArray.length - contador] = 0;
            contador--;
        }
        return nuevoArray;
    }

    //dos arrays sumar y otro array
    static public int[] sumarElementosArrays(int[] miArray1, int[] miArray2) {
        int[] nuevacadenasuma = new int[miArray2.length];
        if (miArray2.length == miArray1.length) {
            for (int i = 0; i < miArray1.length; i++) {
                nuevacadenasuma[i] = miArray1[i] + miArray2[i];
            }
        }
        return nuevacadenasuma;
    }

    //crear array de no repetidos
    static public int[] sinRepetidos(int longitud) {

        Scanner teclado = new Scanner(System.in);

        int[] miArray = new int[longitud];
        int valor;

        for (int i = 0; i < longitud; i++) {
            boolean esRepetido;
            do {
                System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
                valor = Integer.parseInt(teclado.nextLine());
                esRepetido = false;
                for (int j = 0; j < i; j++) {
                    if (miArray[j] == valor) {
                        esRepetido = true;
                        System.out.println("El valor ya ha sido ingresado. Intente nuevamente.");
                        break;
                    }
                }
            } while (esRepetido);
            miArray[i] = valor;
        }

        return miArray;

    }
    //array de divisores
       static public int[] divisores(int numero){
        int contador=0;
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                contador++;
            }
        }
        int[] arrayDivisores;
        arrayDivisores= new int[contador];
        int indice=0;
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
            arrayDivisores[indice]=i;
                    indice++;
            }
        }
        return arrayDivisores;
    }
    
       //ENCONTRAR LOS VALORES MAYORES A 30       
           static public int[] mas30(int[] miArray) {
        int contador = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > 30) {
                contador++;
            }
        }
        int[] nuevoArray = new int[contador];
        int nuevoCOntador = 0;
        for (int j = 0; j < miArray.length; j++) {
            if (miArray[j] > 30) {
                nuevoArray[nuevoCOntador] = j;
                nuevoCOntador++;

            }
        }

        return nuevoArray;
    }


}
