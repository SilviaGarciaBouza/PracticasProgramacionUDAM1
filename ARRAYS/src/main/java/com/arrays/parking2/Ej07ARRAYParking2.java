/*
Realizar una clase llamada Parking2 que gestione los coches aparcados en un parking
mediante un Array, que almacene las matrículas y la hora de entrada en el parking. El parking es un
poco raro, mide solo 3 metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First
Output). Cada minuto en el parking cuesta 2 céntimos (máx 10 euros). La clase debe tener métodos
siguientes:
• Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas ocupadas.
• Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno. La plaza
del fondo es la número 1 y la que está más cerca de la entrada es la 20.
• Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a pagar
según los segundos de estancia. Devuelve la matrícula del coche y el importe a pagar. Si es parking
está vacío devuelve cadena vacía y cero euros.
• Mostrar lo recaudado hasta ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que
introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del
sistema. 
 */
package com.arrays.parking2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author silvia
 */
public class Ej07ARRAYParking2 {

    private String[] cadenaMatriculas;
    private double precioMinuto = 0.02;
    private double costeMax = 10;
    private double recaudado=0;

    public Ej07ARRAYParking2() {
        cadenaMatriculas = new String[20];
    }

    public String[] estadoParking() {
        return cadenaMatriculas;
    }
    public int contadorPlazasOcupadas(){
        int plazasOcupadas=0;
    for (int i=0; i<cadenaMatriculas.length; i++){
        if(cadenaMatriculas[i]!=null){
            plazasOcupadas++;
        }
    }
    return  plazasOcupadas;
}

    //Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno. La plaza
    //del fondo es la número 1 y la que está más cerca de la entrada es la 20.
    public int aparcar(String numeroMatricula) {
        int numeroPlaza = 0;
        for (int i = 0; i < cadenaMatriculas.length; i++) {
            if (cadenaMatriculas[i] == null) {
                cadenaMatriculas[i] = numeroMatricula + LocalTime.now();
                numeroPlaza = i + 1;
                break;
            }
        }
        return numeroPlaza;
    }

    //Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a pagar
    //según los segundos de estancia. Devuelve la matrícula del coche y el importe a pagar. Si es parking
    //está vacío devuelve cadena vacía y cero euros.
    public String desaparcar() {
        
        
        String matriculaHoraAparcado = "0";
        String cocheMatricula;
        LocalTime cocheHora;
        long minutosAparcados;
        StringBuilder matriculaCoste= new StringBuilder();
        double coste = 0;
        for (int i = cadenaMatriculas.length - 1; i >= 0; i--) {
            if (cadenaMatriculas[i] != null) {
                matriculaHoraAparcado = cadenaMatriculas[i];
                cadenaMatriculas[i] = null;
                break;
            }
        }
//        cocheMatricula = cocheDesaparcarHora.substring(0, 6);
        cocheHora = LocalTime.parse(matriculaHoraAparcado.substring(7));
        minutosAparcados = ChronoUnit.MINUTES.between(cocheHora, LocalTime.now());
        coste = (double)minutosAparcados * 0.02;
        if (coste > 10) {
            coste = 10;
        }
        recaudado+=coste;
        cocheMatricula= matriculaHoraAparcado.substring(0,7);
        matriculaCoste.append("Matricula: ").append(cocheMatricula).append(", Coste: ").append(coste).append("€");
        String desaparcar= matriculaCoste.toString();
        return desaparcar;

    }
    //recaudado
    public double getRecaudado() {
        return recaudado;
    }
    

}
