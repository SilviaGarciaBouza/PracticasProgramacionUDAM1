/*
Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la recámara
pero solo una bala. Al empezar la partida se genera una posición al azar de la recámara para la bala
de forma que puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los jugadores irán
disparando sucesivamente hasta que uno de los dos se muera. Crea una clase Pistola con los
atributos y métodos que la definen. 
 */
package sgbt06e13ruletarusa;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Pistola {
    //atributos
    private int huecos=6;
    private int bala=1;
    private int huecoConBala;
    private boolean hayBala=false; 
private int huecoDisparado= 0;
    public boolean isHayBala() {
        return hayBala;
    }
    Random miRandom= new Random();

    //Al empezar la partida se genera una posición al azar de la recámara para la bala
    public Pistola() {
           
        this.huecoConBala= miRandom.nextInt(1,7);
       
    }
    public void disparo(){
        this.huecoDisparado+=1;
        if(huecoDisparado==this.huecoConBala){
            this.hayBala=true;
            System.out.println("Has muesto");
        }
        else{
            System.out.println("El disparo no lleva bala");
        }
    }
    
   
   
    
}
