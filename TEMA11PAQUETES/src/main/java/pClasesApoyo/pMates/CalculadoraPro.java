/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pClasesApoyo.pMates;

/**
 *
 * @author silvia
 */
class CalculadoraPro extends Calculadora{
    //no podemos hacer override ni super
    public String  sumar(){
        int suma=0;
        for(int i=0; i<listaEnteros.size();i++){
            suma+=listaEnteros.get(i);
        }
        return Integer.toHexString(suma);
    }
    
    //hay override y super

    @Override
    public int menor() {
        int min= super.menor(); 
        if(min<0){
            return 0;
        }else{
            return min;
        }
    }
    
}
