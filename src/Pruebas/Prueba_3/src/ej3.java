package Pruebas.Prueba_3.src;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        int opcion;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la opción");
            System.out.println("1: Convertir euros a dólares");
            System.out.println("2: Convertir euros a libras");
            System.out.println("3: Convertir euros a yenes");
            System.out.println("4: Convertir euros a todas las monedas");
            opcion = sc.nextInt();
            
            System.out.println("Introduce la cantidad de euros que quieres convertir");
            int cantidad = sc.nextInt();

            switch (opcion) {
                case 1:
                    double [] num = convertirEurosAMonedas(cantidad);
                    System.out.println(num[0]);
                    break;
                case 2:
                    double [] num1 = convertirEurosAMonedas(cantidad);
                    System.out.println(num1[1]);
                    break;
                case 3:
                    double [] num2 = convertirEurosAMonedas(cantidad);
                    System.out.println(num2[2]);
                    break;
                case 4:
                    double [] num3 =convertirEurosAMonedas(cantidad);
                    for (int i = 0; i < num3.length; i++){
                        System.out.println(num3[i] );
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            sc.close();

        } while(opcion > 0);
    }


    public static double[] convertirEurosAMonedas(int x){
        
        final double dolar = 0.98;
        final double libras = 0.87;
        final double yenes = 144.73;

        double cdolar = x * dolar;
        double clibras = x * libras;
        double cyenes = x * yenes;

        double[] y = {cdolar,clibras,cyenes};

        return y;
    }
}

