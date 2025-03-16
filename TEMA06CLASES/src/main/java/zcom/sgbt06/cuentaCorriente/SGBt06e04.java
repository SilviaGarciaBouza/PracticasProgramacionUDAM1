/*
Haz un programa como el anterior, pero creando dos cuentas en vez de una. Habrá una
opción de menú nueva que será “Cambiar cuenta activa” para pasar de una cuenta a otra.
Tendremos una variable de tipo CuentaCorriente que le puedes llamar cuentaActiva que unas veces
apuntará a una cuenta y otras veces a la otra
Recuerda que las variables de tipo Objeto, a diferencia de los tipos primitivos, son apuntadores a los
objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su constructor, podemos hacer
luego una tercera variable ‘cuentaActiva’ sin constructor y hacer ‘cuentaActiva=cuenta1’ o bien
‘cuentaActiva=cuenta2’ cuando nos interese.
El programa al principio hará algo así:
CuentaCorriente cuenta1 = new CuentaCorriente ("ES010001",1.5f);
CuentaCorriente cuenta2 = new CuentaCorriente ("ES020002",0.5f);
CuentaCorriente cuentaActiva = cuenta1; //sin constructor.
En alguna opción de menú permitirá cambiar cuentaActiva de cuenta1 a cuenta2 y
viceversa. 
 */
package zcom.sgbt06.cuentaCorriente;

/**

 */
public class SGBt06e04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
