/*
Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
de fechas)
 */
package com.tema5funciones;

import static com.tema5funciones.EJERCICIO03_CALCULARDIASMES.calcularDiasMes;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO04_DIASENTREFECHAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año1;
        int año2;
        int mes1;
        int mes2;
        int dia1;
        int dia2;

        do {
            System.out.println("Introduce el mes de la primera fecha: ");
            mes1 = Integer.parseInt(teclado.nextLine());
        } while (mes1 <= 0 || mes1 > 13);
        System.out.println("Introduce el año de la primera fecha: ");
        año1 = Integer.parseInt(teclado.nextLine());
        do {
            System.out.println("Introduce el dia de la primera fecha: ");
            dia1 = Integer.parseInt(teclado.nextLine());
        } while (dia1 <= 0 || dia1 > calcularDiasMes(año1, mes1));

        do {
            System.out.println("Introduce el mes de la segunda fecha: ");
            mes2 = Integer.parseInt(teclado.nextLine());
        } while (mes2 <= 0 || mes2 > 13);
        System.out.println("Introduce el año de la segunda fecha: ");
        año2 = Integer.parseInt(teclado.nextLine());
        do {
            System.out.println("Introduce el dia de la segunda fecha: ");
            dia2 = Integer.parseInt(teclado.nextLine());
        } while (dia2 <= 0 || dia2 > calcularDiasMes(año2, mes2));
        
        System.out.println(calcularDiasEntreFechas(dia1, mes1, año1, dia2, mes2, año2));
        
        
        

    }
    
    
    static int calcularDiasEntreFechas(int dia1, int mes1, int año1, int dia2, int mes2, int año2){
        int suma=0;
        
        
            //Distinto año
    
        if(año1>año2){
            año2=año1+año2;
            año1= año2-año1;
            año2=año2-año1;
            
            mes2=mes1+mes2;
            mes1=mes2-mes1;
            mes2=mes2-mes1;
            
            dia2=dia1+dia2;
            dia1= dia2-dia1;
            dia2=dia2-dia1;
        }
        
        
        
        //Mismo año
           if(año1==año2&&mes1==mes2){
           suma= Math.abs(dia1-dia2);
           return suma;
       } else if(año1==año2&&mes1<mes2){
           
           for(int i= mes1+1; i<mes2;i++){
               suma += calcularDiasMes(año1, i);
           }
           suma=suma+calcularDiasMes(año1, mes1)-dia1+dia2;
           return suma;
       }else if (año1==año2&&mes1>mes2){
           
           for(int i= mes2+1; i<mes1;i++){
               suma += calcularDiasMes(año1, i);
           }
           suma=suma+calcularDiasMes(año1, mes2)-dia2+dia1;
           return suma;
       }
    
         for(int j=año1+1; j<año2; j++){
             for(int k=1; k<=12; k++){
                 suma+=calcularDiasMes(j, k);
                 
             }
         }
     
      
        for(int i= mes1+1; i<12;i++){
               suma += calcularDiasMes(año1, i);
           }
           suma=suma+calcularDiasMes(año1, mes1)-dia1;
        for(int i= 1; i<mes2;i++){
               suma += calcularDiasMes(año1, i);
           }
           suma=suma+calcularDiasMes(año2, mes2-1)+dia2;
        return suma;
        
        
    }
    
    
    
    
    
    
//    //usando diasentreprincipioaños
//        public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        int año1;
//        String mes1;
//        int dia1;
//        int año2;
//        String mes2;
//        int dia2;
//
//        int diasDesdePrincipio1;
//        int diasDesdePrincipio2;
//        //Obtencion de la fecha 1
//        do {
//            System.out.println("Escribe un mes: ");
//            mes1 = teclado.nextLine();
//            if (!mes1.equals("diciembre") && !mes1.toLowerCase().equals("febrero") && !mes1.toLowerCase().equals("marzo") && !mes1.toLowerCase().equals("enero") && !mes1.toLowerCase().equals("abril") && !mes1.toLowerCase().equals("mayo") && !mes1.toLowerCase().equals("junio") && !mes1.toLowerCase().equals("julio") && !mes1.toLowerCase().equals("agosto") && !mes1.toLowerCase().equals("septiembre") && !mes1.toLowerCase().equals("octubre") && !mes1.equals("noviembre")) {
//                System.out.println("Mes incorrecto, escribe el mes con letras");
//            }
//        } while (!mes1.equals("diciembre") && !mes1.toLowerCase().equals("febrero") && !mes1.toLowerCase().equals("marzo") && !mes1.toLowerCase().equals("enero") && !mes1.toLowerCase().equals("abril") && !mes1.toLowerCase().equals("mayo") && !mes1.toLowerCase().equals("junio") && !mes1.toLowerCase().equals("julio") && !mes1.toLowerCase().equals("agosto") && !mes1.toLowerCase().equals("septiembre") && !mes1.toLowerCase().equals("octubre") && !mes1.equals("noviembre"));
//        do {
//            System.out.println("Escribe un año: ");
//            año1 = Integer.parseInt(teclado.nextLine());
//            if (año1 < 1) {
//                System.out.println("El año debe ser mayor a 0");
//            }
//        } while (año1 <= 1);
//        do {
//            System.out.println("Escribe un dia: ");
//            dia1 = Integer.parseInt(teclado.nextLine());
//            if (dia1 < 1) {
//                System.out.println("El dia debe ser mayor a 0 y menos o igual a 31");
//                if ((dia1 > calcularDiasMes(mes1, año1) || dia1 <= 0)) {
//                    System.out.println("El dia es incorrecto");
//                }
//            }
//        } while (dia1 > calcularDiasMes(mes1, año1) || dia1 <= 0);
//        //Obtencion de la fecha 2
//        do {
//            System.out.println("Escribe un mes: ");
//            mes2 = teclado.nextLine();
//            if (!mes2.equals("diciembre") && !mes2.toLowerCase().equals("febrero") && !mes2.toLowerCase().equals("marzo") && !mes2.toLowerCase().equals("enero") && !mes2.toLowerCase().equals("abril") && !mes2.toLowerCase().equals("mayo") && !mes2.toLowerCase().equals("junio") && !mes2.toLowerCase().equals("julio") && !mes2.toLowerCase().equals("agosto") && !mes2.toLowerCase().equals("septiembre") && !mes2.toLowerCase().equals("octubre") && !mes2.equals("noviembre")) {
//                System.out.println("Mes incorrecto, escribe el mes con letras");
//            }
//        } while (!mes2.equals("diciembre") && !mes2.toLowerCase().equals("febrero") && !mes2.toLowerCase().equals("marzo") && !mes2.toLowerCase().equals("enero") && !mes2.toLowerCase().equals("abril") && !mes2.toLowerCase().equals("mayo") && !mes2.toLowerCase().equals("junio") && !mes2.toLowerCase().equals("julio") && !mes2.toLowerCase().equals("agosto") && !mes2.toLowerCase().equals("septiembre") && !mes2.toLowerCase().equals("octubre") && !mes2.equals("noviembre"));
//        do {
//            System.out.println("Escribe un año: ");
//            año2 = Integer.parseInt(teclado.nextLine());
//            if (año2 < 1) {
//                System.out.println("El año debe ser mayor a 0");
//            }
//        } while (año2 <= 1);
//        do {
//            System.out.println("Escribe un dia: ");
//            dia2 = Integer.parseInt(teclado.nextLine());
//            if (dia2 < 1) {
//                System.out.println("El dia debe ser mayor a 0 y menos o igual a 31");
//                if ((dia2 > calcularDiasMes(mes2, año2) || dia2 <= 0)) {
//                    System.out.println("El dia es incorrecto");
//                }
//            }
//        } while (dia2 > calcularDiasMes(mes2, año2) || dia2 <= 0);
//        diasDesdePrincipio2 = diasDesdePrincipioDeAño(dia2, mes2, año2);
//        diasDesdePrincipio1 = diasDesdePrincipioDeAño(dia1, mes1, año1);
//        if (diasDesdePrincipio1 < diasDesdePrincipio2) {
//            System.out.println(diasDesdePrincipio2 - diasDesdePrincipio1);
//        } else {
//            System.out.println(diasDesdePrincipio1 - diasDesdePrincipio2);
//
//        }
//
//    }
    
    
    
    
    
    

}

