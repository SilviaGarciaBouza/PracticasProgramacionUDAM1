/*
A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que
se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades
como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el
saldo.
Las propiedades de un móvil prepago son:
- int numeroMovil (9 dígitos)
- float costeMinutoLlamada (euros, con dos decimales)
- float costeConsumoMB (euros, con dos decimales)
- float saldo (euros, con dos decimales)
Tiene un único constructor con la siguiente firma:
MovilPrepago(long nM, float cML, float cMB, float s)
Los métodos son:
- void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada
- void navegar(int MB) análogo a efectuar una llamada
- boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
- float consultarSaldo ()
Lo primero de debemos hacer es crear una instancia de un móvil (con el constructor) con
unos valores cualesquiera, por ejemplo:
 MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);
 y después llamar a los métodos y mostrar por pantalla el atributo saldo del móvil. 
 */

 /*
A partir de la clase MovilPrepago del ejercicio anterior, crea un programa en el que el usuario
dé de alta un teléfono con unas características determinadas y luego le permita mediante un menú
hacer operaciones como consultar saldo, recarga, hacer llamada, navegar. Se proporciona un
modelo (modeloMenu) a modo de esqueleto, con el menú y las funciones necesarias, en las que solo
tienes rellenar los huecos.
Es similar al anterior, primero creamos un móvil:
 MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);
O pidiéndole los datos al usuario. Luego ya el menú sobre ese móvil. 
 */
package com.tema06clases;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO01_MOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PARA EL EJERCICIO1
//         MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);
//         miMovil.consultarSaldo();
//         miMovil.navegar(4);
//           System.out.println(miMovil.consultarSaldo());
//         miMovil.recargar(5);
//           System.out.println(miMovil.consultarSaldo());
//         miMovil.recargar(3);
//           System.out.println(miMovil.consultarSaldo());
//         miMovil.efectuarllamada(0);
//         //if/else para que impriman aqui y no en la clase
//         miMovil.consultarSaldo();
//         System.out.println(miMovil.consultarSaldo());

//PARA EL EJERCICIO2:
        Scanner teclado = new Scanner(System.in);
        long numeroMovil;
        float costeMinutoLlamada;
        float costeConsumoMB;
        float saldo;
        int operacion;

        do {
            System.out.println("Indica el numero de telefono: ");
            numeroMovil = Integer.parseInt(teclado.nextLine());
        } while (Long.toString(numeroMovil).length() != 9);
        System.out.println("Indica el coste de la llamada: ");
        costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
        System.out.println("Indica el coste de la navegacion: ");
        costeConsumoMB = Float.parseFloat(teclado.nextLine());
        System.out.println("Indica el saldo: ");
        saldo = Float.parseFloat(teclado.nextLine());

        MovilPrepago mimovil = new MovilPrepago(numeroMovil, costeMinutoLlamada, costeConsumoMB, saldo);

        
        do{
        System.out.println("Que peracion quiere realizar?");
        System.out.println("1-CONSULTAR SALDO, 2-RECARGAR, 3-LLAMAR, 4-NAVEGAR, OTRO NUMERO-NAVEGAR");
        operacion = Integer.parseInt(teclado.nextLine());
        switch (operacion) {
            case 1 -> {
                System.out.println(mimovil.consultarSaldo());
            }
            case 2 -> {
                System.out.println("Cuanto quieres recargar?: ");
                int recargar = Integer.parseInt(teclado.nextLine());
                if (recargar % 5 == 0) {
                    System.out.println("recarga efectuada");
                    mimovil.recargar(recargar);
                } else {
                    System.out.println("Solo se pueden recargar cantidades multiplos de 5");
                }
            }
            case 3 -> {
                System.out.println("Cuantos segundos dura la llamada: ");
                int segundos= Integer.parseInt(teclado.nextLine());
                mimovil.efectuarllamada(segundos);
                
            }
            case 4 -> {
                System.out.println("cuantos megas navegas");
                int megas= Integer.parseInt(teclado.nextLine());
                mimovil.navegar(megas);
            }
            default -> {System.out.println("Has salido del programa");}

        }
        
        }while(operacion==1|| operacion==2 ||operacion==3||operacion==4);
        
        
        

    }

}

class MovilPrepago {

    /*
    - int numeroMovil (9 dígitos)
- float costeMinutoLlamada (euros, con dos decimales)
- float costeConsumoMB (euros, con dos decimales)
- float saldo (euros, con dos decimales)
     */
    private long numeroMovil;
    private float costeMinutoLlamada;
    private float costeConsumoMB;
    private float saldo;

    //MovilPrepago(long nM, float cML, float cMB, float s)
    public MovilPrepago(long numeroMovil, float costeMinutoLlamada, float costeConsumoMB, float saldo) {
        this.numeroMovil = numeroMovil;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
    }

    /*
    Los métodos son:
- void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada
- void navegar(int MB) análogo a efectuar una llamada
- boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
- float consultarSaldo ()
     */
    public void efectuarllamada(int Segundos) {
        float coste = this.costeMinutoLlamada * ((float) Segundos / 60.0f);

        if (saldo == 0) {
            System.out.println("No tiene saldo para efectuar llamadas");
        } else if (saldo < coste) {
            System.out.println("El coste es mayor a la llamada, se corta la llamada y el saldo es 0");
            this.saldo = 0;
        } else {
            System.out.println("Se efectua la llamada");
            this.saldo -= coste;
        }
    }

    public void navegar(int mb) {
        float coste = this.costeConsumoMB * (float) mb;

        if (saldo == 0) {
             System.out.println("No tiene saldo para navegar");
            this.saldo = 0;
        } else if (saldo < coste) {
             System.out.println("El coste es mayor a la navegacion, se corta la navegacion y el saldo es 0");
            this.saldo = 0;
        } else {
             System.out.println("Se efectua la navegacion ");
            this.saldo -= coste;
        }
    }

    boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    float consultarSaldo() {
        return this.saldo;
    }

}
