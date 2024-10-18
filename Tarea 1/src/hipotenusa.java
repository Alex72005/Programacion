import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int cat1;
        int cat2;
        double hipotenusa;


        System.out.println("Introduce el primer cateto: ");
        cat1=sc.nextInt();

        System.out.println("Introduce el segundo cateto: ");
        cat2=sc.nextInt();

        hipotenusa = Math.sqrt(cat1 * cat1 + cat2 * cat2);

        System.out.println("El resultado de la hipotenusa es:"+hipotenusa);

        sc.close();

    }

    
}

