/*
ASIGNAR VALORES
ASIGNAR VALORES SIN REPETIR
AÑADIR ELEMENTO
Añadi elemento
ELIMINAR elemento POR POSICION
ELIMINAR ELEMENTO POR VALOR
Eliminar por valor, devuelve cantidad de eliminaciones
MOSTRAR
Mostrar con dos decimales: elemento+Posicion        
ORDENAR
Compara Mismos elementos no mismo orden  no repes
Vaciar
Divisores
CREA NUMEROS ALEATORIOS NO REPES Y LOS ORDENA
BUSQUEDA DICOTOMICAx2/ ordenar primero!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<xxxx22222
comparar dos arrayList buscado el numero de elementos comunes<<<<<<<<<<<<<<<<
iiiiiiiiiiimmmmmmmmmmmmmmmmmmmmmmppppppppppppp   cadena1.remove(cadena1.indexOf(min1));
 */
package com.modulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class M02ARRAYLIST {

    public static void main(String[] args) {
        ArrayList<Double> miArrayList = new ArrayList<>();
        ArrayList<String> miArrayList11 = new ArrayList<>();
        ArrayList<String> miArrayList22 = new ArrayList<>();
        miArrayList11.add("2");
        miArrayList11.add("1");
        miArrayList22.add("1");
        miArrayList22.add("2");
        //ASIGNAR VALORES 
        System.out.println(asignarValors(miArrayList));
        //ASIGNAR VALORES SIN REPETIR
        System.out.println(asignarValorssINrEPETIR(miArrayList));
        //AÑADIR ELEMETO
        System.out.println(añadirElemento(miArrayList));
        //AÑADIR ELEMENTO2
        //ELIMINAR elemento POR POSICION
        System.out.println(eliminaarElementoPosicion(miArrayList, 1));
        //ELIMINAR elemento POR VALOR
        System.out.println(eliminaarElementoValor(miArrayList, 4));
        //ELIMINAR POR VALOR2
        //MOSTRAR
        System.out.println(Mostrar(miArrayList));
        //MOSTRAR CON DOS DECIMALES
        //ORDENAR
        System.out.println(ordenar(miArrayList));
        ////Mismos elementos no mismo orden NO REPES
        System.out.println(mismosElementos(miArrayList11, miArrayList22));
//        Vaciar
//        Divisores
//        CREA NUMEROS ALEATORIOS NO REPES Y LOS ORDENA
//BUSQUEDA DICOTOMICA
        int[] miArray = {1, 20, 32, 41, 52, 93};
        int num = 32;
        System.out.println("Dicotomica: ");
        busquedaDicotomica(miArray, num);

    }

//ASIGNAR VALORES
    static public ArrayList<Double> asignarValors(ArrayList<Double> miarrayList) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Indica longitud: ");
        longitud = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < longitud; i++) {
            System.out.println("Escribe la altura: ");
            miarrayList.add(Double.parseDouble(teclado.nextLine()));
        }
        return miarrayList;
    }

//ASIGNAR VALORES SIN REPETIR
    static public ArrayList<Double> asignarValorssINrEPETIR(ArrayList<Double> miarrayList) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Indicas longitud: ");
        longitud = Integer.parseInt(teclado.nextLine());
        double valor;
        do {

            do {
                System.out.println("Escribe la altura: ");
                valor = Double.parseDouble(teclado.nextLine());

            } while (miarrayList.contains(valor));
            miarrayList.add(valor);

        } while (miarrayList.size() < longitud);
        return miarrayList;
    }

    //AÑADIR ELEMENTO
    static public ArrayList<Double> añadirElemento(ArrayList<Double> miArrayList) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un valor: ");
        miArrayList.add(Double.parseDouble(teclado.nextLine()));
        return miArrayList;
    }

    //Añadi elemento
    public static void añadirElemento2(ArrayList<Double> miArrayList, double nuevoElemento) {
        miArrayList.add(nuevoElemento);
    }

    //ELIMINAR elemento POR POSICION
    static public ArrayList<Double> eliminaarElementoPosicion(ArrayList<Double> miArrayList, int posicionEliminar) {
        if (miArrayList.size() > posicionEliminar) {
            miArrayList.remove(posicionEliminar);
        }
        return miArrayList;
    }

    //ELIMINAR ELEMENTO POR VALOR
    static public ArrayList<Double> eliminaarElementoValor(ArrayList<Double> miArrayList, double valor) {
        miArrayList.remove(valor);
        return miArrayList;
    }

    //Eliminar por valor, devuelve cantidad de eliminaciones
    public static int eliminarPorValor(ArrayList<Double> miArrayList, double valor) {
        int contador = 0;
        for (Double elemento : miArrayList) {
            if (elemento == valor) {//o equals
                contador++;
            }
        }
        while (miArrayList.contains(valor)) {
            miArrayList.remove(valor);
        }
        return contador;
    }

    //MOSTRAR
    static public ArrayList<Double> Mostrar(ArrayList<Double> miArrayList) {

        return miArrayList;
    }

    //Mostrar con dos decimales: elemento+Posicion        
    public static void mostrarArrayList(ArrayList<Double> miArrayList) {
        int contador = 0;
        for (Double elemento : miArrayList) {
            System.out.printf("Posicion: " + contador + " -> Altura: %.2f\n", elemento);
            contador++;
        }
    }

    // ORDENAR
    public static ArrayList<Double> ordenar(ArrayList<Double> miArrayList) {
        Collections.sort(miArrayList);
        return miArrayList;
    }

    //Compara Mismos elementos no mismo orden  no repes
    public static boolean mismosElementos(ArrayList<String> miArrayList11, ArrayList<String> miArrayList22) {
        //Compara que tenga el mismo size
        if (miArrayList11.size() != miArrayList22.size()) {
            return false;
        }
        for (int i = 0; i < miArrayList11.size(); i++) {
            if (!miArrayList22.contains(miArrayList11.get(i)) || !miArrayList11.contains(miArrayList22.get(i))) {
                return false;
            }
        }
        return true;
    }

    //Vaciar
    public static void vaciar(ArrayList<Double> miArrayList) {
        miArrayList.clear();
    }
//Divisores

    static public ArrayList<Integer> calcularDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
//CREA NUMEROS ALEATORIOS NO REPES Y LOS ORDENA

    static public ArrayList<Integer> generarNumerosDiferentes(ArrayList<Integer> numeros, int longitud) {
        Random random = new Random();
        while (numeros.size() < longitud) {
            int numeroRandom = random.nextInt(1, 50);
            if (numeros.contains(numeroRandom) == false) {
                numeros.add(numeroRandom);
            }

        }
        Collections.sort(numeros);
        return numeros;

    }

    //BUSQUEDA DICOTOMICA
    int[] miArray = {1, 20, 32, 41, 52, 93};
    int num = 3;

    public static void busquedaDicotomica(int[] miArray, int num) {

        boolean encontrado = false, fin = false;
        int centro, inf = 0, sup = miArray.length - 1;
        while (!encontrado && !fin) {
            centro = (int) ((sup + inf) / 2);
            if (num == miArray[centro]) {
                encontrado = true;
            } else {
                if (num < miArray[centro]) {
                    sup = centro - 1;
                } else {
                    inf = centro + 1;
                }
                if (inf > sup) {
                    fin = true;
                }
            }
        }
        System.out.println(encontrado ? "encontrado" : "no encontrado");
    }

    //Dicotomico pasandole un arraylist<<<<<<<<<<<<<<<<<<<<      
    //Ordenar antesssssssssssssssssss
    public static boolean aciertos(ArrayList<Integer> miArrayList, int num) {

        int[] miArray = new int[miArrayList.size()];//ordena antesss
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = miArrayList.get(i);
        }

        boolean encontrado = false, fin = false;
        int centro, inf = 0, sup = miArray.length - 1;
        while (!encontrado && !fin) {
            centro = (int) ((sup + inf) / 2);
            if (num == miArray[centro]) {
                encontrado = true;
            } else {
                if (num < miArray[centro]) {
                    sup = centro - 1;
                } else {
                    inf = centro + 1;
                }
                if (inf > sup) {
                    fin = true;
                }
            }
        }
        return encontrado;
    }

    // Dicotomicoooo 2:
    public static boolean dicotomico(ArrayList<Integer> miArrayList, int num) {
        //primero ordeno:
        Collections.sort(miArrayList);
        //segundo busco
        int i = Collections.binarySearch(miArrayList, num);
        if (i == 0) {
            return false;
        } else {
            return true;//devuelve la posicion
        }
    }
    //comparar dos arrayList buscado el numero de elementos comunes

    public int compararArrayLists(ArrayList<Integer> arrayl1, ArrayList<Integer> arrayl2) {
        int cont = 0;
        for (int i = 0; i < arrayl1.size(); i++) {
            if (arrayl2.contains(arrayl1.get(i))) {
                cont++;
            }
        }
        return cont;
    }

}
