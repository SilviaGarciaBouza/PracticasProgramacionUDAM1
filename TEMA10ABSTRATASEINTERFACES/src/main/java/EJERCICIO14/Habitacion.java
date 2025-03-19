/*
10.14. Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un
número de habitación y un proceso de check-in y check-out. En el hotel hay tres tipos de
habitaciones, aunque podría haber más en el futuro:
 3 habitaciones Lowcost (cuesta 50 euros/dia todo el año).
 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento
del 20% si el día de salida es abril, julio o agosto.
 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10 o más
días.
• El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como “no
ocupadas”.
• El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out
entre las ocupadas y listar habitaciones libres y ocupadas.
• El check-in es común para todas las habitaciones, consiste en marcar la habitación como
ocupada. El check-out consiste en marcar la habitación como libre y calcular el importe a
pagar que se calculará en función del tipo de habitación y de los días de estancia (quizás sea
necesario almacenar la fecha de llegada en el momento del check-in)
Cuestión 1: ¿Habitacion debería ser una clase abstracta o una interfaz? ¿Por qué? clase abstrata pq tiene atributos y metodos no abstratos
Cuestión 2: ¿Es útil que el método toString() en la clase Habitacion? 
- Mantener toda la información en las clases más que en el programa que las utiliza.
- Puedes crear una clase Hotel, que tendrá un ArrayList de Habitaciones, o bien definir ese
ArrayList en el programa como variable global y no tener la clase Hotel.
- Sugerencia: Para probar el programa, al hacer el check-out, puedes considerar cada día como
un segundo, así, si han pasado 3 segundos, considerar 3 días.
10.15. Haz una versión del ejercicio anterior pensando que el programa podría usarse para alquilar
otro tipo de elementos nuevos (no habitaciones, por ejemplo, coches) con unos atributos totalmente
distintos y con una forma de facturar distinta, pero el ArrayList debe poder contener cualquier tipo
de elemento y pero sus elementos deben tener el método de checkIn y checkOut implementado. 
 */
package EJERCICIO14;

import java.time.LocalDate;

/**
 *
 * @author silvia
 */
public abstract class Habitacion implements ElementoAlquilable{
    private int numeroHabitacion;
    private boolean estaOcupada;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double precioTotalEstancia=0;
    

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        estaOcupada= false;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
public abstract void calcularImporteTotal();
    
    
    
    @Override
    public void checkIn() {
estaOcupada=true;
    }

    @Override
    public void checkOut() {

estaOcupada=false;
calcularImporteTotal();
        System.out.println(precioTotalEstancia);

    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public double getPrecioTotalEstancia() {
        return precioTotalEstancia;
    }

    public void setPrecioTotalEstancia(double precioTotalEstancia) {
        this.precioTotalEstancia = precioTotalEstancia;
    }
    
    
    
}
