
public class Daltonismo {
    public static void main(String[] args) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        String color1 = "0";
        String color2 = "0";
        String color3 = "0";
        do {
            c1 = (int) (Math.random() * 6) + 1;
            c2 = (int) (Math.random() * 6) + 1;
            c3 = (int) (Math.random() * 6) + 1;
        }while (c1 == c2 || c2 == c3 || c1 == c3);

        switch (c1) {
            case 1:
                color1 = "PSOE";
                break;
            case 2:
                color1 = "PP";
                break;
            case 3:
                color1 = "VOX";
                break;
            case 4:
                color1 = "VILLAREAL";
                break;
            case 5:
                color1 = "Podemos";
                break;
            case 6:
                color1 = "CIUDADANOS";
                break;
        }

        switch (c2) {
            case 1:
                color2 = "PSOE";
                break;
            case 2:
                color2 = "PP";
                break;
            case 3:
                color2 = "VOX";
                break;
            case 4:
                color2 = "VILLAREAL";
                break;
            case 5:
                color2 = "Podemos";
                break;
            case 6:
                color2 = "CIUDADANOS";
                break;
        }

        switch (c3) {
            case 1:
                color3 = "PSOE";
                break;
            case 2:
                color3 = "PP";
                break;
            case 3:
                color3 = "VOX";
                break;
            case 4:
                color3 = "VILLAREAL";
                break;
            case 5:
                color3 = "Podemos";
                break;
            case 6:
                color3 = "CIUDADANOS";
                break;
        }

        System.out.println("-COLORES-");
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);

    }
}
