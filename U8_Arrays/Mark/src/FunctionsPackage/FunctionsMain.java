package FunctionsPackage;
import java.util.Scanner;

public class FunctionsMain {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int n, m, l;
        System.out.println("-FUNCTIONS-");
        System.out.println("1. Iscapicua: Returns true if the number passed as a parameter is capicous and false otherwise.");
        System.out.println("2. IsPrime: Returns true if the number that is passed as a parameter it is prime and false otherwise.");
        System.out.println("3. Digits: Counts the number of digits of an integer.");
        System.out.println("4. Flip: Flips a number over.");
        System.out.println("5. DigitN: Returns the digit that is in the n position of an integer. Start by counting by 0 and from left to right.");
        System.out.println("6. DigitPosition: Gives the position of the first occurrence of a digit within an integer. If not found, return -1.");
        System.out.println("7. RemoveByBehind: Removes a number n digits from the back (by the right).");
        System.out.println("8. PasteByBack: Add a digit to a number from behind.");
        System.out.println("9. NumberSnippet: Takes the start and end positions as parameters within a number and returns the corresponding chunk.");
        System.out.println("10. NumbersTogether: Glue two numbers together to form one.");
        System.out.println("Insert the function's number you want to use: ");
        int fx = xd.nextInt();
        if (fx < 0 || fx > 10) {
            System.out.print("Function doesn't found.");
            System.exit(0);
        }
        switch (fx){
            case 1:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                if (FunctionsLib.IsCapicua(n)) {
                    System.out.print("The number IS capicous");
                }
                else {
                    System.out.print("The number NO IS capicous");
                }
                break;
            case 2:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                if (FunctionsLib.IsPrime(n)) {
                    System.out.print("The number IS prime");
                }
                else{
                    System.out.print("The number IS prime");
                }
                break;
            case 3:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("The length's number is " + FunctionsLib.Digits(n));
                break;
            case 4:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Its flip is " + FunctionsLib.Flip(n));
                break;
            case 5:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Insert the position wanted: ");
                m = PositiveInput(xd.nextInt() );
                System.out.print("The digit is " + FunctionsLib.DigitN(n, m));
                break;
            case 6:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Insert a digit searched: ");
                m = PositiveInput(xd.nextInt());
                System.out.print("The digit is " + FunctionsLib.DigitPosition(n, m));
                break;
            case 7:
                System.out.print("Insert a number: ");
                n = xd.nextInt();
                System.out.print("Insert the number of digit you want to erase: ");
                m = xd.nextInt();
                System.out.print("The number wanted is " + FunctionsLib.RemoveByBehind(n, m));
                break;
            case 8:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Insert the digit you want to paste: ");
                m = DigitInput(xd.nextInt());
                System.out.print("The number wanted is " + FunctionsLib.PasteByBack(n, m));
                break;
            case 9:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Insert the start position: ");
                m = PositiveInput(xd.nextInt());
                System.out.print("Insert the final position: ");
                l = PositiveInput(xd.nextInt());
                System.out.print("The number wanted is " + FunctionsLib.NumberSnippet(n, m, l));
                break;
            case 10:
                System.out.print("Insert a number: ");
                n = PositiveInput(xd.nextInt());
                System.out.print("Insert the digit you want to paste: ");
                m = PositiveInput(xd.nextInt());
                System.out.print("The number wanted is " + FunctionsLib.NumbersTogether(n, m));
                break;
        }
        xd.close();

    }

    public static int PositiveInput (int x) {
        Scanner xd = new Scanner(System.in);
        while (x < 0)  {
            System.out.print("The number is negative, insert it again: ");
            x = xd.nextInt();
        }
        return x;
      

    }
    

    public static int DigitInput (int x) {
        Scanner xd = new Scanner(System.in);
        while (x < 0 || x > 10) {
            System.out.print("The number must be 0-9, insert it again: ");
            x = xd.nextInt();
        }
        return x;
    

    }
}
