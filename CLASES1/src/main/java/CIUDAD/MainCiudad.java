package CIUDAD;


import java.util.Arrays;
import java.util.Scanner;

/*
 Clase TestCiudad:
● El método main hará lo siguiente:
a) Solicitará por teclado el nombre de la ciudad y del país.
b) Creará un objeto inicializado a los valores anteriores.
c) Pedirá las 12 temperaturas (en grados centígrados) y las irá introduciendo en el
array de temperaturas del objeto.
d) Mostrará todas las temperaturas en grados centígrados.
e) Mostrará todas las temperaturas en grados farenheit.
f) Finalmente mostrará la media de los grados centígrados.
A continuación se muestra un ejemplo de ejecución:
 */

/**
 *
 * @author silvia
 */
public class MainCiudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String miciudad;
        String miPais;
        System.out.println("Escribe el nombre de la ciudad: ");
        miciudad=teclado.nextLine();
         System.out.println("Escribe el nombre del pais: ");
        miPais=teclado.nextLine();
        
        Ciudad ciudad1= new Ciudad(miciudad, miPais);
        for(int i=0; i<12; i++){
            System.out.println("Escribe la temperatura en grados centigrados del mes "+(i+1));
            double temperatura= Double.parseDouble(teclado.nextLine());
            ciudad1.asignarTemperaturas(i, temperatura);
        }
        System.out.println(Arrays.toString(ciudad1.mostrarCentigrados()));
        System.out.println(Arrays.toString(ciudad1.mostrarFarenheit()));
        System.out.println(ciudad1.calcularMedia());
        
    }
    
}
