/*
Realizar una clase llamada Parking que gestione los coches aparcados en un parking mediante
un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y
caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir
(esta estructura se llama pila LIFO – Last Input, First Output ). La clase debe tener métodos siguientes:
a. Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas.
b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
c. Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a
desaparcar o bien una cadena vacía si el parking está vacío.
d. Mostrar la cantidad de plazas libres en ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la
información del parking correspondiente a los métodos creados (los métodos no deben escribir nada
por consola, eso lo hace el programa que usa la clase)
Además del array, la clase Parking necesita una variable adicional, que le indique la posición en la que
aparcará el siguiente coche. Inicialmente vale cero, al aparcar un coche se incrementa y al desaparcar
se decrementa. Si vale 20 no cabrán más coches.
Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven esto de forma
más sencilla, se verá en el tercer trimestre. 
 */
package com.arrays.parking;

/**
 *
 * @author silvia
 */
public class Ej06ARRAYParking {

    private String[] matriculas;//20 stack

    public Ej06ARRAYParking() {
        matriculas = new String[20];
    }

    public String[] muestraMatriculas() {
//        //matriculas en que plazas ocupadas
        return matriculas;
    }

    public int aparcar(String numeroMatricula) {
        int numeroPlaza = 0;
//        //Devuelve número de plaza o cero si lleno 1-20
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] == null) {//equal?
                matriculas[i]= numeroMatricula;
                numeroPlaza = i + 1;
                break;
            }
        }
        return numeroPlaza;

    }


    public String desaparcar() {
       
//        //Devuelve la matrícula del coche a desaparcar o bien una cadena vacía
        for (int i = matriculas.length - 1; i >= 0; i--) {
            if (matriculas[i] != null) {
               
                matriculas[i]=null;
                return matriculas[i];
            }
        }
        return " ";
    }

//    //Mostrar la cantidad de plazas libres en ese momento.
    public int plazasLibres() {
        int countPlazasLibres = 0;
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] == null) {
                countPlazasLibres++;
            }

        }
        return countPlazasLibres;
    }

    public String[] getMatriculas() {
        return matriculas;
    }

    

}

    
    
    