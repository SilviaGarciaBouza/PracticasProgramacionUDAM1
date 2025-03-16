/*
Se dice que una función es recursiva cuando el cuerpo de la función utiliza a la propia función.
Dentro de una función recursiva suelen distinguirse dos partes:
- Los casos base: Son aquellos que para su solución no requieren utilizar la función que se está
definiendo.
- Los casos recursivos: Son aquellos que sí que requieren utilizar la función que se está definiendo.
Las definiciones recursivas funcionan siempre y cuando las llamadas recursivas se realicen de
forma que en algún momento se lleguen a los casos base.
Por ejemplo, el factorial de un número se puede calcular como ese número multiplicado por el
factorial del número anterior. Si tenemos que calcular 4! lo podemos hacer como 4 * 3!, este, a su
vez como 4 * 3 * 2! y, de nuevo, 4 * 3 * 2 * 1!; por definición 1! es 1, que es el llamado caso base.
Podemos programar en Java el factorial con la siguiente función recursiva.
Boletín 1 repaso: Java básico
Programación. Ejercicios de ampliación
Curso 2022/2023
public static int factorial(int num){
 if(num == 0){
 return 1;
 }
 else
 return num * factorial(num-1);
 }
 */
package com.boletin;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class FactorialRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido;
        System.out.println("Introduce un nuemro: ");
        numeroIntroducido = Integer.parseInt(teclado.nextLine());
        factorial(numeroIntroducido);
    }

    static int factorial(int numeroIntroducido) {
        if (numeroIntroducido == 0) {
            return 1;
        } else {
            return (numeroIntroducido * factorial(numeroIntroducido - 1));
        }

    }

}
