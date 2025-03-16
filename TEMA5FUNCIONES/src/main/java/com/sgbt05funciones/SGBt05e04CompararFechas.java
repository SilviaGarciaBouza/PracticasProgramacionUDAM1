/*
       //Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
        //dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
        //de fechas) LO HICE PONIENDO AÑOS AUNQUE SEAN DIFERENTES
 */
package com.sgbt05funciones;

import static com.sgbt05funciones.SGBt05e03CalcularDiaMes.calcularDiasMes;
import static com.sgbt05funciones.SGBt05e03CalcularDiaMes.diasDesdePrincipioDeAño;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class SGBt05e04CompararFechas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año1;
        String mes1;
        int dia1;
        int año2;
        String mes2;
        int dia2;

        int diasDesdePrincipio1;
        int diasDesdePrincipio2;
        //Obtencion de la fecha 1
        do {
            System.out.println("Escribe un mes: ");
            mes1 = teclado.nextLine();
            if (!mes1.equals("diciembre") && !mes1.toLowerCase().equals("febrero") && !mes1.toLowerCase().equals("marzo") && !mes1.toLowerCase().equals("enero") && !mes1.toLowerCase().equals("abril") && !mes1.toLowerCase().equals("mayo") && !mes1.toLowerCase().equals("junio") && !mes1.toLowerCase().equals("julio") && !mes1.toLowerCase().equals("agosto") && !mes1.toLowerCase().equals("septiembre") && !mes1.toLowerCase().equals("octubre") && !mes1.equals("noviembre")) {
                System.out.println("Mes incorrecto, escribe el mes con letras");
            }
        } while (!mes1.equals("diciembre") && !mes1.toLowerCase().equals("febrero") && !mes1.toLowerCase().equals("marzo") && !mes1.toLowerCase().equals("enero") && !mes1.toLowerCase().equals("abril") && !mes1.toLowerCase().equals("mayo") && !mes1.toLowerCase().equals("junio") && !mes1.toLowerCase().equals("julio") && !mes1.toLowerCase().equals("agosto") && !mes1.toLowerCase().equals("septiembre") && !mes1.toLowerCase().equals("octubre") && !mes1.equals("noviembre"));
        do {
            System.out.println("Escribe un año: ");
            año1 = Integer.parseInt(teclado.nextLine());
            if (año1 < 1) {
                System.out.println("El año debe ser mayor a 0");
            }
        } while (año1 <= 1);
        do {
            System.out.println("Escribe un dia: ");
            dia1 = Integer.parseInt(teclado.nextLine());
            if (dia1 < 1) {
                System.out.println("El dia debe ser mayor a 0 y menos o igual a 31");
                if ((dia1 > calcularDiasMes(mes1, año1) || dia1 <= 0)) {
                    System.out.println("El dia es incorrecto");
                }
            }
        } while (dia1 > calcularDiasMes(mes1, año1) || dia1 <= 0);
        //Obtencion de la fecha 2
        do {
            System.out.println("Escribe un mes: ");
            mes2 = teclado.nextLine();
            if (!mes2.equals("diciembre") && !mes2.toLowerCase().equals("febrero") && !mes2.toLowerCase().equals("marzo") && !mes2.toLowerCase().equals("enero") && !mes2.toLowerCase().equals("abril") && !mes2.toLowerCase().equals("mayo") && !mes2.toLowerCase().equals("junio") && !mes2.toLowerCase().equals("julio") && !mes2.toLowerCase().equals("agosto") && !mes2.toLowerCase().equals("septiembre") && !mes2.toLowerCase().equals("octubre") && !mes2.equals("noviembre")) {
                System.out.println("Mes incorrecto, escribe el mes con letras");
            }
        } while (!mes2.equals("diciembre") && !mes2.toLowerCase().equals("febrero") && !mes2.toLowerCase().equals("marzo") && !mes2.toLowerCase().equals("enero") && !mes2.toLowerCase().equals("abril") && !mes2.toLowerCase().equals("mayo") && !mes2.toLowerCase().equals("junio") && !mes2.toLowerCase().equals("julio") && !mes2.toLowerCase().equals("agosto") && !mes2.toLowerCase().equals("septiembre") && !mes2.toLowerCase().equals("octubre") && !mes2.equals("noviembre"));
        do {
            System.out.println("Escribe un año: ");
            año2 = Integer.parseInt(teclado.nextLine());
            if (año2 < 1) {
                System.out.println("El año debe ser mayor a 0");
            }
        } while (año2 <= 1);
        do {
            System.out.println("Escribe un dia: ");
            dia2 = Integer.parseInt(teclado.nextLine());
            if (dia2 < 1) {
                System.out.println("El dia debe ser mayor a 0 y menos o igual a 31");
                if ((dia2 > calcularDiasMes(mes2, año2) || dia2 <= 0)) {
                    System.out.println("El dia es incorrecto");
                }
            }
        } while (dia2 > calcularDiasMes(mes2, año2) || dia2 <= 0);
        diasDesdePrincipio2 = diasDesdePrincipioDeAño(dia2, mes2, año2);
        diasDesdePrincipio1 = diasDesdePrincipioDeAño(dia1, mes1, año1);
        if (diasDesdePrincipio1 < diasDesdePrincipio2) {
            System.out.println(diasDesdePrincipio2 - diasDesdePrincipio1);
        } else {
            System.out.println(diasDesdePrincipio1 - diasDesdePrincipio2);

        }

    }

}
