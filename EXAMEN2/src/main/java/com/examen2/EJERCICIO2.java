/*
Ejercicio 2 [3 puntos]: Cálculo de la distancia total entre los mínimos de dos cadenas numéricas:
A partir de dos cadenas de caracteres numéricos con la misma longitud, donde cada carácter representa un dígito del 0 al 9. Se requiere construir 
un programa que realice el siguiente proceso iterativo hasta que ambas cadenas están vacías:
    1. Encuentra el número más pequeño en la primera cadena.
    2. Encuentra el número más pequeño en la segunda cadena.
    3. Calcula la distancia absoluta entre ambos números.
    4. Suma esta distancia a una variable acumuladora.
    5. Elimina los números seleccionados de sus respectivas cadenas.
    6. Repite los pasos anteriores con los números restantes de las cadenas.
El programa debe imprimir los siguientes resultados para cada iteración:
    • El menor número seleccionado de la primera cadena.
    • El menor número seleccionado de la segunda cadena.
    • La distancia calculada entre ambos números.
Al finalizar, debe mostrar la distancia total acumulada.
Requisitos:
    • Las cadenas a procesar estarán almacenada en una variable del programa y no se pedirán al usuario.

    • Debes construir una función que calcule y devuelva el mínimo de una cadena recibida por parámetro y usar la función eliminarCaracter, 
que elimina la primera ocurrencia de un carácter en una cadena.

	private static String eliminarCaracter(String cadena, char caracter) {
    		int indice = cadena.indexOf(caracter);
    		if (indice == -1) {
        		return cadena;     		}
    			return cadena.substring(0, indice) + cadena.substring(indice + 1);
	}
 */
package com.examen2;

/**
 *
 * @author silvia
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1 = "123";
        String cadena2 = "947";
        int menorCadena1 = cadena1.charAt(0);
        int indicemenor1 = 0;
        int indiceMenor2 = 0;
        int menorCadena2 = cadena2.charAt(0);
        int acumulador = 0;
        StringBuilder micadena1 = new StringBuilder().append(cadena1);
        StringBuilder micadena2 = new StringBuilder().append(cadena2);

        do {

            menorCadena1 = cadena1.charAt(0);
            indicemenor1 = 0;
            indiceMenor2 = 0;
            menorCadena2 = cadena2.charAt(0);
            //Character.getNumericValue(digito)
            for (int i = 0; i < cadena1.length(); i++) {
                if (Character.getNumericValue(cadena1.charAt(i)) < menorCadena1) {
                    menorCadena1 = Character.getNumericValue(cadena1.charAt(i));
                    indicemenor1 = i;
                }
            }

            for (int i = 0; i < cadena2.length(); i++) {
                if (Character.getNumericValue(cadena2.charAt(i)) < menorCadena2) {
                    menorCadena2 = Character.getNumericValue(cadena2.charAt(i));
                    indiceMenor2 = i;
                }
            }

            acumulador = acumulador + Math.abs(menorCadena1 - menorCadena2);

            System.out.println("El numero menor de la cadena 1 es: " + menorCadena1);

            System.out.println("El numero menor de la cadena 2 es: " + menorCadena2);
            System.out.println("La distancia entre los numeros es: " + Math.abs(menorCadena1 - menorCadena2));

            System.out.println("El acumulador es: " + acumulador);

            micadena1.deleteCharAt(indicemenor1);
            micadena2.deleteCharAt(indiceMenor2);
            cadena1 = micadena1.toString();
            cadena2 = micadena2.toString();
        } while (cadena1.length() > 1);

        menorCadena1 = cadena1.charAt(0);
        indicemenor1 = 0;
        indiceMenor2 = 0;
        menorCadena2 = cadena2.charAt(0);
        //Character.getNumericValue(digito)
        for (int i = 0; i < cadena1.length(); i++) {
            if (Character.getNumericValue(cadena1.charAt(i)) < menorCadena1) {
                menorCadena1 = Character.getNumericValue(cadena1.charAt(i));
                indicemenor1 = i;
            }
        }

        for (int i = 0; i < cadena2.length(); i++) {
            if (Character.getNumericValue(cadena2.charAt(i)) < menorCadena2) {
                menorCadena2 = Character.getNumericValue(cadena2.charAt(i));
                indiceMenor2 = i;
            }
        }

        acumulador = acumulador + Math.abs(menorCadena1 - menorCadena2);

        System.out.println("El numero menor de la cadena 1 es: " + menorCadena1);

        System.out.println("El numero menor de la cadena 2 es: " + menorCadena2);
        System.out.println("La distancia entre los numeros es: " + Math.abs(menorCadena1 - menorCadena2));

        System.out.println("El acumulador es: " + acumulador);
    }

}
