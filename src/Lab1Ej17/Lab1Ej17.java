/*
Se dispone de la clase Publicación del ejercicio anterior y se desea crear una 
nueva clase base llamada Ventas que obtenga un arreglo con las ventas del último 
semestre de una determinada publicación. Esta clase debe tener funciones miembros 
Leer() y Mostrar() que obtenga y visualice las citadas ventas. Modificar las clases 
Libro y Disco, lea y visualice las publicaciones.
 */
package Lab1Ej17;
import java.util.Scanner;
public class Lab1Ej17 {
    public static void main(String[] args) {
        Libro17 libritos=new Libro17();
        Disco17 disquitos=new Disco17();
        Ventas ventitas=new Ventas();
        Scanner lector=new Scanner(System.in);
        
        int opcion;
        
    do{
        System.out.println("Digite la opcion deseada: ");
        System.out.println("1. Ingresar las caracteristicas de un libro: ");
        System.out.println("2. Mostrar las caracteristicas del libro: ");
        System.out.println("3. Salir: ");
        opcion=lector.nextInt();
        
        switch (opcion){
            case 1: libritos.Cargar_Datos();
                    libritos.Cargar_Datos_libro();
                    disquitos.Cargar_Datos_Disco();
                    ventitas.Leer();
                break;
            case 2: libritos.Mostrar();
                    libritos.Mostrar_libro();
                    disquitos.Mostrar_Disco();
                    ventitas.Mostrar_Ventas();
                break;
            case 3: 
                break;
            default: System.out.println("Opcion invalida");
        }
        }while(opcion!=3);
    }
}
