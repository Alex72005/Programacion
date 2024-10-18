import java.util.Scanner;
public class Ludopatia {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int robo1 = (int) (Math.random() * 5) + 1;
        int robo2 = (int) (Math.random() * 5) + 1;
        int robo3 = (int) (Math.random() * 5) + 1;
        String r1 = "0";
        String r2 = "0";
        String r3 = "0";

        switch (robo1) {
            case 1:
                r1 = "Corazón";
                break;
            case 2:
                r1 = "Diamante";
                break;
            case 3:
                r1 = "Herradura";
                break;
            case 4:
                r1 = "Campana";
                break;
            case 5:
                r1 = "Limón";
        }

        switch (robo2) {
            case 1:
                r2 = "Corazón";
                break;
            case 2:
                r2 = "Diamante";
                break;
            case 3:
                r2 = "Herradura";
                break;
            case 4:
                r2 = "Campana";
                break;
            case 5:
                r2 = "Limón";
        }

        switch (robo3) {
            case 1:
                r3 = "Corazón";
                break;
            case 2:
                r3 = "Diamante";
                break;
            case 3:
                r3 = "Herradura";
                break;
            case 4:
                r3 = "Campana";
                break;
            case 5:
                r3 = "Limón";
        }

        System.out.println("-RESULTADO-");
        System.out.println("1: " + r1);
        System.out.println("2: " + r2);
        System.out.println("3: " + r3);

        if (robo1 == robo2 && robo1 == robo3) {
            System.out.print("WIN");
        }
        else if (robo1 == robo2 || robo1 == robo3 || robo2 == robo3) {
            System.out.print("DRAW");
        }
        else {
            System.out.print("LOOSER");
        }
    }
}