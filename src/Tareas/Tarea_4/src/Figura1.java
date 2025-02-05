package Tareas.Tarea_4.src;

public class Figura1 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }



    }
}


