
import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 3 [4 puntos]: Programa una clase llamada Password que cumpla los siguientes requisitos:
    • Debe tener dos atributos, longitud y contraseña.
    • Debe implementar los siguientes constructores:
        ◦ Un constructor vacío.
        ◦ Un constructor con la longitud por parámetro. Generará una contraseña aleatoria con esa longitud.
        ◦ Un constructor que recibe la contraseña por parámetro.
    • Los métodos que implementa serán: 
        ◦ Método get para contraseña, longitud.
        ◦ Método toString para mostrar el atributo contraseña.
        ◦ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 2 minúsculas y mas de 3 números.
        ◦ generarPassword(): genera la contraseña del objeto con la longitud que se le haya pasado como parámetro. 
Ejemplo de cómo generar una letra mayúscula de forma aleatoria usando la clase Random:
// Generar un número aleatorio entre 0 y 25 (correspondiente a 'A' - 'Z') 
int numeroAleatorio = random.nextInt(26); 
// Obtener la letra mayúscula sumando el número aleatorio al valor de 'A' 
char letraMayuscula = (char) ('A' + numeroAleatorio);
Programa otra clase llamada Usuario que cumpla las siguientes condiciones:
    • Debe tener los atributos nombre y password (de tipo Password).
    • Un atributo estático usuarioCreado de tipo boolean para determinar si hay un usuario creado.
    • Tendrá un constructor que reciba los atributos nombre y password por parámetro.
    • Método get para nombre y contraseña.
    • Método toString para imprimir el nombre y la contraseña.
Clase ejecutable (En un fichero aparte):
    • Crea un menú con las opciones: crear usuario, eliminar usuario, mostrar usuario y salir.
    • Al elegir la opción crear usuario el programa debe pedir el nombre y a continuación debe permitir elegir entre introducir una contraseña o generarla de forma aleatoria. 
    • El programa debe validar si la contraseña introducida por el usuario es fuerte y volver a pedirla si no lo es.
    • El programa no debe permitir crear más de un usuario.
    • Si el usuario elige la opción de borrar usuario, el programa pedirá el nombre y la contraseña, si son válidos eliminará el usuario.
    • La opción mostrar usuario hará uso de los métodos toString.
 */
public class Examen2ArrayList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        int opcion;
        String cont;
        StringBuilder micon;
        String nombre="";
        Usuario user= new Usuario();
        
        Password p;
        do {
            do {
                System.out.println("Que quieres hacer?");
                System.out.println("1-Crear user, 2-Eliminar user, 3-Mostrar user, 4-Salir");
                eleccion = Integer.parseInt(teclado.nextLine());
                if (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4) {
                    System.out.println("Opcion incorrecta!");
                }
            } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4);
            switch (eleccion) {
                case 1 -> {
                    if (Usuario.isUsuarioCreado() == true) {
                        System.out.println("Ya hay usuario creado");
                    } else {
                        //Accion 1    ;
                        System.out.println("Escribe el nombre: ");
                        nombre = teclado.nextLine();
                        do {
                            System.out.println("Quieres elegir contraseña(marca 0) o generarla de forma aleatoria(marca 1)? ");
                            opcion = Integer.parseInt(teclado.nextLine());
                        } while (opcion != 0 && opcion != 1);
                        if (opcion == 0) {
                            do {
                                System.out.println("Indica la contraseña: ");
                                cont = teclado.nextLine();
                                micon = new StringBuilder();
                                micon.append(cont);
                                if (Password.esfuerte(micon) == false) {
                                    System.out.println("La contraseña no es fuerte no es valida.");
                                }
                            } while (Password.esfuerte(micon) == false);

                            p = new Password(micon);

                        } else {
                            System.out.println("Indica longitud de contraseña, minimo 7 para ser fuerte");
                            int longit = Integer.parseInt(teclado.nextLine());
                            p = new Password(longit);

                        }
                        user = new Usuario(nombre, p);

                    }
                }
                case 2 -> {
                    //Accion 2    ;
                    if (Usuario.isUsuarioCreado() == true) {
                        System.out.println("Indica el nombre: ");
                        String nombreborrar = teclado.nextLine();
                        System.out.println("Indica contraseña: ");
                        String c = teclado.nextLine();
                        if (user.getNombre().equals(nombre) && user.getP().getContraseña().toString().equals(c)) {
                            Usuario.setUsuarioCreado(false);
                        }

                    }
                     else{
                        System.out.println("No hay usuario creado");
                
            }
                }
            
         
                case 3 -> {
                    //Accion 3    ;
                    if(Usuario.isUsuarioCreado()==true){
                    System.out.println(user.toString());
                    }else{
                        System.out.println("No hay usuario creado");
                    }
                }
                case 4 -> {
                    //Accion 4    ;
                }
                default -> {
                }
            }
        
    }
    while (eleccion == 1 || eleccion == 2 || eleccion

    == 3);
    System.out.println (

"Has salido del programa!");

    }

}

class Usuario {

    private Password p;
    private String nombre;
    static private boolean usuarioCreado = false;

    public Usuario(String nombre, Password p) {
        this.nombre = nombre;
        this.p = p;
        usuarioCreado = true;
    }

    public Usuario() {
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "p=" + p + ", nombre=" + nombre + '}';
    }

  static public void eliminarUser(){
      usuarioCreado=false;
  }

    public static void setUsuarioCreado(boolean usuarioCreado) {
        Usuario.usuarioCreado = usuarioCreado;
    }
    
    
    public Password getP() {
        return p;
    }

    public String getNombre() {
        return nombre;
    }

    public static boolean isUsuarioCreado() {
        return usuarioCreado;
    }

}

class Password {

    private int longitud;
    private StringBuilder contraseña= new StringBuilder();

  

    public Password(int longitud) {
        this.longitud = longitud;
        
             String letrasmin = "abcdefghijklmnopqrstuvwxyz";
        String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       
        Random r = new Random();
        
        for (int i = 0; i < longitud; i++) {
            if (i < 3) {
                int numero = r.nextInt(0, 10);

                contraseña.append(numero);
            } else if (i < 5) {
                int n = r.nextInt(0, 25);
                contraseña.append(letrasMay.charAt(n));
            } else {
                int n = r.nextInt(0, 25);
                contraseña.append(letrasmin.charAt(n));
            }
        }
            
        
    }

    static public boolean esfuerte(StringBuilder contras) {
        int contadornumeros = 0, contminusc = 0, contmayusc = 0;
        for (int i = 0; i < contras.length(); i++) {
            if (Character.isDigit(contras.charAt(i))) {
                contadornumeros++;
            } else if (Character.isUpperCase(contras.charAt(i))) {
                contmayusc++;
            } else if (Character.isLowerCase(contras.charAt(i))) {
                contminusc++;

            }
        }
        if (contadornumeros < 3 || contmayusc < 2 || contminusc < 2) {

            return false;
        }
        return true;
    }

    public  StringBuilder generaContraseña(int longit) {
        String letrasmin = "abcdefghijklmnopqrstuvwxyz";
        String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.longitud = longit;
        Random r = new Random();
        for (int i = 0; i < contraseña.length(); i++) {
            if (i < 3) {
                int numero = r.nextInt(0, 10);

                contraseña.append(numero);
            } else if (i < 5) {
                int n = r.nextInt(0, 25);
                contraseña.append(letrasMay.charAt(n));
            } else {
                int n = r.nextInt(0, 25);
                contraseña.append(letrasmin.charAt(n));
            }
        }
        return contraseña;
    }

    public Password(StringBuilder contraseña) {
        this.longitud = contraseña.length();
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public StringBuilder getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return ", contrase\u00f1a=" + contraseña;
    }

}
