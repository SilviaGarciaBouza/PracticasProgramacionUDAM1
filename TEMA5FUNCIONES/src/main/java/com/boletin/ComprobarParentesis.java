/*
Programa una función, comprobarParentesis() para que recibe como entrada un String y
devuelve verdadero o falso. La función comprobará si hay tantos paréntesis de apertura como de
cierre. Si son iguales ambos números, devolverá true, en caso contrario, false.
Ejemplos de ejecución:
(6 + 4) * 2 → true
((6 * 3) → false
 */
package com.boletin;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class ComprobarParentesis {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaIntroducida;
        System.out.println("Introduce una cadena de caracteres: ");
        cadenaIntroducida= teclado.nextLine();
        System.out.println(comprobasParentesis(cadenaIntroducida));

    }
    
    static boolean comprobasParentesis(String miCadena){
        int contadorApertura=0;
        int contadorCierre=0;
        for(int i = 0; i<miCadena.length(); i++){
            if(miCadena.charAt(i)=='('){
                contadorApertura++;
            }
            else if(miCadena.charAt(i)==')'){
                contadorCierre++;
            }
        }
        
        return contadorApertura==contadorCierre;
    

}
}
/*
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

*/