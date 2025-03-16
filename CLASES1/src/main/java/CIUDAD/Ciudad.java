package CIUDAD;

/*
Realiza una aplicación para almacenar y mostrar las temperaturas mensuales de una
deteminada ciudad. Para ello, crea una clase llamada Ciudad y otra llamada TestCiudad
(tendrá el método main) para hacer las pruebas.
 Miembros de la clase Ciudad:
● Atributos:
○ nombre: de tipo String. Almacena el nombre de la ciudad.
○ pais: de tipo String. Almacena el nombre del país.
○ temperaturas: array de double. Tendrá 12 celdas para almacenar las temperaturas
de cada uno de los meses del año.
● Métodos:
○ Ciudad: constructor que se encargará de inicializar los atributos nombre y pais con
los valores pasados como argumentos. También se encargará de crear las 12
celdas del array.
○ asignarTemperatura: almacena en el array los grados centígrados de un mes
concreto. Ambos valores los recibirá como argumentos.
○ calcularMedia: devuelve el valor medio de las temperaturas almacenadas en el
array.
○ mostrarCentigrados: muestra en pantalla los grados almacenados en el array.
○ mostrarFarenheit: muestra en pantalla la equivalencia en grados farenheit de los
grados centígrados almacenados en el array. F = C * 9 / 5 + 32.
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
public class Ciudad {
    private String nombreCiudad;
    private String nombrePais;
    private double[] temperaturas;

    public Ciudad(String nombreCiudad, String nombrePais) {
        this.nombreCiudad = nombreCiudad;
        this.nombrePais = nombrePais;
        this.temperaturas= new double[12];
    }
    public void asignarTemperaturas(int mes, double grados){
        this.temperaturas[mes]= grados;
        
    }
    public double calcularMedia(){
        double suma=0;
        int contador=0;
        for(int i=0; i<this.temperaturas.length; i++){
            suma+= this.temperaturas[i];
            contador++;
        }
        if(contador!=0){
            return suma/(double)contador;
        }else{
            return 0;
        }
    }
    public double[] mostrarCentigrados(){
        return this.temperaturas;
    
}
    //F = C * 9 / 5 + 32
      public double[] mostrarFarenheit(){
        double[] tempFar;
        tempFar= new double[this.temperaturas.length];
        for(int i=0; i<this.temperaturas.length ; i++){
            tempFar[i]=( this.temperaturas[i]*9.0d)/(5.0+32.0);
        }
    return tempFar;
}
    
    
}
