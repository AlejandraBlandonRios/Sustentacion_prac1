
package Lab1Ej17;
import java.util.Scanner;
public class Libro17 extends Publicacion17 {
    private String año;
   
    Scanner lector=new Scanner(System.in);
    
    public void Cargar_Datos_libro(){
        System.out.println("Ingrese el año de publicacion del libro: ");
        año=lector.nextLine();
    }
    
    public void Mostrar_libro(){
        System.out.println("El año de publicacion del libro es: "+año);
    }
}

