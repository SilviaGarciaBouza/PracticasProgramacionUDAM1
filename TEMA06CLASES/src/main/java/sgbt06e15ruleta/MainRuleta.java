/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sgbt06e15ruleta;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class MainRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int dinero;
        System.out.println("¿Cuanto dinero tienes en total para jugar?");
        dinero= Integer.parseInt(teclado.nextLine()); 
        Ruleta ruleta= new Ruleta(dinero);
        
    }
    
}
