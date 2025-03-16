
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
. Diseñar una clase Factura que consta de:
• Número identificador: lo proporciona el usuario en el alta de la factura.
• Fecha de la factura: la toma del sistema en el momento del alta.
• Número de cliente: : lo proporciona el usuario en el alta de la factura.
• Porcentaje de IVA: 21% para todas las facturas.
• Un número indeterminado de lineaFactura que contienen:
 Descripción del producto
 Precio unitario
 Cantidad de unidades
 Porcentaje de descuento: 5% para líneas con más de 10 unidades.
 Importe total de la línea.
• Importe total: inicialmente cero, y se va actualizando siempre que se añadan/eliminen
líneas.
Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar línea de
factura y mostrar la factura por consola. Te hará falta una clase lineaFactura con su constructor.
Para añadir línea de factura, habrá que solicitar al usuario los campos necesarios para añadirlo
(descripción, precio unitario y cantidad de unidades). Para eliminar una línea, solicitaremos el
número de línea.
Hacer también un programa con un menú para gestionar una factura (alta, añadir/eliminar líneas,
mostrar factura) Nota: pensar en método toString() para líneaFactura.
 */
/**
 *
 * @author silvia
 */
public class sieteymedio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        //CREA juego:
        System.out.println("Indica el numero de jugadores: ");
        int numero = Integer.parseInt(teclado.nextLine());
        Juego juego = new Juego(numero);

        System.out.println("Juego creado, introduce los nombres de los jugadores: ");
        for (int i = 0; i < numero; i++) {
            System.out.println("Escribe el nombre:");
            String nombrej = teclado.nextLine();
            juego.introducirnombre(i, nombrej);
        }
        juego.getListaJugadores();

        juego.barajar();
        System.out.println("Primera jugada: ");
        for (int ip = 0; ip < numero; ip++) {
            juego.getListaJugadoresl().get(ip).setValorJugada(juego.cadajuego().getValor());
            System.out.println(juego.getListaJugadoresl().get(ip));
            //Sigientes jugadas:
            System.out.println(juego.getListaJugadoresl().get(ip).getNombre());
            
            
            char res;
            do{
            System.out.println("Quieres seguir jugando? s/n");
            res = teclado.nextLine().charAt(0);
            if (res == 's') {
                juego.getListaJugadoresl().get(ip).setValorJugada(juego.getListaJugadoresl().get(ip).getValorJugada()+juego.cadajuego().getValor());
                System.out.println(juego.getListaJugadoresl().get(ip));
                
            }else{
                juego.getListaJugadoresl().get(ip).setSigueJugando(false);
            }
            }while(res=='s'&& juego.getListaJugadoresl().get(ip).getValorJugada()<7.5&&juego.getListaJugadoresl().get(ip).isSigueJugando()==true);
            
            

        }
        
        
        
        double max= -1;
        Jugador jugadorMax= juego.getListaJugadoresl().get(0);
        for(int i=0; i<juego.getListaJugadoresl().size(); i++){
            if(juego.getListaJugadoresl().get(i).getValorJugada()>7.5){
                juego.getListaJugadoresl().get(i).setValorJugada(0);
            }
        }
        for(int i=0; i<juego.getListaJugadoresl().size(); i++){
            if(juego.getListaJugadoresl().get(i).getValorJugada()>max){
                max=juego.getListaJugadoresl().get(i).getValorJugada();
                jugadorMax=juego.getListaJugadoresl().get(i);
            }
        }
        System.out.println("ganador= "+jugadorMax.getNombre());

    }
}

class Juego {

    private ArrayList<carta> baraja = new ArrayList<>();
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();
    private int numeroJugadores;

    public Juego(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
        for (int i = 0; i < 10; i++) {
            baraja.add(new carta("espadas", i + 1));
        }
        for (int i = 0; i < 10; i++) {
            baraja.add(new carta("copas", i + 1));
        }
        for (int i = 0; i < 10; i++) {
            baraja.add(new carta("oros", i + 1));
        }
        for (int i = 0; i < 10; i++) {
            baraja.add(new carta("bastos", i + 1));
        }
        for (int i = 0; i < 3; i++) {
            baraja.add(new carta("espadas", 0.5));
        }
        for (int i = 0; i < 3; i++) {
            baraja.add(new carta("copas", 0.5));
        }
        for (int i = 0; i < 3; i++) {
            baraja.add(new carta("oros", 0.5));
        }
        for (int i = 0; i < 3; i++) {
            baraja.add(new carta("bastos", 0.5));
        }
        for (int i = 0; i < numeroJugadores; i++) {
            listaJugadores.add(new Jugador(" ", true));
        }

    }

    public carta cadajuego() {

        carta cartax = repartirunacarta();
        return cartax;

    }

    public ArrayList<carta> getBaraja() {
        return baraja;
    }

    public ArrayList<Jugador> getListaJugadoresl() {
        return this.listaJugadores;
    }

    public void getListaJugadores() {
        for (Jugador elemento : listaJugadores) {
            System.out.println(elemento);
        }
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void introducirnombre(int posicion, String nombre) {
        listaJugadores.get(posicion).setNombre(nombre);
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public carta repartirunacarta() {
        carta cartaJugada = baraja.get(0);
        baraja.remove(cartaJugada);
        return cartaJugada;
    }

}

class Jugador {

    private String nombre;
    private double valorJugada = 0;
    private boolean sigueJugando;

    public Jugador(String nombre, boolean sigueJugando) {
        this.nombre = nombre;
        this.sigueJugando = sigueJugando;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorJugada() {
        return valorJugada;
    }

    public boolean isSigueJugando() {
        return sigueJugando;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", valorJugada=" + valorJugada + ", sigueJugando=" + sigueJugando + "\n";
    }

    public void setValorJugada(double valorJugada) {
        this.valorJugada = valorJugada;
    }

    public void setSigueJugando(boolean sigueJugando) {
        this.sigueJugando = sigueJugando;
    }

}

class carta {

    private String palo;
    private double valor;

    public carta(String palo, double valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "palo=" + palo + ", valor=" + valor;
    }

}
