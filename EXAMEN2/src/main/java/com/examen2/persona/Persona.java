/*
Haz una clase llamada Persona que siga las siguientes condiciones:
● Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se acceda directamente a ellos. Piensa que modificador de
acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes
hacerlo.
● Por defecto, todos los atributos menos el DNI serán valores por defecto según su
tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa
una constante para ello.
● Se implantaran varios constructores:
○ Un constructor por defecto.
○ Un constructor con el nombre, edad y sexo, el resto por defecto.
○ Un constructor con todos los atributos como parámetro.
Los métodos que se implementarán son:
● calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2
en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su
peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa
que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes
para devolver estos valores.
● esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
● comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no
es correcto, sera H. No sera visible al exterior.
● toString(): devuelve toda la información del objeto.
● generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su
número su letra correspondiente. Este método sera invocado cuando se construya el
objeto. No será visible al exterior.
● Métodos set de cada parámetro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:
● Pide por teclado el nombre, la edad, sexo, peso y altura.
● Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso
y la altura y el último por defecto, para este último utiliza los métodos set para darle
a los atributos un valor.
● Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por
debajo de su peso ideal con un mensaje.
● Indicar para cada objeto si es mayor de edad.
● Por último, mostrar la información de cada objeto.
 */
package com.examen2.persona;

import java.util.Random;

/**
 *
 * @author silvia
 */
public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = ' ';//H M
  private double peso = 0;//kg
    private double altura = 0; //m

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona() {
        this.dni=generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni=generaDNI();
        comprobarSexo(sexo);
    }

    public Persona(double peso, String nombre, int edad, char sexo, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.dni=generaDNI();
        comprobarSexo(sexo);
    }
      


//        calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2
//en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
//devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su
//peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa
//que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes
//para devolver estos valores.
    public int calcularIMC() {

        double imc;
        imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    //MayorDeEdad(): indica si es mayor de edad, devuelve un booleano. 
    public boolean mayorEdad() {

        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
//         comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no
//es correcto, sera H. No sera visible al exterior.

    private boolean comprobarSexo(char sexo) {
        boolean sexocorrecto;
        switch (sexo) {
            case 'M' -> {
                this.sexo = 'M';
                sexocorrecto= true;
            }
            case 'H' -> {
                this.sexo = 'H';
                sexocorrecto= true;
            }
            default -> {
                this.sexo = 'H';
                sexocorrecto= false;
            }
        }
        return sexocorrecto;
    }
    
    
    // toString(): devuelve toda la información del objeto.

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
//     generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su
//número su letra correspondiente. Este método sera invocado cuando se construya el
//objeto. No será visible al exterior.
    private String generaDNI(){
        Random random= new Random();
          String cadenaletras="ABCDEFGHIJKLMNÑOPQRSTUV";
          
        String dniGenerado;
        StringBuilder dniNumero= new StringBuilder();
        for(int i=0; i<8; i++){
            dniNumero.append(random.nextInt(0,10));
        }
        dniGenerado=dniNumero.append(cadenaletras.charAt(Integer.parseInt(dniNumero.toString())%23)).toString();       
        this.dni= dniGenerado;
        return dniGenerado;
    }
    
}
