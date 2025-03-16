/*
Diseña una clase llamada Alumno para gestionar los alumnos de una escuela. Contiene los
atributos: nombre completo, DNI, fecha de nacimiento y nombre de la escuela (común para todos
los alumnos). Además del constructor, los métodos set y get para cada atributo, tendrá los siguientes
métodos:
- Método que nos dice si es mayor de edad o no.
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es
menor que él mismo. False en caso contrario.
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es
exactamente igual en todos los campos (un duplicado). False en caso contrario.
Realiza a continuación un programa sencillo que use la clase definida. 
 */
package sbgt06e12alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author silvia
 */
public class Alumno {
//Atributos:

    private String nombreCompleto;
    private String dni;
    private LocalDate fechaNacimiento;
    private String nombreEscuela = "Nombre";
    //Constructor

    public Alumno(String nombreCompleto, String dni, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno() {
    }

//Set y Get
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    //Método que nos dice si es mayor de edad o no.

    public boolean mayorEdad() {
        long edad;
        edad = ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
        if (edad >= 18) {
            return true;

        } else {
            return false;
        }
    }

// Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es
//menor que él mismo. False en caso contrario.
    public boolean alumnoMayor(Alumno alumno) {
        long edadActual;
        long edadAlumnoPasado;
        edadActual = ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
        edadAlumnoPasado = ChronoUnit.YEARS.between(alumno.getFechaNacimiento(), LocalDate.now());
        if (edadActual > edadAlumnoPasado) {
            return false;
        } else {
            return true;
        }

        // alumno.getFechaNacimiento().isAfter(this.fechaNacimiento);
    }

//Método al que se le pase como parhámetro otro alumno y nos devuelva true si el alumno pasado es
//exactamente igual en todos los campos (un duplicado). False en caso contrario.
    public boolean alumnoDuplicado(Alumno alumno) {
        if (
                this.dni.equals(alumno.getDni()) 
                && this.fechaNacimiento.isEqual(alumno.getFechaNacimiento()) 
                && this.nombreCompleto.equals(alumno.getNombreCompleto()) 
                && this.nombreEscuela.equals(alumno.getNombreEscuela()))
        
        
            {
        return true;
        }else{
            return false;
            }
    }


}
