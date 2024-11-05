package Poo.ej3;

public class pruebaPorReferencia {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println(c);
        c.sumar();
        System.out.println(c);
    }
}
