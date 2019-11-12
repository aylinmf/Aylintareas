package helpers;
/**
 *
 * @author Aylin Funez
 */
//mi clase abstracta para que se haga mi super clase.
public abstract class Formas {
    
      private String dibujar; 
      private String color;
      double r=15/6.28;              //Atributos
      double angulo=60+60-180;
      double area=2*2;
      double largo=15.5;

      //publicar en mi clase forma o hacer publico mi codigo
public Formas(){

}
//Aqui le asigno un valor con mi variable String de caracteres, haciendo uso del metodo set.
 public void setDibujar(String dibujar)

    
 {   this.dibujar = dibujar; // le digo con la palabra reservada this que se le asigne a dibujar mis valores.
    }
 //Aqui le adquiero el valor asignado con el metodo set, haciendo uso del metodo get.
 public  String getDibujar(){
       
        return this.dibujar;// retorna el valor o cadena de mi variable.
    }
 
  public void setColor(String color){
     
        this.color = color;
    }
  
  public  String getColor(){
       
        return this.color;    
    }
  
//hago un metodo publico para imprimir mi informacion y asi para cada una de las opciones.
  public void ImprimirInformacionCuadradro(){
    
    System.out.println("Dibujar: " + dibujar );
    System.out.println("Color: " + color );
    System.out.println("Area: " + area );
    }
  
  
   public void ImprimirInformacionCirculo(){
    
    System.out.println("Dibujar: " + dibujar );
    System.out.println("Color: " + color );
    System.out.println("Radio: " + r );
    }
   
    public void ImprimirInformacionLinea(){
    
    System.out.println("Dibujar: " + dibujar );
    System.out.println("Color: " + color );
    System.out.println("Largo: " + largo );
    }
    
     public void ImprimirInformacionTriangulo(){
    
    System.out.println("Dibujar: " + dibujar );
    System.out.println("Color: " + color );
    System.out.println("Angulo: " + angulo );
    }
    
      abstract String getInfoFigu();
    
}
