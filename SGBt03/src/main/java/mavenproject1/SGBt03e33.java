

/*
  Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio:  (Opcional) Amplia el programa anterior para que el usuario pueda introducir previamente la
base destino y el programa pueda pasar a binario (base 2),  (base 4) u octal (base 8). 
*/
package mavenproject1;

import java.util.Scanner;

public class SGBt03e33 {

    public static void main(String[] args) {

        int numero;
        long numeroBinario = 0;
        int base;

        Scanner teclado = new Scanner(System.in);

        try {
            
            System.out.println("Introduce un numero entero : ");
            numero = teclado.nextInt();
            do{
            System.out.println("Elige la base: 2-> binario, 4->ternario 4, 8->octal");
            base= teclado.nextInt();
            if(base!=2&&base!=4&&base!=8){
                System.out.println("La base introducida no es correcta");
            }
            }while(base!=2&&base!=4&&base!=8);
            if (numero >= 0) {
                for (int i = 0; numero > 0; i++) {

                    numeroBinario += ((numero % base) * (long) Math.pow(10.0, i));
                    numero /= base;
                }
                System.out.println("El numero en base " +base+" es: "+numeroBinario);

            } else {
                numero = Math.abs(numero);

                for (int i = 0; numero > 0; i++) {

                    numeroBinario += ((numero % base) * (long) Math.pow(10.0, i));
                    numero /= base;
                }
                System.out.println("El numero en base " +base+" es: -"+numeroBinario);

            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
