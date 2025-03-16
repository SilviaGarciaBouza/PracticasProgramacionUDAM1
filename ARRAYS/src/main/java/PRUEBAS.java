
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*

7.15. Realiza un programa que tenga un ArrayList llamado alturaAlumnos que mantenga una lista
con las alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50 redondeados
a dos decimales. El programa tendrá las siguientes funciones (accesibles mediante un menú):
a. Añadir altura.
b. Mostrar lista actual con el número de posición
c. Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
d. Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que
se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
e. Ordenar la lista.
 */
/**
 *
 * @author silvia
 */
public class PRUEBAS {

    public static void main(String[] args) {
           ArrayList<Double> miArrayList = new ArrayList<>();
        //ASIGNAR VALORES 
        System.out.println(asignarValors(miArrayList));
        //ASIGNAR VALORES SIN REPETIR
        System.out.println(asignarValorssINrEPETIR(miArrayList));
        //AÑADIR ELEMETO
        System.out.println(añadirElemento(miArrayList));
        //ELIMINAR elemento POR POSICION
        System.out.println(eliminaarElementoPosicion(miArrayList,1));
        //ELIMINAR elemento POR VALOR
        System.out.println(eliminaarElementoValor(miArrayList, 4));
        //MOSTRAR
        System.out.println(Mostrar(miArrayList));
        //ORDENAR
        System.out.println(ordenar(miArrayList));
        

    }

//ASIGNAR VALORES
    static public ArrayList<Double> asignarValors(ArrayList<Double> miarrayList) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Indica longitud: ");
        longitud = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < longitud; i++) {
            System.out.println("Escribe la altura: ");
            miarrayList.add(Double.parseDouble(teclado.nextLine()));
        }
        return miarrayList;
    }

//ASIGNAR VALORES SIN REPETIR
    static public ArrayList<Double> asignarValorssINrEPETIR(ArrayList<Double> miarrayList) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Indicas longitud: ");
        longitud = Integer.parseInt(teclado.nextLine());
        double valor;
        do {

            do {
                System.out.println("Escribe la altura: ");
                valor = Double.parseDouble(teclado.nextLine());

            } while (miarrayList.contains(valor));
            miarrayList.add(valor);

        } while (miarrayList.size() < longitud);
        return miarrayList;
    }

    //AÑADIR ELEMENTO
    static public ArrayList<Double> añadirElemento(ArrayList<Double> miArrayList) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un valor: ");
        miArrayList.add(Double.parseDouble(teclado.nextLine()));
        return miArrayList;
    }
    //ELIMINAR elemento POR POSICION

    static public ArrayList<Double> eliminaarElementoPosicion(ArrayList<Double> miArrayList, int posicionEliminar) {
        miArrayList.remove(posicionEliminar);
        return miArrayList;
    }

    //ELIMINAR ELEMENTO POR VALOR
     static public ArrayList<Double> eliminaarElementoValor(ArrayList<Double> miArrayList, double valor) {
        miArrayList.remove(valor);
        return miArrayList;
    }
    //MOSTRAR
      static public ArrayList<Double> Mostrar(ArrayList<Double> miArrayList) {
        
        return miArrayList;
    }
    // ORDENAR
       public static ArrayList<Double> ordenar(ArrayList<Double> miArrayList) {
        Collections.sort(miArrayList); 
        return miArrayList;
    }

}