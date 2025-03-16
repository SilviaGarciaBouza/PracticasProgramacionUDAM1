/*
Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes
y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar
un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero
de ese año (no usar clases Java de fechas). 
 */
package com.tema5funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO03_CALCULARDIASMES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int año;
        int mes;
        int dia; 
        
        
        
        System.out.println("Escribe un año: ");
        año = Integer.parseInt(teclado.nextLine());
        do{
         System.out.println("Escribe el numero de mes: ");
        mes = Integer.parseInt(teclado.nextLine());
        }while (mes >12|| mes<=0) ; 
        do {
            System.out.println("Introduce el dia: ");
            dia = Integer.parseInt(teclado.nextLine());
        } while (dia <= 0 || dia > calcularDiasMes(año, mes));
        //calcula los dias del mes
        System.out.println(calcularDiasMes(año, mes));
        //calcula los dias desde inicio del año:
        System.out.println(diasDesdePrincipioDeAño(año, mes, dia));
        
    }

     //calcula los dias del mes
    public static int calcularDiasMes(int año, int mes) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (bisiesto(año)) {
                    return 29;
                } else {
                    return 28;
                }
            }

            default -> {
                return 30;
            }

        }
    }

    public static boolean bisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
     //calcula los dias desde inicio del año:
    public static int diasDesdePrincipioDeAño(int año, int mes, int dia){
        int suma=0;
        suma+=dia;
        for(int i= 1; i<mes; i++){
            suma+=calcularDiasMes(año, mes);
        }       
        return suma;
    }

}
