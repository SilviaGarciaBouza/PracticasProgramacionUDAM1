/* Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-22
 * Ejercicio: 
 *Realiza un programa en Java que calcule y muestre por pantalla el perímetro y el área de
un círculo. El valor del radio será de tipo double y asignamos nosotros uno cualquiera. El
valor de PI, lo definimos como una constante también de tipo double.
Área = pi * radio2
Perímetro = 2 * pi * radio.
 */
package sgbt01ampliacion;

public class SGBt01Ampliacione02 {

    public static void main(String[] args) {
        double radio = 3.3;
        final double PI = 3.14;
        double area, perimetro;
        
        try{
        area = PI*Math.pow(radio, 2);
        perimetro = 2*PI*radio;
        System.out.printf("El area de un circulo con radio %.2f es de: %.2f", radio, area);
        System.out.printf("\nEl perimetro de un circulo con radio %.2f es de : %.2f", radio, perimetro);
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: +e");
        }
    }
    
}
