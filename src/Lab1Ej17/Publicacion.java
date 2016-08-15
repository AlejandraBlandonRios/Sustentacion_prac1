
package Lab1Ej17;

import java.util.Scanner;
public class Publicacion {
    
    private String titulo, precio;

    Scanner lector=new Scanner(System.in);
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public void Cargar_Datos(){
        System.out.print("Ingrese el titulo del libro: ");
        titulo=lector.next();
        System.out.print("Ingrese el precio del libro: ");
        precio=lector.next();
    }
    
    public void Mostrar(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El precio del libro es: "+precio);
    }
    
}