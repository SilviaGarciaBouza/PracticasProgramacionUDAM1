/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-19
 * Ejercicio: un sistema de ecuaciones lineales de la forma:

ax + by = c
dx + ey = f
puede resolverse utilizando las siguientes fórmulas:

Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f)
y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los
cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables
juntas, por ejemplo ‘ce’ quiere decir ‘c por e’.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e06 {

    public static void main(String[] args) {
        double coeficienteA, coeficienteB, coeficienteC, coeficienteD, coeficienteE, coeficienteF, valorX, valorY;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Escribe el valor del coeficiente a: ");
            coeficienteA = teclado.nextDouble();
            System.out.print("Escribe el valor del coeficiente b: ");
            coeficienteB = teclado.nextDouble();
            System.out.print("Escribe el valor del coeficiente c: ");
            coeficienteC = teclado.nextDouble();
            System.out.print("Escribe el valor del coeficiente d: ");
            coeficienteD = teclado.nextDouble();
            System.out.print("Escribe el valor del coeficiente e: ");
            coeficienteE = teclado.nextDouble();
            System.out.print("Escribe el valor del coeficiente f: ");
            coeficienteF = teclado.nextDouble();
            
            if (!(coeficienteA * coeficienteE - coeficienteB * coeficienteD == 0)) {
                valorX= coeficienteC*coeficienteE-coeficienteB*coeficienteF;
                valorY=coeficienteA*coeficienteF-coeficienteC*coeficienteD;
                System.out.println("x= "+valorX+" y="+valorY);
                        
            } else {
                //El algoritmo no funciona si el denominador es igual a 0
                System.out.println("No es posible resolver las formulas con esos valores");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }
    }

}
