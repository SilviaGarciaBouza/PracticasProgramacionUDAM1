/*
4.13. (Opcional) Realizar un programa al que se le introduzca un número decimal y lo convierta a
un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las
clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de
decimal a hexadecimal.
Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes
obtenidos hasta que el cociente sea cero. El número será la concatenación de restos,
convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B…15->F
 */
package com.tema04cadenas;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO13_DECIMALAHEXADECIMAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDecimal;
        StringBuilder hexa= new StringBuilder();
        //en ej 16 compruebo que sean numeros       
        System.out.println("Introduce un numero decimal: ");
        numeroDecimal = Integer.parseInt(teclado.nextLine());

        while (numeroDecimal > 1) {
            switch (numeroDecimal % 16) {
                case 1 ->
                    hexa.append(1);
                case 2 ->
                    hexa.append(2);
                case 3 ->
                    hexa.append(3);
                case 4 ->
                    hexa.append(4);
                case 5 ->
                    hexa.append(5);
                case 6 ->
                    hexa.append(6);
                case 7 ->
                    hexa.append(7);
                case 8 ->
                    hexa.append(8);
                case 9 ->
                    hexa.append(9);
                case 10 ->
                    hexa.append('a');
                case 11 ->
                    hexa.append('b');
                case 12 ->
                    hexa.append('c');
                case 13 ->
                    hexa.append('d');
                case 14 ->
                    hexa.append('e');
                case 15 ->
                    hexa.append('f');
            }
            
            numeroDecimal/=16;
        }
        hexa.reverse();
        
        System.out.println(hexa);

    }

}
