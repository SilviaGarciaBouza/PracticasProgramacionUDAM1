/*
Diseña una clase llamada Ruleta y un programa que la use, con la siguiente funcionalidad.
- El jugador puede apostar lo que quiera a par o a impar .
- En cada juego obtiene un número al azar entre 0 y 36
- Si sale 0 pierde tanto par como impar, y en caso contrario si el jugador acierta (par o impar) gana tanto
como lo apostado.
Define los métodos necesarios para que los usuarios puedan apostar a par o impar. Hacer un
programa en el que un jugador lleve 10.000 euros y juegue 10.000 veces 1 euro cada vez siempre
apostando a par ¿Con cuánto dinero acaba? El resultado final puede ir entre 0 y 20.000 euros.
Ejecútalo varias veces. ¿Conclusiones sobre jugar a la ruleta? ;)
 */
package sgbt06e15ruleta;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Ruleta {
   
  private int dineroTotal;
    Random random= new Random();

    public Ruleta(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }
    public void tirada(int dineroApostar, boolean par){
        
         int numeroAzar;
        numeroAzar= random.nextInt(0, 37);
        if(numeroAzar==0){
            this.dineroTotal-=dineroApostar;
            System.out.println("Ha salido 0, pierdes el dinero apostado");
        }else if(numeroAzar%2==0){
            if(par==true){
                this.dineroTotal+=dineroApostar;
                System.out.println("Ha salido el numero "+numeroAzar+"es par, y apostaste par asi que ganas");
                
            }else{
                this.dineroTotal-=dineroApostar;
                System.out.println("Ha salido el numero "+numeroAzar+"es impar, y apostaste par asi que pierdes");
            }
        }else{
            if(par==true){
                this.dineroTotal-=dineroApostar;
                System.out.println("Ha salido el numero "+numeroAzar+"es par, y apostaste impar asi que pierdes");
                
            }else{
                this.dineroTotal+=dineroApostar;
                System.out.println("Ha salido el numero "+numeroAzar+"es impar, y apostaste impar asi que ganas");
            }
        }
    }
}
