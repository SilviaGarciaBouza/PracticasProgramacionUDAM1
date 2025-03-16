/*
Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes
y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar
un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero
de ese año (no usar clases Java de fechas). 

 */
package com.sgbt05funciones;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class SGBt05e03CalcularDiaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año;
        String mes;

        do {
            System.out.println("Escribe un mes: ");
            mes = teclado.nextLine();
            if (!mes.equals("diciembre") && !mes.toLowerCase().equals("febrero") && !mes.toLowerCase().equals("marzo") && !mes.toLowerCase().equals("enero") && !mes.toLowerCase().equals("abril") && !mes.toLowerCase().equals("mayo") && !mes.toLowerCase().equals("junio") && !mes.toLowerCase().equals("julio") && !mes.toLowerCase().equals("agosto") && !mes.toLowerCase().equals("septiembre") && !mes.toLowerCase().equals("octubre") && !mes.equals("noviembre")) {
                System.out.println("Mes incorrecto, escribe el mes con letras");
            }
        } while (!mes.equals("diciembre") && !mes.toLowerCase().equals("febrero") && !mes.toLowerCase().equals("marzo") && !mes.toLowerCase().equals("enero") && !mes.toLowerCase().equals("abril") && !mes.toLowerCase().equals("mayo") && !mes.toLowerCase().equals("junio") && !mes.toLowerCase().equals("julio") && !mes.toLowerCase().equals("agosto") && !mes.toLowerCase().equals("septiembre") && !mes.toLowerCase().equals("octubre") && !mes.equals("noviembre"));
        do {
            System.out.println("Escribe un año: ");
            año = Integer.parseInt(teclado.nextLine());
            if (año < 1) {
                System.out.println("El año debe ser mayor a 0");
            }
        } while (año <= 1);
        System.out.println(calcularDiasMes(mes.toLowerCase(), año));

        /*BBBB
        Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
        dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
        de fechas) */
        int año2;
        String mes2;
        int dia2;

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
        System.out.println(diasDesdePrincipioDeAño(dia2, mes2, año2));
        
        
        
        
        
      
        

    }

   public  static int calcularDiasMes(String mes, int año) {
        int diasMes;
        diasMes = switch (mes) {
            case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" ->
                31;
            case "febrero" ->
                bisiesto(año);

            case "abril", "junio", "septiembre", "noviembre" ->
                30;
            default ->
                0;
        };
        return diasMes;

    }

   public static  int bisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return 29;
        } else {
            return 28;
        }
    }
    /*BBBB
    Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
        dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
        de fechas) */
    public static int diasDesdePrincipioDeAño(int dia, String mes, int año) {
        int numeroMes= switch (mes) {
            case  "enero"->1;
                
            case  "febrero"->2;
               
            case  "marzo"->3
                 ;
            case  "abril"->4
                 ;
            case  "mayo"->5
                 ;
            case "junio" ->6
                 ;
            case "julio" ->7
                 ;
            case "agosto"->8
                 ;
            case "septiembre" ->9
                 ;
            case "octubre" ->10
                 ;
            case  "noviembre"->11
                 ;
            default ->12
                ;         
        };
        String mes2;
        int diasMes=0;
        mes2 = switch (numeroMes) {
            case  1->"enero";
                
            case  2->"febrero";
               
            case  3->"marzo"
                 ;
            case  4->"abril"
                 ;
            case  5->"mayo"
                 ;
            case 6 ->"junio"
                 ;
            case 7->"julio" 
                 ;
            case  8->"agosto"
                 ;
            case 9->"septiembre" 
                 ;
            case 10->"octubre" 
                 ;
            case  11->"noviembre"
                 ;
            default->"diciembre"
                ;
          
        };
        diasMes +=dia;
        for(int i=numeroMes-1; i>=1;i--){
            
            diasMes += calcularDiasMes(mes2, año);
        }
        
        return diasMes;   
    }
    
    
    
 

}
