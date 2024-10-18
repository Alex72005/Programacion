package pruebas.Prueba1.src;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce el resultado obtenido al lanzar el dado:");
        num=sc.nextInt();

        if (num == 1) {
            System.out.println("El número de la cara opuesta es seis");
        }
        else if (num == 2){
            System.out.println("El número de la cara opuesta es cinco");
        }
        else if (num == 3){
            System.out.println("El número de la cara opuesta es cuatro");
        }   
        else if (num == 4){
            System.out.println("El número de la cara opuesta es tres");
        }     
        else if (num == 5) {
            System.out.println("El número de la cara opuesta es dos");
        }
        else if (num == 6){
            System.out.println("El número de la cara opuesta es uno");
        }
        else{
            System.out.println("ERROR: número incorrecto");
        }
        sc.close();

    }
}
