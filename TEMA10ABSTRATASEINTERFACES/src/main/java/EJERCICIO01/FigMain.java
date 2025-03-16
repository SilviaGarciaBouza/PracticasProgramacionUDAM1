/*
• Haz un programa que almacene figuras de los tres tipos en un ArrayList y finalmente se recorra el
ArrayList con un for-each mostrando el precio de cada figura, suponiendo un precio de 10 euros el
metro cuadrado. 
 */
package EJERCICIO01;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class FigMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Figura2D> lista_figuras = new ArrayList<>();
        lista_figuras.add(new Triangulo("isosceles", 1.1f, 2.2f));
        lista_figuras.add(new TrianColor("violeta", "isosceles", 1.1f, 2.2f));
        lista_figuras.add(new Rectangulo(1.1f, 2.2f));
        for (Figura2D elemento : lista_figuras) {
            System.out.println("Precio: "+df.format(elemento.precio(10))+"€");
        }

    }

}
