package EJERCICIO05;


import java.util.Scanner;

/*
• Haz un programa que permita al usuario mover una sola pieza (al comenzar elegirá Alfil o Torre) por
el tablero, partiendo de la posición 0,0, indicando las coordenadas destino del movimiento que quiere
hacer cada vez, terminando el programa cuando introduzca fila -1.
• El programa tendrá una función que presente por pantalla la situación del tablero.
• Por comodidad, puedes hacer las clases dentro del mismo fichero que el programa.
 */
/**
 *
 * @author silvia
 */
public class PiezaAjedrezMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char pieza_a_mover;
        int columna;
        int fila;
        AlfilAjedrez alfil1 = new AlfilAjedrez();
        TorreAjedrez torre1 = new TorreAjedrez();
        alfil1.setColumna(0);
        alfil1.setFila(0);
        torre1.setColumna(0);
        torre1.setFila(0);

        System.out.println("Empieza el juego! termina con fila= -1");

        do {
            System.out.println("Posiciones: ");
            System.out.println(torre1.toString());
            System.out.println(alfil1.toString());
            do {
                System.out.println("Que figura quieres elegir? t-torre/a-alfil");
                pieza_a_mover = teclado.nextLine().charAt(0);
            } while (pieza_a_mover != 't' && pieza_a_mover != 'a');

            System.out.println("Indica posicion final: ");
            boolean jugada_realizada = false;
            do {
                System.out.println("Columna a la cual moverse: ");
                columna = Integer.parseInt(teclado.nextLine());
                System.out.println("Fila a la cual moverse: ");
                fila = Integer.parseInt(teclado.nextLine());

                if (pieza_a_mover == 't') {
                     if (fila != -1) {
                    
                    if (torre1.mover(fila, columna)) {
                        torre1.setColumna(columna);
                        torre1.setFila(fila);
                        jugada_realizada = true;
                    } else {
                       
                            System.out.println("La fila o columna seleccionada no es correcta");
                        }
                    }
                } else {
                    
                     if (fila != -1) {
                    if (alfil1.mover(fila, columna)) {
                        alfil1.setColumna(columna);
                        alfil1.setFila(fila);
                        jugada_realizada = true;
                    } else {
                       
                            System.out.println("La fila o columna seleccionada no es correcta");
                        }
                    }

                }

            } while (jugada_realizada == false && fila != -1);

        } while (fila != -1);
        System.out.println("Has salido del juego!");

    }

}
