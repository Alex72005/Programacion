package Poo.Composicion;

public class Pagina {
    private int numPagina;
    private String texto;

    public Pagina(int numPagina, String texto) {
        this.numPagina = numPagina;
        this.texto = texto;
    }

    public int getNumPaginas() {
        return numPagina;
    }

    public void setNumPaginas(int numPagina) {
        this.numPagina = numPagina;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }








    @Override
    public String toString() {
        return "Pagina [numPagina=" + numPagina + ", texto=" + texto + "]";
    }
}
