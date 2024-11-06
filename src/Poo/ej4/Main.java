package Poo.ej4;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(5);

        Videojuego v1 = new Videojuego("EA Sports FC 25", "Deportes", "PS5", 79.99);
        Videojuego v2 = new Videojuego("Dragon Ball Sparking Zero", "Lucha", "Xbox Series X", 69.99);
        Videojuego v3 = new Videojuego("Call of Duty Black ops III", "Shooter", "PS4", 19.99);
        Videojuego v4 = new Videojuego("Mario Kart 8 Deluxe", "Carreras", "Switch", 59.99);
        Videojuego v5 = new Videojuego("Super Mario Bros Wonder", "Aventuras", "Switch", 62);
        tienda.agregarVideojuego(v1);
        tienda.agregarVideojuego(v2);
        tienda.agregarVideojuego(v3);
        tienda.agregarVideojuego(v4);
        tienda.agregarVideojuego(v5);
        
        Cliente cliente = new Cliente("Alejandro", "asm0125@alu.medac.es", "633414755");

        Pedido pedido = new Pedido(cliente,4 , "06/11/2024");
        pedido.agregarVideojuego(v1);
        pedido.agregarVideojuego(v2);
        pedido.agregarVideojuego(v4);
        pedido.agregarVideojuego(v5);

        v1.aplicarDescuento(15);

        System.out.println(pedido);


    }
}
