/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zboletin;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class TrabajoconNumeros {

    /**
     *TODO ir poniendo todo en variables
     */
    public static void main(String[] args) {
        // Introduce un numero menor que 50 esta lo de disvisonRaizSuma
        int numero;
        int contadorMultiplos7=0;
        int sumaMultiplos7=0;
        float raizCuadradaSumaMultiplos7;
        float disvisonRaizSuma;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Introduce un numero: ");
        numero= Integer.parseInt(teclado.nextLine());
        if(numero>=50||numero<=0){
            System.out.println("El numero debe ser menor a 50 y mayor o igual a 0.");
        }
        }while(numero>=50||numero<=0);
        
        for(int i=numero; i>1;i--){
            if(i%7==0){
                contadorMultiplos7++;
                sumaMultiplos7+=i;
            }
        }
        raizCuadradaSumaMultiplos7= (float)Math.sqrt(sumaMultiplos7);
        disvisonRaizSuma= raizCuadradaSumaMultiplos7/(float)sumaMultiplos7;
        System.out.printf("Resultado: 0.3f", disvisonRaizSuma);
        
    }
    
}
