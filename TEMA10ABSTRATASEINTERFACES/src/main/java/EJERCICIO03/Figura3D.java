/*
Diseña una clase abstracta llamada Figura3D_v1 con método abstracto volumen (). Crea
subclases: Esfera_v1 y PrismaRectangular_v1 que implementen el método de la superclase.
Incorpora los atributos que creas necesarios a las tres clases. Haz un programa que cree una
instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más. 
 */
package EJERCICIO03;

/**
 *
 * @author silvia
 */
abstract public class Figura3D {
//metodo abstrato
    abstract double volumen();

    @Override
    public String toString() {
        return "Figura3D{" + '}';
    }
    
}

class Esfera extends Figura3D{
private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double volumen() {
       return 4/3*Math.PI*Math.pow(radio, 3);
    }

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + '}';
    }
    
    
    
}

class PrismaRectangular extends Figura3D{
private double ancho;
private double lado;
private double altura;

    public PrismaRectangular(double ancho, double lado, double altura) {
        this.ancho = ancho;
        this.lado = lado;
        this.altura = altura;
    }

   

    @Override
    double volumen() {
        return this.altura*this.ancho*this.lado;
    }

    @Override
    public String toString() {
        return "PrismaRectangular{" + "ancho=" + ancho + ", lado=" + lado + ", altura=" + altura + '}';
    }
    
}