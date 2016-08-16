package Lab1Ej17;
import java.util.Scanner;
public class Publicacion17 {
    
    private String titulo, precio;

    Scanner lector=new Scanner(System.in);
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrecio() {
        return precio;
    }
    
    public void Cargar_Datos(){
        System.out.println("Ingrese el titulo del libro: ");
        titulo=lector.nextLine();
        System.out.println("Ingrese el precio del libro: ");
        precio=lector.nextLine();
    }
    
    public void Mostrar(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El precio del libro es: "+precio);
    }
    
}