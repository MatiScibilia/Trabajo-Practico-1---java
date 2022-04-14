
package main;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Entrada= new Scanner(System.in);
       
       Tarea[] ListaDeTareas= new Tarea[10];
       Tarea tareas= new Tarea("a","as");
      
       String Nombre;
       String Descripcion;
       int ent;
       int ModTarea;
       
       int z=0;
       
      do{
      
      System.out.println("Ingrese 1 para cargar una nueva tarea");
      System.out.println("Ingrese 2 para modificar una tarea");
      System.out.println("Ingrese 3 para mostrar la lista de tareas");
      System.out.println("Ingrese 0 para salir");
      ent=Entrada.nextInt();
      Entrada.nextLine();
      
      while(ent < 0 || 4 < ent){
        System.out.println("ERROR.");
                
        System.out.println("Ingrese 1 para cargar una nueva tarea");
        System.out.println("Ingrese 2 para modificar una tarea");
        System.out.println("Ingrese 3 para mostrar la lista de tareas");
        System.out.println("Ingrese 0 para salir");
        ent=Entrada.nextInt();
          
      }
      
      switch(ent){
            case 1:
                System.out.println("Hola Ingrese el nombre de la tarea N "+z);
                Nombre = Entrada.nextLine();

                
                System.out.print("Dime la descripcion de la tarea N "+z);
                Descripcion = Entrada.nextLine();
                
                tareas = new Tarea (Nombre,Descripcion);
                ListaDeTareas[z]=tareas;


                z=z+1;
            break;
            
            case 2:
                if(0<z){
                    
                for(int p=0;p<z;p++){
                        System.out.println("Tarea Nº "+ p);
                        System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                        System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                        System.out.println("-----------------------");
                }
                
                System.out.println("Ingrese el numero de la tarea que desea modificar");
                ModTarea=Entrada.nextInt();
                
                while(z-1<ModTarea || ModTarea<0){
                    System.out.println("ERROR.");
                    System.out.println("Debe ingresar el numero de una tarea ya existente");
                    System.out.println("Ingrese el numero de la tarea que desea modificar");
                    ModTarea=Entrada.nextInt();
                }
                               
                Entrada.nextLine();
                
                System.out.println("Ingrese el nuevo nombre de la tarea "+ModTarea);
                Nombre=Entrada.nextLine();
                                       
                System.out.print("Dime la nueva descripcion de la tarea "+ModTarea);
                Descripcion = Entrada.nextLine();

                tareas = new Tarea (Nombre,Descripcion);
                ListaDeTareas[ModTarea]=tareas;
                               
               }else{
                System.out.println("Error. No se ha cargado ninguna tarea hasta el momento");
                break;
                }
            break;
    
            case 3:
                
                if(0<z){
                   
                    for(int p=0;p<z;p++){
                        System.out.println("Tarea Nº "+ p);
                        System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                        System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                        System.out.println("-----------------------");
                    }
                }else{
                    System.out.println("ERROR. No se ha cargado ninguna tarea hasta el momento");
                    break;
                }
                
            break;
            

              
              
            }
        }while(z!=10);
    
}
}