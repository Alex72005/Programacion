package Excepciones.src;

public class App2 {
    public static void main(String[] args) {
        
        try {
            Tecnico t = new Tecnico(1, "Javi");
            System.out.println(t);
        } catch (CocheIDException e) {
            System.out.println(e.getMessage());
        }
        
    }
}


