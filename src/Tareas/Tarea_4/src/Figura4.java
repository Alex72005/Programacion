package Tareas.Tarea_4.src;

public class Figura4 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--){
            for (int j  = 0; j <= 9; j++){
                if (j >= i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
        
    

