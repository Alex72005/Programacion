package Poo.ej4;

public class Videojuego {
    private String titulo;
    private String genero;
    private String plataforma;
    private double precio;

    public Videojuego(String ti, String ge, String pl, double pr){
        this.titulo = ti;
        this.genero = ge;
        this.plataforma = pl;
        this.precio = pr;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String tit){
        this.titulo = tit;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String gen){
        this.genero = gen;
    }

    public String getPlataforma(){
        return this.plataforma;
    }

    public void setPlataforma(String pla){
        this.plataforma = pla;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double pre){
        this.precio = pre;
    }

    public void aplicarDescuento(double porcentaje){
        this.precio -= this.precio * (porcentaje / 100);
    }

    public String toString(){
        return "Título: " + this.titulo + 
               ", género: " + this.genero + 
               ", plataforma: " + this.plataforma + 
               " y precio: " + this.precio;
    }
}
