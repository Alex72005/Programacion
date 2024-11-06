package Poo.ej4;

import java.util.Arrays;

public class Tienda {
    private Videojuego[] catalogo;
    private int contadorCatalogo;

    public Tienda(int co){
        this.catalogo = new Videojuego[co];
        this.contadorCatalogo = 0;
    }

    public Videojuego[] getCatalogo() {
        return this.catalogo;
    }

    public void setCatalogo(Videojuego[] cat) {
        this.catalogo = cat;
    }

    public int getContadorCatalogo() {
        return this.contadorCatalogo;
    }

    public void setContadorCatalogo(int con) {
        this.contadorCatalogo = con;
    }

    public void agregarVideojuego(Videojuego vid){
        if (contadorCatalogo < catalogo.length) {
            catalogo[contadorCatalogo] = vid;
            contadorCatalogo++;  
        }
        else{
            System.out.println("No se pueden agregar más videojuegos");
        }
    }

    public void buscarPorGenero(String genero){
        for (int i = 0; i < contadorCatalogo; i++){
            if (catalogo[i].getGenero() == genero) {
                System.out.println(catalogo[i]);
            }
        }
    }

    public void buscarPorPlataforma(String plataforma){
        for (int i = 0; i < contadorCatalogo; i++){
            if (catalogo[i].getPlataforma() == plataforma) {
                System.out.println(catalogo[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Catálogo: " + Arrays.toString(catalogo) + 
               " y contador del catálogo: " + contadorCatalogo;
    }

    

    
}
