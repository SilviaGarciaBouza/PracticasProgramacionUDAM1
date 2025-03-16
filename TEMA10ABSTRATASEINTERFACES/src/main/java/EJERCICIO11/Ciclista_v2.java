/*
9. Desarrolla una interfaz llamada Ciclista con un método llamado recorrer() al que se le pasa un
número de kilómetros y una cadena con tipo de terreno y devuelve los segundos que tarda en
recorrerlo. Una interfaz llamada Nadador con un método llamado nadar a la que se le pasan metros
y devuelve los segundos en recorrerlo, y por último otra interfaz llamada Saltador con un método
saltarAltura que no recibe parámetros y que devuelve los centímetros saltados.
• Desarrolla una clase Delfin que implemente la interfaz Nadador. El tiempo en recorrer una
distancia es aleatorio entre 40km/h y 70km/hora
• Desarrolla una clase BallenaAzul que implemente la interfaz Nadador. El tiempo en recorrer
una distancia es de 10km/h para las mayores de 5 años y 13km/h para las menores.
• Desarrolla una clase TriAtleta que implemente las tres interfaces, con los criterios que tu
consideres (pueden devolver valores aleatorios entre unos mínimos y máximos que tú
decidas o tener en cuenta otros parámetros como edad, sexo, etc.).
• Realiza un programa sencillo que cree instancias de delfines, ballenas azules y triatletas y
use los métodos desarrollados.  */
package EJERCICIO11;



/**
 *
 * @author silvia
 */
public interface Ciclista_v2 {
    int recorrer(int numeroKm, String tipoTerreno);//devuelve el tiempo en seg q tarda en recorrerlo
    
}
