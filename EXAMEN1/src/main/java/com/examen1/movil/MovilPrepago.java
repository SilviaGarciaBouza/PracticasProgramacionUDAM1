/*
A partir de la clase MovilPrepago hacer los siguientes cambios.

- Introducir un atributo privado llamado autonomia, de tipo float, con valor inicial 50. Este atributo representa el nivel de carga de batería del móvil, en tanto por cien.

- (0’25 puntos) Crear un nuevo constructor, a mayores del existente, donde se utilicen todos los atributos como parámetros.

- (0’25 puntos) Crear los métodos get y set para el atributo autonomia.

- (0’75 puntos) Modificar los métodos de:

modificarllamada(int segundos) para que:

si la autonomía no supera el 5 por ciento, no permita hacer la llamada, mostrando un mensaje de “Batería insuficiente para llamar”

por cada minuto (o parte proporcional) le reste un uno por cien de la batería.

navegar(int mb) para que

si la autonomía no supera el 5 por ciento, no permita navegar mostrando un mensaje de “Batería insuficiente para navegar”

por cada 100 MB (o parte proporcional) le reste un uno por cien de la batería.

recargar(int importe) para que

establezca la autonomía a 100, independientemente del saldo que se le introduzca.

(0’5 puntos) Haz un programa que:

Cree una instancia del MovilPrepago con el constructor programado en este ejercicio.

Haga dos llamadas, una de 2 minutos, otra de 5 minutos.

Navegue 500 MB

Muestre la autonomía que le queda y el saldo.
 */
package com.examen1.movil;

/**
 *
 * @author silvia
 */
public class MovilPrepago {

    public long numeroMovil;
    final private float costeEstablecLlamada;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;
    //Introducir un atributo privado llamado autonomia, de tipo float, con valor inicial 50. Este atributo representa el nivel de carga de batería del móvil, en tanto por cien.
    private float autonomia = 50;

    MovilPrepago(long nM, float cEL, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeEstablecLlamada = cEL;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    //Crear un nuevo constructor, a mayores del existente, donde se utilicen todos los atributos como parámetros.
    public MovilPrepago(long numeroMovil, float costeEstablecLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo, float autonomia) {
        this.numeroMovil = numeroMovil;
        this.costeEstablecLlamada = costeEstablecLlamada;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
        this.autonomia = autonomia;
    }

    // Crear los métodos get y set para el atributo autonomia.
    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

//   modificarllamada(int segundos) para que:
//
//si la autonomía no supera el 5 por ciento, no permita hacer la llamada, mostrando un mensaje de “Batería insuficiente para llamar”
//
//por cada minuto (o parte proporcional) le reste un uno por cien de la batería.
//
    public void efectuarLlamada(int segundos) {
        if (autonomia < 5) {
            System.out.println("Batería insuficiente para llamar");
        } else {
            saldo -= Math.round((costeEstablecLlamada + costeMinutoLlamada / 60f * segundos) * 100f) / 100f;

            if (saldo < 0) {
                saldo = 0;
            }
            this.autonomia -= segundos / 60;
            if (autonomia < 0) {
                autonomia = 0;
            }
        }
    }
    
//navegar(int mb) para que
//
//si la autonomía no supera el 5 por ciento, no permita navegar mostrando un mensaje de “Batería insuficiente para navegar”
//
//por cada 100 MB (o parte proporcional) le reste un uno por cien de la batería.

    public float getSaldo() {
        return saldo;
    }


    public void navegar(int mb) {
        if (autonomia < 5) {
            System.out.println("Batería insuficiente para navegar");
        } else {
            saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
            if (saldo < 0) {
                saldo = 0;
            }
            this.autonomia -= mb/100;
            if (autonomia < 0) {
                autonomia = 0;
            } 
        }
    }
//
//recargar(int importe) para que
//
//establezca la autonomía a 100, independientemente del saldo que se le introduzca. 
    public boolean recargar(int importe) {
        this.autonomia=100;
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
