import java.util.Scanner;

public class Pucherazo {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.print("Introduzca un número natural: ");
        long n = xd.nextLong();
        if (n< 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        String numero = Long.toString(n);
        int longitud = numero.length();
        char charposicion;
        int random = (int) (Math.random() * longitud) + 1;
        int intposicion;
            charposicion = numero.charAt(random);
            intposicion = charposicion;
            System.out.print(intposicion);
    }
}
