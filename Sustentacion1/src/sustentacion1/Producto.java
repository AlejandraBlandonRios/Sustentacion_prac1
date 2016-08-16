/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion1;
import java.util.Scanner;
public class Producto extends Agregar{
    int venta;
    Scanner lector=new Scanner(System.in);
    private String busca_nombre;

    public void Buscar(){
    System.out.println("Ingrese el nombre que desea buscar: ");
    busca_nombre=lector.next();
    }
    

    

}
