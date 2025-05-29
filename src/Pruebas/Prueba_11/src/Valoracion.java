public class Valoracion {
    private int id;
    private int id_contenido;
    private String nombre_usuario;
    private int puntuacion;
    private String comentario;
    
    public Valoracion() {
    }

    public Valoracion(int id_contenido, String nombre_usuario, int puntuacion, String comentario) {
        this.id_contenido = id_contenido;
        this.nombre_usuario = nombre_usuario;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(int id_contenido) {
        this.id_contenido = id_contenido;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + id_contenido;
        result = prime * result + ((nombre_usuario == null) ? 0 : nombre_usuario.hashCode());
        result = prime * result + puntuacion;
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
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
        Valoracion other = (Valoracion) obj;
        if (id != other.id)
            return false;
        if (id_contenido != other.id_contenido)
            return false;
        if (nombre_usuario == null) {
            if (other.nombre_usuario != null)
                return false;
        } else if (!nombre_usuario.equals(other.nombre_usuario))
            return false;
        if (puntuacion != other.puntuacion)
            return false;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Valoracion [id=" + id + ", id_contenido=" + id_contenido + ", nombre_usuario=" + nombre_usuario
                + ", puntuacion=" + puntuacion + ", comentario=" + comentario + "]";
    }    
}
