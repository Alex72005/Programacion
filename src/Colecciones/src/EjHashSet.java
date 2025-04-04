package Colecciones.src;

import java.util.HashSet;

public class EjHashSet {
    public static void main(String[] args) {
        HashSet<Integrante> edades = new HashSet<Integrante>();

        Integrante i1 = new Integrante(20, "Alvaro", "Villalba");
        Integrante i2 = new Integrante(19, "Victor", "Romero");
        Integrante i3 = new Integrante(18, "Miguel", "Romero");
        Integrante i4 = new Integrante(21, "Rafa", "Luque");
        Integrante i5 = new Integrante(22, "Pablo", "Martinez");
        Integrante i6 = new Integrante(22, "Pablo", "Martinez");

        edades.add(i1);
        edades.add(i2);
        edades.add(i3);
        edades.add(i4);
        edades.add(i5);

        for (Integrante e : edades) {
            System.out.println(e);
        }

        System.out.println("¿Es igual i5 a i6? " + i5.equals(i6));
        System.out.println(i5.hashCode() == i1.hashCode());

    }
}
