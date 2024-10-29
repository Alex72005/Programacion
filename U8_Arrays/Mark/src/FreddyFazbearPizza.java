import java.util.Scanner;
public class FreddyFazbearPizza {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int comanda = 0;
        int a = 0;
        int b = 0;
        int t[] = new int[10];
        for (int i = 0; i <= 9; i++) {
            t[i] = (int) (Math.random() * (4 + 1));
            System.out.print(t[i] + ", ");
        }

        do {
            comanda = 0;
            a = 0;
            b = 0;
            System.out.println(" ");
            System.out.print("Nueva comanda (Inserta -1 para salir): ");
            comanda = xd.nextInt();
            if (comanda != -1) {
                if (comanda > 4) {
                    System.out.print("No se admite una comanda de más de 4 personas.");
                    b++;
                }
                if (comanda < 1) {
                    System.out.print("Número no valido.");
                    b++;
                }
                if (b == 0) {
                    for (int i = 0; i <= 9; i++) {
                        if (t[i] == 0) {
                            t[i] = comanda;
                            a++;
                            break;
                        }
                    }

                    if (a == 0) {
                        for (int i = 0; i <= 9; i++) {
                            if (t[i] + comanda <= 4) {
                                t[i] += comanda;
                                a++;
                                break;
                            }
                        }
                    }

                    if (a == 0) {
                        System.out.print("Establecimiento lleno");
                        break;
                    }

                    for (int i = 0; i <= 9; i++) {
                        System.out.print(t[i] + ", ");
                    }
                }
            }
        } while (comanda != -1);
    }
}
