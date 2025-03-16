/*
Crea un programa sencillo con una instancia de PoligonoIrregular y
que calcule su perímetro. Añade al programa un ArrayList de figuras (PoligonoIrregular,
Rectangulo_v10, Triangulo_v10, Triancolo_v10) y que muestre el perímetro de todos ellos.
- ¿Tiene sentido que Perimetrable sea interfaz y no clase abstracta? ¿Por qué?
 */
package EJERCICIO08;

import EJERCICIO07.*;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class PoligonoIrregularMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //parte 1:Crea un programa sencillo con una instancia de PoligonoIrregular y
//que calcule su perímetro.
        PoligoniIrregular poligono1 = new PoligoniIrregular();
        poligono1.añadirLado(2);
        poligono1.añadirLado(2);
        poligono1.añadirLado(8);
        poligono1.añadirLado(1);
        poligono1.añadirLado(5);
        System.out.println(poligono1.calcularPerimetro());
        //parte 2:Añade al programa un ArrayList de figuras (PoligonoIrregular,
//Rectangulo_v10, Triangulo_v10, Triancolo_v10) y que muestre el perímetro de todos ellos.
//- ¿Tiene sentido que Perimetrable sea interfaz y no clase abstracta? ¿Por qué?
        ArrayList<Perimetrable> listaFiguras= new ArrayList<>();
        listaFiguras.add(poligono1);
        listaFiguras.add(new TrianguloEquilatero("Equilatero", 2, 2));
        listaFiguras.add(new TrianColor("azul","Equilatero", 2, 2));
        listaFiguras.add(new Rectangulo(3, 2));
        
        for(int i=0; i<listaFiguras.size();i++){
            System.out.println(listaFiguras.get(i).calcularPerimetro()); 
                
        }
        
        
    }

}
