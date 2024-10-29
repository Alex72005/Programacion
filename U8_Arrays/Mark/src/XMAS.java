import java.util.Scanner;

public class XMAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a positive number 'n'
        System.out.print("Enter a positive number (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Print the pyramid
            System.out.println("Number Pyramid with " + n + " rows:");

            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }

                // Print increasing numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

                // Print decreasing numbers
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                // Move to the next line for the next row
                System.out.println();
            }
        }

    }
}


