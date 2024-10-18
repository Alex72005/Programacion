public class BattleShip {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String pmax = "0";
        String pmin = "0";
        int caribe[][] = new int[6][10];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                caribe[i][j] = (int) (Math.random() * (100 + 1));
            }
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 5; k++) {
                    for (int z = 0; z <= 9; z++) {
                        if (caribe[i][j] == caribe[k][z]) {
                            caribe[i][j] = (int) (Math.random() * (100 + 1));
                        }
                    }
                }
            }

        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 0; j <= 9; j++) {
                System.out.print(caribe[i][j] + " ");
            }
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                if (caribe[i][j] > max) {
                    max = caribe[i][j];
                    pmax = i + " " + j;
                }
                if (caribe[i][j] < min) {
                    min = caribe[i][j];
                    pmin = i + " " + j;
                }
            }
        }
        System.out.println(" ");
        System.out.println("NÚMERO MAYOR: " + max + " (" + pmax + ")");
        System.out.println("NÚMERO MENOR: " + min + " (" + pmin + ")");
    }
}
