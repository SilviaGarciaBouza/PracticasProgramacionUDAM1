/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 *Ejercicio: el siguiente programa pretende intercambiar dos variables enteras introducidas previamente,
y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código.
¿Sería posible intercambiar los valores de dos variables sin usar ninguna variable
adicional?
 */

package SGBt01e09;

import java.util.Scanner;


public class Ejercicios {

    public static void main(String[] args) {
        //Añadido el objeto teclado y la variable var3 para almacenar el valor de var1.
        Scanner teclado = new Scanner(System.in);
        int var1, var2, var3;
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("Ahora var1 es igual a var1");
        System.out.println("Ahora var2 es igual a var2");
        
        
        
        /*Sí es posible realizar sin variable adicional. 
        Se vuelven a dar los valores iniciales para realizar el ejercicio sin una variable adicional:
        */
        
        System.out.println("");
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
       
        var1 = var2 + var1;
        var2 = var1-var2;
        var1= var1 - var2;
        System.out.println("Ahora var1 es igual a var1");
        System.out.println("Ahora var2 es igual a var2");
        
        
    }
}
