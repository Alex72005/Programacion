package Tareas.Tarea_8.src;

public class Main {
    public static void main(String[] args) throws Exception {
        Reloj reloj = new Reloj();

        while (true) {
            System.out.println(reloj);
            reloj.incrementar();
            Thread.sleep(1000);
        }
    }
}
