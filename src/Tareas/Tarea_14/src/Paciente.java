package Tareas.Tarea_14.src;

public class Paciente implements Comparable<Paciente>{
    private int habitacion;
    private int cama;
    private String nombre;
    private String apellidos;
    private String dieta;

    public Paciente(int habitacion, int cama, String nombre, String apellidos, String dieta) {
        this.habitacion = habitacion;
        this.cama = cama;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dieta = dieta;
    }

    public int getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getCama() {
        return this.cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDieta() {
        return this.dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + habitacion;
        result = prime * result + cama;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((dieta == null) ? 0 : dieta.hashCode());
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
        Paciente other = (Paciente) obj;
        if (habitacion != other.habitacion)
            return false;
        if (cama != other.cama)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (dieta == null) {
            if (other.dieta != null)
                return false;
        } else if (!dieta.equals(other.dieta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Paciente [habitación=" + habitacion + ", cama=" + cama + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", dieta=" + dieta + "]";
    }

    @Override
    public int compareTo(Paciente o) {
        if (this.habitacion > o.habitacion) {
            return 1;
        } else if (this.habitacion < o.habitacion) {
            return -1;
        } else{
            if (this.cama > o.cama) {
                return 1;
            } else if (this.cama < o.cama) {
                return -1;
            }else{
                return 0;
            }
        }
    }
}
