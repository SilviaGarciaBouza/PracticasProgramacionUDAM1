/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los bucles
con un número mínimo de iteraciones (se permite el uso de break) sabiendo que:
- Un número primo es solo divisible por 1 y el mismo.
- Los números primos son todos impares salvo el 2.
- Los divisores de un número siempre son menores que la mitad de dicho número (salvo el
mismo).
- Si un número no es divisible por 2 ya no va a serlo por ningún otro número par
 */
package mavenproject1;

public class SGBt03e20 {

    public static void main(String[] args) {

        boolean esPrimo;
        try {

            System.out.println("Los numeros primos:");
            for (int num = 2; num <= 1000; num++) {
                
                if(num==2 ||!(num%2==0)){
                esPrimo=true;
                for (int i = 2; i < num/2; i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                        
                    }
     
                }
                 if (esPrimo==true) {
                        System.out.println(num);
                    }

            }}

        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}


/*  for (int i = 2; i <= 1000; i++) {
                if ((i != 2) && (!(i % 2 == 0))) {
                    for (int j = 2; j < (i/2); j++) {
                        if (!(i % j == 0)) {
                             System.out.println(i);
                        }
                    }
                }else if(i==2){
                    System.out.println(i);
                }
                
            }
*/
