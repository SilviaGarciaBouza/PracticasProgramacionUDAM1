/*
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

/**
 *
 * @author silvia
 */
public class USUARIO {

//  • Debe tener los atributos nombre y password (de tipo Password).
    private String nombre;
    private PASSWORD miContraseña;
    
    
    
//    • Un atributo estático usuarioCreado de tipo boolean para determinar si hay un usuario creado.
    
    static  boolean usuarioCreado= false;
//    • Tendrá un constructor que reciba los atributos nombre y password por parámetro.
      public USUARIO(String nombre, PASSWORD miContraseña) {
        this.nombre = nombre;
        this.miContraseña = miContraseña;
    } 
    
//    • Método get para nombre y contraseña.
      public String getNombre() {
        return nombre;
    }

    public PASSWORD getMiContraseña() {
        return miContraseña;
    }  
      
      
//    • Método toString para imprimir el nombre y la contraseña.

    @Override
    public String toString() {
        return "USUARIO{" + "nombre=" + nombre + ", miContrase\u00f1a=" + miContraseña + '}';
    }

  

 
    
}
