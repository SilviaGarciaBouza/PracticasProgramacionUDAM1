/*
Ejercicio 3 [4 puntos]: Programa una clase llamada Password que cumpla los siguientes requisitos:
    • Debe tener dos atributos, longitud y contraseña.
    • Debe implementar los siguientes constructores:
        ◦ Un constructor vacío.
        ◦ Un constructor con la longitud por parámetro. Generará una contraseña aleatoria con esa longitud.
        ◦ Un constructor que recibe la contraseña por parámetro.
    • Los métodos que implementa serán:
        ◦ Método get para contraseña, longitud.
        ◦ Método toString para mostrar el atributo contraseña.
        ◦ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 2 minúsculas y mas de 3 números.
        ◦ generarPassword(): genera la contraseña del objeto con la longitud que se le haya pasado como parámetro. 
Ejemplo de cómo generar una letra mayúscula de forma aleatoria usando la clase Random:
// Generar un número aleatorio entre 0 y 25 (correspondiente a 'A' - 'Z') 
int numeroAleatorio = random.nextInt(26); 
// Obtener la letra mayúscula sumando el número aleatorio al valor de 'A' 
char letraMayuscula = (char) ('A' + numeroAleatorio);
Programa otra clase llamada Usuario que cumpla las siguientes condiciones:
    • Debe tener los atributos nombre y password (de tipo Password).
    • Un atributo estático usuarioCreado de tipo boolean para determinar si hay un usuario creado.
    • Tendrá un constructor que reciba los atributos nombre y password por parámetro.
    • Método get para nombre y contraseña.
    • Método toString para imprimir el nombre y la contraseña.
Clase ejecutable (En un fichero aparte):
    • Crea un menú con las opciones: crear usuario, eliminar usuario, mostrar usuario y salir.
    • Al elegir la opción crear usuario el programa debe pedir el nombre y a continuación debe permitir elegir entre introducir una contraseña o generarla de forma aleatoria. 
    • El programa debe validar si la contraseña introducida por el usuario es fuerte y volver a pedirla si no lo es.
    • El programa no debe permitir crear más de un usuario.
    • Si el usuario elige la opción de borrar usuario, el programa pedirá el nombre y la contraseña, si son válidos eliminará el usuario.
    • La opción mostrar usuario hará uso de los métodos toString.

 */
package com.examen2.EJERCICIO3;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class PASSWORD {

//    • Debe tener dos atributos, longitud y contraseña.
    private int longitud;
    private String contraseña;
    private String secuenciaLetras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

//    • Debe implementar los siguientes constructores:
//        ◦ Un constructor vacío.
    public PASSWORD() {
    }

//        ◦ Un constructor con la longitud por parámetro. Generará una contraseña aleatoria con esa longitud.
    public PASSWORD(int longitud) {
        Random random = new Random();
        char caracter;
        this.longitud = longitud;
        for (int i = 0; i < longitud; i++) {
            caracter = secuenciaLetras.charAt(random.nextInt(0, secuenciaLetras.length()));
            this.contraseña = contraseña + caracter;
        }
    }

//        ◦ Un constructor que recibe la contraseña por parámetro.
    public PASSWORD(String contraseña) {
        this.contraseña = contraseña;
    }

//    • Los métodos que implementa serán:
//        ◦ Método get para contraseña, longitud.
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

//        ◦ Método toString para mostrar el atributo contraseña.
    @Override
    public String toString() {
        return "La contraseña es" + contraseña;
    }
//        ◦ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
    //mas de 2 minúsculas y mas de 3 números.

    public boolean esFuerte(String contraseña) {
        int contadorMay = 0;
        int contadorMin = 0;
        int contDigito = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                contDigito++;
            }
            if (Character.isLowerCase(contraseña.charAt(i))) {
                contadorMin++;
            }
            if (Character.isUpperCase(contraseña.charAt(i))) {
                contadorMay++;
            }
        }
        if (contDigito > 3 && contadorMay > 2 && contadorMin > 2) {
            return true;
        } else {
            return false;
        }

    }

//        ◦ generarPassword(): genera la contraseña del objeto con la longitud que se le haya pasado como parámetro. 
//Ejemplo de cómo generar una letra mayúscula de forma aleatoria usando la clase Random:
//// Generar un número aleatorio entre 0 y 25 (correspondiente a 'A' - 'Z') 
//int numeroAleatorio = random.nextInt(26); 
//// Obtener la letra mayúscula sumando el número aleatorio al valor de 'A' 
//char letraMayuscula = (char) ('A' + numeroAleatorio);
}
