
import java.util.ArrayList;
import java.util.Collections;

/*
 Ejercicio 2 [3 puntos]: Cálculo de la distancia total entre los mínimos de dos cadenas numéricas:
A partir de dos cadenas de caracteres numéricos con la misma longitud, donde cada carácter representa un dígito del 0 al 9. 
Se requiere construir un programa que realice el siguiente proceso iterativo hasta que ambas cadenas están vacías:
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
/**
 *
 * @author silvia
 */
public class Examen3ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> cadena1 = new ArrayList<>();
        cadena1.add(1);
        cadena1.add(19);
        cadena1.add(91);
        cadena1.add(56);
        ArrayList<Integer> cadena2 = new ArrayList<>();
        cadena2.add(11);
        cadena2.add(39);
        cadena2.add(121);
        cadena2.add(96);
        //  ArrayList<Integer> distancia = new ArrayList<>();
        int suma = 0;
        if (cadena1.size() == cadena2.size()) {
            while (!cadena1.isEmpty() || !cadena2.isEmpty()) {

                int min1 = Collections.min(cadena1);
                int min2 = Collections.min(cadena2);
                int distancia = (Math.abs(min1 - min2));
                suma += distancia;
                cadena1.remove(cadena1.indexOf(min1));
                cadena2.remove(cadena2.indexOf(min2));
                System.out.println("El menor número seleccionado de la primera cadena: " + min1);
                System.out.println("El menor número seleccionado de la segunada cadena: " + min2);
                System.out.println("La distancia calculada entre ambos números: " + distancia);

            }
            System.out.println("Distancia acumulada: "+suma);
        }

    }

//    static public void busquedaMaspequeños(ArrayList<Integer> cadena1 ,ArrayList<Integer> cadena2 ,ArrayList<Integer> distancia ){
//       int menor1= cadena1.get(0);
//       int indice1=0;
//       int menor2= cadena2.get(0);
//       int indice2=0;
//        for(int i=0; i<cadena1.size();i++){
//            if(cadena1.get(i)<menor1){
//                menor1= cadena1.get(i);
//                indice1=i;
//            }
//        }
//        
//        for(int i=0; i<cadena2.size();i++){
//            if(cadena2.get(i)<menor2){
//                menor2= cadena2.get(i);
//                indice2=i;
//            }
//        }
//        
//        distancia.add(Math.abs(menor2-menor1));
//        cadena1.remove(indice1);
//        cadena2.remove(indice2);
//        
//    }
}
