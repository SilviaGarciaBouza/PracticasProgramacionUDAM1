/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-22
 * Ejercicio: 
 * Prueba el programa del Ámbito de las variables.
a) ¿Qué ocurre si a nivel de clase defino la variable int i = 5 y a nivel del método main
defino una variable int i =10? ¿Cuál de las 2 variables veo en pantalla al intentar
mostrar la i?
b) ¿Y qué sucede si además de las 2 anteriores, ahora a nivel del bloque interno al
método defino una variable int i = 15?
 */

//a) Se muestra la variable de dentro de la funcion.
package sgbt01ampliacion;


public class SGBt01Ampliacione05 {
    int i=15;
  
    public static void main(String[] args) {
        int i=10;
        /* b) Si vuelvo a definir la variable int i = 15 da error porque no se puede volver a decifir la variable
        int i=15;
*/
        System.out.println(i);
        
    }
    
}
