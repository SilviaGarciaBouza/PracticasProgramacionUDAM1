/*
 * Alumno silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-29
 * Ejercicio: Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: 

 */
package mavenproject1;


public class SGBt03e26 {

    public static void main(String[] args) {

        int cantidadNumerosFila=10;
    

        try {
            //Programa a)
            for(int i= 0; i<9; i++){
                for (int j= 0;j<=cantidadNumerosFila;j++ ){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
            System.out.println("");
            
            //Programa b)
             for(int i= 0; i<9; i++){
                for (int j= 0;j<=i;j++ ){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
            System.out.println("");
            
            //Programa c)
            for(int i= 1; i<=9; i++){
                for (int j= cantidadNumerosFila-i;j>=0;j-- ){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
            System.out.println("");
            
              //Programa d)
            for(int i= 1; i<=9; i++){
                for (int j= 9;j>(9-i);j-- ){
                    System.out.print(j);
                }
                System.out.print("\n");
            }
            

           
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }

    }
}