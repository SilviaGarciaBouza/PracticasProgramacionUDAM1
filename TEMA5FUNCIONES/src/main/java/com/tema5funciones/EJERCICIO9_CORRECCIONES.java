/*
5.9. El siguiente programa tiene una variable global llamada saldo sobre la que se ejecutan las
funciones ingresar() y retirar() que aumentan y reducen el saldo respectivamente, no pudiendo
quedar el saldo por debajo de cero. ¿Hay algún error? ¿Cuánto vale la variable saldo al finalizar la
ejecución del programa?
public class Ejercicio {
 public static int saldo=0;
 public static void main(String[] args){
 boolean ok = false;
 ingresar(30);
 retirar(10);
 if (retirar(10)==false) System.out.println("No se puede retirar tanto");
 System.out.println("Saldo final: "+ saldo);
 }
 static void ingresar(int i){
 saldo+=i;
 }
 static boolean retirar(int i){
 if (i>saldo) return false;
 saldo-=i;
 return true;
} }
5.10. Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?
public static void main(String[] args) {
 float saldo = 500f;
 saldo = ingresar(saldo, 400f);
 if (ingresar(saldo, 400f)>1000f)
 System.out.println("Ya tienes más de 1000 euros: " + saldo);
 else System.out.println("No tienes más de 1000 euros: " + saldo);
}
static float ingresar (float saldo, float increm){ return saldo+increm;}
5.11. ¿Qué mostraría este código por pantalla? ¿Por qué?
 public static void main(String[] args) {
 float saldo = 500f;
 ingresar(saldo, 600f);
 if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo);
 else System.out.println("No tienes más de 1000 euros: "+ saldo);
 }
 static void ingresar(float saldo, float increm) {saldo += increm; } 
 */
package com.tema5funciones;

/**
 *
 * @author silvia
 */
public class EJERCICIO9_CORRECCIONES {

  //  public static int saldo = 0;

    public static void main(String[] args) {
//        boolean ok = false;
//        ingresar(30);
//       // retirar(10);sobra
//        if (retirar(10) == false) {
//            System.out.println("No se puede retirar tanto");
//        }
//        System.out.println("Saldo final: " + saldo);
//    }
//
//    static void ingresar(int i) {
//        saldo += i;
//    }
//
//    static boolean retirar(int i) {
//        if (i > saldo) {
//            return false;
//        }
//        saldo -= i;
//        return true;







 float saldo = 500f;
 ingresar(saldo, 600f);
 if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo);
 else System.out.println("No tienes más de 1000 euros: "+ saldo);
 }
 static void ingresar(float saldo, float increm) {saldo += increm; } 














    }


