/*
Ejercicio 2: Crea una clase llamada Cuenta que tendrá los siguientes atributos a los que no
queremos que se acceda directamente: titular, saldo (puede tener decimales) e iban.
● El titular será obligatorio, la cantidad es opcional y el ibán se genera de forma
automática cada vez que se crea una nueva cuenta. Crea dos constructores que
cumplan lo anterior.
● Crea sus métodos get, set y toString.
Tendrá dos métodos de tipo public:
● ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
introducida es negativa, no se hará nada.
● retirar(double cantidad): se retira una cantidad a la cuenta si el saldo es mayor o
igual a la cantidad que se pretende retirar. Si el saldo es menor que la cantidad que
se pretende retirar no se hace nada
Tendrá un método de tipo private:
generarIban(): Se crea un identificador de cuenta formado por las letras ES y 5 dígitos
numéricos que generaremos de forma aleatoria.
● Crea un método ejecutable dentro de la clase Cuenta y haz dos instancias de la
clase, es decir crea dos objetos llamados cuenta1 y cuenta2.
● Ingresa 200 euros de cuenta1 y retira 500 euros de la cuenta2.
Llama al método getIban() del objeto cuenta1 e imprime lo que devuelve.
● Crea otro método ejecutable en una clase a parte, y realiza los pasos anteriores.
¿Qué observas?¿Tiene sentido tener un método setter del atributo iban?
//hacen los mismo,
tiene sentido pq es un atributo privado y asi solo se puede modificar dentro de la misma clase.
 */
package zboletin;

import java.util.Random;

/**
 *
 * @author silvia.garciabouza
 */
//public class MiCuenta {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Cuenta cuenta1= new Cuenta("titular1");
//        Cuenta cuenta2= new Cuenta("titular2");
//        cuenta1.ingresar(200);
//        cuenta2.retirar(500);
//        System.out.println(cuenta1.getIban());//imprime el iban
//        
//        
//    }
//
//}

class Cuenta {

    //Atributo
    private String titular;
    private double saldo;
    private String iban;
    

    //Constructores
    public Cuenta(String titular) {
        
        this.titular = titular;
        this.iban=generarIban();
       
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo=saldo;
        this.iban=generarIban();
        
    }

    //Metodos
    public void ingresar(double cantidad){
       
        if(cantidad<0){}
        else{
            
            this.saldo+=cantidad;
        }
    }
    public void retirar(double cantidad){
        if(cantidad<=this.saldo){
            this.saldo-=cantidad;
        }
    }
    
    private String generarIban(){
        Random random = new Random();
        this.iban = "ES" + random.nextInt(00000, 100000);
        return this.iban;
    }
    
    
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + ", iban=" + iban + '}';
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta("titular1");
        Cuenta cuenta2= new Cuenta("titular2");
        cuenta1.ingresar(200);
        cuenta2.retirar(500);
        System.out.println(cuenta1.getIban());//imprime el iban
    }

}
