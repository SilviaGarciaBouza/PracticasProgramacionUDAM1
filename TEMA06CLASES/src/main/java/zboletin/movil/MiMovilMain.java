/*
Cree una instancia del MovilPrepago con el constructor programado en este ejercicio.

Haga dos llamadas, una de 2 minutos, otra de 5 minutos.

Navegue 500 MB

Muestre la autonomía que le queda y el saldo.



 */
package zboletin.movil;

/**
 *
 * @author silvia.garciabouza
 */
public class MiMovilMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//todo en una clase a parte o en la de movil prepago
//dif en hacerlo en una nueva o en esa
//long nM, float cEL, float cML, float cMB, float s, float autonomia
       MovilPrepago movilPrepago1=new MovilPrepago(500, 0.2f, 0.33f, 0.2f, 3, 50);
       movilPrepago1.efectuarLlamada(2*60);
       movilPrepago1.efectuarLlamada(5*60);
       movilPrepago1.navegar(500);
        System.out.println(movilPrepago1.getAutonomia()); 
    }
    
}
