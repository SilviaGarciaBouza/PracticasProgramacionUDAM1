/*
Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo _v2). Añádele a la
clase base el método abstracto superficie (). Crea una nueva clase Cilindro y haz que implemente los
métodos de la superclase. Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie. 
 */
package EJERCICIO04;



/**
 *
 * @author silvia
 */
abstract public class Figura3D1 {
//metodo abstrato
    abstract double volumen();
    abstract double superficie();

    @Override
    public String toString() {
        return "Figura3D{" + '}';
    }
    
}

class Esfera extends Figura3D1{
private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }
//classes abstratas definidas
    @Override
    double volumen() {
        return 4/3*Math.PI*Math.pow(radio, 3);
    }
    
    
    

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + '}';
    }

    @Override
    double superficie() {
        return 4*Math.PI*Math.pow(radio, 2);
    }
    
    
    
}

class PrismaRectangular extends Figura3D1{
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

    @Override
    double superficie() {
        return 2*this.ancho*this.lado+2*this.altura*this.ancho+2*this.altura*this.lado;
    }
    
}

class Cilindro extends Figura3D1{
private double radio;

private double altura;

    public Cilindro(double radio,  double altura) {
        this.radio = radio;
        this.altura = altura;
    }

   

    @Override
    double volumen() {
        return this.altura*Math.PI*Math.pow(radio, 2);
    }

    

    @Override
    double superficie() {
        return 2*this.radio*this.altura*Math.PI+2*Math.pow(radio, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "radio=" + radio + ", altura=" + altura + '}';
    }
    
}