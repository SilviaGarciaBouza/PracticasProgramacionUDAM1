/*
a) Prueba a crear instancias de hexágonos y pentágonos sobre variables de tipo PoligonoRegular
y comprueba mediante alguna calculadora online que calcula correctamente su área y
perímetro.
b) ¿Por qué PoligonoRegular es abstracta?
c) ¿El método área() podría ser no abstracto?
d) ¿Es posible crear una clase hija de PoligonoRegular sin desarrollar el método área() ?
e) ¿Puedo crear instancias de PoligonoRegular ?
f) ¿Por qué el método perímetro() no es abstracto si no se calcula igual para cada tipo de
polígono regular? (pentágono es lado por 5, hexágono es lado por 6, etc.)
g) ¿El siguiente código es correcto? Explica por qué funciona.
ArrayList <PoligonoRegular> listaPoligonos = new ArrayList <>();
 for (PoligonoRegular p : listaPoligonos)
 System.out.println(p.area());
h) Si no existiesen las clases abstractas y el método área() lo definiésemos en las clases hijas,
¿Funcionaría el código anterior? ¿Por qué? 
 */
package EJERCICIO00;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class PoligonoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            DecimalFormat df= new DecimalFormat("0.00");
//        a) Prueba a crear instancias de hexágonos y pentágonos sobre variables de tipo PoligonoRegular
            Poligonoregular hexgono1= new Hexagono(1.1);
            Poligonoregular pentagono1= new Pentagono(1.1);


//        y comprueba mediante alguna calculadora online que calcula correctamente su área y
//        perímetro.
            System.out.println("Area del exagono: "+df.format(hexgono1.area()));
            System.out.println("Perimetro del exagono: "+df.format(hexgono1.perimetro()));
            
            System.out.println("Area del pentagono: "+df.format(pentagono1.area()));
            System.out.println("Perimetro del pentagono: "+df.format(pentagono1.perimetro()));
//        b) ¿Por qué PoligonoRegular es abstracta? porque tene atributos y metodos abstratos, es decir que tienen que ser definidos por otras clases q extiendan de ella
//        c) ¿El método área() podría ser no abstracto? uno que estuviera definido y el de las que extienden de ella
//        d) ¿Es posible crear una clase hija de PoligonoRegular sin desarrollar el método área() ?no
//        e) ¿Puedo crear instancias de PoligonoRegular ? no, salvo q las definas como hexagono o poligono
//        f) ¿Por qué el método perímetro() no es abstracto si no se calcula igual para cada tipo de
//        polígono regular? (pentágono es lado por 5, hexágono es lado por 6, etc.) pq viene definido en PoligonoRegular
//        g) ¿El siguiente código es correcto? Explica por qué funciona.
       ArrayList <Poligonoregular> listaPoligonos = new ArrayList <>();
         for (Poligonoregular p : listaPoligonos)
         System.out.println(p.area());//si, si los elementos se defines como hexagonos y pentagonos
//        h) Si no existiesen las clases abstractas y el método área() lo definiésemos en las clases hijas,¿Funcionaría el código anterior? ¿Por qué? 
//no pq habria que hacer casting
        
    }
    
}
