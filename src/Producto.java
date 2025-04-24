// public class Persona {
//     private String nombreCompleto;

//     public void mostrarNombre() {
//         System.out.println(nombreCompleto);
//     }
// }

// public class Calculadora {
//     public void operar() {
//         int a = 5, b = 3;
//         int resultado = getResultado(a, b);
//         System.out.println("Resultado: " + resultado);
//     }

//     private int getResultado(int a, int b) {
//         int resultado = a * b + b - a;
//         return resultado;
//     }
// }


public class Producto {
    public double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
