package Tareas.Tarea_4.src;

public class Figura2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (j < i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }

    }
    
}
