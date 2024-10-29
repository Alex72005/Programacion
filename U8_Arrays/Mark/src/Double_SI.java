package Arrays;
import java.util.Scanner;
public class Double_SI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número decimal en coma flotante: ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;
        double parteFraccional = numero - parteEntera;

        String binarioParteEntera = convertirParteEnteraABinario(parteEntera);
        String binarioParteFraccional = convertirParteFraccionalABinario(parteFraccional);

        System.out.println("La parte entera " + parteEntera + " se convierte a binario como: " + binarioParteEntera);
        System.out.println("La parte fraccional " + parteFraccional + " se convierte a binario como: " + binarioParteFraccional);

        scanner.close();
    }

    public static String convertirParteEnteraABinario(int parteEntera) {
        StringBuilder binario = new StringBuilder();

        while (parteEntera > 0) {
            int residuo = parteEntera % 2;
            binario.insert(0, residuo);
            parteEntera /= 2;
        }

        return binario.toString();
    }

    public static String convertirParteFraccionalABinario(double parteFraccional) {
        StringBuilder binario = new StringBuilder(".");

        while (parteFraccional > 0) {
            parteFraccional *= 2;
            int bit = (int) parteFraccional;
            binario.append(bit);
            parteFraccional -= bit;
        }

        return binario.toString();
    }
}

