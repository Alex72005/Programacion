import java.util.Scanner;

public class SupremacismoColorista {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String color[] = {"blue", "red", "yellow", "green", "black", "pink", "orange"};
        String a[] = new String[10];
        String sort[] = new String[10];
        String unsort[] = new String[10];
        System.out.println("Insert 10 Strings");
        for (int i = 0; i <= 7; i++) {
            System.out.print("String " + (i+1) + ": ");
            a[i] = xd.next();
        }

        for (int j = 0; j <= 7; j++) {
            System.out.print(a[j]);
        }



        for (int m = 0; m <= 7; m++) {
            System.out.print(a[m] + ", ");
        }
    }
}
