package Colecciones.src;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, Integrante> edades = new HashMap<Integer, Integrante>();

        Integrante i1 = new Integrante(20, "Alvaro", "Villalba");
        Integrante i2 = new Integrante(19, "Victor", "Romero");
        Integrante i3 = new Integrante(18, "Miguel", "Romero");
        Integrante i4 = new Integrante(21, "Rafa", "Luque");
        Integrante i5 = new Integrante(22, "Pablo", "Martinez");
        Integrante i6 = new Integrante(22, "Pablo", "Martinez");

        edades.put(i1.getEdad(), i1);
        edades.put(i2.getEdad(), i2);
        edades.put(i3.getEdad(), i3);
        edades.put(i4.getEdad(), i4);
        edades.put(i5.getEdad(), i5);

        for (Integer e : edades.keySet()) {
            System.out.println("Clave: " + e + " Valor: " + edades.get(e));
        }

        System.out.println("¿Es igual i5 a i6? " + i5.equals(i6));

    }
}
