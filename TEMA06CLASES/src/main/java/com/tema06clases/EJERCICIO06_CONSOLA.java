/*
A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la máquina.
Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por
turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede
el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila.
Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un
bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego
hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada
(fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane
uno de los dos.
Desconocemos los atributos de la clase Nim ya que son privados, pero sus métodos públicos son:
- Constructor () por defecto. Se crea una instancia del juego.
- boolean juega (int fila, int cant). Valida los datos y retira la cantidad de palillos indicada de la
fila indicada devolviendo true. Devuelve false si los parámetros no son válidos. Las filas van
de 0 a 2.
- boolean fin() devuelve true si se alcanzó el final del juego (un solo palillo en el tablero).
- int piensa (). Se invoca para que la máquina piensa su jugada y devuelve un entero cuyas
decenas son la fila (0,1,2) y las unidades son los palillos que retira (entre 1 y 7), pero no implica
que haga dicha jugada. Lo normal será llamar luego al método juega con los parámetros
obtenidos con piensa().
La clase Consola, tiene los siguientes métodos públicos estáticos:
- pintarTablero (Nim tablero). Se le pasa un tablero de Nim y lo pinta por consola.
- Int leerEntero(texto). Pide un valor por consola y valida que sea un entero de forma que si
mete letras o valores incorrectos no “casca” y vuelve a pedir que se introduzcan
correctamente. El texto que se pasa como parámetro es el que le dice al usuario lo que tiene
que introducir, así no hace falta meter antes un System.out.println. Ejemplo:
x=leerEntero(“introduzca fila”); hará internamente ya System.out.println (“introduzca fila”)
Hay que tener en cuenta que los usuarios hablamos de filas 1,2 y 3 mientras que la clase Nim habla
de filas 0,1 y 2.
Haz un programa que empiece siempre la máquina (ganará siempre) y, si quieres, haz otro en que
empieces tú, a ver si eres capaz de ganarle.
Por último, si no quieres, no es necesario usar el método leerEntero(), puedes usar la lectura de
teclado habitual: nextInt(), nextLine(), etc.
Crearemos una instancia del juego y luego un bucle mientras no sea fin de juego.
Alternaremos movimientos de la máquina: piensa() y juega() con movimientos del
jugador: leerEntero() y juega().
Los métodos de la clase Consola son estáticos, no hay que crear instancia.
En general, procuraremos siempre de separar la parte de interface de usuario (println, nextInt,
etc…) de la lógica del programa. Así podremos transportar fácilmente esa lógica a otro tipo de
programas, con otra interface (consola, interface gráfica, página web, etc.)
En este programa, la clase Nim no depende de la interface de usuario, para cambiar a otro tipo de
entorno simplemente sustituiremos la clase Consola por otro tipo de sistema de interacción con el
usuario.
Trata de seguir esta filosofía en las clases que desarrolles. 
 */
package com.tema06clases;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO06_CONSOLA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nim nim1= new Nim();
        do{
            
        }while(nim1.fin()==false);
    }
    
}


//CLASE NIM- LA CLASE DEL JUEGO
 class Nim {
    public int [] palillos = {3,5,7};
    
public Nim (){}

public boolean juega (int fila, int cantidad){
    if (fila <0 || fila > 2) return false; 
    if (palillos[fila]< cantidad)  return false;
    palillos[fila]-=cantidad;
    return true;
}

public boolean fin (){
    if (palillos[0]+palillos[1]+palillos[2] <= 1) return true; 
    return false;
}

public int piensa () {
    int MENOR; int MAYOR; int MEDIO;
    
    try {Thread.sleep(3000);} catch (InterruptedException e) {}
    //ordenar
    if (palillos[0] > palillos [1] && palillos[0] > palillos [2]){
       MAYOR = 0;  if (palillos[1] > palillos [2]) {MEDIO= 1; MENOR = 2; }
                   else {MEDIO= 2; MENOR = 1;}
    }
    else {
       if (palillos[1] > palillos [2]) {
           MAYOR = 1; if (palillos[0] > palillos [2]) { MEDIO= 0; MENOR = 2;}
                      else  { MEDIO= 2; MENOR = 0;} 
       }
       else {
           MAYOR = 2; if (palillos[0] > palillos [1]) { MEDIO= 0; MENOR = 1;}
                      else  { MEDIO= 1; MENOR = 0;} 
       }
    }
    //elegir la combinacion correcta
    if (palillos[MENOR] == 0 && palillos[MEDIO]==0) 
       { /*REDUCIR A UNO EL TERCERO Y FIN*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == 0 && palillos[MEDIO] == 1 && palillos[MAYOR] > 1)
       { /*REDUCIR A 0 1 0 y gano*/ return MAYOR*10+palillos[MAYOR];}
    if (palillos[MENOR] == 0 && palillos[MEDIO] < palillos[MAYOR]) 
       { /*IGUALAR TERCERO A SEGUNDO*/ return MAYOR*10 +(palillos[MAYOR]-palillos[MEDIO]);}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 1 && palillos[MAYOR] > 1)
       { /*REDUCIR A 1 1 1*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == palillos[MEDIO])
       { /*REDUCIR A CERO EL TERCERO*/ return MAYOR*10+palillos[MAYOR];}
    if (palillos[MAYOR] == palillos[MEDIO] && palillos[MENOR]!=0) 
       { /*REDUCIR A CERO EL PRIMERO*/ return MENOR*10+palillos[MENOR];}
        
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 2 && palillos[MAYOR] > 3 ) 
       { /*IGUALAR TERCERO A 3*/ return MAYOR*10+palillos[MAYOR]-3;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 3 ) 
       { /*DEJAR TERCERO A 2*/ return MAYOR*10+palillos[MAYOR]-2;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 4 && palillos[MAYOR] > 5 ) 
       { /*IGUALAR TERCERO A 5*/ return MAYOR*10+palillos[MAYOR]-5;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 5 && palillos[MAYOR] > 4 ) 
       { /*IGUALAR TERCERO A 5*/ return MAYOR*10+palillos[MAYOR]-4;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 3 ) 
       { /*IGUALAR TERCERO A 1*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 4 && palillos[MAYOR] == 5 ) 
       { /*IGUALAR PRIMERO A 1*/ return MENOR*10+palillos[MENOR]-1;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 5 && palillos[MAYOR] == 6 ) 
       { /*IGUALAR SEGUNDO A 4*/ return MEDIO*10+palillos[MEDIO]-4;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 4 && palillos[MAYOR] == 5 ) 
       { /*IGUALAR PRIMERO A 1*/ return MENOR*10+palillos[MENOR]-1;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 4 && palillos[MAYOR] == 6 ) 
       { /*IGUALAR PRIMERO A 2*/ return MENOR*10+palillos[MENOR]-2;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 5 && palillos[MAYOR] == 7 ) 
       { /*QUITAR UNO AL AZAR */ 
           Random r = new Random();
           int pos = r.nextInt(3);
           return pos*10+1;}
    /*resto de posibilidades: quitar uno del mayor.*/
    return MAYOR*10+1;
}
} //fin clase



//CLASE CONSOLA-PARQ QUE LA MAQUINA JUEGUE CON NOS

 class Consola {  
      
public Consola (){}

public static int leerEntero (String texto) {
    int valor=-1;  boolean error;
    do  {   
        error = false;
        Scanner teclado = new Scanner(System.in);
        System.out.print(texto);
        String txt = teclado.nextLine();
        txt = txt.replaceAll("\\s","");
        try {
          valor = Integer.parseInt(txt);
        }  catch( Exception e ) {System.out.println("> Valor incorrecto."); error=true;}
    }  while (error);
    return valor;
}

public static void pintarTablero (Nim tablero){
    int i,j;
    
    System.out.println ("\n-------TABLERO-----------" );
    for (i=0;i<=2;i++) {
        System.out.print ("Fila " + (i+1) + "(" + tablero.palillos[i]+"):  " );
        for (j=1;j<=tablero.palillos[i];j++)System.out.print("O ");
        System.out.print ("\n");
    }
    System.out.println ("-------------------------\n" );
}

} //fin clase