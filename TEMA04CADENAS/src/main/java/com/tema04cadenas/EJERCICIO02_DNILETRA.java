/*
Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en
dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla. Almacena las letras del NIF en una cadena.
RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
LETRA T R W A G M Y F P D X B N J Z S Q V H L C K E
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO02_DNILETRA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dni;
        char letra;
        String letraDni= "TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.println("Escribe tu numero de dni: ");
        dni = Integer.parseInt(teclado.nextLine());
        letra= letraDni.charAt(dni%23);
        System.out.println("La letra para el dni "+dni+ " es "+letra);

        
        //comprovando que introduces numeros:
        String dni2;
        int dni2numero;
        char letra2;
        String cadenaLetras2="TRWAGMYFPDXBNJZSQVHLCKE";
        boolean esNumeroelDni=true;
        
        do{
        System.out.println("Escribe tu numero de dni: ");
        dni2 = teclado.nextLine();
        for(int i=0; i< dni2.length(); i++){
            if (Character.isDigit(dni2.charAt(i))==false){
                esNumeroelDni=false;
                break;
            }
        }
        if(esNumeroelDni==false){
            System.out.println("El dni debe ser una cadena de numeros");
        }
        
        
        }while (esNumeroelDni==false) ;
        System.out.println();
        
        
        dni2numero= Integer.parseInt(dni2);
        System.out.println(cadenaLetras2.charAt(dni2numero%23));
            
        }
    
    }


