/*
Copia la última versión de las clases de los primeros ejercicios: Figura2D, Triangulo, TrianColor
y Rectangulo (añade sufijo _v9) y realiza los siguientes cambios:
• Crea un método abstracto llamado area () en Figura2D que ha de implementarse en las clases hijas.
• Crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que use el método
abstracto anterior.
• Verificar que las clases hijas implementan el método area (). ¿Qué ocurriría si no lo tuviesen
implementado?// tienen q implementarlo
• Haz un programa que almacene figuras de los tres tipos en un ArrayList y finalmente se recorra el
ArrayList con un for-each mostrando el precio de cada figura, suponiendo un precio de 10 euros el
metro cuadrado. 
 */
package EJERCICIO01;

import java.text.DecimalFormat;

/**
 *
 * @author silvia
 */
public abstract class Figura2D {
    //atributos
    private float alto;
    private float ancho;
    //constructor

    public Figura2D(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    //metodo
    public void verDim(){
        DecimalFormat df= new DecimalFormat("#.##");
        System.out.println("Alto: "+df.format(alto)+".\nAncho: "+df.format(ancho));
    }
    //metodo abstrato
    abstract double area();
    double precio(float precioMetroCuadrado){
        return area()*precioMetroCuadrado;
    }
    //get set

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
}

class Triangulo extends Figura2D{
    public String stilo;//isosceles, restangulos, equilatero....
    //constructor

    public Triangulo(String stilo, float alto, float ancho) {
        super(alto, ancho);
        this.stilo = stilo;
    }
    
   
    public void verEstilo(){
        System.out.println("Estilo: "+this.stilo);
    }

    //clase abstrata
    @Override
    double area() {
          return ((super.getAlto()*super.getAncho())/2f);
    }
    
}

 class TrianColor extends Triangulo{
    private String color;
    //constructor
    

    public TrianColor(String color, String stilo, float alto, float ancho) {
        super(stilo, alto, ancho);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
}

class Rectangulo extends Figura2D{

    public Rectangulo(float alto, float ancho) {
        super(alto, ancho);
    }

   


    public boolean escuadrado(){
        if(super.getAlto()==super.getAncho()){
            return true;
        }
        return false;
    }
    
    //clase abstrata
        @Override
    double area() {
          return ((super.getAlto()*super.getAncho()));
    }
}
