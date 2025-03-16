/*
Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la recámara
pero solo una bala. Al empezar la partida se genera una posición al azar de la recámara para la bala
de forma que puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los jugadores irán
disparando sucesivamente hasta que uno de los dos se muera. Crea una clase Pistola con los
atributos y métodos que la definen. 
 */
package sgbt06e13ruletarusa;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class RuletaRusa {
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Pistola pistola= new Pistola();
        char disparar;
        int numeroJugador=2;
        
        do{
            if(numeroJugador==1){
                numeroJugador=2;
            }else{
                numeroJugador=1;
            }
            
            System.out.println("Jugador numero "+numeroJugador);
        System.out.println("¿Quieres disparar (s/n)?");
        disparar= teclado.nextLine().charAt(0);
        if(disparar=='s'){
            pistola.disparo();
        }}while (pistola.isHayBala()==false);
        
    }
}
