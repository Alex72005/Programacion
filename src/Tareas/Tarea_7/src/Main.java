package Tareas.Tarea_7.src;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona(633414755, "asm0125@alu.medac.es", "05/09/2005", "31023506W");
        Persona p2 = new Persona(634085586, "crs0247@gmail.com", "7/11/2004", "12345678Z");

        System.out.println("Persona 1: " + p1);
        System.out.println("Persona 2: " + p2);

        System.out.println("DNI de Persona 1: " + p1.getDni());
        System.out.println("DNI de Persona 2: " + p2.getDni());
    }
}
