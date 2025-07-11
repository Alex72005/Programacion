package Pruebas.Prueba_6.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus("1780HFB", 10);
        Tractor tractor = new Tractor("1234AFH", 20);

        autobus.setSiEstaAlquilado(true);
        tractor.setSiEstaAlquilado(true);

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("1.Alquilar autobus");
            System.out.println("2.Devolver autobus");
            System.out.println("3.Alquilar tractor");
            System.out.println("4.Devolver tractor");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    autobus.alquilar(60);
                    break;
                case 2:
                    autobus.devolver(120);
                    System.out.println(autobus.calcularPrecio());
                    break;
                case 3:
                    tractor.alquilar();
                    break;   
                case 4:
                    tractor.devolver();
                    System.out.println(tractor.calcularPrecio());
                    break;
                default:
                    break;
            }
        } while (option > 0); 

        sc.close();
    }
}

