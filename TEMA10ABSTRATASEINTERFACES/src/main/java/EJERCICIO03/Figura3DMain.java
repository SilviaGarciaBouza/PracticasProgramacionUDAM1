/*
Diseña una clase abstracta llamada Figura3D_v1 con método abstracto volumen (). Crea
subclases: Esfera_v1 y PrismaRectangular_v1 que implementen el método de la superclase.
Incorpora los atributos que creas necesarios a las tres clases. Haz un programa que cree una
instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más. 
 */
package EJERCICIO03;

import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class Figura3DMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura3D> lista_figuras3d= new ArrayList<>();
        lista_figuras3d.add(new Esfera(1));
        lista_figuras3d.add(new Esfera(2));
        lista_figuras3d.add(new PrismaRectangular(1,2,3));
        lista_figuras3d.add(new PrismaRectangular(4,5,6));
        double mayor_volumen= lista_figuras3d.get(0).volumen();
        int indice_mayor=0;
        int cont=0;
        for(Figura3D elemento: lista_figuras3d){
            if(elemento.volumen()>mayor_volumen){
                mayor_volumen= elemento.volumen();
                indice_mayor= cont;
            }
            cont++;
        }
        System.out.println("El mayor es: "+lista_figuras3d.get(indice_mayor));
    }
    
}
