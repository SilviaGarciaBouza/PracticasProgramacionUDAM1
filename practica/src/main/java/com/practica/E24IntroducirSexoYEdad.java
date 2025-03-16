/*
Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan
los 30 trabajadores.
Usar tipo char para almacenar sexo.
 */
package com.practica;

import java.util.Scanner;

public class E24IntroducirSexoYEdad {

    public static void main(String[] args) {
        char sexo, sexoMasJoven = 'm';
        int edad, edadMasjoven = 70, numeroMujeres = 0, edadSumaMujeres = 0;
        boolean mayor60=false;
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<30;i++){
            do {
                System.out.printf("Trabajador %d\n", i+1);
                System.out.println("Introduce una edad: ");
                edad=Integer.parseInt(teclado.nextLine());
                if(edad==0){
                    break;
                }
                else if(edad<16||edad>70){
                    System.out.println("Edad incorrecta, la edad tiene que ser entre 16 y 70");
                }
            }while(edad<16||edad>70);
            if(edad==0){
                break;
            }
            
            do{
                System.out.println("Introduce el sexo(m/h): ");
                sexo= teclado.nextLine().charAt(0);
                if(sexo!='m'&&sexo!='h'){
                    System.out.println("Sexo incorrecto");
                }
            }while(sexo!='m'&&sexo!='h');
            if(edad<edadMasjoven){
                edadMasjoven=edad;
                sexoMasJoven=sexo;
                
            }
            if(sexo=='m'){
                numeroMujeres++;
                edadSumaMujeres+=edad;
                
            }
            if(edad>60){
                mayor60=true;
            }
            
            
            
            
        }
        
        System.out.println("Edad mas joven: "+edadMasjoven);
        System.out.println("Sexo mas joven: "+sexoMasJoven);
        System.out.println("Media de edad de las mujeres: "+((double)edadSumaMujeres/numeroMujeres));
        System.out.println("Hay alguno mayor de 60: "+mayor60);

      


    }

}
