/**
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: leer dos números enteros y muestre si el primero es mayor que el segundo. 
 */
package sgbt02;

import java.util.Scanner;


public class SGBt02e01b {

    public static void main(String[] args) {
        int numero1, numero2;
        Boolean primeroMayorSegundo;
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.print("Escribe un número entero: ");
            numero1= teclado.nextInt();
            System.out.print("Escribe otro número entero: ");
            numero2=teclado.nextInt();
            primeroMayorSegundo = numero1>numero2;
            
            System.out.printf("%d es mayor que %d: %b" ,numero1,numero2, primeroMayorSegundo);
        }catch(Exception e){
            System.out.println("Se ha producido un error: "+e);
        }
    }
    
}
