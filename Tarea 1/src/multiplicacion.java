import java.util.Scanner;

public class multiplicacion {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int multiplicacion=0;

        System.out.println("Introduce el primer numero: ");
        num1=sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2=sc.nextInt();


        multiplicacion=num1*num2;

        System.out.println("El resultado de la multiplicación es "+multiplicacion);
        
        sc.close();

        
        


    }
}
