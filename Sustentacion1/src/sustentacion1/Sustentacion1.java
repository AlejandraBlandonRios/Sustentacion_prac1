
package sustentacion1;
import java.util.Scanner;
public class Sustentacion1 {

    public static void main(String[] args) {
        Agregar Pro_nuevo[]=new Agregar[50];
        Scanner lector=new Scanner(System.in);
        int i=0;
        int n=0;
        int opcion;
        int bandera=0;
        int bandera1=0;
        int bandera2=0;
        int z=0;
        int p=0;
        String bus_producto;
        
    do{
        System.out.println("------------MENU---------------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar inventario");
        System.out.println("5. Realizar ventas");
        System.out.println("6. Mostrar ganancias totales");
        System.out.println("7. Salir");
        System.out.println("-------------------------------");
        opcion=lector.nextInt();
        bandera=0;
        bandera1=0;
        bandera2=0;
        switch (opcion){
            case 1: 
                Pro_nuevo[i]=new Agregar();
                Pro_nuevo[i].Datos();
                i++;
                break;
            case 2: 
                System.out.println("Ingrese el nombre del producto que desea buscar: ");
                lector.nextLine();
                bus_producto=lector.nextLine();
                for(int k=0;k<i;k++){
                    if(bus_producto.equals(Pro_nuevo[k].getNombre())){
                        n=k;
                        bandera=1;
                        System.out.println("Encontrado");
                    }
                }
                if(bandera==1) 
                    Pro_nuevo[n].Mostrar();
                else
                    System.out.println("El nombre producto ingresado no existe");
                break;
            case 3: 
                System.out.println("Ingrese el nombre del producto que desea eliminar: ");
                lector.nextLine();
                bus_producto=lector.nextLine();
                for(int k=0;k<i;k++){
                    if(bus_producto.equals(Pro_nuevo[k].getNombre())){
                        z=k;
                        bandera1=1;
                        System.out.println("Encontrado");
                    }
                }
                if(bandera1==1) 
                    Pro_nuevo[z].Eliminar();
                else
                    System.out.println("El nombre producto ingresado no existe");
                break;
            case 4:
                for(int j=0;j<i;j++){
                    Pro_nuevo[j].Mostrar();
                }
                break;
            case 5:
                System.out.println("Ingrese el nombre del producto que desea vender: ");
                lector.nextLine();
                bus_producto=lector.nextLine();
                for(int k=0;k<i;k++){
                    if(bus_producto.equals(Pro_nuevo[k].getNombre())){
                        p=k;
                        bandera2=1;
                        System.out.println("Encontrado");
                    }
                }
                if(bandera2==1) 
                    Pro_nuevo[p].Ventas();
                else
                    System.out.println("El nombre producto ingresado no existe");
                break;
            case 6:
                for(int j=0;j<i;j++){
                    Pro_nuevo[j].Ganancias();
                }
            default: System.out.println("Opcion invalida");
        }
        }while(opcion!=7);
    }
}
    

