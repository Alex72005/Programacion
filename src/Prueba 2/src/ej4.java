import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        System.out.println("Introduzca una cantidad de números");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            System.out.println("Introduce el número "+ i + ":");
            int j = sc.nextInt(); 
            if (j>0){
                c1 = c1 + 1;
            }
            else if(j<0){
                c2 = c2 + 1;
            }
            else if(j==0){
                c3 = c3 + 1;
            }
            
        }
        
        System.out.println("Se han introducido "+c1+" números mayores a 0, "+c3+" número igual a 0 y "+c2+" número menor a 0");

        sc.close();

    }
    
}
