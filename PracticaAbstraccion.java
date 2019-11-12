
package practicaabstraccion;

import helpers.IngenieriaComputacion;
import helpers.IngenieriaProduccion;


public class PracticaAbstraccion {

   
    public static void main(String[] args) {
        
    IngenieriaComputacion ic=new IngenieriaComputacion();
    IngenieriaProduccion ip=new IngenieriaProduccion();
    
    System.out.println(ic.getFacultad());
    System.out.println(ip.getFacultad());
    
    
    }
    
}
