



package com.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 *
 * @author silvia
 */
public class BUSCARYYORDENAR {




    public static void main(String[] args) {
        int[] arrayIntroducido;
        int tamaño;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el tamaño del array: ");
        tamaño= Integer.parseInt(teclado.nextLine());
        int numeroBusqueda;
        arrayIntroducido = new int[tamaño];
        System.out.println("Introduce los numeros del array:");
        for(int i=0; i<tamaño;i++){
            int numero;
            System.out.println("Escribe un numero:");
            numero= Integer.parseInt(teclado.nextLine());
            arrayIntroducido[i]=numero;
        }
        
        System.out.println(Arrays.toString(arrayIntroducido));
        System.out.println(ordenar(arrayIntroducido));
        System.out.println("Introduce el numero a buscar: ");
        numeroBusqueda= Integer.parseInt(teclado.nextLine());
        System.out.println(buscar(ordenar(arrayIntroducido), numeroBusqueda));

    }

    static public ArrayList<Integer> ordenar(int[] arrayIntroducido) {
        ArrayList<Integer> nuevoArraynuevo = new ArrayList<>(arrayIntroducido.length);
        ArrayList<Integer> nuevoArraynuevo2 = new ArrayList<>(arrayIntroducido.length);
        //Paso el array a arraylist
        for (int i = 0; i < arrayIntroducido.length; i++) {
            nuevoArraynuevo.add(i, arrayIntroducido[i]);
        }
        //ordeno

        int contador = 0;

        while (nuevoArraynuevo.size()!=0) {
            int indiceBorrar = 0;
            int menor = nuevoArraynuevo.get(0);
            for (int i = 0; i < nuevoArraynuevo.size(); i++) {
                if (nuevoArraynuevo.get(i) <= menor) {
                    menor = nuevoArraynuevo.get(i);
                    indiceBorrar = i;
                    contador++;
                  

                }
            }
            nuevoArraynuevo2.add(menor);
            nuevoArraynuevo.remove(indiceBorrar);
        }
        return nuevoArraynuevo2;

    }

    
    static public boolean buscar(ArrayList<Integer> lista, int numerobuscar){
        
        boolean existe=false;
         int finaln= lista.size()-1;
        int inicio= 0;
        
        
        while (inicio<=finaln){
       
        int  centro = inicio + (finaln-inicio)/2;
        if(lista.get(centro)==numerobuscar){
            return true;
        }else if(lista.get(centro)>numerobuscar){
            finaln=centro-1;
            
        }else{
            inicio=centro+1;
        }
        
            }

       return existe;
    }



}  
