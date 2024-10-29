
public class Xenofobia {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int media = 0;
        int count = 0;
        String country[] = {"Spain", "Russia", "Japan", "Australia"};
        int h[][] = new int[4][10];
        int m[][] = new int[4][3];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 9; j++) {
                h[i][j] = (int) (Math.random() * (210 - 140 + 1) + 140);
            }
        }

        for (int i = 0; i <= 9; i++) {
            if (h[i][count] > max) {
                max = h[i][count];
            }
            if (h[i][count] < min) {
                min = h[i][count];
            }
            count++;
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(" ");
            System.out.print(country[i] + ": ");
            for (int j = 0; j <= 9; j++) {
                System.out.print(h[i][j] + " ");

            }
        }
    }
}
