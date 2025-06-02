package Pruebas.Prueba_11.src;

public class Contenido {
    private int id;
    private String titulo;
    private String tipo;
    private String genero;
    private int duracion_min;
    private String estreno;
    private double valoracion;

    public Contenido(int id, String titulo, String tipo, String genero, int duracion_min, String estreno,
            double valoracion) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.duracion_min = duracion_min;
        this.estreno = estreno;
        this.valoracion = valoracion;
    }

    public Contenido(String titulo, String tipo, String genero, int duracion_min, String estreno, double valoracion) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.duracion_min = duracion_min;
        this.estreno = estreno;
        this.valoracion = valoracion;
    }

    public Contenido() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + duracion_min;
        result = prime * result + ((estreno == null) ? 0 : estreno.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valoracion);
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
        Contenido other = (Contenido) obj;
        if (id != other.id)
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (duracion_min != other.duracion_min)
            return false;
        if (estreno == null) {
            if (other.estreno != null)
                return false;
        } else if (!estreno.equals(other.estreno))
            return false;
        if (Double.doubleToLongBits(valoracion) != Double.doubleToLongBits(other.valoracion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contenido: id=" + id + ", titulo=" + titulo + ", tipo=" + tipo + ", genero=" + genero
                + ", duracion_min=" + duracion_min + ", estreno=" + estreno + ", valoracion=" + valoracion;
    }
}
