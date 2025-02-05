package Tareas.Tarea_1.src;

import java.util.Scanner;

public class grados {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int grados1=0;
        int grados2=0;

        System.out.println("Introduce los grados celsius: ");
        grados1=sc.nextInt();

        grados2=32+(9*grados1/5);

        System.out.println("Los grados Fahrenheit son:"+grados2);

        sc.close();




        
        

        
        


    }

    
    }

