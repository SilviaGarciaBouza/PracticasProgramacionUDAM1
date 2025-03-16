package EJERCICIO06;



/*
Modifica la clase PiezaAjedrez (versión _v2) para incluir métodos ¿estáticos? para que el
usuario introduzca la columna como letra (a-h) y la fila (entre 1 y 8) y los convierta a los valores usados
previamente (entre 0 y 7). Esto obligará a generar una nueva versión del programa anterior, para que
el usuario introduzca a-h y 1-8 como valores destino del movimiento. 
 */

/**
 *
 * @author silvia
 */
abstract public class PiezaAjedrez1_v2 {
private int fila;//0-7
private int columna;//0-7


    abstract boolean mover(int fila_destino, int columna_destino);//true si el movimiento es valido

    static public int introduce_columna_letra(char letra){
        switch (letra) {
            case 'a' ->{return 0;}
            case 'b' ->{return 1;}
            case 'c' ->{return 2;}
            case 'd' ->{return 3;}
            case 'e' ->{return 4;}
            case 'f' ->{return 5;}
            case 'g' ->{return 6;}
            case 'h' ->{return 7;}
            default ->{return -1;}
        }
    
    }
    
        static public char columna_num_a_letra(int letra){
        switch (letra) {
            case 0 ->{return 'a';}
            case 1 ->{return 'b';}
            case 2 ->{return 'c';}
            case 3 ->{return 'd';}
            case 4 ->{return 'e';}
            case 5 ->{return 'f';}
            case 6 ->{return 'g';}
            default ->{return 'h';}
         
        }
    
    }
    
    
    
    
    
    
        static public int fila_numero_a_8(int numero){
        switch (numero) {
             
            case 0 ->{return 1;}
            case 1 ->{return 2;}
            case 2 ->{return 3;}
            case 3 ->{return 4;}
            case 4 ->{return 5;}
            case 5 ->{return 6;}
            case 6 ->{return 7;}
            default ->{return 8;}
         
        }
        
        }//1-8
        
           static public int fila_numero_a_7(int numero){
        switch (numero) {
             
            case 1 ->{return 0;}
            case 2 ->{return 1;}
            case 3 ->{return 2;}
            case 4 ->{return 3;}
            case 5 ->{return 4;}
            case 6 ->{return 5;}
            case 7 ->{return 6;}
            default ->{return 7;}
         
        }
        
        }//1-8

    
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

class AlfilAjedrez_v2 extends PiezaAjedrez1_v2{

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

class TorreAjedrez_v2 extends PiezaAjedrez1_v2{

    @Override
boolean mover(int fila_destino, int columna_destino) {
    if (fila_destino >= 8 || fila_destino < 0 || columna_destino >= 8 || columna_destino < 0) {
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