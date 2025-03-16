/*
Realizar un programa que tenga definido un Array de 12 filas y 30 columnas llamado
temperaturaDia con las temperaturas medias de un lugar en cada uno de los días del año
(suponemos meses de 30 días). Serán valores enteros negativos o positivos. El programa debe tener
funciones para realizar las siguientes tareas:
a. Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera valores al
azar para todos los días. Para enero, febrero, marzo, noviembre y diciembre los valores estarán
comprendidos entre -10 y +20 y para el resto de meses entre +10 y +35.
b. Mostrar por pantalla el contenido del array en forma de tabla: todos los días de un mes en la misma
fila, ocupando 3 posiciones (una para el signo y dos dígitos para la temperatura).
c. Mostrar la temperatura media del año.
d. Calcular la temperatura media de cada mes.
e. Crear un Array unidimensional con la temperatura mínima de cada mes.


//Del ej 11 se añade:
. Mostrar el día en el que más calor hizo del año.
c. Decir si hay algún día con más de 30 grados, recorriendo lo imprescindible del array, es
decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array. 
 */
package com.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class Ej10ARRAYSTemperaturaDias {

    public static void main(String[] args) {
        int[][] temperaturaMediaDiaria = new int[30][12];;
        llenarValores(temperaturaMediaDiaria);
        mostarDatos(temperaturaMediaDiaria);
        System.out.printf("La temperatura mdia anual ha sido: %.2f", temperaturaMediaAnual(temperaturaMediaDiaria));
        System.out.println("\nLas temperaturas medias de cada mes son: " + Arrays.toString(temperaturaMediaMes(temperaturaMediaDiaria)));
        System.out.println("Las temperaturas minimas de cada mes son: " + Arrays.toString(temperaturaMinimaMes(temperaturaMediaDiaria)));
        System.out.println("El dia mas calurose del año fue: " + diaMasCalorDelAño(temperaturaMediaDiaria));
        System.out.println("Hay doas con mas de 30 grados: "+diasMas30Grados(temperaturaMediaDiaria));
    }

    /*
    a. Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera valores al
azar para todos los días. Para enero, febrero, marzo, noviembre y diciembre los valores estarán
comprendidos entre -10 y +20 y para el resto de meses entre +10 y +35.*/
    static public void llenarValores(int[][] temperaturaMediaDiaria) {
        Random random = new Random();
        // temperaturaMediaDiaria= new int[30][12];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                switch (j) {
                    case 0, 1, 3, 11, 12 -> {
                        temperaturaMediaDiaria[i][j] = random.nextInt(-10, 21);
                    }
                    default -> {
                        temperaturaMediaDiaria[i][j] = random.nextInt(-10, 36);
                    }
                }

            }
        }
    }

    /*  
    Mostrar por pantalla el contenido del array en forma de tabla: todos los días de un mes en la misma
fila, ocupando 3 posiciones (una para el signo y dos dígitos para la temperatura).
     */
    static public void mostarDatos(int[][] temperaturas) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 30; j++) {
                if (temperaturas[j][i] < 10 && temperaturas[j][i] > -10) {
                    if (temperaturas[j][i] >= 0) {
                        System.out.print("+0" + temperaturas[j][i] + " ");
                    } else {
                        System.out.print("-0" + Math.abs(temperaturas[j][i]) + " ");

                    }
                } else {
                    if (temperaturas[j][i] > 9) {
                        System.out.print("+" + temperaturas[j][i] + " ");
                    } else {
                        System.out.print(temperaturas[j][i] + " ");

                    }
                }
            }
            System.out.println("");

        }

    }

    //Mostrar la temperatura media del año.
    static public double temperaturaMediaAnual(int[][] temperaturas) {
        double temperaturaMedia = 0;
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                contador++;
                suma += temperaturas[i][j];
            }
        }
        if (contador != 0) {
            temperaturaMedia = suma / (double) contador;
        }
        return temperaturaMedia;
    }

    //d. Calcular la temperatura media de cada mes.
    static public double[] temperaturaMediaMes(int[][] temperaturas) {
        double[] temperaturasMediaMes;
        temperaturasMediaMes = new double[12];
        double suma = 0;
        int indice = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 30; j++) {
                suma += temperaturas[j][i];
            }

            temperaturasMediaMes[indice] = suma / 30d;
            indice++;
        }

        return temperaturasMediaMes;

    }

    //Crear un Array unidimensional con la temperatura mínima de cada mes.
    static public int[] temperaturaMinimaMes(int[][] temperaturas) {
        int[] temperaturasMinimasMes;
        temperaturasMinimasMes = new int[12];
        int indice = 0;

        int temperaturaMinimaCadaMes;
        for (int i = 0; i < 12; i++) {
            temperaturaMinimaCadaMes = temperaturas[0][i];
            for (int j = 0; j < 30; j++) {
                if (temperaturas[j][i] < temperaturaMinimaCadaMes) {
                    temperaturaMinimaCadaMes = temperaturas[j][i];
                }
            }
            temperaturasMinimasMes[indice] = temperaturaMinimaCadaMes;
            indice++;

        }
        return temperaturasMinimasMes;
    }

    //Dia de mas calor del año
    static public String diaMasCalorDelAño(int[][] temperaturas) {
        int numeroDelMes = 0;
        int numerodia = 0;
        //LocalDate diaCaluroso;
        StringBuilder diaCaluroso = new StringBuilder();
        int temperaturaMasCalurosa = temperaturas[0][0];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (temperaturas[i][j] > temperaturaMasCalurosa) {
                    temperaturaMasCalurosa = temperaturas[i][j];
                    numeroDelMes = j;
                    numerodia = i;
                }
            }
        }
        // diaCaluroso.of(año,numeroDelMes,numerodia);
        diaCaluroso.append(numerodia).append("-").append(numeroDelMes);
        return diaCaluroso.toString();

    }
    
    static public boolean diasMas30Grados(int[][] temperaturas){
        boolean mas30= false;
        for(int i=0; i<30; i++){
            for(int j=0; j<12; j++){
                if(temperaturas[i][j]>30){
                    mas30=true;
                    break;
                }
            }
        }
        return mas30;
    }
}
