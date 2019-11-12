
package trabajandoconobjetos;


public class Trabajandoconobjetos {
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Eduardo");
    persona.setApellido("Suarez");
    persona.setEdad (20);
    persona.setSexo ("M");
System.out.println("Nombre: " + persona.getNombre() );
System.out.println("apellido: " + persona.getApellido() );
System.out.println("Edad: " + persona.getEdad() );
System.out.println("Sexo: " + persona.getSexo() );
        
    }
    public static class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo; 
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    }
}
