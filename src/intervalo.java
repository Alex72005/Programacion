import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inferior = 0;
        int superior = 0;

        do {
            System.out.println("Introduzca el límite inferior");
            inferior = sc.nextInt();
            System.out.println("Introduzca el límite superior");
            superior = sc.nextInt();

            if (inferior > superior) {
                System.out.println("El limite inferior tiene que ser menor que el superior. Por favor introduzca los limites de nuevo");
            }

        } while (inferior > superior);


        int c1 = 0; /*Contador numeros dentro del intervalo */
        int c2 = 0; /*Contador numeros fuera del intervalo */

        System.out.println("Introduzca números. Cuando introduzca el 0 el programa se detendrá");
        int numero = sc.nextInt();
        while (numero != 0) {
            if (numero <= superior && numero >= inferior) {
                c1 += numero;
            }
            else{
                 c2++;
            }
            
            numero = sc.nextInt();
        }
        
        System.out.println("La suma de los números que están dentro del intervalo es: " + c1);
        System.out.println("La cantidad de números que están fuera del intervalo es: " + c2);

        sc.close();
        
    }
}   
