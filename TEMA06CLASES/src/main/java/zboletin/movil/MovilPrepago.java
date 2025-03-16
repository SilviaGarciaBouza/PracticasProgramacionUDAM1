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
package zboletin.movil;

/**
 *
 * @author silvia.garciabouza
 */
public class MovilPrepago {

    //Introducir un atributo privado llamado autonomia, de tipo float, con valor inicial 50. Este atributo representa el nivel de carga de batería del móvil, en tanto por cien.
    private float autonomia = 50;
    public long numeroMovil;
    final private float costeEstablecLlamada;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;
//Crear un nuevo constructor, a mayores del existente, donde se utilicen todos los atributos como parámetros.

    MovilPrepago(long nM, float cEL, float cML, float cMB, float s, float autonomia) {
        numeroMovil = nM;
        costeEstablecLlamada = cEL;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
        this.autonomia = autonomia;
    }
    //Crear los métodos get y set para el atributo autonomia

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

    MovilPrepago(long nM, float cEL, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeEstablecLlamada = cEL;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }
//modificarllamada(int segundos) para que:
//
//si la autonomía no supera el 5 por ciento, no permita hacer la llamada, mostrando un mensaje de “Batería insuficiente para llamar”
//
//por cada minuto (o parte proporcional) le reste un uno por cien de la batería.
    //TODO: tego q cortar llamada al terminar autonomia ?
    //todoTengo que cortar llamada al llegar a 5%?no

    public void efectuarLlamada(int segundos) {
        if (this.autonomia > 5) {
            if (this.autonomia >= (float) segundos / 60f) {
                this.autonomia -= (float) segundos / 60f;
            } else {
                System.out.println("Se ha cortado antes de terminar la llamada");
            }
            saldo -= Math.round(
                    (costeEstablecLlamada + costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
            if (saldo < 0) {
                saldo = 0;
            }
        } else {
            System.out.println("Batería insuficiente para llamar");
        }
    }
//navegar(int mb) para que
//
//si la autonomía no supera el 5 por ciento, no permita navegar mostrando un mensaje de “Batería insuficiente para navegar”
//
//por cada 100 MB (o parte proporcional) le reste un uno por cien de la batería.
    //TODO: tego q cortar la navegacion al terminar autonomia ?
    //todoTengo que cortar la navegacion al llegar a 5%?no

    public void navegar(int mb) {

        if (autonomia > 5) {
            if (this.autonomia >= (float) mb / 100f) {
                this.autonomia -= (float) mb / 100f;
            } else {
                System.out.println("Se ha cortado antes de terminar la llamada");
            }
            this.autonomia -= (float) mb / 100f;
            saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
            if (saldo < 0) {
                saldo = 0;
            }
        } else {
            System.out.println("Batería insuficiente para navegar");
        }
    }
//recargar(int importe) para que
//
//establezca la autonomía a 100, independientemente del saldo que se le introduzca.

    public boolean recargar(int importe) {
        this.autonomia = 100;
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
