/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pClasesApoyo;

import java.util.Random;

/**
 *
 * No necesitas usar ninguna palabra clave específica para el acceso default. Si no especificas public,
 * private o protected, el acceso será default
 */
class DadoFalso{
    Random random= new Random();
    public int lanzar(int n)throws RangoExcepcion{
        if(n<1||n>6){
            throw new RangoExcepcion();
        }
        int numeroResultado;
        numeroResultado = random.nextInt(1,8);
        if(numeroResultado==7){
            return n;
        }else{
            return numeroResultado;
        }
    }
    
}

class RangoExcepcion extends Exception{
    @Override
    public String getMessage() {

        return "Numero fuera de rango";
    }
    
}