package Tareas.Tarea_5.src.Herencia;

public class Main {
    public static void main(String[] args) {
        Goku g1 = new Goku("Super Saiyan", "Kamehameha");
        Vegeta v1 = new Vegeta("Forma normal", "Ataque del Big Bang");

        v1.defender(true);
        g1.siUsaTecnica(false);
        g1.atacar(v1);

        System.out.println(v1);

        
    }
}
