/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion1;

import java.util.Scanner;

public class Agregar {
    private String nombre;
    private int cantidad,venta;
    private double valor,total;
    Scanner lector=new Scanner(System.in);
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void Datos(){
        System.out.println("Ingrese el nombre del producto: ");
        nombre=lector.nextLine();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidad=lector.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        valor=lector.nextDouble();
    }
        
    public void Mostrar(){
        if(nombre.equals("")) System.out.println("");
        else{
        System.out.println("El nombre del producto: "+nombre);
        System.out.println("La cantidad de productos: "+cantidad);
        System.out.println("El valor del producto: "+valor);}
    }
    
    public void Eliminar(){
        nombre="";
        cantidad=0;
        valor=0;
       
    }
    
    public void Ventas(){
        System.out.println("Ingrese cuanta cantidad desea vender: ");
        venta=lector.nextInt();
        cantidad=cantidad-venta;
        total=venta*valor;
        
    }
    public void Ganancias(){
        if(nombre.equals("")) System.out.println("");
        else{
        System.out.println("El nombre del producto: "+nombre);
        System.out.println("La cantidad de productos: "+cantidad);
        System.out.println("El valor del producto: "+valor);
        System.out.println("Cantidad de productos vendidos: "+venta);
        System.out.println("El valor total de la venta: "+total);
        }
    }
}
