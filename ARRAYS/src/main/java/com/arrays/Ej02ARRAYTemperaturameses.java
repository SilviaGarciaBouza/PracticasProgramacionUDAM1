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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class Ej02ARRAYTemperaturameses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEleccion;
        Random random = new Random();
        int[] temperaturaMensual;
        temperaturaMensual = new int[12];
        double temperaturaMediaAnual = 0;
        int suma = 0;
        boolean mas30 = false;
        boolean temperaturaRepe = false;
        boolean mesIgual = false;
        do {

            System.out.println("Que quieres hacer?");
            System.out.println("0- Llenar el array con temperarturas sin repetir");
            System.out.println("1- Llenar el Array con valores al azar para todos los meses (entre 0 y 40");
            System.out.println("2- Mostrar la temperatura media del año");
            System.out.println("3- Mostrar los meses en los que hizo más de 30 grados");
            System.out.println("4- Saber si hay algún mes con más de 30 grados");
            System.out.println("5- Saber si hay alguna temperatura repetida en dos o más meses");
            System.out.println("6- Saber si hay algún mes con más de 30 grados sin retun ni breack");
            System.out.println("Otro numero- Salir");
            numeroEleccion = Integer.parseInt(teclado.nextLine());

            switch (numeroEleccion) {

                //case 0 como 1 pero sin repetidos
                case 0 -> {
                    llenarAzaSinRepes(temperaturaMensual);
//                    temperaturaMensual[0] = random.nextInt(0, 41);
//
//                    do {
//                        for (int i = 1; i < temperaturaMensual.length; i++) {
//
//                            for (int j = i - 1; j >= 0; j--) {
//                                do {
//                                    temperaturaMensual[i] = random.nextInt(0, 41);
//                                } while (temperaturaMensual[i] == temperaturaMensual[j]);
//
//                            }
//                        }
//
//                    } while (mesIgual == true);
                    System.out.println("Las temperaturas sin repetidos son: " + Arrays.toString(llenarAzaSinRepes(temperaturaMensual)));
                }
                case 1 -> {
                    llenarAzar(temperaturaMensual);
                    System.out.println("Las temperaturas medias mensuales son: " + Arrays.toString(temperaturaMensual));

                }
                case 2 -> {

                    System.out.println("La temperatura media anual es: " + calculaTemperaturaMedia(temperaturaMensual));
                }
                case 3 -> {
                    System.out.println("Los meses con mas de 30 grados han sido los numero: ");
                    mostrarMeses(temperaturaMensual);
                }
                case 4 -> {

                    System.out.println("Has meses con mas de 30 grados de media: " + hayMas30(temperaturaMensual));
                }
                case 5 -> {

                    System.out.println("Hay temperatura repetida: " + temperaturaRepe(temperaturaMensual));
                }

                default -> {
                }
                case 6 -> {

                    System.out.println("Has meses con mas de 30 grados de media sin break ni return: " + SegundahayMas30(temperaturaMensual));
                }
            }

        } while (numeroEleccion == 6 || numeroEleccion == 0 || numeroEleccion == 1 || numeroEleccion == 2 || numeroEleccion == 3 || numeroEleccion == 4 || numeroEleccion == 5);

        System.out.println("Has salido del programa!");
    }

    //a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
    static public void llenarAzar(int[] arrayAzar) {
        Random radom = new Random();
        for (int i = 0; i < arrayAzar.length; i++) {
            arrayAzar[i] = radom.nextInt(0, 41);
        }
    }
    //b. Mostrar la temperatura media del año.

    static int calculaTemperaturaMedia(int[] miArray) {
        int suma = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        return suma / 12;

    }

    // c. Mostrar los meses en los que hizo más de 30 grados.
    static void mostrarMeses(int[] miArray) {

        for (int i = 0; i < miArray.length; i++) {
            String mes;
            switch (i) {
                case 0 -> {
                    mes = "enero";
                }
                case 1 -> {
                    mes = "febrero";
                }
                case 2 -> {
                    mes = "marzo";
                }
                case 3 -> {
                    mes = "abril";
                }
                case 4 -> {
                    mes = "mayo";
                }
                case 5 -> {
                    mes = "junio";
                }
                case 6 -> {
                    mes = "julio";
                }
                case 7 -> {
                    mes = "agosto";
                }
                case 8 -> {
                    mes = "septiembre";
                }
                case 9 -> {
                    mes = "octubre";
                }
                case 10 -> {
                    mes = "noviembre";
                }
                case 11 -> {
                    mes = "diciembre";
                }
                default -> {
                    mes = "mes incorrecto";
                }

            }
            if (miArray[i] > 30) {
                System.out.println(mes);
            }
        }
    }

    // d.  Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array, es
//decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array. Puedes usar break
//o return.
    static public boolean hayMas30(int[] miArray) {
        boolean existeMas30 = false;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > 30) {
                existeMas30 = true;
                return true;
            }
        }
        return existeMas30;
    }

    //    e. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array pero
//ahora sin usar ni break ni return.
    static public boolean SegundahayMas30(int[] miArray) {
        boolean existeMas30 = false;
        int indice = 0;
        while (existeMas30 == false || indice < miArray.length) {

            if (miArray[indice] > 30) {
                existeMas30 = true;

            }
            indice++;
        }
        return existeMas30;
    }

    //f. Decir si hay alguna temperatura repetida en dos o más meses. 
    static public boolean temperaturaRepe(int[] miArray) {
        boolean hayRepes = false;
        for (int i = 0; i < miArray.length - 1; i++) {
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[i] == miArray[j]) {
                    hayRepes = true;
                    return true;
                }
            }
        }
        return hayRepes;
    }

//    Realiza un programa similar al anterior, pero que en la parte ‘a’ garantice que no hay
//temperaturas repetidas. 
    static int[] llenarAzaSinRepes(int[] arrayAzar) {
        Random random = new Random();

        for (int i = 0; i < arrayAzar.length; i++) {
            boolean encontrado;
            do {
                encontrado = false;
                arrayAzar[i] = random.nextInt(0, 41);
                for (int j = 0; j < i; j++) {
                    if (arrayAzar[i] == arrayAzar[j]) {
                        encontrado = true;
                        break;
                    }
                }
            } while (encontrado == true);
        }

        return arrayAzar;
    }
    
//    b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para
//obtener el nombre del mes)
    static public void mostrarConNombreMeses(int[] miArray){
        String[] nombresTemp= new String[12];
        for(int i=0; i<miArray.length; i++){
            String mes= LocalDate.of(1,i,1).getMonth().toString();
            nombresTemp[1]= mes+""+miArray[i];
        }
    }

}
