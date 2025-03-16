/*
Implementa una clase llamada Punto que defina las coordenadas de un punto.
Atributos:
● x: representará la coordenada x del punto. De tipo double y privado.
● y: representará la coordenada y del punto. De tipo double y privado.
Métodos:
● 2 constructores: uno sin parámetros (por omisión) y otro con parámetros que permita
inicializar el punto con unas coordenadas determinadas.
● 2 métodos para obtener las coordenadas del punto: uno para obtener la coordenada x
y otro para obtener la coordenada y.
● Un método llamado calcularDistancia con la siguiente definición:
public double calcularDistancia(Punto p) { ... }
La función de este método es calcular la distancia a otro punto (al que recibe como
parámetro). Usa Math.sqrt(a) para hallar la raíz cuadrada de a.
Finalmente implementa la clase TestPunto que contenga el método main para probar el
funcionamiento de la anterior. Hará lo siguiente:
a) Creará 2 puntos: uno usando el constructor por omisión y el otro será inicializado con
las coordenadas (2,5).
b) Mostrará la distancia entre ambos puntos.
A continuación se muestra el resultado de la ejecución del programa:

 */
package punto;

/**
 *
 * @author silvia.garciabouza
 */
public class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }
    public double calcularDistancia(Punto p){
        return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
    }
}
