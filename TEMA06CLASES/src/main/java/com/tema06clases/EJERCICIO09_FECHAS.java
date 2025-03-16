/*
. Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas
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
package com.tema06clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO09_FECHAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalDate fnace;
        //       a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.      
        System.out.println("Escribe tu fecha de nacimiento (YYYY-MM-DD): ");
        fnace = LocalDate.parse(teclado.nextLine());
        long dias = ChronoUnit.DAYS.between(fnace, LocalDate.now());
        System.out.println(dias);

//        b) Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar
//        dichos días a la fecha.
        LocalDate fecha;
        int dia;
        LocalDate fecha2;
        System.out.println("Escribe una fecha (YYYY-MM-DD): ");
        fecha = LocalDate.parse(teclado.nextLine());
        System.out.println("Escribe numero de dias: ");
        dia = Integer.parseInt(teclado.nextLine());
        fecha2 = fecha.plusDays(dia);
        System.out.println(fecha2);

//        c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
        LocalTime hora1;
        LocalTime hora2;
        System.out.println("Escribe una hora (HH:MM:SS): ");
        hora1 = LocalTime.parse(teclado.nextLine());
        System.out.println("Escribe una hora (HH:MM:SS): ");
        hora2 = LocalTime.parse(teclado.nextLine());
        long seg = ChronoUnit.SECONDS.between(hora1, hora2);
        System.out.println(seg);

//        d) ¿Cuántos años bisiestos ha habido desde el año 1 dC?
        long numerosBisiesto = 0;
        for (int i = 0; i <= 2024; i++) {
            if (LocalDate.of(i, 01, 01).isLeapYear()) {
                numerosBisiesto++;
            }
        }
        System.out.println(numerosBisiesto);

//e) Introducir una fecha y mostrar el día de la semana que le corresponde.
        LocalDate fecha3;

        System.out.println("Escribe una fecha (YYYY-MM-DD): ");
        fecha3 = LocalDate.parse(teclado.nextLine());
        System.out.println(fecha3.getDayOfWeek());

//        f) Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y
//        que informe si se puede devolver a día de hoy o no (los plazos de devolución, son
//        respectivamente 5 horas, 6 meses, 15 días)
        int tipoCompra;
        LocalDate fechaCompra;

        LocalTime horaCompra;
        System.out.println("Introduce el tipo de compra realizada: 1- perecedero, 2-electrónica, 3-ropa");
        tipoCompra = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce una fecha de comrpra (YYYY-MM-DD)");
        fechaCompra = LocalDate.parse(teclado.nextLine());
        switch (tipoCompra) {
            case 1 -> {
                if (fechaCompra.equals(LocalDate.now())) {
                    System.out.println("Escribe la hora de compra (HH:MM:SS): ");
                    horaCompra = LocalTime.parse(teclado.nextLine());
                    if (ChronoUnit.HOURS.between(horaCompra, LocalTime.now()) < 5) {
                        System.out.println("Se puede devolver");
                    } else {
                        System.out.println("No se puede devolver");
                    }
                } else {
                    System.out.println("no se puede devolver");
                }
            }
            case 2 -> {
                if (ChronoUnit.MONTHS.between(fechaCompra, LocalDate.now()) < 2) {
                    System.out.println("Se puede devolver");
                } else {
                    System.out.println("No se puede devolver");
                }
            }
            case 3 -> {
                if (ChronoUnit.DAYS.between(fechaCompra, LocalDate.now()) < 15) {
                    System.out.println("Se puede devolver");
                } else {
                    System.out.println("no se puede devolver");
                }

            }
            default -> {
                System.out.println("producto invalido");
            }
        }

//        g) Introducir un año y decir cuántos domingos tiene.
        int año;
        int cantidadDomingo = 0;
        System.out.println("Introduce ujn año: ");
        año = Integer.parseInt(teclado.nextLine());
        LocalDate fechaDomingos = LocalDate.of(año, 01, 01);
        do {
            if (fechaDomingos.getDayOfWeek().getValue() == 7) {
                cantidadDomingo++;
            }
            fechaDomingos = fechaDomingos.plusDays(1);

        } while (fechaDomingos.getYear() == año);
        System.out.println(cantidadDomingo);
//        h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años. 
        LocalDate esteAño;
        Locale local = new Locale("gl", "Es");
        for (int i = 2024; i >= 2019; i--) {
            esteAño = LocalDate.of(i, 12, 31);
            System.out.println(esteAño.getDayOfWeek().getDisplayName(TextStyle.FULL, local));
        }
    }

}
