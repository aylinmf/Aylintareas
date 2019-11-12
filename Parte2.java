
package parte2;

import helpers.Alemania;
import helpers.Bolivia;
import helpers.Brasil;
import helpers.Colombia;
import helpers.Ecuador;


public class Parte2 {

    
    public static void main(String[] args) {
    
     Alemania alemania=new Alemania();
     Ecuador ecuador=new Ecuador();
     Colombia colombia=new Colombia();
     Brasil brasil=new Brasil();
     Bolivia bolivia=new Bolivia();
    
    System.out.println(alemania.getPais());
    System.out.println(alemania.getPresidente());
    
    System.out.println(ecuador.getPais());
    System.out.println(ecuador.getPresidente());
    
    System.out.println(colombia.getPais());
    System.out.println(colombia.getPresidente());
    
    System.out.println(brasil.getPais());
    System.out.println(brasil.getPresidente());
    
    System.out.println(bolivia.getPais());
    System.out.println(bolivia.getPresidente());
    
    }
    
}
