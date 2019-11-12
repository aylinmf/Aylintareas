
package ejemplo1;


public class Ejemplo1 {

    public static void main(String[] args) {
        
// Clase bicycle tiene tres atributos
public int cadence;
public int gear;
public int speed;
    
// constructor para la clase Bicycle
public Ejemplo1(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}
    
// Métodos para la clase
public void setCadence(int newValue) {
    cadence = newValue;
}
    
public void setGear(int newValue) {
    gear = newValue;
}
    
public void applyBrake(int decrement) {
    speed -= decrement;
}
    
public void speedUp(int increment) {
    speed += increment;

    }
}
