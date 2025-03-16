
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Ejercicio 1 [3 puntos]:  Realiza un programa que reciba como entrada un informe que consiste en una cadena de caracteres numéricos llamados niveles, que representan las medidas de los sensores de un reactor nuclear. El programa debe comprobar que este informe es seguro. Un informe sólo es seguro si se cumplen las dos condiciones siguientes:

    • Los niveles aumentan o disminuyen de forma gradual. Es decir, todos los valores de la cadena deben estar en formato creciente o decreciente. 
    • Dos niveles adyacentes cualesquiera difieren al menos en una y como máximo en tres unidades.
Requisitos:
    • El programa pedirá la cadena numérica/informe al usuario.
    • La verificación de si el informe es seguro debe realizarse en una función a parte. 
    • No es necesario validar que la cadena introducida es correcta.
    • Pista: Usa las funciones Character.getNumericValue y Math.abs.
*/
/**
 *
 * @author silvia
 */
public class Examen1ArrayList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la cadena numerica: ");
        String cadenanumerica= teclado.nextLine();
        System.out.println("Es seguro: "+esSeguro(cadenanumerica));
        
       

    }

public static boolean esSeguro(String cadena){
    ArrayList<Integer> cadenaArraylist = new ArrayList<>();
    for(int i=0; i<cadena.length();i++){
        cadenaArraylist.add(Integer.parseInt(Character.toString(cadena.charAt(i))));       
    }
    boolean escreciente=true, esdecrecnte=true;
    //creciente
    for(int j=0; j<cadenaArraylist.size()-1;j++){
    if(cadenaArraylist.get(j)>cadenaArraylist.get(j+1)){
        escreciente=false;
        break;
    }
}
      //decreciente
    for(int j=0; j<cadenaArraylist.size()-1;j++){
    if(cadenaArraylist.get(j)<cadenaArraylist.get(j+1)){
        esdecrecnte=false;
        break;
    }
}
   if(escreciente==false&&esdecrecnte==false){
       return false;
   }
    
     for(int j=0; j<cadenaArraylist.size()-1;j++){
    if(Math.abs(cadenaArraylist.get(j)-cadenaArraylist.get(j+1))<1||Math.abs(cadenaArraylist.get(j)-cadenaArraylist.get(j+1))>3){
        return false;
    }
}
    
    
    return true;
}

}



