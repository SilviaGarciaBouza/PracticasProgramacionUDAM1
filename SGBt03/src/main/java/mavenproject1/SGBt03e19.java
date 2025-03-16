/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Programa que se le introduzcan números por consola y que informe si están ordenados
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los
números no están ordenados.
Para cada número, puedo ver si es mayor que el anterior. En ese caso estarán
ordenados ascendentemente, en caso contrario no.  
 */
package mavenproject1;

import java.util.Scanner;


public class SGBt03e19 {

    public static void main(String[] args) {
        double numeroIntroducido, numeroAnterior;
        
        Scanner teclado = new Scanner(System.in);
        

        try {
            System.out.println("Introduce un numero (0 para finalizar): ");
            numeroIntroducido= teclado.nextDouble();
            do{
                numeroAnterior=numeroIntroducido;
                System.out.println("Introduce un numero (0 para finalizar): ");
                numeroIntroducido = teclado.nextDouble();
                
            
            }
            while (!(numeroIntroducido==0) && numeroIntroducido>=numeroAnterior) ;
            
            if((numeroIntroducido!=0) &&(numeroIntroducido<=numeroAnterior)){
                System.out.println("Los numeros no estan ordenados ascendentemente");
            }else{
                System.out.println("Los numeros si estan ordenados ascendentemente");
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
