/*
Funciones recursivas
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
public static int factorial(int num){
 if(num == 0){
 return 1;
 }
 else
 return num * factorial(num-1);
 }
4. La multiplicación se puede programar de forma recursiva a través de la suma. Multiplicar un
número por otro es el mismo resultado que si sumamos el primer número a la multiplicación del
primer número por el anterior del otro, hasta llegar a que el otro número sea 1. Por ejemplo, 2 * 4 =
2 + 2 * 3.
Haz un programa donde se haga la multiplicación de manera recursiva.
IMPORTANTE: Si el primer número es menor que el segundo, podemos cambiarlos de orden para
que se hagan menos llamadas recursivas. Por ejemplo, 2 * 4 es igual a 4 * 2.
 */
package com.sgbt05boletinfunciones;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class E04MultiplicacionRecursiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Escribe un numero: ");
        numero1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe otro numero: ");
        numero2 = Integer.parseInt(teclado.nextLine());
        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;

       // System.out.println(multiplicacionRecursiva(numero1, numero2));

    }
/*
    static int multiplicacionRecursiva(int numero1, int numero2) {
       if(numero1>numero2){
        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;
       }

        
        if(numero1>=0&&numero2>=0){
        if (numero1 == 1) {
            return numero2;
        } 
        if (numero2 == 1) {
            return numero1;
        } 
        if (numero1 == 0 || numero2 == 0) {
           return 0;
        } 
        return numero1 +multiplicacionRecursiva(numero1, numero2-1);
    }else if(numero1<0&&numero2<0){
        
    }
    
}*/
    
}
