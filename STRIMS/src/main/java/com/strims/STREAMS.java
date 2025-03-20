/*
1. Filtrar y mapear una lista de números enteros
Dada una lista de números enteros, filtra los que sean pares, multiplícalos
por 2 y devuelve una nueva lista con los resultados.
static List<Integer> procesarNumeros(List<Integer> numeros) {...}
Ejemplo de entrada: List<Integer> numeros1 = List.of(1, 2, 3, 4, 5, 6);
Salida esperada: [4, 8, 12]

2. Suma de los cuadrados de los números impares
Dado un array de números enteros, calcula la suma de los cuadrados de los
números impares.
static int sumaCuadradosImpares(int[] numeros) {...}
Ejemplo de entrada: int[] numeros2 = {1, 2, 3, 4, 5};
Salida esperada: 35 // (1*1 + 3*3 + 5*5 = 1 + 9 + 25 = 35)

3. Calcular el promedio de una lista de números decimales
Dado un List<Double>, calcula el promedio de los valores contenidos en él,
retornando el resultado como un OptionalDouble (si la lista está vacía, el
resultado será NULL).
static OptionalDouble calcularPromedio(List<Double> numeros) {...}
Ejemplo de entrada: List<Double> numeros = List.of(10.5, 20.0, 30.5);
Salida esperada: OptionalDouble[20.333333333333332]

4. Concatenar cadenas de una lista con una coma
Dada una lista de String, genera una única cadena donde cada elemento
esté separado por una coma.
static String concatenarCadenas(List<String> palabras) {...}
Ejemplo de entrada: List<String> palabras = List.of("manzana",
"pera", "uva");
Salida esperada: "manzana, pera, uva"

5. Ejercicio de examen pero con Streams
Dada una List<Integer>, hacer un método que imprima por pantalla los
números que están repetidos, indicando el número de veces que se repiten.
static void numerosRepetidos(List<Integer> numeros) {...}
Ejemplo de entrada:
List<Integer> numeros = List.of(0, 0, 1, 1, 1, 2);
Salida esperada:
0 se repite 2 veces
1 se repite 3 veces

6. Gestión de Empleados
Dada la siguiente clase Empleado, que representa trabajadores con un
nombre, edad, salario y departamento:
class Empleado {
private String nombre;
private int edad;
private double salario;
private String departamento;
public Empleado(String nombre, int edad, double salario,
String departamento) {
this.nombre = nombre;
this.edad = edad;
this.salario = salario;
this.departamento = departamento;
}
public String getNombre() {return nombre;}
public int getEdad() {return edad;}
public double getSalario() {return salario;}
public String getDepartamento() {return departamento;}
@Override
public String toString() {
return nombre + " (" + edad + " años, " + departamento +
", " + salario + "€)";
}
}

Implementa los siguientes métodos usando Streams:
a) Obtener la lista de empleados con salario superior a un umbral dado,
ordenados de mayor a menor salario.
b) Agrupar los empleados por departamento y devolver un Map<String,
List<Empleado>>.
c) Calcular el salario promedio de los empleados mayores de una edad
determinada.
Ejemplo de entrada:
List<Empleado> lista = List.of(
new Empleado("Juan", 25, 2500.0, "Ventas"),
new Empleado("Ana", 32, 3200.0, "IT"),
new Empleado("Pedro", 45, 5000.0, "IT"),
new Empleado("Marta", 29, 2700.0, "Ventas"),
new Empleado("Luis", 38, 4000.0, "Recursos Humanos")
);
Salida esperada:
empleadosConSalarioMayorA(lista, 3000);
// [Pedro (45 años, IT, 5000.0€), Luis (38 años, Recursos
Humanos, 4000.0€), Ana (32 años, IT, 3200.0€)]
agruparPorDepartamento(lista);
// {Ventas=[Juan, Marta], IT=[Ana, Pedro], Recursos
Humanos=[Luis]}
salarioPromedioMayoresDe(lista, 30);
// OptionalDouble[4066.6666666666665]
// (3200 + 5000 + 4000) / 3
 */
package com.strims;

import com.sun.jdi.DoubleValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

import java.util.stream.Collectors;

/**
 *
 * @author silvia
 */
public class STREAMS {

    public static void main(String[] args) {
        //EJ1
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(imprimirNewList(listaNumeros));
        //EJ2
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(imprimirInt(numeros));
        //EJ3
        List<Double> listaDoubles = List.of(10.5, 20.0, 30.5);
        System.out.println(imprimirPromedio(listaDoubles));
        //EJ4
        List<String> palabras = List.of("manzana",
                "pera", "uva");
        System.out.println(imprimirCadenaUnica(palabras));
        //EJ5
        List<Integer> listaEnteros = List.of(0, 0, 1, 1, 1, 2);
        imprimirRepetidos(listaEnteros);
        //EJ6

    }

    //EJ1
    static public List<Integer> imprimirNewList(List<Integer> listaNumeros) {
        return listaNumeros.stream()
                .filter(n -> n % 2 == 0)
                .map(m -> m * 2)
                .collect(Collectors.toList());
    }

    //EJ2
    static public int imprimirInt(int[] numeros) {
        return Arrays.stream(numeros)
                .filter(n -> n % 2 != 0)
                .map(m -> m * m)
                .sum();
    }

    //EJ3
    static public OptionalDouble imprimirPromedio(List<Double> listaDoubles) {
        return listaDoubles.stream()
                .mapToDouble(d -> d.doubleValue())
                .average();
    }

    //EJ4
    static public String imprimirCadenaUnica(List<String> palabras) {
        return palabras.stream()
                .collect(Collectors.joining(", "));
    }

    //EJ5
    static public void imprimirRepetidos(List<Integer> listaEnteros) {
        listaEnteros.stream()
                .distinct()
                .filter(n -> Collections.frequency(listaEnteros, n) > 1)
                .forEach(n -> System.out.println(n + " se repite " + Collections.frequency(listaEnteros, n) + " veces"));
    }

    //EJ6
    static public List<Empleado> filtarPorSalario(List<Empleado> listaEmpleados, double salarioUmbral) {
        return listaEmpleados.stream()
                .filter(n -> n.getSalario() > salarioUmbral)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .toList();
    
    }
    
    static public Map<String,List<Empleado>> agruparPorDepartamento(List<Empleado> listaEmpleados){
        listaEmpleados.stream()
                .map(n->n.getDepartamento()+n)
                .;
    }

}

//EJ6
class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado(String nombre, int edad, double salario,
            String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + departamento
                + ", " + salario + "€)";
    }
}
