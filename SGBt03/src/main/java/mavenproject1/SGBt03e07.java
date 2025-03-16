/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave?
¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su
funcionalidad? */
package mavenproject1;

import java.util.Scanner;

public class SGBt03e07 {
//Devuelve los divisores del numero introducido entre los naturales 1 y 1000. Si el numero no esta en ese rango devuelve "Numero incorrecto"
 public static void main(String[] args) {
 int num;
 Scanner teclado = new Scanner(System.in);
 System.out.print("Introduce un número natural entre 1 y 1000: ");
 num = teclado.nextInt();
 if (num <=0 || num > 1000)//or, en lugar de && porque sino nunca entra en el if. Ademas aado el = a num<=0 porque el 0 tambiñé
 System.out.println("Numero incorrecto.");
 else{
         System.out.println(num);//imprime el numero y en el siguiente for recorre solo  hasta el numero/2
 for (int i=num/2;i>=1;i--)
     if (num % i == 0) System.out.println(i);
 } 
}
}