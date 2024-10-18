import java.util.Scanner;
public class BombardeenFrancia {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int numero = (int) (Math.random() * 13) + 1;
        int figurita = (int) (Math.random() * 4) + 1;
        String num = "0";
        String fig = "0";
        switch (numero) {
            case 1:
                num = "As";
                break;
            case 2:
                num = "2";
                break;
            case 3:
                num = "3";
                break;
            case 4:
                num = "4";
                break;
            case 5:
                num = "5";
                break;
            case 6:
                num = "6";
                break;
            case 7:
                num = "7";
                break;
            case 8:
                num = "8";
                break;
            case 9:
                num = "9";
                break;
            case 10:
                num = "10";
                break;
            case 11:
                num = "Jota";
                break;
            case 12:
                num = "Reina";
                break;
            case 13:
                num = "Rey";
                break;
        }
        xd.close();

        switch (figurita) {
            case 1:
                fig = "Picas";
                break;
            case 2:
                fig = "Tréboles";
                break;
            case 3:
                fig = "Corazones";
                break;
            case 4:
                fig = "Diamantes";
                break;
        }

        System.out.println("CARTA RANDOM DE LA BARAJA FRANCESA:");
        System.out.println(num + " de " + fig);
    }
}
