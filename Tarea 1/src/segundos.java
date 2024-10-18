import java.util.Scanner;

public class segundos {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int horas=0;
        int minutos=0;
        int seg=0;
        int total=0;
        final int cambio_horas=3600;
        final int cambio_minutos=60;

        System.out.println("Introduce las horas: ");
        horas=sc.nextInt(); 

        System.out.println("Introduce los minutos: ");
        minutos=sc.nextInt();

        System.out.println("Introduce los segundos: ");
        seg=sc.nextInt();

        total=(horas*cambio_horas)+(minutos*cambio_minutos)+seg;

        System.out.println("Los segundos totales son:"+total);

        sc.close();


        
        

        
        


    }

    
}

