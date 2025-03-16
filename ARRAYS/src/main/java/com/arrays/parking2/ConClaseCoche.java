/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.arrays.parking2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author silvia
 */
public class ConClaseCoche {

    public static void main(String[] args) {
        Parking p= new Parking();
        System.out.println(p.toString());
        p.aparcar("1111");
        p.aparcar("22222");
        p.aparcar("324413");
        p.aparcar("6666");
        p.aparcar("7777");
        p.aparcar("88888");
                System.out.println("coches ya apar: "+Arrays.toString(p.getListaCoches()));
                p.desaparcar();
                        System.out.println("coches desa: "+Arrays.toString(p.getListaCoches()));
                        System.out.println("plaz lib "+p.plazasLibres());



    }

}

class Parking {
private CocheAparcado[] listaCoches= new CocheAparcado[20];


//   a. Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas.
  public CocheAparcado[] getListaCoches() {
        return listaCoches;
    }
//b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
  public int aparcar(String matricula){
      int numeroPlaza=0;
      for(int i=0; i<this.listaCoches.length; i++){
          if(listaCoches[i]==null){
              listaCoches[i]=new CocheAparcado(matricula);
              numeroPlaza=i+1;
              break;
          }
      }
      return numeroPlaza;
  }

//c. Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a
//desaparcar o bien una cadena vacía si el parking está vacío.
   public String desaparcar(){
      String matricula=" ";
      for(int i=this.listaCoches.length-1; i>=0; i--){
          if(listaCoches[i]!=null){
              matricula=listaCoches[i].getMatricula();
                                   System.out.println("coste"+coste(listaCoches[i]));

              listaCoches[i]=null;

              
              break;
          }
      }
      return matricula;
  }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Arrays.deepHashCode(this.listaCoches);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parking other = (Parking) obj;
        return Arrays.deepEquals(this.listaCoches, other.listaCoches);
    }
  
//d. Mostrar la cantidad de plazas libres en ese momento.
 public int plazasLibres(){
      int cont=0;
      for(int i=this.listaCoches.length-1; i>=0; i--){
          if(listaCoches[i]==null){
              cont++;
          }
      }
      return cont;
  }
 
 
 public double coste(CocheAparcado coche){
    double  micoste=0.2*(double)(ChronoUnit.MINUTES.between(coche.getHoraEntrada(),  LocalTime.now())); 
return micoste;



 }

    @Override
    public String toString() {
        return "Parking{" + "listaCoches=" + listaCoches + '}';
    }
  

}
class CocheAparcado{
    private String matricula;
    private LocalTime horaEntrada;

    public CocheAparcado(String matricula) {
        this.matricula = matricula;
        this.horaEntrada = LocalTime.now();
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.matricula);
        hash = 89 * hash + Objects.hashCode(this.horaEntrada);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CocheAparcado other = (CocheAparcado) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.horaEntrada, other.horaEntrada);
    }

    @Override
    public String toString() {
        return "CocheAparcado{" + "matricula=" + matricula + ", horaEntrada=" + horaEntrada + '}';
    }
    
    
    
}
