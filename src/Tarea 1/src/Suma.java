import java.util.Scanner;

public class Suma {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=10;
        int suma=0;

        System.out.println("Introduce el primer numero: ");
        num1=sc.nextInt();


        suma=num1+num2;

        System.out.println("El resultado de la suma es "+suma);
        
        sc.close();

    }
}