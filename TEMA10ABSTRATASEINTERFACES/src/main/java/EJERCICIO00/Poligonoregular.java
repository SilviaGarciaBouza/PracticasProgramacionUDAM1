/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJERCICIO00;

/**
 *
 * @author silvia
 */
public abstract class Poligonoregular {
 double tamañoLado;
 abstract double area();
 abstract int getCantidadLados();
 double perimetro() { return getCantidadLados() * this.tamañoLado; }

 Poligonoregular (double tl) { this.tamañoLado = tl; }
}


class Pentagono extends Poligonoregular {
 Pentagono (double t ) {super (t); }

 @Override
 int getCantidadLados () {return 5;}

 @Override
 double area () { return 1.72048d * Math.pow(this.tamañoLado,2);
 }
}
class Hexagono extends Poligonoregular {
 Hexagono (double t ) {super (t); }

 @Override
 int getCantidadLados () {return 6;}

 @Override
 double area () {
 double lado = this.tamañoLado;
 double apotema = Math.sqrt((lado *lado)-((lado/2)*(lado/2)));
 return lado * apotema * 3;
 }
}