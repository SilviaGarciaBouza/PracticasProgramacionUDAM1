/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author silvia
 */
public class Leche extends ProductoLacteo{
    private String tipoLeche; //"entera", "desnatada"...

    public Leche(String nombre,String tipoLeche, double litrosUsados, double precioVenta) {
        super(nombre,"Leche", litrosUsados, precioVenta);
        this.tipoLeche = tipoLeche;
    }

    @Override
    public String mostrarInfo() {
        return "Nombre"+super.getNombre()+"Tipo: "+super.getTipo()+", tipo de leche: "+this.tipoLeche+", litros usados: "+super.getLitrosUsados()+", precio venta: "+super.getPrecioVenta();
    }
    
}
