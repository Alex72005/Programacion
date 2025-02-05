package Tareas.Tarea_5.src.Asociacion;
/*bidireccional */
public class Main {
    public static void main(String[] args) {
        Cliente d1 = new Cliente("Alejandro", "Santos");
        CtaCte c1 = new CtaCte(0, d1);
        c1.setSaldo(5000);
        System.out.println(d1);
    }
}
