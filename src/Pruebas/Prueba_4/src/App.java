package Pruebas.Prueba_4.src;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = {{0,1,2},
                           {1,2,0},
                           {2,0,1}};

        int opcion = 0;
       
        do {

            System.out.println("1.Mostrar la sala"); 
            System.out.println("2.Reservar asiento");
            System.out.println("3.Cancelar Reserva");
            System.out.println("4.Buscar asiento disponible");
            System.out.println("5.Contar asientos ocupados"); 
            System.out.println("Introduce la opción");
            opcion = sc.nextInt();
            System.out.println("Introduce la fila");
            int fila = sc.nextInt();
            System.out.println("Introduce la columna");
            int columna = sc.nextInt();
            
            switch (opcion) {
                case 1:
                for (int i = 0; i < matriz.length; i++){
                    for (int j = 0; j < matriz[i].length; j++){
                        if (matriz[i][j] == 0) {
                            matriz[i][j] = '.';
                        }
                        if (matriz[i][j] == 1) {
                            matriz[i][j] = 'X';
                        }
                        if (matriz[i][j] == 2) {
                            matriz[i][j] = 'R';
                        }
                        System.out.print((char)matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                    break;
               
                case 2:
                    if (matriz[fila][columna] == 0) {
                        System.out.println("Asiento reservado");
                        matriz[fila][columna] = 2;
                    }
                    if (matriz[fila][columna] == 1 || matriz[fila][columna] == 2) {
                        System.out.println("Error, ese asiento está ocupado o reservado");
                    }
                    break;
    
                case 3:
                    if (matriz[fila][columna] == 2) {
                        System.out.println("El asiento " + fila + columna + " esta disponible");
                        matriz[fila][columna] = 0;
                    }
                    if (matriz[fila][columna] == 1 || matriz[fila][columna] == 0) {
                        System.out.println("Error, el asiento está ocupado o disponible");
                    }
                    break;
                case 4:
                    boolean encontrado = false;
                    while (!encontrado) {
                        int filaRandom = 1;
                        int columnaRandom = 1;

                        if(matriz[filaRandom][columnaRandom] == 0){
                            System.out.println("El asiento con fila " + filaRandom + " y columna " + columnaRandom + " está disponible");
                            encontrado = true;
                        }
                    }
                    break;

                case 5:                                                                                              
                int contador = 0;
                for (int i = 0; i < matriz.length; i++){
                    for (int j = 0; j < matriz[i].length; j++){
                        if (matriz[i][j] == 1) {
                            contador++;
                        } 
                    }
                }
                    System.out.println(contador);
                    break;
                case 6:
                    
                    break;
                default:
                    break;
            }

        } while (opcion == 0);
        
        sc.close();
    }
}
