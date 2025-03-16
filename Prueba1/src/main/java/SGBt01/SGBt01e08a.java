/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la
media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. ¿Sería
posible hacerlo con una sola variable?
 */

//Versión con 4 variables:
package SGBt01;

import java.util.Scanner;

public class SGBt01e08a {
    public static void main(String[] args) {
        Scanner miConsola = new Scanner(System.in);
        int edadPrimeraPersona, edadSegundaPersona, edadTerceraPersona, edadCuartaPersona;
        double edadMediaCuatroPersonas;
        try{
        System.out.print("Escribe la edad de la primera persona: ");
        edadPrimeraPersona = miConsola.nextInt();
        System.out.print("Escribe la edad de la segunda persona: ");
        edadSegundaPersona = miConsola.nextInt();
        System.out.print("Escribe la edad de la tercera persona: ");
        edadTerceraPersona = miConsola.nextInt();
        System.out.print("Escribe la edad de la cuarta persona: ");
        edadCuartaPersona = miConsola.nextInt();
        if(edadPrimeraPersona>=0 && edadSegundaPersona>=0 && edadTerceraPersona>=0 &&edadCuartaPersona>=0){
        edadMediaCuatroPersonas = ((double)edadPrimeraPersona + edadSegundaPersona+ edadTerceraPersona + edadCuartaPersona)/4.0;
        System.out.println("\nLa edad media de las cuatro personas es de: " + edadMediaCuatroPersonas);}
        else{
            System.out.println("\nSe ha producito un error: la edad de las personas debe ser mayor o igual a 0");
        }
        }
        catch(Exception e){
            System.out.println("\nSe ha producido un error: "+e);
        }
    }
    
}
