package Poo.ej4;

public class Pedido {
    private Cliente cliente;
    private Videojuego[] videojuegos;
    private int contadorVideojuegos;
    private String fechaDePedido;
    
    public Pedido(Cliente c, int co, String f){
        this.cliente = c;
        this.videojuegos = new Videojuego[co];
        this.contadorVideojuegos = 0;
        this.fechaDePedido = f;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cli) {
        this.cliente = cli;
    }

    public Videojuego[] getVideojuegos() {
        return this.videojuegos;
    }

    public void setVideojuegos(Videojuego[] vid) {
        this.videojuegos = vid;
    }

    public int getContadorVideojuegos() {
        return this.contadorVideojuegos;
    }

    public void setContadorVideojuegos(int con) {
        this.contadorVideojuegos = con;
    }

    public String getFechaDePedido() {
        return this.fechaDePedido;
    }

    public void setFechaDePedido(String fec) {
        this.fechaDePedido = fec;
    }

    public void agregarVideojuego(Videojuego vid){
        if (contadorVideojuegos < videojuegos.length) {
            videojuegos[contadorVideojuegos] = vid;
            contadorVideojuegos++;
        }
        else{
            System.out.println("No se pueden agregar más videojuegos al pedido");
        }
    }

    public double calcularPrecioTotal(){
        double total = 0;
        for (int i = 0; i < contadorVideojuegos; i++) {
            total += videojuegos[i].getPrecio();
        }
        return total;
    }



    public String toString(){
        String detalles = "";
        for (int i = 0; i < contadorVideojuegos; i++) {
            detalles += videojuegos[i].toString() + " ";
        }
        return "Cliente: " + this.cliente + 
               ", videojuegos: " + detalles + 
               ", cantidad de videojuegos: " + this.contadorVideojuegos + 
               " y fecha de pedido: " + this.fechaDePedido;
    }
}
