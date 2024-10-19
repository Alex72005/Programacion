package Tarea4.src;
public class Figura3 {
    public static void main(String[] args) {
       for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
       } 
    }
    
}
