/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: programa al que le introduzcas un número y que garantice que es positivo, es decir si lo
introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario
hasta que se introduzca uno positivo.
Cuando tenemos que hacer algo una o más veces, pero por lo menos una, el do…while puede ser
mejor opción que el while. 
   */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e13 {

    public static void main(String[] args) {
      double numero;
        
        Scanner teclado = new Scanner(System.in);

        try {
            do{
                System.out.println("Introduce un número positivo: ");
                numero=teclado.nextDouble();
                if(numero<=0){
                    System.out.println("El numero introducido no es positivo");
                }
                
            }while (numero<=0); 
            System.out.println("El número introducido es positivo");
           
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }

}

