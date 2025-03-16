/**
 * A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que
 * se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades
 * como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el
 * saldo.
 * Las propiedades de un móvil prepago son:
 * - int numeroMovil (9 dígitos)
 * - float costeMinutoLlamada (euros, con dos decimales)
 * - float costeConsumoMB (euros, con dos decimales)
 * - float saldo (euros, con dos decimales)
 * Tiene un único constructor con la siguiente firma:
 * MovilPrepago(long nM, float cML, float cMB, float s)
 * Los métodos son:
 * - void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada
 * - void navegar(int MB) análogo a efectuar una llamada
 * - boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
 * - float consultarSaldo ()
 * Lo primero de debemos hacer es crear una instancia de un móvil (con el constructor) con
 * unos valores cualesquiera, por ejemplo:
 * MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);
 * y después llamar a los métodos y mostrar por pantalla el atributo saldo del móvil.
 */
package zcom.sgbt06.movilPrepago;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SGBt06e01 {

    public static void main(String[] args) {
        char masOperacion;
        DecimalFormat df = new DecimalFormat("#.##");
        char miVisibilidad;
        boolean mostrarSaldoTrasOperacion = true;
        Scanner teclado = new Scanner(System.in);
        int accion;
        int recargar;
        int navegar;
        int segundos;
        int miNumeroTelefono;
        float miCosteConsumo;
        float miCosteMinutoLLamada;
        float miSaldo;

        //movil creado:
        // MovilPrepago miMovil = new MovilPrepago(900900900, 0.1f, 0.5f, 10f);
        //Crear movil:
        System.out.println("Escribe un numero de telefono: ");
        miNumeroTelefono = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe coste minuto llamada: ");
        miCosteMinutoLLamada = Float.parseFloat(teclado.nextLine());
        System.out.println("Escribe coste consumo: ");
        miCosteConsumo = Float.parseFloat(teclado.nextLine());
        System.out.println("Escribe el salgo inicial: ");
        miSaldo = Float.parseFloat(teclado.nextLine());
        
        MovilPrepago miMovil = new MovilPrepago(miNumeroTelefono, miCosteConsumo, miCosteMinutoLLamada, miSaldo);

        do {
            System.out.println("Qué quieres hacer?");
            do {
                System.out.println("Llamar(1) - Navegar(2) - Recargar(3) - Consultar Saldo(4) - Configuracion(5)");
                accion = Integer.parseInt(teclado.nextLine());

            } while (accion != 1 && accion != 2 && accion != 3 && accion != 4 && accion != 5);
            switch (accion) {

                case 1 -> {
                    System.out.println("Cuantos segundos vas a llamar?");
                    segundos = Integer.parseInt(teclado.nextLine());
                    miMovil.efectuarLlamada(segundos);

                }
                case 2 -> {
                    System.out.println("Cuantos MB vas a navegar?");
                    navegar = Integer.parseInt(teclado.nextLine());
                    miMovil.navegar(navegar);
                }

                case 3 -> {
                    System.out.println("Cuanto dinero quieres recargar?");
                    recargar = Integer.parseInt(teclado.nextLine());
                    miMovil.recargar(recargar);
                }

                case 4 ->
                    System.out.println(miMovil.saldo);
                case 5 -> {
                    System.out.println("Quieres que se muestren el saldo tras cada operacion? (s/n)");
                    miVisibilidad = teclado.nextLine().charAt(0);
                    if (miVisibilidad == 's') {
                        mostrarSaldoTrasOperacion = true;
                    } else {
                        mostrarSaldoTrasOperacion = false;
                    }
                    miMovil.configurar(mostrarSaldoTrasOperacion);
                }

            }
            do {
                System.out.println("Quieres hacer otra operacion? s/n");
                masOperacion = teclado.nextLine().charAt(0);
                if (masOperacion != 's' && masOperacion != 'n') {
                    System.out.println("La respuesta es incorrecta");
                }
            } while (masOperacion != 's' && masOperacion != 'n');
        } while (masOperacion != 'n');

        System.out.println("Hasta pronto!");
    }

}
