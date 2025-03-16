/*
Finalmente implementa la clase TestPunto que contenga el método main para probar el
funcionamiento de la anterior. Hará lo siguiente:
a) Creará 2 puntos: uno usando el constructor por omisión y el otro será inicializado con
las coordenadas (2,5).
b) Mostrará la distancia entre ambos puntos.
 */
package punto;

/**
 *
 * @author silvia.garciabouza
 */
public class PuntoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1= new Punto(0.0, 0.0);
        Punto punto2= new Punto(2.0, 5.0);
        
        System.out.println(punto1.calcularDistancia(punto2));
    }
    
}
