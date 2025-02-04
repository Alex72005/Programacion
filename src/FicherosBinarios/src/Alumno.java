package FicherosBinarios.src;

import java.io.Serializable;

public class Alumno implements Serializable, Comparable<Alumno> {
    int id;
    String nombre;
    String correo;
    double nota;
    
    public Alumno(int id, String nombre, String correo, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.nota = nota;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((correo == null) ? 0 : correo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(nota);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Alumno other = (Alumno) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (correo == null) {
            if (other.correo != null)
                return false;
        } else if (!correo.equals(other.correo))
            return false;
        if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
            return false;
        return true;
    }

    @Override
    public int compareTo(Alumno o1) {
        if (this.id < o1.id) {
            return -1;
        }

        else if (this.id > o1.id) {
            return 1;
        }

        else{
            return 0;
        }
    }
}
