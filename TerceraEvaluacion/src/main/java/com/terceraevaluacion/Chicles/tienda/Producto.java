

/*
Ejercicio de Programación Java: Gestión de Inventario de Tienda
Este ejercicio consiste en diseñar e implementar dos clases en Java, Producto y Tienda, para gestionar el inventario y las transacciones de una tienda.

2. Clase Tienda
//
//Atributos:
//
//inventario (List<Producto>): Lista de los productos en la tienda.
//saldo (double): Dinero disponible en la tienda.
//margenBeneficio (double): Factor multiplicador (mayor que 1) para calcular el precio de venta a partir del precio de compra.
//Constructores:
//
//Tienda(double saldo, double margenBeneficio): Inicializa el saldo y el margen de beneficio. El inventario se inicializa vacío.
//Tienda(double saldo, double margenBeneficio, List<Producto> listaProductos): Inicializa el saldo, el margen de beneficio y el inventario con la lista proporcionada.
//Métodos de Instancia:
//
//getInventario(): Retorna una copia de la lista del inventario.
//cantidadInventario(): Retorna la cantidad de productos en el inventario.
//precioVentaTotal(): Retorna la suma del precio de venta de todos los productos en el inventario.
//precioCompraTotal(): Retorna la suma del precio de compra de todos los productos en el inventario.
//precioVentaMedio(): Retorna el precio de venta promedio de los productos en el inventario.
//precioCompraMedio(): Retorna el precio de compra promedio de los productos en el inventario.
//precioVentaMasCaro(): Retorna el precio de venta del producto más caro.
//precioVentaMasBarato(): Retorna el precio de venta del producto más barato.
//productoMasCaro(): Retorna una lista con todos los productos que tienen el precio de venta más caro.
//productoMasBarato(): Retorna una lista con todos los productos que tienen el precio de venta más barato.
//aplicarDescuento(double d): Aplica un descuento d a todos los productos del inventario utilizando el método 
//aplicarDescuento de la clase Producto.
//Extras (Fácil):
//
//Sobrecargar todos los métodos anteriores (excepto constructores y getInventario()) para que reciban un String 
//categoria como argumento y operen solo sobre los productos de esa categoría.
//Sobrecargar el método getInventario() para que reciba un String categoria y devuelva una lista con los
//productos de esa categoría.
//Extras (Difícil):
//
//Sobrecargar todos los métodos anteriores (excepto constructores y getInventario()) para que reciban un 
//Predicate<Producto> como argumento y operen solo sobre los productos que cumplan el predicado.
//Buscar una forma de implementar las sobrecargas anteriores evitando la duplicación de código (sugiere 
//crear métodos estáticos que reciban una lista de productos como argumento).
//Métodos de Instancia (Continuación):
//
//comprarProducto(Producto p): Compra un producto. Resta del saldo el precioCompra de p. Si p no tiene ID 
//o precio de venta, se le asigna un nuevo ID único y el precio de venta se calcula (precioCompra * margenBeneficio). 
//Añade el producto al inventario.
//comprarProducto(double precioCompra, String nombre, String categoria): Crea un nuevo objeto Producto con los 
//atributos proporcionados. Le asigna un nuevo ID único, calcula el precio de venta (precioCompra * margenBeneficio), 
//resta el precio de compra del saldo y lo añade al inventario.
//comprarProducto(double precioCompra, double precioVenta, String nombre, String categoria): Crea un nuevo objeto 
//Producto con los atributos proporcionados. Le asigna un nuevo ID único, utiliza el precioVenta proporcionado, 
//resta el precio de compra del saldo y lo añade al inventario.
//comprarLista(List<Producto> listaProductos): Compra todos los productos de la lista proporcionada.
//venderProducto(Producto p): Vende un producto. Aumenta el saldo en el precioVenta de p y lo elimina del inventario.
//venderProducto(int ID): Vende un producto buscando el producto por su ID. Utiliza el método encontrarProducto(int ID)
//para obtener el producto.
//encontrarProducto(int ID): Retorna el objeto Producto con el ID especificado. Retorna null si no se encuentra.
//(Opcional) productoAparece(int ID): Retorna true si existe un producto con el ID especificado en el inventario, false 
//en caso contrario.
//mostrarInformacion(): Imprime en consola la información de todos los productos del inventario en formato de tabla (ID,
//Nombre, Categoría, Precio Compra, Precio Venta). Si la clase Producto implementa Comparable, la tabla debe estar 
//ordenada por ID por defecto.
//mostrarInformacion(Comparator c): Imprime la información de todos los productos del inventario en formato de tabla,
//ordenados según el Comparator proporcionado. No debe modificar la lista del inventario.
//Extra (Difícil):
//
//Añadir un atributo margenes de tipo Map<String, Double>, donde la clave es la categoría del producto y el valor 
//es el margen de beneficio específico para esa categoría.
//Añadir un método para añadir o actualizar márgenes de beneficio para categorías de productos.
//Al comprar un producto, comprobar si su categoría existe como clave en el atributo margenes. Si existe, aplicar el
//margen de beneficio específico de la categoría. Si no existe, aplicar el margenBeneficio por defecto de la tienda.
//Este enunciado describe un ejercicio completo que cubre los conceptos de clases, objetos, atributos, constructores,
//métodos, interfaces (Comparable), colecciones (List, Map), genéricos, sobrecarga de métodos y programación orientada 
//a objetos en Java. La sección de "Extras" 
//permite aumentar la dificultad del ejercicio para estudiantes más avanzados.
// */
//
//
//import java.util.Comparator;
//
///**
// * 1.Clase producto
//Atributos:
//
//precioCompra (double): Precio de compra del producto.
//precioVenta (double): Precio de venta del producto.
//nombre (String): Nombre del producto.
//categoria (String): Descripción en una palabra del tipo de producto.
//ID (int): Identificador único del producto dentro de la tienda.
//Constructores:
//
//Producto(double precioCompra, String nombre, String categoria): Inicializa precio de compra, nombre y categoría. 
//* El precio de venta y el ID se establecerán posteriormente.
//Producto(double precioCompra, double precioVenta, String nombre, String categoria): Inicializa precio de compra, 
//* precio de venta, nombre y categoría. El ID se establecerá posteriormente.
//Producto(int ID, double precioCompra, double precioVenta, String nombre, String categoria): Inicializa todos los atributos.
//Métodos de Instancia:
//
//Getters y setters para todos los atributos.
//toString(): Devuelve una representación en String del producto.
//aplicarDescuento(double d) (opcional): Multiplica el precioVenta por el factor d (donde d es menor que 1 para aplicar un descuento).
//mostrarInformacion() (opcional): Imprime en consola la información del producto formateada (similar a una fila de la tabla de la clase Tienda).
//* Extra (Difícil):
//
//Implementar la interfaz Comparable<Producto> para ordenar los productos por ID ascendente.
//Hacer que el método mostrarInformacion() de la clase Tienda ordene por defecto los productos utilizando el orden natural definido por compareTo().
//Crear métodos estáticos en la clase Producto que devuelvan objetos de Comparator<Producto> para comparar productos por:
//Precio de compra ascendente.
//Precio de compra descendente.
//Precio de venta ascendente.
//Precio de venta descendente.
// */
//public class Producto  implements Comparable<Producto>{
//    private double precioCompra;
//    private double precioVenta;
//    private String nombre;
//    private String categoria;
//    private int id;
//
//    
//    public void aplicarDescuento(double d) {
//        this.setPrecioVenta(precioVenta*d);
//    }
//    public void mostrarInformacion(){
//        
//            System.out.println("Producto{" + "precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", nombre=" + nombre + ", categoria=" + categoria + ", id=" + id + '}');
//    }
//    
//    
//    
//    public Producto(double precioCompra, String nombre, String categoria) {
//        this.precioCompra = precioCompra;
//        this.nombre = nombre;
//        this.categoria = categoria;
//    }
//
//    public Producto(double precioCompra, double precioVenta, String nombre, String categoria, int id) {
//        this.precioCompra = precioCompra;
//        this.precioVenta = precioVenta;
//        this.nombre = nombre;
//        this.categoria = categoria;
//        this.id = id;
//    }
//
//    public Producto(double precioCompra, double precioVenta, String nombre, String categoria) {
//        this.precioCompra = precioCompra;
//        this.precioVenta = precioVenta;
//        this.nombre = nombre;
//        this.categoria = categoria;
//    }
//
//    public double getPrecioCompra() {
//        return precioCompra;
//    }
//
//    public void setPrecioCompra(double precioCompra) {
//        this.precioCompra = precioCompra;
//    }
//
//    public double getPrecioVenta() {
//        return precioVenta;
//    }
//
//    public void setPrecioVenta(double precioVenta) {
//        this.precioVenta = precioVenta;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getCategoria() {
//        return categoria;
//    }
//
//    public void setCategoria(String categoria) {
//        this.categoria = categoria;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Producto{" + "precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", nombre=" + nombre + ", categoria=" + categoria + ", id=" + id + '}';
//    }
//       
//   
////compara por id
//    @Override
//    public int compareTo(Producto o) {
//        return Integer.compare(this.id,o.id);
//    }
//
//    // Métodos estáticos para comparadores
//    public static Comparator<Producto> compararPorPrecioCompraAscendente() {
//        return Comparator.comparingDouble(producto->producto.getPrecioCompra());
//    }
//
//    public static Comparator<Producto> compararPorPrecioCompraDescendente() {
//        return Comparator.comparingDouble(Producto::getPrecioVenta).reversed();
//    }
//
//    public static Comparator<Producto> compararPorPrecioVentaAscendente() {
//        return Comparator.comparingDouble(producto -> producto.getPrecioVenta());
//    }
//
//    public static Comparator<Producto> compararPorPrecioVentaDescendente() {
//        return Comparator.comparingDouble(Producto::getPrecioVenta).reversed();
//    }
//    
//    
//}
//public static Comparator<Producto> compararPorPrecioCompraDescendente() {
//        return Comparator.comparingDouble(producto->producto.getPrecioCompra()).reversed();
//    }
//
//}