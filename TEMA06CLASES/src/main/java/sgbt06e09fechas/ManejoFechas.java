/*
Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas
con la siguiente funcionalidad:
a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
b) Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar
dichos días a la fecha.
c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
d) ¿Cuántos años bisiestos ha habido desde el año 1 dC?
e) Introducir una fecha y mostrar el día de la semana que le corresponde.
f) Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y
que informe si se puede devolver a día de hoy o no (los plazos de devolución, son
respectivamente 5 horas, 6 meses, 15 días)
g) Introducir un año y decir cuántos domingos tiene.
h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años. 
 */
package sgbt06e09fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;

import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class ManejoFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner teclado = new Scanner(System.in);
        LocalDate fechaNacimiento;
        long diasDesdeTuNacimiento;
        // a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
        System.out.println("Introduce tu fecha de nacimiento (AAAA-MM-DD): ");
        fechaNacimiento= LocalDate.parse(teclado.nextLine());
        diasDesdeTuNacimiento= Math.abs( ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now()));
        System.out.println(diasDesdeTuNacimiento);
        //b) Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar
        //dichos días a la fecha.
        LocalDate fechaIntroducida;
        int numeroDias;
        LocalDate nuevaFecha;
        System.out.println("Escribe una fecha (AAAA-MM-DD): ");
        fechaIntroducida= LocalDate.parse(teclado.nextLine());
        System.out.println("Introduce un numero de dias para añadir a la fecha anterior: ");
        numeroDias= Integer.parseInt(teclado.nextLine());
        nuevaFecha= fechaIntroducida.plusDays(numeroDias);
        System.out.println(nuevaFecha);
        //c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
        LocalTime hora1;
        LocalTime hora2;
        long segundosComparacion;
        System.out.println("Escribe una hora (horas:minutos) Por ejemplo: '08:30' :");
        hora1= LocalTime.parse(teclado.nextLine());
        System.out.println("Escribe otra hora (horas:minutos) Por ejemplo: '08:30' :");
        hora2= LocalTime.parse(teclado.nextLine());
        segundosComparacion= ChronoUnit.SECONDS.between(hora1, hora2);
        System.out.println(segundosComparacion);
        //d) ¿Cuántos años bisiestos ha habido desde el año 1 dC?
        int contadorBisiestos=0;
        for(int i= 1; i<= LocalDate.now().getYear();i++){
            if(LocalDate.of(i,01,01).isLeapYear()==true){
                contadorBisiestos++;
            }        
        }
        System.out.println(contadorBisiestos);
        //e) Introducir una fecha y mostrar el día de la semana que le corresponde.
        LocalDate fechaDiaSemana;
        System.out.println("Introduce una fecha (AAAA-MM-DD): ");
        fechaDiaSemana= LocalDate.parse(teclado.nextLine());
        System.out.println(fechaDiaSemana.getDayOfWeek());
        //f) Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y
        //que informe si se puede devolver a día de hoy o no (los plazos de devolución, son
        //respectivamente 5 horas, 6 meses, 15 días)
        int tipoProducto;
        LocalDate fechaCompra;
        LocalTime horaCompra;
        boolean devolver;
        System.out.println("Escribe el numero que corresponda con el tipo del producto (1- perecedero, 2-electrónica, 3-ropa):");
        tipoProducto= Integer.parseInt(teclado.nextLine());
       
        
        
        System.out.println("Escribe la fecha de compra (AAAA-MM-DD):");
        fechaCompra= LocalDate.parse(teclado.nextLine());
        
        switch(tipoProducto){
            case 1 -> {
                System.out.println("¿A que hora se realiza la compra (horas:minutos) Por ejemplo: '08:30'?");
            horaCompra= LocalTime.parse(teclado.nextLine());
                if(fechaCompra.isEqual(LocalDate.now())&& LocalTime.now().isBefore(horaCompra.plusHours(5))){
                    devolver=true;
                }else{
                    devolver=false;
                }            
            }
            case 2 -> {
            
            if(fechaCompra.plusMonths(6).isBefore(LocalDate.now())){
                devolver=false;
            }else{
                devolver=true;
            }
                }
            case 3 -> {
            if(fechaCompra.plusDays(15).isBefore(LocalDate.now())){
                devolver=false;
            }else{
                devolver=true;
            }
                System.out.println("Se puede devolver: "+devolver);

            }
        }
        
            //g) Introducir un año y decir cuántos domingos tiene.
            
                int añoDomingos;
                LocalDate fechaDomingos;
                int contadorDomingos=0;
                System.out.println("Introduce el año: ");
                añoDomingos= Integer.parseInt(teclado.nextLine());
                fechaDomingos= LocalDate.of(añoDomingos,01, 01);
                
                do{
                    if(fechaDomingos.getDayOfWeek().getValue()==7){
                        contadorDomingos++;
                    }
                    fechaDomingos= fechaDomingos.plusDays(1);
                }while(fechaDomingos.getYear()==añoDomingos);
                System.out.println("El año " + añoDomingos + " tiene " + contadorDomingos + " domingos.");
                
                //h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años. 
                DayOfWeek dia ;
                Locale locale = new Locale("gl", "Es");
                for(int i= LocalDate.now().getYear(); i>=LocalDate.now().getYear()-5; i--){
                    dia = LocalDate.of(i,12,31).getDayOfWeek();
                    System.out.println(dia.getDisplayName(TextStyle.FULL, locale));
                }

    }
    
}



/*
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class JgpT6e09Fechas {

    static Scanner teclado = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Dias desde tu fecha de nacimiento");
            System.out.println("2. Sumar dias a una fecha");
            System.out.println("3. Diferencia entre dos horas en segundos");
            System.out.println("4. Contar años bisiestos desde el año 1 d.C.");
            System.out.println("5. Dia de la semana de una fecha");
            System.out.println("6. Devolucion de un producto");
            System.out.println("7. Contar domingos en un año");
            System.out.println("8. Dia de la semana del 31 de diciembre de los ultimos 5 años");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 ->
                    calcularDiasDesdeNacimiento();
                case 2 ->
                    sumarDiasAFecha();
                case 3 ->
                    diferenciaEntreHoras();
                case 4 ->
                    contarAniosBisiestos();
                case 5 ->
                    diaSemanaDeFecha();
                case 6 ->
                    devolucionProducto();
                case 7 ->
                    contarDomingosEnAnio();
                case 8 ->
                    diaSemanaUltimosCinco();
                case 0 ->
                    System.out.println("¡Hasta luego!");
                default ->
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

//a)Comparar Nacimiento
    // Función a)
    public static void calcularDiasDesdeNacimiento() {
        System.out.print("Introduce tu fecha de nacimiento (AAAA-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(teclado.nextLine());
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(fechaNacimiento, hoy);
        System.out.println("Han pasado " + dias + " días desde tu nacimiento.");
    }

    // Función b)
    public static void sumarDiasAFecha() {
        System.out.print("Introduce una fecha (AAAA-MM-DD): ");
        LocalDate fecha = LocalDate.parse(teclado.nextLine());
        System.out.print("Introduce el número de días a sumar: ");
        int dias = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer
        LocalDate nuevaFecha = fecha.plusDays(dias);
        System.out.println("La nueva fecha es: " + nuevaFecha);
    }

    // Función c)
    public static void diferenciaEntreHoras() {
        System.out.print("Introduce la primera hora (HH:MM:SS): ");
        LocalTime hora1 = LocalTime.parse(teclado.nextLine());
        System.out.print("Introduce la segunda hora (HH:MM:SS): ");
        LocalTime hora2 = LocalTime.parse(teclado.nextLine());
        long segundos = ChronoUnit.SECONDS.between(hora1, hora2);
        System.out.println("La diferencia entre ambas horas es de " + Math.abs(segundos) + " segundos.");
    }

    // Función d)
    public static void contarAniosBisiestos() {
        int bisiestos = 0;
        for (int year = 1; year <= Year.now().getValue(); year++) {
            if (Year.isLeap(year)) {
                bisiestos++;
            }
        }
        System.out.println("Desde el año 1 d.C. ha habido " + bisiestos + " años bisiestos.");
    }

    // Función e)
    public static void diaSemanaDeFecha() {
        System.out.print("Introduce una fecha (AAAA-MM-DD): ");
        LocalDate fecha = LocalDate.parse(teclado.nextLine());
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        System.out.println("El día de la semana es: " + diaSemana);
    }

    // Función f)
    public static void devolucionProducto() {
        System.out.print("Introduce el tipo de producto (1-perecedero, 2-electrónica, 3-ropa): ");
        int tipo = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer
        System.out.print("Introduce la fecha de compra (AAAA-MM-DD HH:MM): ");
        LocalDateTime fechaCompra = LocalDateTime.parse(teclado.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime ahora = LocalDateTime.now();

        boolean sePuedeDevolver = switch (tipo) {
            case 1 ->
                ChronoUnit.HOURS.between(fechaCompra, ahora) <= 5;
            case 2 ->
                ChronoUnit.MONTHS.between(fechaCompra, ahora) <= 6;
            case 3 ->
                ChronoUnit.DAYS.between(fechaCompra, ahora) <= 15;
            default ->
                false;
        };

        System.out.println(sePuedeDevolver ? "Se puede devolver." : "No se puede devolver.");
    }

    // Función g)
    public static void contarDomingosEnAnio() {
        System.out.print("Introduce un año: ");
        int anio = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer
        int domingos = 0;
        for (int mes = 1; mes <= 12; mes++) {
            for (int dia = 1; dia <= LocalDate.of(anio, mes, 1).lengthOfMonth(); dia++) {
                LocalDate DiaMes = LocalDate.of(anio, mes, dia);
                if (DiaMes.getDayOfWeek().getValue() == 7) {
                    domingos++;
                }
            }
        }
        System.out.println("El año " + anio + " tiene " + domingos + " domingos.");
    }

    // Función h)
    public static void diaSemanaUltimosCinco() {
        LocalDate hoy = LocalDate.now();
        int anioActual = hoy.getYear();
        for (int i = 0; i < 5; i++) {
            LocalDate fecha = LocalDate.of(anioActual - i, 12, 31);
            DayOfWeek diaSemana = fecha.getDayOfWeek();
            String diaEnGallego = switch (diaSemana) {
                case MONDAY ->
                    "Luns";
                case TUESDAY ->
                    "Martes";
                case WEDNESDAY ->
                    "Mércores";
                case THURSDAY ->
                    "Xoves";
                case FRIDAY ->
                    "Venres";
                case SATURDAY ->
                    "Sábado";
                case SUNDAY ->
                    "Domingo";
            };
            System.out.println("El 31 de diciembre de " + (anioActual - i) + " fue " + diaEnGallego + ".");
        }
    }
}
*/