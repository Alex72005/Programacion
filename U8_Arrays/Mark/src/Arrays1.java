import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int num[] = new int[20];
        int pow[] = new int[20];
        int cube[] = new int[20];
        for (int i = 0; i <= 19; i++) {
            num[i] = (int) (Math.random() * 101);
            pow[i] = num[i] * num[i];
            cube[i] = pow[i] * num[i];
        }
        System.out.print("NUM: ");
        for (int a = 0; a <= 19; a++) {
            System.out.print(num[a] + ", ");
        }
        System.out.println("");
        System.out.print("POW: ");
        for (int b = 0; b <= 19; b++) {
            System.out.print(pow[b] + ", ");
        }
        System.out.println("");
        System.out.print("CUBE: ");
        for (int c = 0; c <= 19; c++) {
            System.out.print(cube[c] + ", ");
        }
    }
}
