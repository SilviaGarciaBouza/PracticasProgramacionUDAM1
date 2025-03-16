/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-22
 * Ejercicio: 
 * Realiza un programa que visualice en pantalla el código ASCII (el código ASCII está
incluido en el Unicode) de los caracteres 'r' y 'R' y sin usar la tabla ASCII.
Pista: Las operaciones de casting pueden servir para que una variable de un tipo sea vista
como de otro tipo.
 */
package sgbt01ampliacion;

public class SGBt01Ampliacione04 {

  
    public static void main(String[] args) {
        try{
            char r = 'r';
            char rMayuscula=  'R';
            int rAscii= (int)r;
            int rMayusculaAscii= (int)rMayuscula;
            System.out.printf("El codigo ASCII del caracter 'r' es: %d", rAscii);
            System.out.printf("\nEl codigo ASCII para el caracter 'R' es: %d", rMayusculaAscii);
            
        }
        catch(Exception e){
                System.out.println("Se ha producido un error: "+e);
    }
    }
    
}
