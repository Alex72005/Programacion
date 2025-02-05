package Pruebas.Prueba_2.src;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("El factorial del número "+num+ " es "+fact);
        sc.close();




    }
}
