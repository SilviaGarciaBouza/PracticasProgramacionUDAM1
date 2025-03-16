/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO07;

/**
 *
 * @author silvia
 */
public 
class Rectangulo extends Figura2D{

    public Rectangulo(float alto, float ancho) {
        super(alto, ancho);
    }

   


    public boolean escuadrado(){
        if(super.getAlto()==super.getAncho()){
            return true;
        }
        return false;
    }
    
    //clases abstratas
        @Override
    double area() {
          return ((super.getAlto()*super.getAncho()));
    }

    @Override
    public double calcularPerimetro() {
            return super.getAlto()*2+super.getAncho()*2;
    }
    
    
    
    
}