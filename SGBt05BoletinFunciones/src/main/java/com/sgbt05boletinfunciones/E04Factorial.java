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
 */
package com.sgbt05boletinfunciones;

/**
 *
 * @author silvia.garciabouza
 */
public class E04Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
