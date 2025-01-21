package Excepciones.src;

public class Coche {
    private int id;
    private String marca;
    private String modelo;

    public Coche(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws CocheIDException{
        if (id <= 0) {
            throw new CocheIDException("El id no puede ser menor o igual a cero");
        }
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
    }
}
