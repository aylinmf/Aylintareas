/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Aylin Funez
 */
public class Estudiante {
    
    public String nombre;
    private String carrera;
    private int edad;
    
    public  Estudiante(String nombre,String carrera){
    
        this.nombre=nombre;
        this.carrera=carrera;
        
    }
    
    public void Imprimircarrera(){
       System.out.println(carrera);
       
    }
    
    public void establecerEdad(int _edad){
         this.edad=_edad;
    }
    
    public int obtenerEdad(){
     return edad;
    }

    
    
    
    
}
