/*
Ejercicio 3: Haz una clase llamada MiPersona que siga las siguientes condiciones:
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
● Por último, mostrar la información de cada objeto
 */
package zboletin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class MiPersona {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        char sexo;
        int edad;
        double peso;
        double altura;
        System.out.println("Escribe el nombre: ");
        nombre = teclado.nextLine();
        do {
            System.out.println("Escribe el sexo M/H");
            sexo = teclado.nextLine().charAt(0);
            if (sexo != 'M' && sexo != 'H') {
                System.out.println("El sexo debe ser 'M' o 'H' ");
            }
        } while (sexo != 'M' && sexo != 'H');
        do {
            System.out.println("Escribe la edad: ");
            edad = Integer.parseInt(teclado.nextLine());
            if (edad < 0) {
                System.out.println("La edad debe ser mayor o igual a 0");
            }
        } while (edad < 0);
        System.out.println("Escribe el peso: ");
        peso = Double.parseDouble(teclado.nextLine());
        System.out.println("Escribe la altura en m: ");
        altura = Double.parseDouble(teclado.nextLine());

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setAltura(altura);
        persona3.setEdad(edad);
        persona3.setPeso(peso);
        persona3.setSexo(sexo);
        if (persona1.calcularIMC() == 0) {
            System.out.println("La persona1 esta en su peso ideal");
        } else if (persona1.calcularIMC() == -1) {
            System.out.println("La persona1 esta por debajo de su peso ideal");
        } else {
            System.out.println("La persona1 está por encima de su peso ideal");
        }
        if (persona2.calcularIMC() == 0) {
            System.out.println("La persona2 esta en su peso ideal");
        } else if (persona1.calcularIMC() == -1) {
            System.out.println("La persona2 esta por debajo de su peso ideal");
        } else {
            System.out.println("La persona2 está por encima de su peso ideal");
        }
        if (persona3.calcularIMC() == 0) {
            System.out.println("La persona3 esta en su peso ideal");
        } else if (persona1.calcularIMC() == -1) {
            System.out.println("La persona3 esta por debajo de su peso ideal");
        } else {
            System.out.println("La persona3 está por encima de su peso ideal");
        }
        
        if(persona1.esmayordeedad()){
            System.out.println("La primera persona es mayor de edad");
        }else{
            System.out.println("La primera persona  no es mayor de edad");
        }

        if(persona2.esmayordeedad()){
            System.out.println("La segunda persona es mayor de edad");
        }else{
            System.out.println("La segunda persona no es mayor de edad");
        }
        
         if(persona3.esmayordeedad()){
            System.out.println("La tercera persona es mayor de edad");
        }else{
            System.out.println("La tercera persona no es mayor de edad");
        }
         
         System.out.println(persona1.toString());
         System.out.println(persona2.toString());
         System.out.println(persona3.toString());
    }
}

//public si esta en otro fichero al main
class Persona {

    //static en lugar de final, como constante
    private static String nombre = "";
    private static int edad = 0;
    private static char sexo = 'M';//H M
    private static double peso = 0;
    private static double altura = 0;
    private String dni;

    public Persona() {
         this.dni= generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni= generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
         this.dni= generarDNI();

    }

    //static cuando haces clase.metodo, si es par un objeto.metodo no
    int calcularIMC() {
        if ((this.peso / Math.pow(this.altura, 2.0)) < 20) {
            return -1;
        } else if (((this.peso / Math.pow(this.altura, 2.0)) >= 20) && ((this.peso / Math.pow(this.altura, 2.0)) <= 25)) {
            return 0;
        } else {
            return 1;
        }
    }

    boolean esmayordeedad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    boolean sexoCorrecto(char sexo) {
        if (this.sexo == sexo) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + "nombre" + this.nombre + "edad" + this.edad + "sexo" + this.sexo + "peso" + this.peso + "altura" + this.altura + '}';
    }

    String generarDNI() {
        StringBuilder midni = new StringBuilder();
        Random random = new Random();
        String letras = "trwagmyfpdxbmjzsqvhlcke";
        for (int i = 0; i < 8; i++) {
            midni.append(random.nextInt(0, 10));
        }
        midni.append(letras.charAt(Integer.parseInt(midni.toString()) % 23));
        return midni.toString();
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }

    public static char getSexo() {
        return sexo;
    }

    public static void setSexo(char sexo) {
        Persona.sexo = sexo;
    }

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double peso) {
        Persona.peso = peso;
    }

    public static double getAltura() {
        return altura;
    }

    public static void setAltura(double altura) {
        Persona.altura = altura;
    }

}
