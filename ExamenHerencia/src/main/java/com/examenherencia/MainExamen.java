package com.examenherencia;

/**
 *
 * @author silvia.garciabouza
 */
public class MainExamen {

    public static void main(String[] args) {

        Alarma alarma1 = new Alarma(50.0);
        System.out.println("Alarma: ");
        System.out.println("Estado incicial de la alarma: ");

        alarma1.activarDesactivarTimbre();

        System.out.println("------------------");
        System.out.println("Simulacion multiples mediciones: ");
        alarma1.multiplesMediciones(5, 1);
        System.out.println("------------------");

        System.out.println("Ultima activacion de la alarma: ");
        System.out.println(alarma1.getListaFechasHoras().get(alarma1.getListaFechasHoras().size() - 1));
        System.out.println("------------------");

        System.out.println("Todos los registros de  activacion de la alarma: ");
        System.out.println(alarma1.getListaFechasHoras());
        System.out.println("------------------");
        System.out.println("Resetea la alarma: ");
        alarma1.ReiniciarAlarma();
        System.out.println("Todos los registros de  activacion de la alarma: ");
        System.out.println(alarma1.getListaFechasHoras());
        System.out.println("------------------");
        System.out.println(" ");

        AlarmLuminos alarmaLuminosa = new AlarmLuminos(50.0);
        System.out.println("Alarma Luminosa: ");
        System.out.println("Estado incicial de la alarma: ");
        alarmaLuminosa.activarDesactivarTimbre();
        System.out.println("------------------");
        System.out.println("Simulacion multiples mediciones: ");
        alarmaLuminosa.multiplesMediciones(5, 1);
        System.out.println("------------------");

        System.out.println("Ultima activacion de la alarma: ");
        System.out.println(alarmaLuminosa.getListaFechasHoras().get(alarmaLuminosa.getListaFechasHoras().size() - 1));
        System.out.println("------------------");

        System.out.println("Todos los registros de  activacion de la alarma: ");
        System.out.println(alarmaLuminosa.getListaFechasHoras());
        System.out.println("------------------");
        System.out.println("Resetea la alarma: ");
        alarmaLuminosa.ReiniciarAlarma();
        System.out.println("Todos los registros de  activacion de la alarma: ");
        if (alarmaLuminosa.getListaFechasHoras().size() > 0) {
            System.out.println(alarmaLuminosa.getListaFechasHoras());
        } else {
            System.out.println("No hay registros");
        }
        System.out.println("------------------");
        System.out.println(" ");
    }

}
