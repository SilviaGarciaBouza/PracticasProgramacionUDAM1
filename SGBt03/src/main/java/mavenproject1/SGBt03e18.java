/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-23
 * Ejercicio: Mostrar las tablas de multiplicar del 1 al 9. 
 */
package mavenproject1;


public class SGBt03e18 {

    public static void main(String[] args) {

        try {
            for(int i=1; i<=9; i++){
            System.out.printf("Tabla de multiplicar del %d: \n",i);
            for(int j = 1; j<=10; j++){
                System.out.printf("%d * %d = %d\n",i,j,(i*j) );
            }
            
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}
