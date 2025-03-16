/*
Ahora, crea una clase ejecutable que haga lo siguiente:
● Pide por teclado el nombre, la edad, sexo, peso y altura.
● Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
pedidas por teclado, 
el segundo objeto obtendrá todos los anteriores menos el pesoy la altura 
y el último por defecto, para este último utiliza los métodos set para darle
a los atributos un valor.
● Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por
debajo de su peso ideal con un mensaje.
● Indicar para cada objeto si es mayor de edad.
● Por último, mostrar la información de cada objeto.
 */
package com.examen2.persona;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreIntroducido;
        int edadIntroducida;
        char sexointroducido;
        double pesointroducido;
        double alturaIntroducida;
        System.out.println("Escribe el nombre: ");
        nombreIntroducido = teclado.nextLine();
        System.out.println("Escribe la edad: ");
        edadIntroducida = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe el sexo (H/M): ");
        sexointroducido = teclado.nextLine().charAt(0);
        System.out.println("Introduce el peso: ");
        pesointroducido = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce la altura: ");
        alturaIntroducida = Double.parseDouble(teclado.nextLine());
        Persona persona1 = new Persona(pesointroducido, nombreIntroducido, edadIntroducida, sexointroducido, alturaIntroducida);
        Persona persona2 = new Persona(nombreIntroducido, edadIntroducida, sexointroducido);
        Persona persona3 = new Persona();
        persona3.setPeso(50.0);
        persona3.setNombre("Sil");
        persona3.setEdad(36);
        persona3.setSexo('M');
        persona3.setAltura(1.67);
        switch (persona1.calcularIMC()) {
            case -1 -> {
                System.out.println("Persona1 esta por debajo de su peso ideal");
            }
            case 0 -> {
                System.out.println("Persona1 esta en su peso ideal");
            }
            default -> {
                System.out.println("Persona1 esta por encimade su peso ideal");
            }
        }
        switch (persona2.calcularIMC()) {
            case -1 -> {
                System.out.println("Persona2 esta por debajo de su peso ideal");
            }
            case 0 -> {
                System.out.println("Persona2 esta en su peso ideal");
            }
            default -> {
                System.out.println("Persona2 esta por encimade su peso ideal");
            }
        }
        switch (persona3.calcularIMC()) {
            case -1 -> {
                System.out.println("Persona3 esta por debajo de su peso ideal");
            }
            case 0 -> {
                System.out.println("Persona3 esta en su peso ideal");
            }
            default -> {
                System.out.println("Persona3 esta por encimade su peso ideal");
            }
        }

        if (persona1.mayorEdad() == true) {
            System.out.println("Persona1 es mayor de edad");
        } else {
            System.out.println("Persona1 no es mayor de edad");
        }
        if (persona2.mayorEdad() == true) {
            System.out.println("Persona2 es mayor de edad");
        } else {
            System.out.println("Persona2 no es mayor de edad");
        }
        if (persona3.mayorEdad() == true) {
            System.out.println("Persona3 es mayor de edad");
        } else {
            System.out.println("Persona3 no es mayor de edad");
        }
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    

    }
    
}
