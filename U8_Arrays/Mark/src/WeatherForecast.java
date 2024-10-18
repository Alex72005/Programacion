import java.util.Scanner;
public class WeatherForecast {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.print("Inserta la estación (Primavera, Verano, Otoño, Invierno): ");
        String estacion = xd.next();
        int calor = 0;
        int frio = 0;
        int a = 0;
        int b = 0;
        int w = 0;
        switch (estacion) {
            case "Primavera":
                a = 39;
                b = 10;
                w = 60;
                break;
            case "Verano":
                a = 45;
                b = 20;
                w = 90;
                break;
            case "Otoño":
                a = 33;
                b = 5;
                w = 50;
                break;
            case "Invierno":
                a = 28;
                b = 1;
                w = 40;
                break;
            default:
                System.out.print("Entrada no valida");
                System.exit(0);
        }

        while (calor == frio || calor < frio) {
            calor = (int) ((Math.random() * (a - b)) + 1) + b;
            frio = (int) ((Math.random() * (a - b)) + 1) + b;
        }
        System.out.println("Tº MAX: " + calor + "º");
        System.out.println("Tº MIN: " + frio + "º");

        int temp = (int) (Math.random() * 100) + 1;
        if (temp <= w) {
            System.out.print("Soleado");
        }
        else {
            System.out.print("Nublado");
        }
    }
}
