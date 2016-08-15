/*
Una editorial de libros y discos desea crear fichas que almacenen el título y el 
precio de cada publicación. Crear la correspondiente clase (denominada Publicación) 
que implemente los datos anteriores. A partir de esta clase, diseñar dos clases derivadas: 
Libro, con el número de páginas, año de publicación y precio; y la clase Disco, con duración 
en minutos y precio Cada una de las tres clases tendrá una función mostrar(), para visualizar sus datos.
Escribir un programa que cree instancias (objetos) de las clases Libro y Disco, solicite datos al usuario y a 
continuación los visualice.
 */
package lab1ej16;
import java.util.Scanner;
public class Lab1Ej16 {
    public static void main(String[] args) {
        Libro libritos=new Libro();
        Disco disquitos=new Disco();
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
                break;
            case 2: libritos.Mostrar();
                    libritos.Mostrar_libro();
                    disquitos.Mostrar_Disco();
                break;
            case 3: 
                break;
            default: System.out.println("Opcion invalida");
        }
        }while(opcion!=3);
    }
    }
    

