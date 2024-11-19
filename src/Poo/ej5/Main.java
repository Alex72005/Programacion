package Poo.ej5;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Alejandro", "Santos ", 19, "Intermedio");
        Profesor p = new Profesor("Javi", "Suarez", 30, "Programación");

        System.out.println(e);
        System.out.println(p);
    }
}
