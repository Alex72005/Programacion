import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.print("Introduzca un número natural: ");
        long luckynum = xd.nextLong();
        if (luckynum < 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        String luckystr = Long.toString(luckynum);
        int longitud = luckystr.length();
        char posicion = 0;
        int intposicion = 0;
        int goodl = 0;
        int badl = 0;
        for (int i = 0; i < longitud; i++) {
            posicion = luckystr.charAt(i);
            intposicion = posicion;
            intposicion = intposicion - 48;
           if (intposicion == 3 || intposicion == 7 || intposicion == 8 || intposicion == 9) {
               goodl++;
           }
           else if (intposicion == 0 || intposicion == 1 || intposicion == 2 || intposicion == 4 || intposicion == 5 || intposicion == 6) {
               badl++;
           }
        }

        if (goodl > badl) {
            System.out.print("Tu número ES un número de la suerte.");
        }
        else if (goodl < badl) {
            System.out.print("Tu número NO ES un número de la suerte.");
        }
        else {
            System.out.print("Tu número es NEUTRAL");
        }

        xd.close();
    }
}
