/*
//Realiza a continuación un programa sencillo que use la clase definida. 
 */
package sbgt06e12alumno;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class AlumnoMain {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String dni;
        String nombreCompleto;
        LocalDate fechaNacimiento;
        
        String dni2;
        String nombreCompleto2;
        LocalDate fechaNacimiento2;
        
        System.out.println("Escribe el nombre completo del alumno: ");
        nombreCompleto= teclado.nextLine();
        System.out.println("Escribe el dni del alumno: ");
        dni= teclado.nextLine();
        System.out.println("Escribe la fecha de nacimiento (YYYY-MM-DD): ");
        fechaNacimiento=LocalDate.parse(teclado.nextLine());
         Alumno alumno1= new Alumno(nombreCompleto, dni, fechaNacimiento);
        System.out.println(alumno1.mayorEdad());
        
        
        System.out.println("Escribe el nombre completo del alumno: ");
        nombreCompleto2= teclado.nextLine();
        System.out.println("Escribe el dni del alumno: ");
        dni2= teclado.nextLine();
        System.out.println("Escribe la fecha de nacimiento (YYYY-MM-DD): ");
        fechaNacimiento2=LocalDate.parse(teclado.nextLine());
         Alumno alumno2= new Alumno(nombreCompleto2, dni2, fechaNacimiento2);
        
        System.out.println(alumno1.alumnoMayor(alumno2));
        System.out.println(alumno1.alumnoDuplicado(alumno2));
        
        
        
    }
    
}
