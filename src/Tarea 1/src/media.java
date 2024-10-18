import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int num3=0;
        int media=0;

        System.out.println("Introduce el primer numero: ");
        num1=sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2=sc.nextInt();

        System.out.println("Introduce el tercer numero: ");
        num3=sc.nextInt();


        media=(num1+num2+num3)/3;

        System.out.println("El resultado de la media aritmética es "+media);
        
        sc.close();


        
        


    }
}
