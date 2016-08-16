
package Lab1Ej17;
import java.util.Scanner;
public class Libro extends Publicacion {
    private String num_pag, año, precio;
   
    Scanner lector=new Scanner(System.in);
    
    public void Cargar_Datos_libro(){
        System.out.print("Ingrese el año de publicacion del libro: ");
        año=lector.next();
    }
    
    public void Mostrar_libro(){
        System.out.println("El año de publicacion del libro es: "+año);
    }
}
