/*
Clase ejecutable (En un fichero aparte):
    • Crea un menú con las opciones: crear usuario, eliminar usuario, mostrar usuario y salir.
    • Al elegir la opción crear usuario el programa debe pedir el nombre y a continuación debe permitir elegir entre introducir una contraseña o generarla de forma aleatoria. 
    • El programa debe validar si la contraseña introducida por el usuario es fuerte y volver a pedirla si no lo es.
    • El programa no debe permitir crear más de un usuario.
    • Si el usuario elige la opción de borrar usuario, el programa pedirá el nombre y la contraseña, si son válidos eliminará el usuario.
    • La opción mostrar usuario hará uso de los métodos toString.
 */
package com.examen2.EJERCICIO3;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MAINPASSWORDUSUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        String nombreUsuario="";
        int eleccionContrasena;
        String micontraseña="";
        int longitudContraseña;
        PASSWORD myPassword;
        USUARIO miUsuario;
        do {

//    • Crea un menú con las opciones: crear usuario, eliminar usuario, mostrar usuario y salir.
            do {
                System.out.println("Que quieres hacer?");
                System.out.println("1-crear usuario, 2-eliminar usuario, 3-mostrar usuario, 4-salir");
                eleccion = Integer.parseInt(teclado.nextLine());
                if (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4) {
                    System.out.println("La opcion elegida no es correcta");
                }
            } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);
            switch (eleccion) {
                //Al elegir la opción crear usuario el programa debe pedir el nombre y a continuación debe 
                //permitir elegir entre introducir una contraseña o generarla de forma aleatoria. 

                case 1 -> {
                    //    • El programa no debe permitir crear más de un usuario.
                    if (USUARIO.usuarioCreado == true) {
                        System.out.println("Ya hay un usuario creado");
                    } else {
                        System.out.println("Escribe tu nombre de usuario: ");
                        nombreUsuario = teclado.nextLine();
                        do {
                            System.out.println("Elige:");
                            System.out.println("1-Introducir contraseña, 2-Generar contraseña aleatoria");
                            eleccionContrasena = Integer.parseInt(teclado.nextLine());
                            if (eleccionContrasena != 1 && eleccionContrasena != 2) {
                                System.out.println("La opcion elegida no es correcta");
                            }
                            switch (eleccionContrasena) {
                                case 1 -> {
                                    do {
                                        System.out.println("Introduce la contraseña: ");
                                        micontraseña = teclado.nextLine();
                                        //El programa debe validar si la contraseña introducida por el usuario es fuerte y volver a pedirla si no lo es.  
                                        myPassword = new PASSWORD(micontraseña);
                                        if (myPassword.esFuerte(micontraseña) == false) {
                                            System.out.println("La contraseña no es fuerte");
                                        }
                                    } while (myPassword.esFuerte(micontraseña) == false);
                                }
                                default -> {
                                    System.out.println("Indica la congitud de la contraseña: ");
                                    longitudContraseña = Integer.parseInt(teclado.nextLine());
                                    myPassword = new PASSWORD(longitudContraseña);
                                    micontraseña= myPassword.getContraseña();
                                }
                            }
                        } while (eleccionContrasena != 1 && eleccionContrasena != 2);
                        miUsuario = new USUARIO(nombreUsuario, myPassword);
                        USUARIO.usuarioCreado = true;
                        System.out.println("Se ha creado el usuario correctamente");
                    }
                }

                case 2 -> {
                    //Si el usuario elige la opción de borrar usuario, el programa pedirá el nombre y la contraseña, 
                    //si son válidos eliminará el usuario.

                    if(USUARIO.usuarioCreado==false){
                        System.out.println("No hay usuario creado");
                    }else{
                        System.out.println("Indica el nombre del usuario: ");
                        String newUser= teclado.nextLine();
                        System.out.println("Indica la contraseña del usuario: ");
                        String newContrasena= teclado.nextLine();
                        
                        if(newContrasena.equals(micontraseña)&& newUser.equals(nombreUsuario)){
                            USUARIO.usuarioCreado=false;
                            System.out.println("Se ha borrado el usuario");
                        }else{
                            System.out.println("No se ha borrado porque los datos de nombre o contraseña no ha sido correcto");
                        }
                        
                    }

                    
                }
                case 3 -> {
                    //La opción mostrar usuario hará uso de los métodos toString.
                    if(USUARIO.usuarioCreado==true){
                    System.out.println(micontraseña);
                    }else{
                        System.out.println("No hay usuario creado");
                    }
                }
                default -> {
                }
            }

        } while (eleccion != 4);

        System.out.println("Has salido del programa!");

    }

}
