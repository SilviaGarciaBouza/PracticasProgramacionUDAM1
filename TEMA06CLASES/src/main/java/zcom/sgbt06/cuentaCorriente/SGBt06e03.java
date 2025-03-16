/*
  
A partir de la clase CuentaCorriente que te proporcionará el profesor, crea un programa en el
que se creen una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un menú le
permita al usuario hacer operaciones como ingresar, retirar y consultar saldo en la cuenta. El único
atributo público de la cuenta es el IBAN (String de dígitos/letras). Otros atributos privados son saldo,
contadorIngresos, porcentajeComision, pero como son privados, no tenemos acceso a ellos. Los métodos
son:
- constructor (String Iban, float porcComision): se le pasa el nombre de la cuenta y el porcentaje de
comisión para las retiradas de dinero. También fija saldo inicial a cero
- void ingresar (float importe): aumenta el saldo. Si se hacen 3 ingresos consecutivos, sin ninguna
retirada en medio, se regala 0,7 euros al usuario (pero de esto no tenemos que preocuparnos, es el
método de la clase que nos proporciona el que lo hace).
- boolean retirar (float importe): reduce el saldo solo si es posible ya no puede quedar negativo (devuelve
si se ha podido efectuar la retirada o no). Cada retirada tiene una comisión asociada.
- float getSaldo (): devuelve el saldo actual en la cuenta.
- setComision (float porcentaje). Cambia la comisión de retirada.
- getPorcentajeComision() devuelve un float con el porcentaje de comisión a aplicar en retiradas. 
 */
package zcom.sgbt06.cuentaCorriente;

import java.util.Scanner;

/**
 *
 * @author silvia.garciabouza
 */
public class SGBt06e03 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numeroOperacion;
        float importeIngresar, importeRetirar, comision;
        boolean masOperaciones=true;
        char masOp;
        CuentaCorriente miCuenta = new CuentaCorriente("754957377539857uedhfurehjuv", 0.03f);
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("Ingresar(1)-Retirar(2)-Consultar saldo(3)-Cambiar comision(4)");
            numeroOperacion = Integer.parseInt(teclado.nextLine());
            switch (numeroOperacion) {
                case 1 -> {                                  
                    System.out.println("Introduce el importe a ingresar");
                    importeIngresar = Float.parseFloat(teclado.nextLine());
                    miCuenta.ingresar(importeIngresar);
                }
                case 2 -> {
                    System.out.println("Introduce el importe a retirar");
                    importeRetirar = Float.parseFloat(teclado.nextLine());
                    miCuenta.ingresar(importeRetirar);
                }
                case 3 -> {
                    System.out.println("El saldo es " + miCuenta.getSaldo());
                }
                case 4 -> {
                    System.out.println("Introduce la nueva comisión");
                    comision = Float.parseFloat(teclado.nextLine());
                    miCuenta.getPorcentajeComision();
                }
                
            }
            
            do {
                System.out.println("Quieres hacer otra operacion?(s/n)");
                masOp = teclado.nextLine().charAt(0);
                switch (masOp) {
                    case 's' -> {
                        masOperaciones = true;
                    }
                    case 'n' -> {
                        masOperaciones = false;
                    }
                    default -> {
                        System.out.println("Respuesta incorrecta");
                    }
                }
            } while (masOp != 'n' && masOp != 's');
        
        } while (masOperaciones == true);
        
    }
    
}
