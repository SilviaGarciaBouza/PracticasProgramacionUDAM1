/*
Haz un programa sencillo que cree instancias de Triangulo, TrianColor y Rectangulo y muestre su
perímetro. 
*/
package EJERCICIO07;

/**
 *
 * @author silvia
 */
public class PerimetrableMain {

    public static void main(String[] args) {
TrianguloEquilatero triangulo1= new TrianguloEquilatero("equilatero", 2, 3);
TrianColor triangulo2= new TrianColor("verde", "equilatero", 4, 2);
Rectangulo rectanulo1= new Rectangulo(4, 8);
        System.out.println(triangulo1.calcularPerimetro());
        System.out.println(triangulo2.calcularPerimetro());
        System.out.println(rectanulo1.calcularPerimetro());

    }
    
}
