
package practicaencapsulamientoo;

import helpers.Estudiante;


public class PracticaEncapsulamientoo {

    
    public static void main(String[] args) {
        
        Estudiante estudiante=new Estudiante("Aylin Funez","Ing.Computación");
        
        estudiante.Imprimircarrera();
        
        estudiante.establecerEdad(15);
        
        System.out.println(estudiante.obtenerEdad());
        
        
    }
    
}
