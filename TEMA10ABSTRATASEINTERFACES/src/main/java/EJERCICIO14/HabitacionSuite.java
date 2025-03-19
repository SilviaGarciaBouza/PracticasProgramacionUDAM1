/*
 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10 o más
días.
 */
package EJERCICIO14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author silvia
 */
public class HabitacionSuite extends Habitacion{
        public HabitacionSuite(int numeroHabitacion) {
        super(numeroHabitacion);
        
    }

    @Override
    public void calcularImporteTotal() {
        double precio=( ChronoUnit.DAYS.between(super.getFechaEntrada(), LocalDate.now())*200);
        if(ChronoUnit.DAYS.between(super.getFechaEntrada(), LocalDate.now())>=10){
            precio*=0.8;
        }
super.setPrecioTotalEstancia(precio);

    }
    
}
