package EJERCICIO06;


import java.util.Scanner;

/*
Modifica la clase PiezaAjedrez (versión _v2) para incluir métodos ¿estáticos? para que el
usuario introduzca la columna como letra (a-h) y la fila (entre 1 y 8) y los convierta a los valores usados
previamente (entre 0 y 7). Esto obligará a generar una nueva versión del programa anterior, para que
el usuario introduzca a-h y 1-8 como valores destino del movimiento. 
 */
/**
 *
 * @author silvia
// */
//public class PiezaAjedrezMain1_v2 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        char pieza_a_mover;
//        int columna;
//        int fila;
//        AlfilAjedrez_v2 alfil1 = new AlfilAjedrez_v2();
//        TorreAjedrez_v2 torre1 = new TorreAjedrez_v2();
//        alfil1.setColumna(0);
//        alfil1.setFila(0);
//        torre1.setColumna(0);
//        torre1.setFila(0);
//
//        System.out.println("Empieza el juego! termina con fila= -1");
//
//        do {
//            System.out.println("Posiciones: ");
//            System.out.println(torre1.toString());
//            System.out.println(alfil1.toString());
//            do {
//                System.out.println("Que figura quieres elegir? t-torre/a-alfil");
//                pieza_a_mover = teclado.nextLine().charAt(0);
//            } while (pieza_a_mover != 't' && pieza_a_mover != 'a');
//
//            System.out.println("Indica posicion final: ");
//            boolean jugada_realizada = false;
//            do {
//                System.out.println("Columna a la cual moverse a-h: ");
//                columna = PiezaAjedrez1_v2.introduce_columna_letra( teclado.nextLine().charAt(0));
//                System.out.println("Fila a la cual moverse 1-8: ");
//                fila = PiezaAjedrez1_v2.introduce_columna_letra(Integer.parseInt(teclado.nextLine()));
//
//                if (pieza_a_mover == 't') {
//                     if (fila != -1) {
//                    
//                    if (torre1.mover(fila, columna)) {
//                        torre1.setColumna(columna);
//                        torre1.setFila(fila);
//                        jugada_realizada = true;
//                    } else {
//                       
//                            System.out.println("La fila o columna seleccionada no es correcta");
//                        }
//                    }
//                } else {
//                    
//                     if (fila != -1) {
//                    if (alfil1.mover(fila, columna)) {
//                        alfil1.setColumna(columna);
//                        alfil1.setFila(fila);
//                        jugada_realizada = true;
//                    } else {
//                       
//                            System.out.println("La fila o columna seleccionada no es correcta");
//                        }
//                    }
//
//                }
//
//            } while (jugada_realizada == false && fila != -1);
//
//        } while (fila != -1);
//        System.out.println("Has salido del juego!");
//
//    }
//
//}
