/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zcom.sgbt06.movilPrepago;

/**
 *
 * @author silvia.garciabouza
 */


  public class MovilPrepago {

    int numeroMovil;
    float costeMinutoLlamada, costeConsumoMB, saldo;
    boolean visibilidadSaldo = false;

    public MovilPrepago(int nM, float cML, float cMB, float s) {
        this.numeroMovil = nM;
        this.costeConsumoMB = cMB;
        this.costeMinutoLlamada = cML;
        this.saldo = s;
    }

    public void efectuarLlamada(int segundos) {

        float costeLlamada = this.costeMinutoLlamada * (segundos / 60.0f);
        if (costeLlamada < this.saldo) {
            saldo -= costeLlamada;
            if (visibilidadSaldo == true) {
                System.out.printf("El saldo que queda es %.2f\n", saldo);
            }
        } else if (costeLlamada == this.saldo) {
            saldo = 0;
            System.out.println("No hay saldo");
        } else if (this.saldo != 0) {
            saldo = 0;
            System.out.println("No hay saldo suficiente, se ha cortado la llamada");
        } else {
            System.out.println("No hay saldo");
        }
    }
//void navegar(int MB) análogo a efectuar una llamada

    public void navegar(int MB) {
        float costeNavegar = this.costeConsumoMB * (MB);
        if (costeNavegar < this.saldo) {
            saldo -= costeNavegar;
            if (visibilidadSaldo == true) {
                System.out.printf("El saldo que queda es %.2f\n", saldo);
            }
        } else if (costeNavegar == this.saldo) {
            saldo = 0;
            System.out.println("No hay saldo");
        } else if (this.saldo != 0) {
            saldo = 0;
            System.out.println("No hay saldo suficiente, se ha cortado la navegación");
        } else {
            System.out.println("No hay saldo");
        }
    }
// * - boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false

    public boolean recargar(int importe) {
        boolean recargaValida = (importe % 5 != 0) ? false : true;
        if (recargaValida) {
            saldo += importe;
        }
        if (visibilidadSaldo == true) {
            System.out.printf("El saldo que queda es %.2f\n", saldo);
        }

        return recargaValida;
    }
    //* - float consultarSaldo ()

    public float consultarSaldo() {
        return saldo;
    }

    public boolean configurar(boolean preguntarVisibilidadSaldo) {
        visibilidadSaldo = preguntarVisibilidadSaldo;
        return visibilidadSaldo;

    }
}
