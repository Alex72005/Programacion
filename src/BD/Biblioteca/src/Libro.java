package BD.Biblioteca.src;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int añoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.disponible = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + añoPublicacion;
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + (disponible ? 1231 : 1237);
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
        Libro other = (Libro) obj;
        if (id != other.id)
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (añoPublicacion != other.añoPublicacion)
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (disponible != other.disponible)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Libro " + this.id + ": " + this.titulo + ", " + this.autor + ", " + this.añoPublicacion + ", " + this.genero + ", " + this.disponible;
    }

    
}
