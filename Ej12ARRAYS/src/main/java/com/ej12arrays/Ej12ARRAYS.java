/*
Realizar un programa llamado hipotenusa al que se le pasen como parámetros dos valores,
verifique que son enteros positivos y que suponiendo que son los catetos de un ángulo recto, calcule
el valor de la hipotenusa. (se refiere a introducirlos en la llamada al programa, java prog param1
param2, sería algo así: java hipotenusa 4 2.
Para asignar parámetros a programas en Netbeans, clicamos botón derecho sobre el proyecto y, en
Propiedades del Proyecto, en la sección Ejecutar: comprobamos que la entrada ’clase main’ contiene
el nombre del paquete+programa de este ejercicio en concreto, y en ’argumentos’ ponemos separados
por espacios en blanco los argumentos. Para ejecutar pulsamos F6, o bien Ejecutar proyecto, pero
no May+F6 (Ejecutar archivo actual) como sí podemos hacer en otros casos.  */
package com.ej12arrays;

/**
 *
 * @author silvia
 */
public class Ej12ARRAYS {

    public static void main(String[] args) {

        // Validar que se hayan proporcionado dos argumentos
        if (args.length != 2) {
            System.out.println("El numero de argumentos es distinto de 2");
        }

        // Convertir los argumentos a enteros y validar que sean positivos
        int cateto1 = Integer.parseInt(args[0]);
        int cateto2 = Integer.parseInt(args[1]);
        double hipotenusa=0;
        if (cateto1 > 0 && cateto2 > 0) {
              // Calcular la hipotenusa 
               hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
           // hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            System.out.println(hipotenusa);
        }else{
            System.out.println("Los argumentos no son positivos");
        }

        // Mostrar el resultado
        System.out.println("La hipotenusa es: " + hipotenusa);

    }
}
