/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO07;

/**
 *
 * @author silvia
 */

public class TrianguloEquilatero extends Figura2D{
    public String stilo;//isosceles, restangulos, equilatero....
    //constructor

    public TrianguloEquilatero(String stilo, float alto, float ancho) {
        super(alto, ancho);
        this.stilo = stilo;
    }
    
   
    public void verEstilo(){
        System.out.println("Estilo: "+this.stilo);
    }

    //clases abstratas
    @Override
    double area() {
          return ((super.getAlto()*super.getAncho())/2f);
    }

    @Override
    public double calcularPerimetro() {
        return super.getAncho()*3;
                
    }
    
    
    
    
}
