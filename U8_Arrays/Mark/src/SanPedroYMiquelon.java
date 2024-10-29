import java.util.Scanner;

public class SanPedroYMiquelon {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String colorines[] = {"Amarillo", "Rojo", "Negro", "Blanca", "Azúl", "Verde"};
        System.out.print("Indica las franjas de la banderiña: ");
        int franjas = xd.nextInt();
        int color = 0;
        for (int i = 1; i <= franjas; i++) {
            color = (int) (Math.random() * (6));
            System.out.println(colorines[color]);
        }
        xd.close();
    }
}
