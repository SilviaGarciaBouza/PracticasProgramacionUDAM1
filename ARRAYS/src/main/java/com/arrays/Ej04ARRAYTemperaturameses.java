/*
Realiza un programa similar a los anteriores pero que realice las siguientes funciones:
a. Llenar el Array con valores al azar para todos los meses. Para enero, febrero, marzo, noviembre y
diciembre los valores estarán comprendidos entre -10 y +20 y para el resto de meses entre +10 y
+40.
b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para
obtener el nombre del mes)
c. Mostrar la temperatura máxima del año, usando printf especificando en el formato que incluya el
signo “+” en temperaturas positivas y que solo muestre 1 decimal.
d. Mostrar el nombre del mes más frío del año.
e. Para hacer pruebas estadísticas, desplazar los valores a la derecha, pasando el último al primero. 
 */
package com.arrays;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */

public class Ej04ARRAYTemperaturameses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mesesTemperatura;
        mesesTemperatura = new int[12];
        Random random = new Random();
        int eleccion;
        double tempMax;
        int indexMaxtemp = 0;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1- Rellenar las temperaturas con valores al azar");
            System.out.println("2- Mostrar por pantalla el contenido del array con el nombre de los meses");
            System.out.println("3- Mostrar la temperatura máxima del año");
            System.out.println("4- Mostrar el nombre del mes más frío del año");
            System.out.println("5- Desplazar los valores a la derecha, pasando el último al primero");
            eleccion = Integer.parseInt(teclado.nextLine());
            switch (eleccion) {
                case 1 -> {
                    // enero0, febrero,1 marzo2, noviembre10 ydiciembre11 los valores estarán comprendidos 
                    //entre -10 y +20 y para el resto de meses entre +10 y+40.   
                    mesesTemperatura[0] = random.nextInt(-10, 21);
                    mesesTemperatura[1] = random.nextInt(-10, 21);
                    mesesTemperatura[2] = random.nextInt(-10, 21);
                    mesesTemperatura[10] = random.nextInt(-10, 21);
                    mesesTemperatura[11] = random.nextInt(-10, 21);
                    mesesTemperatura[3] = random.nextInt(-10, 21);
                    mesesTemperatura[4] = random.nextInt(-10, 21);
                    mesesTemperatura[5] = random.nextInt(-10, 21);
                    mesesTemperatura[6] = random.nextInt(-10, 21);
                    mesesTemperatura[7] = random.nextInt(-10, 21);
                    mesesTemperatura[8] = random.nextInt(-10, 21);
                    mesesTemperatura[9] = random.nextInt(-10, 21);
                    System.out.println(Arrays.toString(mesesTemperatura));
                }
                case 2 -> {
                    mostrarConNombreMeses(mesesTemperatura);

                }
                case 3 -> {
                    tempMax = (double) mesesTemperatura[0];
                    for (int i = 0; i < mesesTemperatura.length - 1; i++) {
                        if (mesesTemperatura[i] > tempMax) {
                            tempMax = mesesTemperatura[i];
                        }
                    }
                    System.out.printf("La mayor temperatura es: %+.1f\n", tempMax);
                }
                case 4 -> {

                    tempMax = (double) mesesTemperatura[0];
                    for (int i = 0; i < mesesTemperatura.length - 1; i++) {
                        if (mesesTemperatura[i] > tempMax) {
                            indexMaxtemp = i;
                        }
                    }
                    Month mesMasFrio = Month.of(indexMaxtemp);
                    System.out.println("El mes mas frio es: " + mesMasFrio.getDisplayName(TextStyle.FULL, new Locale("es", "Es")));
                }
                case 5 -> {
                    int[] nuevoArrayTempMes;
                    nuevoArrayTempMes = new int[12];
                    nuevoArrayTempMes[0] = mesesTemperatura[mesesTemperatura.length - 1];
                    int contindex = 0;
                    for (int i = 1; i < nuevoArrayTempMes.length; i++) {
                        nuevoArrayTempMes[i] = mesesTemperatura[contindex];
                        contindex++;
                    }
                    System.out.println("El nuevo array de temperaturas es : " + Arrays.toString(nuevoArrayTempMes));

                }
                default -> {

                }

            }

        } while (eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4 || eleccion == 5);

        System.out.println("Has salido del programa");
    }

    //    b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para
//obtener el nombre del mes)
    static public void mostrarConNombreMeses(int[] miArray) {
        int count = 0;
        do {
            Month mes = Month.of(count + 1);
            System.out.println(mes.getDisplayName(TextStyle.FULL, new Locale("es", "Es")) + ":" + miArray[count]);
            count++;
        } while (count < 12);
    }

//Mostrar temperaturas con nombres de los meses:
static public void mostrarconNombre(int[] miArray) {
        for(int i=0; i<miArray.length;i++){
            
        Month nombreMes= Month.of(i+1);
        
            System.out.println(nombreMes.getDisplayName(TextStyle.FULL, new Locale("es", "Es")) + ": "+miArray[i]);
        }
        
    }
}

//   
//
////                   
//}
