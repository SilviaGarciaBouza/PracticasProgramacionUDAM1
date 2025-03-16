/*
Para comparar buscar... en clases creada por nos hay que sobreescribir el metodo equals
 */
package com.modulos;

/**
 *
 * @author silvia
 */
public class M05Equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public class NombreClase {

        String atributo1;
        int atributo2;

        public NombreClase(String nombre, int edad) {
            this.atributo1 = nombre;
            this.atributo2 = edad;
        }

        @Override
        public int hashCode() {
            int hash = 7;
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
            if (obj instanceof NombreClase == false) {
                return false;
            }
            NombreClase other = (NombreClase) obj;
            if (this.atributo2 == other.atributo2 && this.atributo1.equals(other.atributo1)) {
                return true;
            }
            return false;
        }
    }
}
