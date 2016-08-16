
package Lab1Ej17;
import java.util.Scanner;
public class Ventas extends Publicacion17{
    private String venta;
    
    Scanner lector=new Scanner(System.in);
    public void Leer(){
        System.out.println("Ingrese el numero de ventas del libro en el ultimo semestre:");
        venta=lector.nextLine();
    }
    public void Mostrar_Ventas(){
        System.out.println("El numero de ventas de la publicacion en el ultimo semestre: "+venta);
    }
}
