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
public class Parte1 {

   
    public static void main(String[] args) {
        
         System.out.println("--Ciudadano--");
        
        System.out.print("Nombre: ");
        Ciudadano ciudadano = new Ciudadano("Aylin Funez");
         
         ciudadano.Imprimirnombre();
        
         System.out.print("Edad: ");
         ciudadano.setEdad(19);
         System.out.println(ciudadano.getEdad());
         
         System.out.print("Años de Experiencia: ");
         ciudadano.setañosExp(5);
         System.out.println(ciudadano.getañosag());
         
         
        
   
        
        
    }
    
}
