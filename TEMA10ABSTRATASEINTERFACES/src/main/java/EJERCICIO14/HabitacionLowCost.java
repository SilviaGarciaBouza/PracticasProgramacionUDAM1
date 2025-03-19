/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author silvia
 */
public class HabitacionLowCost extends Habitacion{

    public HabitacionLowCost(int numeroHabitacion) {
        super(numeroHabitacion);
        
    }

    @Override
    public void calcularImporteTotal() {
        double precio=( ChronoUnit.DAYS.between(super.getFechaEntrada(), LocalDate.now())*50);
super.setPrecioTotalEstancia(precio);

    }
    
}
