
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
. Realizar un programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6 (como
si fuese lanzar un dado). Utilizando los métodos estáticos de la clase Collections guarda en otro
ArrayList la distribución de resultados obtenidos (cuantas veces ha salido el uno, cuantas veces ha
salido el dos, etc…) y muestra su contenido. Finalmente, también mediante métodos de Collections,
mostrar la diferencia de veces entre el número que más ha salido y el que menos ha salido. 

 */
public class EXAMENINVENTADO {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            l.add(r.nextInt(1, 7));
        }
        
        System.out.println(Collections.frequency(l, 1));
        System.out.println(Collections.frequency(l, 2));
        System.out.println(Collections.frequency(l, 3));
        System.out.println(Collections.frequency(l, 4));
        System.out.println(Collections.frequency(l, 5));
        System.out.println(Collections.frequency(l, 6));
        
        
                ArrayList<Integer> f = new ArrayList<>();
                f.add(Collections.frequency(l, 1));
                f.add(Collections.frequency(l, 2));
                f.add(Collections.frequency(l, 3));
                f.add(Collections.frequency(l, 4));
                f.add(Collections.frequency(l, 5));
                f.add(Collections.frequency(l, 6));
                System.out.println(f);
                
                System.out.println("mas");
                System.out.println(Collections.max(f));
                System.out.println(Collections.min(f));
                System.out.println("resta:");
                System.out.println(Collections.max(f)-Collections.min(f));
                System.out.println(f.indexOf(Collections.max(f)));
                System.out.println(f.indexOf(Collections.min(f)));

    }

}
