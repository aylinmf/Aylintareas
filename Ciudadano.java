/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;

/**
 *
 * @author Aylin Funez
 */
public class Ciudadano {
    
    public String nombre;
    private int edad;
    private int añosExperiencia;
    

public  Ciudadano(String nombre){
    
        this.nombre=nombre;     
}
public void Imprimirnombre(){
       System.out.println(nombre);
       
    }

public void setEdad(int _edad){
         this.edad=_edad;
    }
    public int getEdad(){
     return edad;
    }
public void setañosExp(int _Ae){
         this.añosExperiencia=_Ae;
    }
    public int getañosag(){
     return añosExperiencia;
    }


}