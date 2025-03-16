/*
Mostrar las tablas de multiplicar del 1 al 9.
 */
package com.practica;


public class E18TablasMultiplicar {

    public static void main(String[] args) {

        for(int i= 1; i<=9; i++){
            System.out.printf("Tabla de multiplicar del %d:\n",i);
            for (int j=1; j<=10; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }

    }
    
}
