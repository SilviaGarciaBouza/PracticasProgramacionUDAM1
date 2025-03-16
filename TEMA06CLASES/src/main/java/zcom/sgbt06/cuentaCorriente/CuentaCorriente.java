/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zcom.sgbt06.cuentaCorriente;

public class CuentaCorriente{
    int cont=0;
    String IBAN;
    private float saldo;
    private int contadorIngresos;
    private float porcentajeComision;

    public CuentaCorriente(String IBAN, float porcentajeComision) {
        this.IBAN = IBAN;
        this.saldo = 0;
        this.contadorIngresos = contadorIngresos;
        this.porcentajeComision = porcentajeComision;
    }

   
    public void ingresar(float importe){
 
        saldo+=importe;
        cont++;
        if(cont>=3&&cont%3==0){
            saldo+=0.7;
        }    
    }
    
    boolean retirar (float importe){
        if(saldo>=(importe+(porcentajeComision*importe))){
        saldo-=importe;
        saldo-= porcentajeComision*importe;
            System.out.println("Operación realizada");
            return true;
        }
        else{
            System.out.println("No se ha podido realizar la operación");
            return false;
        }
    }
    float getSaldo (){
        return saldo;
    }
    void setComision (float porcentaje){
      porcentajeComision=porcentaje;
    }
    
    float getPorcentajeComision(){
        return porcentajeComision;
    }
}