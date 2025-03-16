package EJERCICIO05;

/*
Pensando que en el futuro implementemos el juego de ajedrez para dos jugadores, se desea
crear una clase abstracta llama PiezaAjedrez, con dos atributos enteros llamados fila y columna que
representan sus coordenadas en el tablero (valores entre 0 y 7) y un método abstracto llamado
mover () al que se le pasan como parámetro la fila y columna destino de un movimiento. El método
devolver true si el movimiento se puede realizar o false si es un movimiento erróneo. Implementa
esa clase y sus subclases AlfilAjedrez y TorreAjedrez. Para simplificarlo, vamos a pensar en
movimientos en un tablero vacío, es decir solo con una pieza, la que se está movimiento.
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
abstract public class PiezaAjedrez {
private int fila;//0-7
private int columna;//0-7

    abstract boolean mover(int fila_destino, int columna_destino);//true si el movimiento es valido

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "PiezaAjedrez{" + "fila=" + fila + ", columna=" + columna + '}';
    }
  
    
}

class AlfilAjedrez extends PiezaAjedrez{

    @Override
    boolean mover(int fila_destino, int columna_destino) {
        if(fila_destino>=7||fila_destino<=0||columna_destino>=7|| columna_destino<=0){
            return false;
        }
         if (Math.abs(fila_destino - super.getFila()) != Math.abs(columna_destino - super.getColumna())) {
            return false;
        }
         return true;
    }

    @Override
    public String toString() {
        return "Alfil{" + "fila=" + super.getFila() + ", columna=" + super.getColumna() +'}';
    }
    
    
    
}

class TorreAjedrez extends PiezaAjedrez{

    @Override
boolean mover(int fila_destino, int columna_destino) {
    if (fila_destino > 7 || fila_destino < 0 || columna_destino > 7 || columna_destino < 0) {
        return false; // Fuera del tablero
    }

    int filaOrigen = super.getFila();
    int columnaOrigen = super.getColumna();

    if (fila_destino != filaOrigen && columna_destino != columnaOrigen) {
        return false; // No es un movimiento válido para la torre (no es ni horizontal ni vertical)
    }

    int filaDireccion = 0;
    int columnaDireccion = 0;

    if (fila_destino == filaOrigen) { // Movimiento horizontal
        columnaDireccion = (columna_destino > columnaOrigen) ? 1 : -1;
    } else { // Movimiento vertical
        filaDireccion = (fila_destino > filaOrigen) ? 1 : -1;
    }

    int filaActual = filaOrigen + filaDireccion;
    int columnaActual = columnaOrigen + columnaDireccion;



    return true; // Movimiento válido
}
      @Override
    public String toString() {
        return "Torre{" + "fila=" + super.getFila() + ", columna=" + super.getColumna() +'}';
    }
}