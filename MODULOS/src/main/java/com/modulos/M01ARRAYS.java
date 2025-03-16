/*
INICIALIZAR 
BUSCAR NUMERO DE ELEMENTOS IGUALES EN DOS ARRAYS DE NUMEROS NO REPETIDOS<<<<<<<<<<<<<<
DESPLAZAR DERECHA <<<<<<<<<<<<<<<
ASIGNAR VALORES
AsiGNAR VALORES RANDOM NO REPES<<<<<<<<<<<<<<<<<
IMPRIMIR ELEMENTOS EN LINEAS SEPARADAS
BUSCAR UN ELEMENTO
BUSCAR EL NUMERO DE VECES Q SE REPITE UN ELEMENTO
INVERTIR EL ARRAY
ELIMINAR UN ELEMENTO
ROTAR VALORES A LA DERECHA
ROTAR A LA DERECHA N POSICIONES<<<<<<<<<<<<<<<<<<<<<<
VERIFICAR SI DOS ARRAYS SON IGUALES
¿ES PALINDROMO?
¿HAY REPETIDOS?<<<<<<<<<<<<<<<<<<<<<<<
BUSQUEDA DICOTOMICA en ARRAYLISST(Hay q ordenar primero el arrayyyyyy)<<<<<<<<<<<<<<
 */
package com.modulos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class M01ARRAYS {

    public static void main(String[] args) {
        //
        String[] miArray0 = {"1", "2", "3"};
        String[] miArray = {"1", "2", "1"};
        int[] miArray2 = {1, 2};
//        INICIALIZAR 
//        ASIGNAR VALORES
        asignarValores(miArray2);
//      asignar valores random sin repetidos;
//        IMPRIMIR ELEMENTOS EN LINEAS SEPARADAS
        imprimirEnDistintasLineas(miArray2);
//        BUSCAR UN ELEMENTO
        busqueda(miArray, "1");
//        BUSCAR EL NUMERO DE VECES Q SE REPITE UN ELEMENTO
        busquedaRepeticiones(miArray, "1");
//        INVERTIR EL ARRAY
        System.out.println(Arrays.toString(invierteArray(miArray)));

//        ELIMINAR UN ELEMENTO
        System.out.println(Arrays.toString(eliminarElemento(miArray, "2")));
//        ROTAR VALORES A LA DERECHA
        System.out.println(Arrays.toString(rotarAAderecha(miArray)));
//        VERIFICAR SI DOS ARRAYS SON IGUALES
        miArray0[0] = "1";
        miArray0[1] = "2";
        miArray0[2] = "3";
        miArray[0] = "1";
        miArray[1] = "2";
        miArray[2] = "3";
        
        System.out.println(compararArrays(miArray0, miArray));
//        ¿ES PALINDROMO?
        System.out.println(esPalindromo(miArray));
    }

    //Inicializar array: no vale en fun a parte
    static public void iniciarArray() {
        Scanner teclado = new Scanner(System.in);
        int[] miArray;
        int longitud;
        System.out.println("Escribe la longitud: ");
        longitud = Integer.parseInt(teclado.nextLine());
        miArray = new int[longitud];
        //Otra forma con valores:
        int[] miArray2 = {1, 2, 3, 4};
    }
   // BUSCAR NUMERO DE ELEMENTOS IGUALES EN DOS ARRAYS DE NUMEROS NO REPETIDOS<<<<<<<<<<<<<<

      //2 arrays de int no repetidos
    int[] primi= {1,2,3,4};
    public int numeroAciertos(int[]otroArray){
        int contador=0;
        for(int i=0; i<primi.length;i++){
            for(int j=0; j<otroArray.length; j++){
                if(primi[i]==otroArray[j]){
                    contador++;
                }
            }
        }
        return contador;
    }

    public int[] getPrimi() {
        return primi;
    }
    
    
    //DESPLAZAR DERECHA
      static public int[] desplazarDerecha(int[] miArray, int numeroDesplazado) {
        int indice=0;
        int[] nuevoArray= new int[miArray.length];
        for(int i=0; i<miArray.length;i++){
            numeroDesplazado= numeroDesplazado%miArray.length;
            if(i>=numeroDesplazado){
                nuevoArray[i]= miArray[indice];
                indice++;
            }
       
        }
        int contador=0;
        for(int j=0; j<miArray.length;j++){
            if(j<numeroDesplazado){
                nuevoArray[j]= miArray[miArray.length-numeroDesplazado+contador];
                contador++;
            }
        }
        return nuevoArray;
        
    }

    //Asignar valores a un array
    static public void asignarValores(int[] miArray) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Escribe un valor: ");
            miArray[i] = Integer.parseInt(teclado.nextLine());
        }
    }
    
   //Asignar valores random no repetidos 
     static public int[] asignarValoresnoçRepes(int[] miArray) {
        Random random= new Random();
        int contador=0;
        int numerorandom;
       
        while (contador<miArray.length) {
            boolean repe=false;
            numerorandom= random.nextInt(1,41);
            for(int i=0; i<miArray.length;i++){
                if(miArray[i]==numerorandom){
                    repe=true;
                    break;
                }
            }
            if(repe==false){
                miArray[contador]=numerorandom;
                contador++;
            }
            
        }
        return miArray;
    }
    
    

    //Imprimir Elementos en lineas separadas     
    static public void imprimirEnDistintasLineas(int[] miArray) {
        System.out.println("Mi array: ");
        for (int elemento : miArray) {
            System.out.println(elemento);
        }
    }

    //busqueda de 1 elemento(primer indice o -1)
    static public int busqueda(String[] miArray, String elementoBuscar) {
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i].equals(elementoBuscar)) {
                return i;
            }
        }
        return -1;
    }

    //BUSCAR EL NUMERO DE veces QUE SE REPITE un elemento
    static public int busquedaRepeticiones(String[] miArray, String elementoBuscar) {
        int repeticiones = 0;
        for (String miArray1 : miArray) {
            if (miArray1.equals(elementoBuscar)) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

    //invierte el array
    static public String[] invierteArray(String[] miArray) {
        String[] nuevoArrayInvertido = new String[miArray.length];
        int indice = 0;
        for (int i = miArray.length - 1; i >= 0; i--) {

            nuevoArrayInvertido[indice] = miArray[i];
            indice++;
        }
        return nuevoArrayInvertido;
    }

    //Eliminar un elemento
    static public String[] eliminarElemento(String[] miArray, String elementoAEliminar) {
         if (miArray == null || elementoAEliminar == null) {
        return null; 
    }
        int suma = 0;
        for (String miArray1 : miArray) {
            if (miArray1.equals(elementoAEliminar)) {
                suma++;
            }
        }
        String[] nuevoArray = new String[miArray.length - suma];
        int indice = 0;
        for (String miArray1 : miArray) {
            if (!miArray1.equals(elementoAEliminar)) {
                nuevoArray[indice] = miArray1;
                indice++;
            }
        }
        return nuevoArray;

    }
    
  
    
    
    

    //ROtar valoress a la derecha
    static public String[] rotarAAderecha(String[] miArray) {
        String[] nuevoArray = new String[miArray.length];
        nuevoArray[0] = miArray[miArray.length - 1];
        int indice = 0;
        for (int i = 1; i < nuevoArray.length; i++) {
            nuevoArray[i] = miArray[indice];
            indice++;
        }
        return nuevoArray;
    }
    //rotar n posiciones
        static public int[] suma(int[] a, int n) {
        int[] b= new int[a.length];
        int cont=0;
        int d=n;
        for(int i=0; i<a.length;i++){
           if(i<n){
               b[i]=a[a.length-1-d];
               d--;
           }else{
               b[i]= a[cont];
               cont++;
           }
        
        }
        return b;
    }


    
    
    
    //dos arrays iguales ==orden

    static public boolean compararArrays(String[] miArray1, String[] miArray2) {
        if (miArray1.length != miArray2.length) {
        return false; 
    }

        
            for (int i = 0; i < miArray1.length; i++) {
                if (!miArray1[i].equals(miArray2[i])) {
                    return false;
                }
            }
       
        return true;

    }   
    
    //¿es palindrimo?
    static public boolean esPalindromo(String[] miArray) {
        for (int i = 0; i < miArray.length; i++) {
            if (!miArray[i].equals(miArray[miArray.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
//HAY REPETIDOS??
        static public boolean mas30(int[] miArray) {
        for (int i = 0; i < miArray.length - 1; i++) {
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[i] == miArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
