
package helpers;

/**
 *
 * @author Aylin Funez
 */
public class circulo extends Formas {
    
    public circulo (){
    
    setDibujar("Circulo");   // lo mismo realizamos para cada subclase
    setColor("Rojo");
    }

    @Override
     public String getInfoFigu() {
       return "--Informacion de Circulo--";
    }
    
    
}
