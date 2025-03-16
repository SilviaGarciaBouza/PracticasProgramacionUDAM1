/*
Ejercicio 1 [3 puntos]:  Realiza un programa que reciba como entrada un informe que consiste en una cadena de caracteres numéricos llamados niveles, 
que representan las medidas de los sensores de un reactor nuclear. El programa debe comprobar que este informe es seguro. Un informe sólo es seguro 
si se cumplen las dos condiciones siguientes:

    • Los niveles aumentan o disminuyen de forma gradual. Es decir, todos los valores de la cadena deben estar en formato creciente o decreciente. 
    • Dos niveles adyacentes cualesquiera difieren al menos en una y como máximo en tres unidades.
Requisitos:
    • El programa pedirá la cadena numérica/informe al usuario.
    • La verificación de si el informe es seguro debe realizarse en una función a parte. 
    • No es necesario validar que la cadena introducida es correcta.
    • Pista: Usa las funciones Character.getNumericValue y Math.abs.

 */
package com.examen2;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        String niveles;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la cadena con los valores de los niveles: ");
        niveles = teclado.nextLine();
        System.out.println("Es segura la cadena: "+esSeguro(niveles));
    }

    static public boolean esSeguro(String niveles) {
        boolean esCreciente = true;
        boolean esDecreciente = true;

        boolean seguro = true;
        //Son digitos
        for (int i = 0; i < niveles.length(); i++) {
            if (Character.isDigit(niveles.charAt(i)) == false) {
                seguro = false;
                return seguro;
            }
        }
        //creciente
        for (int i = 0; i < niveles.length() - 1; i++) {
            if (niveles.charAt(i) > niveles.charAt(i + 1)) {
                esCreciente = false;
                break;
            }
        }
        //decreciente
        for (int i = 0; i < niveles.length() - 1; i++) {
            if (niveles.charAt(i) < niveles.charAt(i + 1)) {
                esDecreciente = false;
            }
        }
        //Es creciente o decreciente
        if (esCreciente == false && esDecreciente == false) {
            seguro = false;
            return seguro;
        }
        // Dos niveles adyacentes  difieren al menos en una y como máximo en tres unidades.
        if (esCreciente == true) {
            for (int i = 0; i < niveles.length() - 1; i++) {
                if((niveles.charAt(i+1)-niveles.charAt(i))<1||(niveles.charAt(i+1)-niveles.charAt(i))>3){
                    seguro=false;
                    return seguro;
                }
            }
        }
        
        if(esDecreciente==true){
            for(int i=0; i<niveles.length()-1; i++){
                if((niveles.charAt(i)-niveles.charAt(i+1))>3||(niveles.charAt(i)-niveles.charAt(i+1))<1){
                    seguro=false;
                    return seguro;
                }
            }
        }

        return seguro;
    }
}
