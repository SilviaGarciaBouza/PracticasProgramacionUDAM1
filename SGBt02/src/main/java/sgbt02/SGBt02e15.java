/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-20
 * Ejercicio:haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números
int sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones que se muestran abajo.
Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores
y finalmente explica la diferencia de comportamiento entre cada una de las versiones:
• Versión a) if (b !=0 && a/b==0) {r = a/b; System.out.println(r);}
• Versión b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
• Versión c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras
dos como comentarios. Comentando unas y descomentando otra vas probando cada caso.
La explicación puedes ponerla en el propio código, al final, como comentarios. 

 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e15 {

    public static void main(String[] args) {

        int a, b;
        int r;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el divisor, que sea un número b entero distinto de 0: ");
        b = teclado.nextInt();
        System.out.print("Introduce un número a entero que al dividirlo entre b el resultado no sea 0: ");
        a = teclado.nextInt();

        /*a) Si el valor de b es 0 no muestra error poque estos operadores se evalúan en cortocircuito, por lo que no se evalúa el operando de la derecha(a / b == 0)
        si el resultado de la operación queda determinado por el operando de la izquierda(b != 0). Esto significa que si b es 0 ya no se evalúa a/b,
        por lo que el programa no muestra error de ejecución.*/
        if (b != 0 && a / b == 0) {
            r = a / b;
            System.out.println(r);
        } else {
            System.out.println("Alguno de los números introducidos no es correcto");
        }

        /*b) En este caso si b = 0 produce un error de ejecución porque primero comprueba a / b 
            
        if (a / b == 0 && b != 0) {
            r = a / b;
            System.out.println(r);
        }else {
            System.out.println("Alguno de los números introducidos no es correcto");
        }*/

 /*C) Al haber un solo & no se evalúa en cortocircuito, por lo que si b=0 produce error de ejecucion
        if (b != 0 & a / b == 0) {
            r = a / b;
            System.out.println(r);
        }else {
            System.out.println("Alguno de los números introducidos no es correcto");
        }*/
    }
}
