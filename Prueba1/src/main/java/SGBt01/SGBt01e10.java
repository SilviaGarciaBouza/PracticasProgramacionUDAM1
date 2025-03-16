/**
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-15
 * Ejercicio: programa al que se le introduzcan por consola las coordenadas X e Y de un punto del plano y
calcule el área del rectángulo que forma ese punto con el origen de los ejes de coordenadas (ojo:
pueden ser negativos):
 */
package SGBt01;

import java.util.Scanner;

public class SGBt01e10 {

 
    public static void main(String[] args) {
   
        double valorX, valorY, areaRectangulo;
        Scanner teclado = new Scanner(System.in);
        try{
        System.out.print("Escribe el valor X: ");
        valorX= Math.abs (teclado.nextDouble());
        System.out.print("Escribe el valor Y: ");
        valorY= Math.abs (teclado.nextDouble());
        areaRectangulo = valorX*valorY;
        System.out.println("Á'rea del rectángulo: " + areaRectangulo);
        }
        catch(Exception e){
            System.out.println("Se ha producido un error: "+e);
        }
    }
    
}
