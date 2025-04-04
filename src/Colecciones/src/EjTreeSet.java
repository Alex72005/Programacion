package Colecciones.src;

import java.util.TreeSet;

public class EjTreeSet {
    public static void main(String[] args) {
        TreeSet<Integrante> integrantes = new TreeSet<Integrante>();

        Integrante i1 = new Integrante(18, "Carlos", "Marín");
        Integrante i2 = new Integrante(19, "Victor", "Romero");
        Integrante i3 = new Integrante(20, "Miguel", "Romero");
        Integrante i4 = new Integrante(21, "Pablo", "Martinez");
        Integrante i5 = new Integrante(22, "Rafa", "Luque");
        Integrante i6 = new Integrante(18, "Carlos", "Marín");

        integrantes.add(i1);
        integrantes.add(i2);
        integrantes.add(i3);
        integrantes.add(i4);
        integrantes.add(i5);
        integrantes.add(i6);

        for (Integrante i : integrantes) {
            System.out.println(i);
        }

        System.out.println(i5.equals(i6));
        System.out.println(i6.equals(i3));

        System.out.println(i1.compareTo(i2));
        System.out.println(i3.compareTo(i1));
        System.out.println(i1.compareTo(i1));

    }
}
