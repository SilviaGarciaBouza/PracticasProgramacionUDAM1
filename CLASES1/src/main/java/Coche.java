/*
Crea una clase Coche que represente coches. Ha de tener los siguientes atributos y
métodos:
● Atributos: marca, modelo, color, número de puertas, potencia, tipo combustible. Serán
todos private.
● Métodos:
○ 2 constructores: uno sin argumentos y otro con argumentos que inicialice todos los
atributos.
○ Métodos para asignar valores a los atributos (uno por cada atributo).
○ Métodos para devolver el contenido de los atributos (uno por cada atributo).
○ Un método que muestre en pantalla las características de un coche.
Para probar el funcionamiento de la clase Coche, crea una clase llamada TestCoche que
contenga un método main donde se creen 2 objetos a partir de la clase Coche. Ha de pedir
por teclado los datos necesarios para cada uno de ellos. Uno de los objetos se creará
usando el constructor que recibe los valores de todos los atributos; el otro objeto se creará
usando el constructor sin argumentos (los valores para sus atributos se asignarán con los
métodos específicos).
Finalmente, se han de mostrar en pantalla las características de los 2 coches.
A continuación se muestra un ejemplo de ejecución:
 */

/**
 *
 * @author silvia
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color; 
    private int numeroPuertas;
    private double potencia;
    private String tipoCombustibe;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numeroPuertas, double potencia, String tipoCombustibe) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.potencia = potencia;
        this.tipoCombustibe = tipoCombustibe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustibe() {
        return tipoCombustibe;
    }

    public void setTipoCombustibe(String tipoCombustibe) {
        this.tipoCombustibe = tipoCombustibe;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroPuertas=" + numeroPuertas + ", potencia=" + potencia + ", tipoCombustibe=" + tipoCombustibe + '}';
    }
    
    
}
