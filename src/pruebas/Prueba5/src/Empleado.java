package pruebas.Prueba5.src;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String telefono;
    private Contrato contrato;

    public Empleado(String n, String a, String t,Contrato c){
        this.nombre = n;
        this.apellidos = a;
        this.telefono = t;
        this.contrato = c;

        if (this.nombre.length() >= 3 && this.nombre.length() <= 20) {
            this.nombre = n;
        }else{
            this.nombre = "Incorrecto";
        }

        if (this.apellidos.length() >= 3 && this.apellidos.length() <= 60) {
            this.apellidos = a;
        } else {
            this.apellidos = "Incorrecto";
        }

        if (this.telefono.length() == 12 && this.telefono.startsWith("+34")) {
            this.telefono = t;
        } else {
            this.telefono = "Incorrecto";
        }
    }

    public Empleado() {
        this.nombre = "Incorrecto";
        this.apellidos = "Incorrecto";
        this.telefono = "Incorrecto";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        if (nom.length() >= 3 && nom.length() <= 20) {
            this.nombre = nom;
        } 
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        if (ape.length() >= 3 && ape.length() <= 60) {
            this.apellidos = ape;
        }
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String tel) {
        if (tel.length() == 12 && tel.startsWith("+34")) { 
            this.telefono = tel;
        }
    }

    public Contrato getContrato() {
        return this.contrato;
    }

    public void setContrato(Contrato con) {
        this.contrato = con;
    }

    
    public String toString() {
        return "Nombre: " + this.nombre + 
               ", apellidos=" + this.apellidos +
               ", teléfono=" + this.telefono + 
               ", contrato: " + this.contrato;
    }

    
    






}
