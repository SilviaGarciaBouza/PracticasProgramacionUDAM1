
import java.util.Arrays;

/*
a) Indica los errores del siguiente código y muestre lo que saca por pantalla:
 int [] a = new int [] {10,21,37,40,51};
 int p=0,i=0;
 for (int x=0;x<a.length;x++)
 if (x%2==0) p+=a[x]; else i+=a[x];
 System.out.printf("%d-%d\n",p,i);
 Añade la línea: System.out.println(Arrays.toString(a)); ¿Qué muestra?
 */

/**
 *
 * @author silvia
 */
public class EJ00ARRAYSCorreccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] a = new int [] {10,21,37,40,51};
        int p=0,l=0;
        for (int x=0;x<a.length;x++)
        if (x%2==0) p+=a[x]; else l+=a[x];
        System.out.printf("%d-%d\n",p,l);
        System.out.println(Arrays.toString(a));
    
    
    
  
    int [] arr4 = new int [] {10,20,30,40,50};
    int [] arr5 = new int [5];

    
    int [] arr6 = new int [] {10,20,30,40,50};
    for(int i=0; i<=arr6.length-2; i++){
         arr6[i]=arr6[i+1];
   
        
    }

     System.out.println(Arrays.toString(arr6));
   
}
}