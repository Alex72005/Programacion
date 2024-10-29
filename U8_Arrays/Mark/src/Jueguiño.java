import java.util.Scanner;
public class Jueguiño {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;
        int numero = 0;
        int a = 5;
        for (int i = 5; i > 1; i--) {
            if (a == 5) {
                System.out.print("Se ha generado un número aleatorio del 1 al 100, intente adivinarlo: ");
                numero = xd.nextInt();
                if (numero < 1 || numero > 100) {
                    System.out.print("Eres puto retrasado mental adicto al nopor y al hentai");
                    System.exit(0);
                }
            }
            a--;

                if (numero < random) {
                    System.out.println("Que puto pringao, el número es mayor que " + numero);
                    System.out.print("Quedan " + a + " intentos, vuelva a intentarlo: ");
                    numero = xd.nextInt();
                    if (numero < 1 || numero > 100) {
                        System.out.print("Eres puto retrasado mental adicto al nopor y al hentai");
                        System.exit(0);
                    }
                }
                else if (numero > random) {
                    System.out.println("Que puto pringao, el número es menor " + numero);
                    System.out.print("Quedan " + a + " intentos, vuelva a intentarlo: ");
                    numero = xd.nextInt();
                    if (numero < 1 || numero > 100) {
                        System.out.print("Eres puto retrasado mental adicto al nopor y al hentai");
                        System.exit(0);
                    }
                }
                else {
                    System.out.print("Eres listo el numero era " + numero + ", GGs");
                    System.exit(0);
                }
        }
        System.out.print("k nuv, el número era " + random);
    }
}
