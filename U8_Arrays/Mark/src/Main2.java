import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.print("Inserte el primer número positivo: ");
        int numero1 = xd.nextInt();
        if (numero1 <= 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }

        int suma1 = 0;
        for (int i = numero1; i >= 1; i--) {
            int resto1 = numero1 % i;
            if (resto1 == 0) {
                suma1 = suma1 + 1;
            }
        }
        if (suma1 <= 2) {
            System.out.println("El primer número es primo");
        }

        System.out.print("Inserte el segundo número positivo: ");
        int numero2 = xd.nextInt();
        if (numero2 <= 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
            int suma2 = 0;
            for (int j = numero2; j >= 1; j--) {
                int resto2 = numero2 % j;
                if (resto2 == 0) {
                    suma2 = suma2 + 1;
                }
            }
            if (suma2 <= 2) {
                System.out.println("El segundo número es primo");
                System.out.println("Por tanto, sus únicos dos divisores son 1 y" + numero2);
            }




            xd.close();
        }
    }


