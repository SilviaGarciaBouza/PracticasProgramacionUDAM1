/*
Cuestiones previas:
a) if (cad.substring(0,2).equals(cad.substring(cad.length()-2,cad.length())))
b) b=false;
for (int i=0;i<= cad.length()-2;i++)
 if(cad.charAt(i)==cad.charAt(i+1)) b = true;
¿Por qué el bucle va hasta length()-2 en vez de hasta length(), o length()-1 ?
c) res = nom.toUpperCase().charAt(0) +"." + ape1.toUpperCase().charAt(0)+"." +
 ape2.toUpperCase().charAt(0) +".";*/

package com.mystrings;

/**
 *
 * a) condicion de si la subcadena que coge una subcadena de la cadena cad (desde la posicion 0 hasta la 1)  y la compara con la subcadena de la 
 * cadena cad desde la penultima hasta la ultima posicion.
 * 
 * b)compara los caracteres de la cadena.
 * Va hasta length -2 porque lo compara hasta length -1 que es el ultimo caracter de la cadena. De no ser asi se compararia con legth y eso no esta 
 * en la cadena
 * res es una cadena formada por el primer caracter de la primera cadena en mayusculas, un punto, el primer caracter de la segunda cadena en mayusculas
 * un punto y el primer caracter de la tercera cadena emn mayuscula y otro punto.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class CuestionesPrevias {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
