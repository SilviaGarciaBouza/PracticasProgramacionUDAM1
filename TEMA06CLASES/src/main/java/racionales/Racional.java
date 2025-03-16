/*
Realiza una aplicación que permita trabajar con números racionales (números que tienen
un numerador y un denominador). Esto es útil porque muchos números no pueden ser
representados exactamente usando un número fraccionario. Por ejemplo, el número
racional 1/3 representado como un número fraccionario sería 0'333333, valor más fácil de
manipular pero a costa de perder precisión. Evidentemente 1/3 * 3 = 1, pero 0'333333 * 3 =
0'999999.
Crearemos entonces una clase llamada Racional para trabajar con números racionales.
Tendrá 2 atributos (ambos serán private):
● numerador, de tipo entero.
● denominador, de tipo entero.
Como métodos vamos a incluir, en principio, los siguientes:
● Un constructor sin parámetros que creará los objetos con el valor 1 tanto para el
numerador como para el denominador.
● Un método llamado asignarDatos, que recibirá 2 parámetros de tipo entero. Su
función es establecer unos valores determinados para el numerador y el
denominador (serán los 2 parámetros que recibe).
● Un método llamado visualizarRacional, que simplemente visualizará en pantalla el
número racional.
Una vez creada esta clase, comprueba su funcionamiento creando otra clase, TestRacional,
que contenga el método main y haga lo siguiente:
a) Crear un objeto de la clase Racional.
b) Visualizar el número racional creado.
c) Asignarle a ese número nuevos valores para el numerador y para el denominador.
d) Visualizar de nuevo el número.
A continuación se muestra un ejemplo de ejecución:
 */
package racionales;

/**
 *
 * @author silvia.garciabouza
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarRacional() {
        System.out.println(this.numerador + "/" + this.denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;

    }
//simplificar racional

    public void simplificarRacional() {
//        if (this.numerador < 0) {
//            this.numerador = Math.abs(numerador);
//            for (int i = 2; i < numerador; i++) {
//                while (numerador % i == 0 && denominador % i == 0) {
//                    this.numerador /= i;
//                    this.denominador /= i;
//                }
//
//            }
//            numerador *= -1;
//        } else {
//            for (int i = 2; i < numerador; i++) {
//                while (numerador % i == 0 && denominador % i == 0) {
//                    this.numerador /= i;
//                    this.denominador /= i;
//                }
//
//            }
//
//        }

        boolean signo = distinguirSignoNumerador();
        this.numerador = Math.abs(numerador);
        for (int i = 2; i < numerador; i++) {
            while (numerador % i == 0 && denominador % i == 0) {
                this.numerador /= i;
                this.denominador /= i;
            }

            if (signo == false) {
                this.numerador *= -1;
            }

        }

    }

    public boolean distinguirSignoNumerador() {
        if (this.numerador >= 0) {
            return true;
        } else {
            return false;
        }
    }

    static public Racional doubletoRacional(double myDouble, int precision) {
        int numeradorCreado = (int) (myDouble * Math.pow(10, precision));
        int denominadorCreado = (int) Math.pow(10, precision);
        Racional miRacional = new Racional(numeradorCreado, denominadorCreado);
        miRacional.simplificarRacional();
        return miRacional;

    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    static public Racional sumaRacionales(Racional racional1, Racional racional2) {
        Racional sumaRacional = new Racional();
        sumaRacional.numerador = (racional1.numerador * racional2.denominador) + (racional2.numerador * racional1.denominador);
        sumaRacional.denominador = (racional1.denominador * racional2.denominador);
        return sumaRacional;
    }

    static public Racional sumaRacionales(Racional racional1, int numeroEntero) {

        return sumaRacionales(racional1, intToRacional(numeroEntero));
    }

    public Racional sumaRacionales(int numeroEntero, Racional racional1) {

        return sumaRacionales(racional1, intToRacional(numeroEntero));
    }

    static public Racional intToRacional(int miNumeroEntero) {
        return new Racional(miNumeroEntero, 1);

    }

    //suma el objeto con otro que le introduces por parametro y cambia el valor
    public Racional SumaConotroRacional(Racional racional) {
        Racional miRacional = sumaRacionales(racional, this);
        this.numerador = miRacional.numerador;
        this.denominador = miRacional.denominador;
        return this;
    }

    static public Racional multiplicarRacionales(Racional racional1, Racional racional2) {
        return new Racional(racional1.numerador * racional2.numerador, racional1.denominador * racional2.denominador);
    }

    static public Racional dividirRacionales(Racional racional1, Racional racional2) {
        return new Racional(racional1.numerador * racional2.denominador, racional1.denominador * racional2.numerador);
    }

    static public boolean Equals(Racional racional1, Racional racional2) {
        return dividirRacionales(racional1, racional2) == new Racional(1, 1); 
          
        
    }

}
