package Tareas.Tarea_2.src;

import java.util.Scanner;

public class orden {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Introduce el numero: ");
        num1=sc.nextInt();

        System.out.println("Introduce el segundo número:");
        num2=sc.nextInt();

        System.out.println("Introduce el tercer número");
        num3=sc.nextInt();

        if ((num1<num2)&&(num2<num3)){
            System.out.println("Los numeros se encuentran en orden ascendente");
        } 

        else {
            System.out.println("Los numeros se encuentran en orden descendente");
        }


        






    }
}