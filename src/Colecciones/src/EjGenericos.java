package Colecciones.src;

public class EjGenericos {
    public static void main(String[] args) {
        ContenedorIntegrantes<Integrante> equipo = new ContenedorIntegrantes<>();

        Integrante i1 = new Integrante(25, "Ana", "García");
        Integrante i2 = new Integrante(30, "Juan", "Pérez");
        Integrante i3 = new Integrante(18, "Alex", "Santos");

        equipo.agregarIntegrante(i1);
        equipo.agregarIntegrante(i2);

        System.out.println("Integrante más joven: " + equipo.getMasJoven());
        System.out.println("Integrantes ordenados:");

        for (Integrante i : equipo.getIntegrantesOrdenados()) {
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println(equipo.buscarIntegrante(i1));
        System.out.println(equipo.buscarIntegrante(i3));

    }
}
