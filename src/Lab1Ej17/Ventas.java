/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Ej17;
import java.util.Scanner;
public class Ventas extends Publicacion{
    int venta;
    
    Scanner lector=new Scanner(System.in);
    public void Leer(){
        System.out.print("Ingrese el numero de ventas del libro en el ultimo semestre:");
        venta=lector.nextInt();
    }
    public void Mostrar(){
        System.out.println("El numero de ventas de la publicacion en el ultimo semestre: "+venta);
    }
}
