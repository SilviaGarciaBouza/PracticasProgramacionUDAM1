/*
Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine la superclase
Paciente como abstracta haciendo el método facturar() abstracto, ya que se implementa en las tres
clases hijas. 
 */
package EJERCICIO004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class HospitalMain {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Paciente> list_pacientes = new ArrayList<>();
        char motivo;
        int eleccion;
        String mconsulta;
        String nombre;
        String nacimiento;
        String consulta_anterior;
        int numero_recetas = 0;
        int totalFacturado = 0;
        do {
            do {
                System.out.println("Que quieres hacer?");
                System.out.println("1-Llegada, 2-Salida, 3-acturacion, 4-Salir");
                eleccion = Integer.parseInt(teclado.nextLine());
                if (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4) {
                    System.out.println("Opcion incorrecta!");
                }
            } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);
            switch (eleccion) {
                case 1 -> {
                    do {
                        System.out.println("Motivo de llegada: c-Consult, r-Receta, e-Revision");
                        motivo = teclado.nextLine().charAt(0);
                    } while (motivo != 'c' && motivo != 'r' && motivo != 'e');
                    if (motivo == 'c') {
                        System.out.println("Escribe el motivo de consulta");
                        mconsulta = teclado.nextLine();
                        System.out.println("Escribe tu nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Escribe tu fecha de nacimiento (ej: 2000-01-02)");
                        nacimiento = teclado.nextLine();
                        list_pacientes.add(new PacienteConsulta(mconsulta, nombre, LocalDate.parse(nacimiento)));

                        System.out.println(list_pacientes);
                    } else if (motivo == 'r') {
                        System.out.println("Escribe tu nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Escribe tu fecha de nacimiento (ej: 2000-01-02)");
                        nacimiento = teclado.nextLine();
                        System.out.println("Escribe el numero de recetas: ");
                        numero_recetas = Integer.parseInt(teclado.nextLine());
                        list_pacientes.add(new PacienteRecetas(nombre, LocalDate.parse(nacimiento), numero_recetas));
                        System.out.println(list_pacientes);
                    } else {
                        System.out.println("Escribe tu nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Escribe tu fecha de nacimiento (ej: 2000-01-02)");
                        nacimiento = teclado.nextLine();
                        System.out.println("Escribe la fecha de la consulta anterior (ej: 2000-01-02)");
                        consulta_anterior = teclado.nextLine();
                        list_pacientes.add(new PacienteRevision(LocalDate.parse(consulta_anterior), nombre, LocalDate.parse(nacimiento)));
                        System.out.println(list_pacientes);
                    }

                }
                case 2 -> {
                    System.out.println("Siguiente paciente " + list_pacientes.get(0).getNombre());
                    System.out.println("Coste: " + list_pacientes.get(0).facturar());
                    totalFacturado += list_pacientes.get(list_pacientes.size() - 1).facturar();
                    list_pacientes.remove(0);
                }
                case 3 -> {
                    System.out.println("Facturado: " + totalFacturado);
                }
                case 4 -> {
                    //Accion 4    ;
                }
                default -> {
                }
            }
        } while (eleccion == 1 || eleccion == 2 || eleccion == 3);
        System.out.println("Has salido del programa!");
    }

}

abstract class Paciente {

    private String nombre;
    private LocalDate fecha_nacimiento;

    public Paciente(String nombre, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    abstract public int facturar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

}

class PacienteConsulta extends Paciente {

    private String motivo;
    private int coste = 100;

    public PacienteConsulta(String motivo, String nombre, LocalDate fecha_nacimiento) {
        super(nombre, fecha_nacimiento);
        this.motivo = motivo;
    }

    @Override
    public int facturar() {
        return this.coste;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "PacienteConsulta{" + "motivo=" + motivo + ", coste=" + coste + '}';
    }

}

class PacienteRecetas extends Paciente {

    private int numero_recetas;
    private int coste;

    public PacienteRecetas(String nombre, LocalDate fecha_nacimiento, int numero_recetas) {
        super(nombre, fecha_nacimiento);
        this.numero_recetas = numero_recetas;
        this.coste = 5 * this.numero_recetas;
    }

    @Override
    public int facturar() {
        return this.coste;
    }

    public int getNumero_recetas() {
        return numero_recetas;
    }

    public void setNumero_recetas(int numero_recetas) {
        this.numero_recetas = numero_recetas;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "PacienteRecetas{ , coste=" + coste + '}';
    }

}

class PacienteRevision extends Paciente {

    private LocalDate fecha_visita_anterior;
    int coste;

    public PacienteRevision(LocalDate fecha_visita_anterior, String nombre, LocalDate fecha_nacimiento) {
        super(nombre, fecha_nacimiento);
        this.fecha_visita_anterior = fecha_visita_anterior;
        coste = (ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now()) > 65) ? 30 : 50;
    }

    public LocalDate getFecha_visita_anterior() {
        return fecha_visita_anterior;
    }

    public void setFecha_visita_anterior(LocalDate fecha_visita_anterior) {
        this.fecha_visita_anterior = fecha_visita_anterior;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public int facturar() {
        return this.coste;
    }

    @Override
    public String toString() {
        return "PacienteRevision{" + "fecha_visita_anterior=" + fecha_visita_anterior + ", coste=" + coste + '}';
    }

}

