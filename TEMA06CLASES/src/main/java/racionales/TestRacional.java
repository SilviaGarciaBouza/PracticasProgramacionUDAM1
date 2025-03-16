/*
Una vez creada esta clase, comprueba su funcionamiento creando otra clase, TestRacional,
que contenga el método main y haga lo siguiente:
a) Crear un objeto de la clase Racional.
b) Visualizar el número racional creado.
c) Asignarle a ese número nuevos valores para el numerador y para el denominador.
d) Visualizar de nuevo el número.
A continuación se muestra un ejemplo de ejecución:
 */
package racionales;

/**
 *
 * @author silvia.garciabouza
 */
public class TestRacional {

   
    public static void main(String[] args) {
Racional racional1= new Racional();
//        racional1.visualizarRacional();
//        racional1.setNumerador(2);
//        racional1.setDenominador(9);
//        racional1.visualizarRacional();
//        Racional racional2= new Racional(60, -28);
//        racional2.simplificarRacional();
//        racional2.visualizarRacional();
        System.out.println(Racional.doubletoRacional(Math.PI, 6));

    }
    
}
