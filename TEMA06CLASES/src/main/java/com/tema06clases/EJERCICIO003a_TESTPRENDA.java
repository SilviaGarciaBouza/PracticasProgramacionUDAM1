/*
Crea una prenda con cada constructor
Imprime el toString de cada una
 */
package com.tema06clases;

/**
 *
 * @author silvia
 */
public class EJERCICIO003a_TESTPRENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EJERCICIO003b_PRENDA prenda1= new EJERCICIO003b_PRENDA("jersey");
        EJERCICIO003b_PRENDA prenda2= new EJERCICIO003b_PRENDA("S", 'H', 3.3, 0.2, "pantalon");
        EJERCICIO003b_PRENDA prenda3= new EJERCICIO003b_PRENDA(3.3, "falda");
        System.out.println(prenda1.toString());
         System.out.println(prenda2.toString());
          System.out.println(prenda3.toString());
    }
    
}

  
    
    
 