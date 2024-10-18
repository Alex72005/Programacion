package Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String fx;
        int a[] = null;
        System.out.println("-ARRAY FUNCTIONS-");
        System.out.println("1. GenerateArrayInt: Generates an array of size n with random numbers whose range\n" +
                "(minimum and maximum) is indicated as a parameter.");
        System.out.println("2. MinimArrayInt: Returns the minimum value of the array that is passed as a parameter.");
        System.out.println("3. MaximumArrayInt: Returns the maximum of the array that is passed as parameter.");
        System.out.println("4. MediaArrayInt: Returns the average of the array that is passed as a parameter.");
        System.out.println("5. ThisInArrayInt: Tells whether or not a number is inside an array.");
        System.out.println("6. PositionInArray: Searches for a number in an array and returns the position\n" +
                "(the index) in which it is located.");
        System.out.println("7. RotateArrayInt: Rotate n positions to the left the numbers of an array.");
        System.out.println("Exit: End the program.");
        do {
            int n = 0;
            int m = 0;
            int l = 0;
            System.out.print("Console: ");
            fx = xd.next();
            switch (fx) {
                case "1":
                    System.out.print("Insert the size of array: ");
                    n = xd.nextInt();
                    System.out.print("Insert the min valor of each array part: ");
                    m = xd.nextInt();
                    System.out.print("Insert the max valor of each array part: ");
                    l = xd.nextInt();
                    a = FunctionsLib.generateArrayInt(n, m, l);
                    System.out.print("Your new Array is: ");
                    FunctionsLib.outputArray(a);
                    break;
                case "2":
                    if (a != null) {
                        System.out.println("Minim valor of array: " + FunctionsLib.minimArrayInt(a));
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "3":
                    if (a != null) {
                        System.out.println("Max valor of array: " + FunctionsLib.maximumArrayInt(a));
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "4":
                    if (a != null) {
                        System.out.println("Media of all valor of array: " + FunctionsLib.mediaArrayInt(a));
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "5":
                    if (a != null) {
                        System.out.println("Insert the number you want to search: ");
                        n = xd.nextInt();
                        if (FunctionsLib.thisInArrayInt(a, n)) {
                            System.out.println("Your number IS in the array");
                        }
                        else {
                            System.out.println("Your number NOT IS in the array");
                        }
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "6":
                    if (a != null) {
                        System.out.println("Insert the number you want to search: ");
                        n = xd.nextInt();
                        System.out.println("Your number is in position " + FunctionsLib.positionInArray(a, n));
                        if (FunctionsLib.positionInArray(a, n) == -1) {
                            System.out.println("(If the position is -1, your number is not in array.)");
                        }
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "7":
                    if (a != null) {
                        do {
                            System.out.println("Insert the number of movements (must be positive): ");
                            n = xd.nextInt();
                        } while (n < 0);
                        System.out.println("New Array: ");
                        a = FunctionsLib.rotateArrayInt(a, n);
                        FunctionsLib.outputArray(a);
                    }
                    else {
                        System.out.println("Array expected with 1 Function.");
                    }
                    break;
                case "Exit":
                    System.out.println("End.");
                    break;
                default:
                    System.out.println("Not-recognized function.");
            }
        }
        while (!fx.equals("Exit"));
    }
}