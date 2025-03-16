/*
Programa una función, comprobarParentesis() para que recibe como entrada un String y
devuelve verdadero o falso. La función comprobará si hay tantos paréntesis de apertura como de
cierre. Si son iguales ambos números, devolverá true, en caso contrario, false.
Ejemplos de ejecución:
(6 + 4) * 2 → true
((6 * 3) → false
 */
package com.sgbt05boletinfunciones;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class E02ComprobarParentesis {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String fraseIntroducida;
        System.out.println("Escribe una frase para contar los parentesis introducidos: ");
        fraseIntroducida= teclado.nextLine();
        System.out.println(comprobarParentesis(fraseIntroducida));
        
        
    }
    
    static boolean comprobarParentesis (String fraseIntroducida){
        int contadorApertura=0;
        int contadorCierre=0;
        for(int i =0; i<fraseIntroducida.length(); i++){
            if(fraseIntroducida.charAt(i)=='('){
                contadorApertura++;
            }else if(fraseIntroducida.charAt(i)==')'){
                contadorCierre++;
            }
        }
        if(contadorApertura==contadorCierre){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
