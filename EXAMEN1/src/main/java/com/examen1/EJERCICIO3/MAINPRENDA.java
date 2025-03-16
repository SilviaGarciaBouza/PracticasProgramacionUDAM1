/*
A partir de la clase prenda realizar los siguientes cambios:
a- crear un atributo stockPrendas de tipo long que se actualice sumando que se
actualice sumando uno cada vez ue se instancie la clase prrenda.
b- crea un atributo tipo  de tipo String que se establezca a null si el valor 
introducido en el constructor no coincide con alguno de los suguientes: "falda",
"pantalon","jersey":
c- Crea un atributo referencia que se establezca de forma automaticagenerando un 
numero aleatorio de 5 cufras cada vezq que se instancie la clase Prenda.
d- crea un atributo double precioConiva.
e-Modifica el metodo setPrecioConIva pARA que establezca el valor del atributo  
precioconiva a partir de los atributos iva y precioSinIva. Este metodo solo se 
podra llamar desde el contructor de la clase.
f- crea un constructor que reciva como parametros los atributos: 
tipo, talla, sexo, precioSinIva, e iva einicialice correctamente todos los atributos,
incluidos precioConIva.
Crea otro constructor que reciva como parametro tipo y precioSinIva, establezca el atributo
talla a 42 y el sexo a 'H' y el iva a 21.0 por defecto e inicialice correctamente el 
resto de atributos.
h-Crea el metodo toString que muestre todos los valores de todos losatributos de la clase.



i- En la clase ejecutable testPrenda:
. Crea un objeto prenda con cada uno de los constructores.
. Imprime los valores de cada objeto con el metodo toString.

 */
package com.examen1.EJERCICIO3;

/**
 *
 * @author silvia
 */
public class MAINPRENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Prenda prenda1= new Prenda(2.1, "jersey");
       Prenda prenda2 = new Prenda("S", 'H', 1.1, 0.2, "falda");
        System.out.println(prenda1.toString());
        System.out.println(prenda2.toString());
    }
    
}
