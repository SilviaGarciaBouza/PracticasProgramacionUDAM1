/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productos;

import java.util.ArrayList;

/**
 *
 * @author silvia
 */
public class FabricaMain {
 ArrayList<ProductoLacteo> listaProductos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<ProductoLacteo> listaProductos = new ArrayList<>();
//        listaProductos.add(new Yogur("fesa", 0.5, 1.02));
//        listaProductos.add(new Queso(100, 3.5, 1.02));
//        listaProductos.add(new Leche("desnatada", 1, 1.02));

    }

    public static void AgregarProducto(ArrayList<ProductoLacteo> listaProductos, ProductoLacteo productoNuevo) {
        for (ProductoLacteo elemento : listaProductos) {
            listaProductos.add(productoNuevo);
        }
    }

    public static void mostrarProductos(ArrayList<ProductoLacteo> listaProductos) {
        for (ProductoLacteo elemento : listaProductos) {
            System.out.println(elemento.mostrarInfo());
        }
    }

    public static void contarProductosPorTipo(ArrayList<ProductoLacteo> listaProductos) {
        int contLeche = 0, contYogur = 0, contQueso = 0;
        for (ProductoLacteo elemento : listaProductos) {
            if (elemento instanceof Leche) {
                contLeche++;
            } else if (elemento instanceof Yogur) {
                contYogur++;
            } else {
                contQueso++;
            }
        }
        System.out.println("Numero de productos tipo leche: " + contLeche);
        System.out.println("Numero de productos tipo queso: " + contQueso);
        System.out.println("Numero de productos tipo yogur: " + contYogur);
    }

    
     public static double calcularLitrosUsados(ArrayList<ProductoLacteo> listaProductos) {
         double litrosTotales=0;
        for (ProductoLacteo elemento : listaProductos) {
            litrosTotales+=elemento.getLitrosUsados();
        }
        return litrosTotales;
    }
     
      public static double calcularIngresosTotales(ArrayList<ProductoLacteo> listaProductos) {
         double ingresosTotales=0;
        for (ProductoLacteo elemento : listaProductos) {
            ingresosTotales+=elemento.getPrecioVenta();
        }
        return ingresosTotales;
    }
      public static ProductoLacteo buscarProductoPorNombre(ArrayList<ProductoLacteo> listaProductos, String nombre) {
        for (ProductoLacteo elemento : listaProductos) {
            if(elemento.getNombre().equals(nombre)){
                return elemento;
            }
        }
        return null;
    }
      
       public static void eliminarProductoPorNombre(ArrayList<ProductoLacteo> listaProductos, String nombre) {
       // listaProductos.remove()
       
    }
//        public static void contarProductosPorTipo(ArrayList<ProductoLacteo> listaProductos) {
//        int contLeche = 0, contYogur = 0, contQueso = 0;
//        for (ProductoLacteo elemento : listaProductos) {
//            if (elemento instanceof Leche) {
//                contLeche++;
//            } else if (elemento instanceof Yogur) {
//                contYogur++;
//            } else {
//                contQueso++;
//            }
//        }
//        System.out.println("Numero de productos tipo leche: " + contLeche);
//        System.out.println("Numero de productos tipo queso: " + contQueso);
//        System.out.println("Numero de productos tipo yogur: " + contYogur);
//    }
      
}
