/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Sin ejecutarlo, intenta explicar que hace este programa.
public class Ejercicios {
 public static void main(String[] args) {
 int hora=0;
 for (int i=1;i<=7*24;i++) {
 System.out.println (hora);
 if (++hora > 23) hora=0;
 }
 } //fin main
} //fin clase  */
package mavenproject1;
//El programa imprime las horas del 0 a 23 de los 7 dias de la semana , es decir, imprime 7 veces los numeros del 0 al 23 (las horas de una semana).

public class SGBt03e15 {

    public static void main(String[] args) {
        int hora = 0;
        for (int i = 1; i <= 7 * 24; i++) {
            System.out.println(hora);
            if (++hora > 23) {
                hora = 0;
            }
        }
    } //fin main
} //fin clase 

