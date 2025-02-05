import java.util.Scanner;

public class resta {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=10;
        int resta=0;

        System.out.println("Introduce el primer numero: ");
        num1=sc.nextInt();


        resta=num1-num2;

        System.out.println("El resultado de la resta es "+resta);
        
        sc.close();



    }
}
