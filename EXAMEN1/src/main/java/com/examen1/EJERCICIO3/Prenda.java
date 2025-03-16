/*
A partir de la clase prenda realizar los siguientes cambios:
a- crear un atributo stockPrendas de tipo long que se actualice sumando que se
actualice sumando uno cada vez ue se instancie la clase prrenda.
b- crea un atributo tipo  de tipo String que se establezca a null si el valor 
introducido en el constructor no coincide con alguno de los suguientes: "falda",
"pantalon","jersey":
c- Crea un atributo referencia que se establezca de forma automaticagenerando un 
numero aleatorio de 5 cufras cada vezq que se instancie la clase Prenda.
d- crea un atributo double precioConiva.
e-Modifica el metodo setPrecioConIva pARA que establezca el valor del atributo  
precioconiva a partir de los atributos iva y precioSinIva. Este metodo solo se 
podra llamar desde el contructor de la clase.
f- crea un constructor que reciva como parametros los atributos: 
tipo, talla, sexo, precioSinIva, e iva einicialice correctamente todos los atributos,
incluidos precioConIva.
Crea otro constructor que reciva como parametro tipo y precioSinIva, establezca el atributo
talla a 42 y el sexo a 'H' y el iva a 21.0 por defecto e inicialice correctamente el 
resto de atributos.
h-Crea el metodo toString que muestre todos los valores de todos losatributos de la clase.
 */
package com.examen1.EJERCICIO3;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author silvia
 */
public class Prenda {

    private String talla; //(XS, S, M, L, XL, 32, 34, 38,...)
    private char sexo; // 'H', 'M'
    private double precioSinIva;
    private double iva;
//    a- crear un atributo stockPrendas de tipo long que se actualice sumando que se
//actualice sumando uno cada vez ue se instancie la clase prrenda.
    private long stockPrendas=0;
    
//     crea un atributo tipo  de tipo String que se establezca a null si el valor 
//introducido en el constructor no coincide con alguno de los suguientes: "falda",
//"pantalon","jersey":
    private String tipo;
    
//    Crea un atributo referencia que se establezca de forma automaticagenerando un 
//numero aleatorio de 5 cufras cada vezq que se instancie la clase Prenda.

    private String referencia;
    
       private String createReferencia(){
           StringBuilder referencia= new StringBuilder();
           Random random = new Random();
           for(int i=0; i<5; i++){
               referencia.append(random.nextInt(0,10));
           }
           return referencia.toString();
       }
    
   //d- crea un atributo double precioConiva. 
    private double precioConIva;
    
//    e-Modifica el metodo setPrecioConIva pARA que establezca el valor del atributo  
//precioconiva a partir de los atributos iva y precioSinIva. Este metodo solo se 
//podra llamar desde el contructor de la clase.
     private double setPrecioConIva(double precioSinIva, double iva) {
        this.precioConIva = precioSinIva+((iva*precioSinIva)/100);
        return this.precioConIva;
    }


    public long getStockPrendas() {
        return stockPrendas;
    }

    public void setStockPrendas(long stockPrendas) {
        this.stockPrendas = stockPrendas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

   
    public String getReferencia() {
        return referencia;
    }
    
    
    
//     crea un constructor que reciva como parametros los atributos: 
//tipo, talla, sexo, precioSinIva, e iva einicialice correctamente todos los atributos,
//incluidos precioConIva.

    public Prenda(String talla, char sexo, double precioSinIva, double iva, String tipo) {
        this.talla = talla;
        this.sexo = sexo;
        this.precioSinIva = precioSinIva;
        this.iva = iva;
        if(tipo.equals("falda")==false&&tipo.equals("pantalon")==false&&tipo.equals("jersey")==false ){
            this.tipo=null;
        }else{
        this.tipo= tipo;
        }
        this.stockPrendas++;
        this.precioConIva= setPrecioConIva(this.precioSinIva, this.iva);
        this.referencia= createReferencia();
    }
    
 
    
    
    
//Crea otro constructor que reciva como parametro tipo y precioSinIva, establezca el atributo
//talla a 42 y el sexo a 'H' y el iva a 21.0 por defecto e inicialice correctamente el 
//resto de atributos.

    public Prenda(double precioSinIva, String tipo) {
        this.precioSinIva = precioSinIva;
        if(tipo.equals("falda")==false&&tipo.equals("pantalon")==false&&tipo.equals("jersey")==false ){
            this.tipo=null;
        }else{
        this.tipo= tipo;
        }
        this.talla = "42";
        this.sexo = 'H';
        this.iva = 21.0;
        this.stockPrendas++;
        this.precioConIva= setPrecioConIva(this.precioSinIva, this.iva);
        this.referencia= createReferencia();

    }
    
    
    
    
    
    

    public String getTalla() {
        return talla;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public double getIva() {
        return iva;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
//    h-Crea el metodo toString que muestre todos los valores de todos losatributos de la clase.

    @Override
    public String toString() {
        return "Prenda{" + "talla=" + talla + ", sexo=" + sexo + ", precioSinIva=" + precioSinIva + ", iva=" + iva + ", stockPrendas=" + stockPrendas + ", tipo=" + tipo + ", referencia=" + referencia + ", precioConIva=" + precioConIva + '}';
    }
    
    
    
    

}

