package Tareas.Tarea_1.src;

import java.util.Scanner;

public class cambiosigno {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        int num1=0;
        int cambiosigno=0;

        System.out.println("Introduce el numero: ");
        num1=sc.nextInt();

        cambiosigno=num1*(-1);

        System.out.println("El número cambiado de signo es "+cambiosigno);

        sc.close();
        

        
        


    }
}
