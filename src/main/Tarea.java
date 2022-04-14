/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Mati
 */
public class Tarea {
    
    String Nombre="0";
    String Descripcion="0";
   
    
    
    //constructor
    //parametrosformales
    public Tarea(String Nombre,String Descripcion){
        this.Nombre=Nombre;
        this.Descripcion=Descripcion;
        
    }

    public String mostrarTarea(){

        return this.Nombre+ " : " + this.Descripcion +" : ";
    }

    
    
}
