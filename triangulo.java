
package helpers;

/**
 *
 * @author Aylin Funez
 */
//hace publiclo mi clase triangulo con la palabra reservada extends que me dice que e habilite por decir asi 
//mi codigo de mi super clase.
public class triangulo  extends Formas {
    
    //Que publique en la clase
    public triangulo(){
    setDibujar("Triangulo");    //Les estoy asignado ya la informacion de sus atributos.
    setColor("Amarillo");
    }

    @Override
    //este metodo me dice que adquiera la informacion de las figuras.
     public String getInfoFigu() {
       return "--Informacion de Triangulo--"; //retorna en consola como comentario.
    }

}

