/*
/*
ARRAY
solo de un tipo de datos
lenth es sun atributo no un a fun
0..lenth-1
declaracion
int[] edad;
reserva de memoria
int[] edad = new int[12];
inicializacion
edad = new int [] {1,2,3}
o hacerlo todo junto:
int [] edad = {1,2,3};
para acceder:
edad[1]; //posicion uno de edad
edad.lenth;
con bucle for se pueden recorrer los elementos para darles valor, tienes q saber ya ell lenth
for para no modificar el valor:
for (String c) este foreach no vale para asignar valores, da error, vake por ej para print
...mirar apuntes se imprime asi pq tiene el tostring, todas las clases lcon toString lo pden hacer
array no tiene tostring asi q para imprimirlo: Arrays.toString(elArrayAImprimir);
busqueda de un elemento:
secuencial va comparando  con cada uno hasta que lo encuemnntra;
dicotomica: primero calcula el medio del array
el array no puedes pedir por teclado el valor
El valor de cada elemento si q se puede cambiar
 */
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class ARRAYSbloque1 {

    public static void main(String[] args) {
//        Scanner teclado= new Scanner(System.in);
//        //crea un array que reciba por teclado un array de numeros y haga la suma 
//        int[] numeros = new int[3];
//        for(int i= 0; i<numeros.length; i++){
//            System.out.println("Intoduce un numero: ");
//            numeros[i]= Integer.parseInt(teclado.nextLine());
//        }
//        System.out.println(Arrays.toString(numeros));
//        //Dado un array de int indica cual es el elemento mas grande:
//        int elementoMayor= numeros[0];
//for each sig no vale para dar valores
//        for(int elemento: numeros){
//            
//            if(elemento>elementoMayor){
//                elementoMayor=elemento;
//            }
//            
//        }
//        System.out.println("El elemento mayor es: "+elementoMayor);
//        
////        //recibe un elemento y calcula el promedio de los elementos:
////        int[] cadenaNumeros= new int[4];
////        int suma= 0;
////        for(int i=0; i<cadenaNumeros.length; i++){
////            System.out.println("Introduce un numero: ");
////            numeros[i]= Integer.parseInt(teclado.nextLine());
////            suma+=1;
////            System.out.println(suma);
////        }
//       
//        //ordena de manera ascendente
//        for(int i=0; i< numeros.length-1; i++){
//            for(int j=i+1; j<numeros.length;i++){
//                if(numeros[i]>numeros[j]){
//                    numeros[i]= numeros[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numeros));
//        

        //crea un array que reciba por teclado un array de numeros y haga la suma 
        Scanner teclado = new Scanner(System.in);
//        int[] numeros1;
//        numeros1 = new int[3];
//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros1[i] = Integer.parseInt(teclado.nextLine());
//        }
//        System.out.println(Arrays.toString(numeros1));
//
//        //Dado un array de int indica cual es el elemento mas grande
//        int tamaño;
//        int[] numeros2;
//        System.out.println("Intica el tamaño del array: ");
//        tamaño = Integer.parseInt(teclado.nextLine());
//        numeros2 = new int[tamaño];
//        int numeroMasGrande;
//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros2[i] = Integer.parseInt(teclado.nextLine());
//
//        }
//        numeroMasGrande = numeros2[0];
//        for (int i = 0; i < numeros2.length; i++) {
//            if (numeroMasGrande < numeros2[i]) {
//                numeroMasGrande = numeros2[i];
//            }
//        }
//        System.out.println("De la cadena: " + Arrays.toString(numeros2) + " el numero mas grande es " + numeroMasGrande);
//        //recibe un elemento y calcula el promedio de los elementos
//        int[] numeros3;
//        int tamaño3;
//        System.out.println("Escribe el tamaño del array: ");
//        tamaño3 = Integer.parseInt(teclado.nextLine());
//        numeros3 = new int[tamaño3];
//        int suma = 0;
//        double promedio;
//        int contador = 0;
//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros3[i] = Integer.parseInt(teclado.nextLine());
//            suma += numeros3[i];
//            contador++;
//        }
//        promedio = (double) suma / (double) contador;
//        System.out.println("De la cadena: " + Arrays.toString(numeros3) + " elpromedio es " + promedio);
//        //ordena de manera ascendente
//        int[] numero4 = {9, 3, 6, 2, 5, 4, 1, 8, 7, 0};
//        for (int i = 0; i < numero4.length - 1; i++) {
//            for (int j = i + 1; j < numero4.length; j++) {
//                if (numero4[i] > numero4[j]) {
//                    numero4[i] = numero4[i] + numero4[j];
//                    numero4[j] = numero4[i] - numero4[j];
//                    numero4[i] = numero4[i] - numero4[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numero4));
//
//        int[] numero4b = {4, 3, 1, 7, 8, 2, 4, 6, 5, 9, 0};
//        Arrays.sort(numero4b);
//        System.out.println("Segunda cadena: " + Arrays.toString(numero4b));
//        //recibe un array y cuenta cuantas veces contiene un numero especifico
//        int[] numeros5 = new int[5];
//        int numeroABuscar;
//        int count = 0;
//        System.out.println("Que numero quieres buscar? ");
//        numeroABuscar = Integer.parseInt(teclado.nextLine());
//        for (int i = 0; i < numeros5.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros5[i] = Integer.parseInt(teclado.nextLine());
//            if (numeros5[i] == numeroABuscar) {
//                count++;
//            }
//        }
//        System.out.println("La cadena " + Arrays.toString(numeros5) + " contiene el numero intoducido " + count + " veces.");
//        //Crea un programa que busque un elemento en un array; si lo encuentra devuelve su indice y sino -1;
//        int[] numero6= {0,1,2,3,4,5,6,7,8,9};
//        int num;
//        System.out.println("Escribe el numero a buscar: ");
//        num = Integer.parseInt(teclado.nextLine());
//        boolean contiene=false;
//        for(int i=0; i<numero6.length; i++){
//            if(numero6[i]== num){
//                contiene=true;
//                System.out.println(i);
//                break;
//            }
//        }
//        if(contiene==false) System.out.println(-1);
//        //Escribe un programa que invierta un array de enteros
//        int[] numeros7={0,1,2,3,4,5,6,7,8,9};
//        int[] numeros7b= new int[numeros7.length];
//        for(int i= 0; i<numeros7b.length; i++){           
//            numeros7b[i]=numeros7[numeros7.length-1-i];
//        }
////        System.out.println("El array invertido es "+ Arrays.toString(numeros7b));
//        //programa que elimina un numero de un array de enteros y devuelve el nuevo array:
//        int[] numero8;
//        int[] numero8b;
//        int tamañoArray;
//        int numeroEliminar;
//        System.out.println("Escribe el tamaño del array: ");
//        tamañoArray = Integer.parseInt(teclado.nextLine());
//        numero8 = new int[tamañoArray];
//        System.out.println("Que numero vas a querer eliminar: ");
//        numeroEliminar = Integer.parseInt(teclado.nextLine());
//        int contEliminar = 0;
//        for (int i = 0; i < numero8.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numero8[i] = Integer.parseInt(teclado.nextLine());
//            if (numero8[i] == numeroEliminar) {
//                contEliminar++;
//            }
//        }
//        int tamaño8b = numero8.length - contEliminar;
//        numero8b = new int[tamaño8b];
//        int indice = 0;
//        for (int i = 0; i < numero8.length; i++) {
//            if (numero8[i] != numeroEliminar) {
//                numero8b[indice] = numero8[i];
//                indice++;
//            }
//        }
//
//        System.out.println("La cadena nueva eliminando el numero indicado es: " + Arrays.toString(numero8b));
        //verifica que un array esta ordenado ascendentemente
//
//        int[] numeros9;
//        int tamaño9;
//        boolean ascen = true;
//        System.out.println("Escribe el tamaño del array: ");
//        tamaño9 = Integer.parseInt(teclado.nextLine());
//        numeros9 = new int[tamaño9];
//        for (int i = 0; i < numeros9.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros9[i] = Integer.parseInt(teclado.nextLine());
//        }
//        for (int i = 0; i < numeros9.length - 1; i++) {
//            if (numeros9[i] > numeros9[i + 1]) {
//                ascen = false;
//            }
//        }
//        System.out.println("Esta ordenado ascendentemente " + ascen);

//        //TODO programa que rote a la derecha un array un numero especifico de veces
//        int[] numeros10;
//        int tamaño10;
//        int numeroRotacion;
//        System.out.println("Escribe el tamaño del array: ");
//        tamaño10 = Integer.parseInt(teclado.nextLine());
//        numeros10 = new int[tamaño10];
//        System.out.println("Escribe el numero de posiciones que quieres rotar el array a la derecha: ");
//        numeroRotacion = Integer.parseInt(teclado.nextLine());
//
//        for (int i = 0; i < numeros10.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros10[i] = Integer.parseInt(teclado.nextLine());
//        }
//        int[] numeros10b;
//        numeros10b = new int[numeros10.length];
//        int ind = numeroRotacion;
//        for (int i = 0; i < numeroRotacion; i++) {
//            numeros10b[i] = numeros10[numeros10.length - 1 - i];
//        }
//        int ind10 = 0;
//        for (int i = numeroRotacion; i < numeros10b.length; i++) {
//            numeros10b[i] = numeros10[ind10];
//            ind10++;
//        }
//
//        System.out.println(Arrays.toString(numeros10b));
        //escribe un programa que encuetre el segundo valor maximo en un array de enteros
//        int[] numeros11 = {1, 3, 2, 5, 4, 6, 7, 0, 8, 9};
//         int masalto=0;
//           int segunMasAlto=0;
//           if(numeros11[1]>numeros11[2]){
//               masalto=numeros11[1];
//               segunMasAlto=numeros11[2];
//           }else{
//               masalto=numeros11[2];
//               segunMasAlto=numeros11[1];
//           }
//
//        for (int i = 0; i < numeros11.length; i++) {
//            
//          if(numeros11[i]>masalto&&numeros11[i]>segunMasAlto){
//              segunMasAlto= masalto;
//              masalto= numeros11[i];
//          }else if(numeros11[i]>segunMasAlto){
//              segunMasAlto=numeros11[i];
//          }
//          
//           
//        }
//        System.out.println("El segundo mas altpo es " + segunMasAlto);
        //escribe un programa que verifique que doa arrays son iguales, que tengan los mismos elementos en 
        //la misma posicion
//        int[] numeros12 = {1, 23, 4, 5};
//        int[] numeros12b = {1, 2, 3, 4, 5};
//        System.out.println("Son iguales: " + Arrays.equals(numeros12, numeros12b)); //no func asi
////Crea un programa que mueva todos los ceros de un arrays al final, sin alterar el orden de los otros
//        int[] numeros13;
//        int tamaño13;
//        int count0 = 0;
//        System.out.println("escribe el tamaño del array: ");
//        tamaño13 = Integer.parseInt(teclado.nextLine());
//        numeros13 = new int[tamaño13];
//        for (int i = 0; i < numeros13.length; i++) {
//            System.out.println("Escribe un numero: ");
//            numeros13[i] = Integer.parseInt(teclado.nextLine());
//            if (numeros13[i] == 0) {
//                count0++;
//            }
//        }
//        System.out.println(count0);
//        int[] numero13b;
//        numero13b = new int[tamaño13];
//        int indice13 = 0;
//        for (int i = 0; i < numeros13.length; i++) {
//            if (numeros13[i] != 0) {
//                numero13b[indice13] = numeros13[i];
//                indice13++;
//            }
//        }
//        System.out.println(Arrays.toString(numero13b));
//        for (int i = numero13b.length+1 - count0; i < numero13b.length; i++) {
//            numero13b[i] = 0;
//        }
//        System.out.println(Arrays.toString(numero13b));
        //Dados dos arrays de enteros del mismo tamaño suma los elementos correspondiente de ambos arrays 
        //y guarda el resultado en un nuevo array
//        int[] numeros14a={1,2,3,4,5};
//        int[] numeros14b={7,5,6,9,8};
//        int[] numeros14c;
//        numeros14c=new int[numeros14a.length];
//        for(int i=0; i<numeros14a.length; i++){
//            numeros14c[i]=numeros14a[i]+numeros14b[i];
//        }
//        System.out.println(Arrays.toString(numeros14c));
        //Escribe un programa que determine si un array de enteros es un palindromo í
        //(el array es igual cuando se lee de izda a derecha o de derecha a izquierda)
        int[] numeros15;
        int tamaño15;
        boolean esPalindromo = true;
        System.out.println("Escribe el tamaño del array: ");
        tamaño15 = Integer.parseInt(teclado.nextLine());
        numeros15 = new int[tamaño15];

        for (int i = 0; i < numeros15.length; i++) {
            System.out.println("Escribe un numero: ");
            numeros15[i] = Integer.parseInt(teclado.nextLine());

        }

        for (int i = 0; i < numeros15.length; i++) {
            if (numeros15[i] != numeros15[numeros15.length - 1 - i]) {
                esPalindromo = false;
            }
        }
        System.out.println("Es palindromo: " + esPalindromo
        );
    }

}
