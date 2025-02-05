import java.util.Scanner;

public class division {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int division=0;

        System.out.println("Introduce el primer numero: ");
        num1=sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2=sc.nextInt();


        division=num1/num2;

        System.out.println("El resultado de la división es "+division);
        
        sc.close();

        
        


    }
}
