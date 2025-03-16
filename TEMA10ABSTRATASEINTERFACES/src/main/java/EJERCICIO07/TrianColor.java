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
 class TrianColor extends TrianguloEquilatero{
    private String color;
    //constructor
    

    public TrianColor(String color, String stilo, float alto, float ancho) {
        super(stilo, alto, ancho);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
}
