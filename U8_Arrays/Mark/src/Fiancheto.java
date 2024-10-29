public class Fiancheto {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int media = 0;
        int chess[][] = new int[10][10];
        int fiancheto[] = new int[10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                chess[i][j] = (int) (Math.random() * (300 - 200 + 1) + 200);
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(" ");
            for (int j = 0; j <= 9; j++) {
                System.out.print(chess[i][j] + " ");
            }
        }

        for (int i = 0; i <= 9; i++) {
                fiancheto[i] = chess[i][i];
        }

        for (int i = 0; i <= 9; i++) {
            if (fiancheto[i] > max) {
                max = fiancheto[i];
            }
            if (fiancheto[i] < min) {
                min = fiancheto[i];
            }
        }

        for (int i = 0; i <= 9; i++) {
            media = fiancheto[i] + media;
        }
        media = media / 10;

        System.out.println(" ");
        System.out.print("DIAGONAL: ");
        for (int i = 0; i <= 9; i++) {
            System.out.print(fiancheto[i] + " ");
        }
        System.out.println(" ");
        System.out.println("NÚMERO MAYOR: " + max);
        System.out.println("NÚMERO MENOR: " + min);
        System.out.println("MEDIA: " + media);
    }
}
