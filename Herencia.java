
package herencia;

import helpers.circulo;
import helpers.cuadrado;
import helpers.linea;        // se importa todas las subclases creadas.
import helpers.triangulo;
import java.util.Scanner;


public class Herencia {
//metodo principal, como pueden ver decidi hacer un pequeño menú.
   public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
     int opc;   
        
        System.out.print("Seleccione una opcion."
                +"\n" +"1.Cuadrado"
                +"\n" +"2.Triangulo"                             //mi menu  //menu
                + "\n"+"3.Linea"
                +"\n" +"4.Circulo"
                +"\n"+"Digite el numero de su eleccion: " ); 
        opc=entrada.nextInt();

    switch(opc){
    
     case 1: cuadrado cu= new cuadrado();
     System.out.println("\n"+"-Su elección fue la 1-Cuadrado.");
     System.out.println(cu.getInfoFigu());
     cu.ImprimirInformacionCuadradro();
     break;
         
     case 2: triangulo tri= new triangulo();
     System.out.println("\n"+"-Su elección fue la 2-Triangulo.");
     System.out.println(tri.getInfoFigu());
     tri.ImprimirInformacionTriangulo();
     break;
         
     case 3: linea li= new linea();
     System.out.println("\n"+"-Su elección fue la 3-linea.");
     System.out.println(li.getInfoFigu());
     li.ImprimirInformacionLinea();
     break;
         
     case 4: circulo cir= new circulo();
     System.out.println("-Su elección fue la 4-Circulo." +"\t");
     System.out.println(cir.getInfoFigu());
     cir.ImprimirInformacionCirculo(); // esta parte es importnate porque desde aqui con la palabra cir
     //que es mi variablele agrego el .Imprimir informacion como veiamos arriba eso es lo que nos esta imprimiendo en consola.
     //Asi para cada clase.
     break; 
         
       default:System.out.println("ERROR");  
               break;    
    //fin del menu.
    }    
  }
}//como pueden ver este es mi programa de herencia que implementa un pequeño menu
//y ahora lo compilamos.
// esto ha sido todo , muchas gracias , hasta la proxima..