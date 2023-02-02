public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(20);
        System.out.println("Edad: "+persona.getEdad());

        persona.setNombre("Catalina");
        System.out.println("Nombre: "+persona.getNombre());

        persona.setTelefono(1235628999);
        System.out.println("Numero de Telefono: " + persona.getTelefono());
    }

}
class Persona{

    private int edad;
    private String nombre;
    private int telefono;


    public void setEdad(int edad){
        this.edad =  edad;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono =  telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
 // Constructor

    public Persona(){
        System.out.println("Informacion de cliente ");
    }

}