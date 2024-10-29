import java.util.Scanner;

public class IntSI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número a convertir: ");
        String numero = scanner.nextLine();

        System.out.print("Ingrese la base actual del número: ");
        int baseInicial = scanner.nextInt();

        System.out.print("Ingrese la base a la que desea convertir el número: ");
        int baseFinal = scanner.nextInt();

        scanner.close();

        int decimal = convertirBaseADecimal(numero, baseInicial);
        String resultado = convertirDecimalABase(decimal, baseFinal);

        System.out.println("El número " + numero + " en base " + baseInicial + " es igual a " + resultado + " en base " + baseFinal + ".");
    }

    public static int convertirBaseADecimal(String numero, int base) {
        int decimal = 0;
        String digitos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = numero.length() - 1; i >= 0; i--) {
            char digito = numero.charAt(i);
            int valor = digitos.indexOf(digito);
            decimal += valor * Math.pow(base, numero.length() - 1 - i);
        }

        return decimal;
    }

    public static String convertirDecimalABase(int decimal, int base) {
        String resultado = "";
        String digitos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (decimal > 0) {
            int residuo = decimal % base;
            resultado = digitos.charAt(residuo) + resultado;
            decimal /= base;
        }

        return resultado;
    }
}

