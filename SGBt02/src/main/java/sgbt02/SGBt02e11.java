/*
 * Alumno Silvia García Bouza
 * Curso: UDAM1
 * Fecha: 2024-09-20
 * Ejercicio: realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente.
Suponemos que los valores son correctos, sin emplear las clases de fechas de Java.
Hay que hacer un tratamiento diferente según sea fin de año, fin de mes (no fin de año)
o un día no fin de mes.
 */
package sgbt02;

import java.util.Scanner;

public class SGBt02e11 {

    public static void main(String[] args) {

        int dia, mes, año, numDiasDelMes;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce el dia: ");
            dia = teclado.nextInt();
            System.out.print("Introduce el mes: ");
            mes = teclado.nextInt();
            System.out.print("Introduce el año: ");
            año = teclado.nextInt();

            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    numDiasDelMes = 31;
                }
                case 2 ->
                    {
                    if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                        numDiasDelMes = 29;
                    } else {
                        numDiasDelMes = 28;
                    }
                }
                case 4, 6, 9, 11 ->
                    numDiasDelMes = 30;
                default ->
                    numDiasDelMes = 0;

            }

            if (año >= 0 && (mes > 0 && mes <= 12) && (dia <= numDiasDelMes && dia > 0)) {
                //calcular el dia siguiente:
                if(!(mes==12)&&dia==numDiasDelMes){
                    System.out.printf("1-%d-%d",mes+1,año);
                }else if(mes==12&&dia==numDiasDelMes){
                    System.out.printf("1-1-%d",año+1);
                }
                else{
                System.out.printf(dia+1+"-%d-%d"+año, mes, año);
                
                }
                
            } else {
                System.out.println("Los valores para dia, mes y año no son correctos");
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un  error: " + e);
        }

    }
}
