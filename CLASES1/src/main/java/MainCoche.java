
import java.util.Scanner;

/*
Para probar el funcionamiento de la clase Coche, crea una clase llamada TestCoche que
contenga un método main donde se creen 2 objetos a partir de la clase Coche. Ha de pedir
por teclado los datos necesarios para cada uno de ellos. Uno de los objetos se creará
usando el constructor que recibe los valores de todos los atributos; el otro objeto se creará
usando el constructor sin argumentos (los valores para sus atributos se asignarán con los
métodos específicos).
Finalmente, se han de mostrar en pantalla las características de los 2 coches.
A continuación se muestra un ejemplo de ejecución:
 */
/**
 *
 * @author silvia
 */
public class MainCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String marca, String modelo, String color, int numeroPuertas, double potencia, String tipoCombustibe
        Scanner teclado = new Scanner(System.in);
        String marca;
        String modelo;
        String color;
        int numeroPuertas;
        double potencia;
        String tipoCombustibe;
        System.out.println("Coche 1:");
        System.out.println("Escribe la marca:  ");
        marca = teclado.nextLine();
        System.out.println("Escribe el modelo: ");
        modelo = teclado.nextLine();
        System.out.println("Escribe el color: ");
        color = teclado.nextLine();
        System.out.println("Escribe el numero de puertas: ");
        numeroPuertas = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe la potencia: ");
        potencia = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible: ");
        tipoCombustibe = teclado.nextLine();
        Coche coche1 = new Coche(marca, modelo, color, numeroPuertas, potencia, tipoCombustibe);
        Coche coche2 = new Coche();
        System.out.println("Coche 2:");
        System.out.println("Escribe la marca:  ");
        marca = teclado.nextLine();
        System.out.println("Escribe el modelo: ");
        modelo = teclado.nextLine();
        System.out.println("Escribe el color: ");
        color = teclado.nextLine();
        System.out.println("Escribe el numero de puertas: ");
        numeroPuertas = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe la potencia: ");
        potencia = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe el tipo de combustible: ");
        tipoCombustibe = teclado.nextLine();
        coche2.setMarca(marca);
        coche2.setModelo(modelo);
        coche2.setColor(color);
        coche2.setNumeroPuertas(numeroPuertas);
        coche2.setPotencia(potencia);
        coche2.setTipoCombustibe(tipoCombustibe);
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

    }

}
