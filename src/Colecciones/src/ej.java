package Colecciones.src;

import java.util.ArrayList;

public class ej {
    public static void main(String[] args) {
        ArrayList <Character> letras = new ArrayList<Character>();

        for (int i = 65; i <= 90; i++) {
            letras.add((char)i);
        }

        System.out.println(letras);

        System.out.println(letras.indexOf('E'));
        System.out.println(letras.indexOf('H'));
        System.out.println(letras.indexOf('O'));

        letras.remove(1);

        Character letra = 'U';
        /*letras.remove((Character)'U');*/
        letras.remove(letra);

        System.out.println(letras);
    }
}
