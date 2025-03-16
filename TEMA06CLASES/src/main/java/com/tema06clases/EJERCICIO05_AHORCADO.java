/*
A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que permita
al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya que son privados,
pero sus métodos públicos son:
- Constructor(String txtAdivinar, String txtPista). Crea el juego con la frase a adivinar y con un texto de
pista para el jugador.
- Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin pistas.
- boolean probarLetra (char x). Comprueba si la letra pasada como parámetro está en la frase a adivinar,
en caso afirmativo, devuelve true¸ sino false.
- boolean adivinada(). Devuelve true si se ha adivinado la frase, false en caso contrario.
- boolean perdio(). Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase,
false en caso contrario.
- char leerLetra (). Pide al usuario por consola una letra y devuelve dicha letra.
- void pintar (). Dibuja un “tablero” en la consola, con el estado del juego.
Como en ejercicios anteriores empezaremos creando una instancia de Ahorcado con
uno de los constructores que tiene. Luego habrá un bucle para jugar mientras no
adivine la palabra secreta y no pierda. Dentro del bucle leeremos la letra por
teclado, probará si es correcta o no y pintará el tablero
 */
package com.tema06clases;

import java.util.Scanner;

/**
 *
 * @author silvia
 */
public class EJERCICIO05_AHORCADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
       char letra;
        
        
        
        Ahorcado ahorcado1= new Ahorcado("elefante", "Es un animal muy grande");
        for(int i=1; i<=10;i++) {
            
            
            if(ahorcado1.probarLetra(ahorcado1.leerLetra())==true){
                System.out.println("La letra esta en la palabra");
            }else{
                
                System.out.println("La letra no esta en la palabra");
            }
            ahorcado1.pintar();
            if(ahorcado1.adivinada()){
                System.out.println("Has adivinado la palabra");
                break;
            }
            if(ahorcado1.perdio()){
                System.out.println("Has perdido");
                break;
            }
        }
        
    }
    
}





 class Ahorcado {
    private final String fraseAdivinar;
    private final String pista;
    private final int MAX_ERRORS;
    private int intentos;
    private StringBuilder fraseActual;
   
public Ahorcado (String f, String  p ){
      fraseAdivinar=f;
      pista=p; 
      MAX_ERRORS = 10;
      intentos = 0;
      
      fraseActual = new StringBuilder (f);
      for (int i=0; i< fraseActual.length(); i++){
           if (fraseActual.charAt(i)!=' ') fraseActual.setCharAt(i, '.');
      }
      
}

public Ahorcado (String f ){
       this (f, "");    
}

public boolean probarLetra (char p){
       String temp;
                  
       if (fraseAdivinar.indexOf(p)==-1){
           intentos ++;
           return false;
       }
       else {
           for (int i=0;i<fraseAdivinar.length();i++) {
                 if (fraseAdivinar.charAt(i)== p) 
                    fraseActual.setCharAt(i,p);     
           }
           return true;
       }
}
       
public boolean adivinada (){
    if (fraseAdivinar.equals(fraseActual.toString())) 
         return true;
     else
         return false;        
}

public boolean perdio () {
    if (intentos ==MAX_ERRORS) return true; else return false;
}

public char leerLetra () {
    System.out.println ("Introduce letra:");
    String entradaTeclado; char letraEntrada;
    Scanner entradaEscaner = new Scanner (System.in);
    entradaTeclado = entradaEscaner.nextLine ();
    return entradaTeclado.charAt(0);
}

public void pintar (){
System.out.print("\n----------------------------------------------------\n");
System.out.println("Estado actual:" + fraseActual);
System.out.println("Pista        :" + pista);
System.out.println("Llevas " + intentos + " fallos  de " + MAX_ERRORS);
switch (intentos) {
    case 10: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println("/.\\..|.");
        System.out.println(".....|.");
        System.out.println("-------");
        break;
    case 9: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println("/....|.");
        System.out.println(".....|.");
        System.out.println("-------");
        break;
    case 8: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");
		break;    
    case 7: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");
       break;
    case 6: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println(".|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 5: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");              
        break;
    case 4: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 3: 
        System.out.println(".-----.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 2: 
        System.out.println(".......");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 1: 
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println("-------");        
        break;
    case 0: 
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");        
        break;
   }
} //pintar

} //fin clase

