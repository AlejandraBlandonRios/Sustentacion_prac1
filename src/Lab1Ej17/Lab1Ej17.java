/*
Se dispone de la clase Publicación del ejercicio anterior y se desea crear una 
nueva clase base llamada Ventas que obtenga un arreglo con las ventas del último 
semestre de una determinada publicación. Esta clase debe tener funciones miembros 
Leer() y Mostrar() que obtenga y visualice las citadas ventas. Modificar las clases 
Libro y Disco, lea y visualice las publicaciones.
 */
package Lab1Ej17;
import java.util.Scanner;

public class Lab1Ej17 {
    
    public static void main(String[] args){
        Libro17[] libritos=new Libro17[20];
        Disco17[] disquitos=new Disco17[20];
        Ventas[] ventitas=new Ventas[20];
        Scanner lector=new Scanner(System.in);
        int i=0;
        int k=0;
        int opcion;
        

        
    do{
        System.out.println("Digite la opcion deseada: ");
        System.out.println("1. Ingresar las caracteristicas de un libro: ");
        System.out.println("2. Mostrar las caracteristicas de todos los libros: ");
        System.out.println("3. Busqueda por nombre del libro: ");
        System.out.println("4. Salir: ");
        opcion=lector.nextInt();
        
        switch (opcion){
            case 1: 
                libritos[i]=new Libro17();
                libritos[i].Cargar_Datos();
                libritos[i].Cargar_Datos_libro();
                disquitos[i]=new Disco17();
                disquitos[i].Cargar_Datos_Disco();
                ventitas[i]=new Ventas();
                ventitas[i].Leer();
                System.out.println("El libro ingresado esta en la posicion: "+i);
                i++;
                
            break;
            case 2:
                for(int j=0;j<i;j++){
                    libritos[j].Mostrar();
                    libritos[j].Mostrar_libro();
                    disquitos[j].Mostrar_Disco();
                    ventitas[j].Mostrar_Ventas();
                }
            break;
            case 3:
                funciones(); 
                
                libritos[k].Mostrar();
                libritos[k].Mostrar_libro();
                disquitos[k].Mostrar_Disco();
                ventitas[k].Mostrar_Ventas();
            default:
                System.out.println("Opcion no valida");
        }
    }while (opcion!=4);     
    }
 static void funciones(){
     String libro;
     Scanner lector=new Scanner(System.in);
     System.out.println("Ingrese el nombre del libro:");
     libro=lector.nextLine();  
     /*for(k=0;k<i;k++){
                    if(libro.equals(libritos[k].getTitulo())){
                        i=k;
                    }
                }*/
  }
}
    
