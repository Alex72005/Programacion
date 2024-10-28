package DNI.src;
public class Persona {
    private String nombre;
    private String apellidos;
    private String fechaNac;
    private int edad;

    public Persona(String n, String ape, String fec, int ed){
        this.nombre = n;
        this.apellidos = ape;
        this.fechaNac = fec;
        this.edad = ed;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public String getFecha(){
        return this.fechaNac;
    }

    public void setFecha(String f){
        this.fechaNac = f; 
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int e){
        this.edad = e;
    }

    
    public String toString(){
        return "Nombre " + this.nombre + 
               ", Apellidos " + this.apellidos + 
               "y Fecha de nacimiento " + this.fechaNac; 
    }

}
