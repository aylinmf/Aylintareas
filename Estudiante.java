
package estudiante;

public class Estudiante {
    public static void main(String[] args) {
        Estu estudiante = new Estu();
        estudiante.setNombre("Aylin Funez");
        estudiante.setAEdad(19);
        estudiante.setCarrera("Ingenieria en Computación");
        estudiante.setcc(11);
        estudiante.setcampus("Roatán");
        
        System.out.println("Nombre: " + estudiante.getNombre() );
        System.out.println("Edad: " + estudiante.getedad() );
        System.out.println("Carrera: " + estudiante.getCarrera() );
        System.out.println("Clases Cursadas: " + estudiante.getcc());
        System.out.println("Campus: " + estudiante.getcampus() );
    }
    public static class Estu{
    private String nombre;
    private int edad;
    private int C;
    private String carrera; 
    private String campus; 
    
    public String getNombre(){
        return nombre;     
    } 
    public int getedad(){
        return edad;    
    }
    public int getcc(){
        return C;
    }
    public String getCarrera(){
        return carrera;
    } 
    public String getcampus(){
        return campus;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAEdad(int edad){
        this.edad = edad;
    }
    public void setcc(int C){
        this.C= C;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setcampus(String campus){
        this.campus = campus;
    }


        
}

}