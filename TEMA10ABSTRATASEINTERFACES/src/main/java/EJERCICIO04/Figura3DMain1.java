/*
Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo _v2). Añádele a la
clase base el método abstracto superficie (). Crea una nueva clase Cilindro y haz que implemente los
métodos de la superclase. Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie. 
 */
package EJERCICIO04;

import EJERCICIO03.*;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class Figura3DMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura3D1> lista_figuras3d= new ArrayList<>();
        lista_figuras3d.add(new Esfera(1));
       
        lista_figuras3d.add(new Cilindro(1.1,2.2));
        lista_figuras3d.add(new PrismaRectangular(4,5,6));
        double mayor_sup= lista_figuras3d.get(0).superficie();
        int indice_mayor=0;
        int cont=0;
        for(Figura3D1 elemento: lista_figuras3d){
            if(elemento.superficie()>mayor_sup){
                mayor_sup= elemento.superficie();
                indice_mayor= cont;
            }
            cont++;
        }
        System.out.println("El mayor es: "+lista_figuras3d.get(indice_mayor));
    }
    
}
