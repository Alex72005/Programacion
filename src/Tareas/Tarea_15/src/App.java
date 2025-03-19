package Tareas.Tarea_15.src;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet <Integer> numeros = new HashSet<Integer>();

        Random random = new Random();

        while (numeros.size() < 15) {
            numeros.add(random.nextInt(101));
        }

        TreeSet<Integer> numerosOrd = new TreeSet<Integer>(numeros);

        System.out.println(numerosOrd);

        TreeMap<Integer, Boolean> nPrimos = new TreeMap<Integer, Boolean>();

        for (Integer i : numerosOrd) {
            nPrimos.put(i, esPrimo(i));
        }

        for (Integer key : nPrimos.keySet()) {
            boolean esP = nPrimos.get(key);

            if (esP) {
                System.out.println(key + ": " + "Sí");
            }
            else{
                System.out.println(key + ": " + "No");
            }
        }
    }

    private static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
