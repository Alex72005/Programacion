package pruebas.Prueba2.src;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número");
        int num = sc.nextInt();
        int sumatorio = 0;

        for (int i = 0; i <= num; i++){
            sumatorio = sumatorio + i;
        }

        System.out.println("El sumatorio del número "+num+ " es "+sumatorio);
        sc.close();

    }

}
