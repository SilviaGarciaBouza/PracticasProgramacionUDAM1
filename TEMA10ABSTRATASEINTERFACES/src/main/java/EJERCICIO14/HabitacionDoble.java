/*
 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento
del 20% si el día de salida es abril, julio o agosto.
 */
package EJERCICIO14;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author silvia
 */
public class HabitacionDoble extends Habitacion{
    
    public HabitacionDoble(int numeroHabitacion) {
        super(numeroHabitacion);
        
    }

    @Override
    public void calcularImporteTotal() {
        double precio=( ChronoUnit.DAYS.between(super.getFechaEntrada(), LocalDate.now())*100);
        if(LocalDate.now().getMonthValue()==4||LocalDate.now().getMonthValue()==7||LocalDate.now().getMonthValue()==8){
            precio*=1.2;
        }
super.setPrecioTotalEstancia(precio);

    }
}
