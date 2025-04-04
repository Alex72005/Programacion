package Colecciones.src;

public class Integrante implements Comparable<Integrante>{
    private int edad; 
    private String nombre;
    private String apellido;

    public Integrante(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + edad;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Integrante other = (Integrante) obj;
        if (edad != other.edad)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        return true;
    }

    // @Override
    // public String toString() {
    //     return "Integrante [nombre=" + nombre + ", apellido=" + apellido + "]";
    // }

    @Override
    public String toString() {
        return "Integrante [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    //ordena de forma ascendente
    @Override
    public int compareTo(Integrante o) {
        return Integer.compare(this.edad, o.edad);
    }

    

}
