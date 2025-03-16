
package EJERCICIO07;

import java.text.DecimalFormat;

/**
Crea una interfaz llamada Perimetrable con un solo método llamado calcularPerimetro al que
no se le pasa ningún parámetro y devuelve un double con el perímetro de la clase que la implemente.
Copia las clases Figura2D, Triangulo, TrianColor y Rectangulo en su última versión (añade sufijo _v10)
y modifica la nueva Figura2D para que implemente Perimetrable.
- ¿Qué ocurre al añadir esta implementación? ¿Se produce algún error de compilación?
- ¿Por qué? ¿Hay alguna forma rápida de arreglar ese error?
- Modifica las clases necesarias para que calculen el perímetro correctamente (supón que los
triángulos son equiláteros para simplificar el cálculo)
Haz un programa sencillo que cree instancias de Triangulo, TrianColor y Rectangulo y muestre su
perímetro. 
 */
public interface Perimetrable {
    double calcularPerimetro();//devuelve perímetro de la clase que la implemente
}
abstract class Figura2D implements Perimetrable {
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
    
    //implementa metodo de la interfaz
    
    
    @Override
    abstract public double calcularPerimetro();
    
}










