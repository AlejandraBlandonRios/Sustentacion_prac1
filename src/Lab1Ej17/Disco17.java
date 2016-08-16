
package Lab1Ej17;
import java.util.Scanner;
public class Disco17 extends Publicacion17{
    private String min;
   
    Scanner lector=new Scanner(System.in);
    public void Cargar_Datos_Disco(){
        
        System.out.println("Ingrese el numero de paginas del libro: ");
        min=lector.nextLine();
    }
    public void Mostrar_Disco(){
        System.out.println("El numero de paginas del libro es: "+min);
    }
}
