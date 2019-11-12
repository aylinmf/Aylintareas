
package nota;

import java.util.Scanner;


public class Nota {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota,pro;
        String nom;
        
        
        
        System.out.print("Ingrese su Nombre: ");
          String n=sc.nextLine();
          
       System.out.print("Ingresa una nota: ");
          int no=sc.nextInt();
          
          if(no>70)
          {   
              
              System.out.println( n+" Su nota es " + no + " y esta Aprobado" );
          
          }else{System.out.println(n+" Su nota es " + no + " y esta Reprobado");}
          
              
        
    }
    
}
