/*
Crea una nueva clase PoligonoIrregular (no es hija de Figura2D ni de ninguna otra clase) que
tiene como único atributo un ArrayList con la longitud de todos los lados del mismo. Haz que esta
clase implemente Perimetrable. Crea un programa sencillo con una instancia de PoligonoIrregular y
que calcule su perímetro. Añade al programa un ArrayList de figuras (PoligonoIrregular,
Rectangulo_v10, Triangulo_v10, Triancolo_v10) y que muestre el perímetro de todos ellos.
- ¿Tiene sentido que Perimetrable sea interfaz y no clase abstracta? ¿Por qué?
*/
package EJERCICIO08;

import EJERCICIO07.Perimetrable;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class PoligoniIrregular implements Perimetrable{
    ArrayList<Integer> listaLongitudLados= new ArrayList<>();

    
    

    public void añadirLado(int lado){
        listaLongitudLados.add(lado);
    }
    
    
    

    @Override
    public double calcularPerimetro() {
        int suma=0;
        for(int i=0; i<listaLongitudLados.size();i++){
           
           suma+=listaLongitudLados.get(i);
        }
        return suma;
    }
    
}
