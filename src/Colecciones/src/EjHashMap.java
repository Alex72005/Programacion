package Colecciones.src;

import java.util.ArrayList;
import java.util.HashMap;

public class EjHashMap {
    public static void main(String[] args) {
        
        /*ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(10);

        for (Integer num : numeros) {
            System.out.println(num);
        }

        HashMap <Integer, String> palabras = new HashMap<Integer, String>();

        palabras.put(1, "teclado");
        palabras.put(2, "raton");
        palabras.put(3, "pantalla");

        for (Integer clave : palabras.keySet()) {
            System.out.println(clave);
            System.out.println(palabras.get(clave));
        } */

        ArrayList<ArrayList<String>> congelados = new ArrayList<>();

        ArrayList<String> cereales = new ArrayList<>();
        cereales.add("arroz");
        cereales.add("avena");

        ArrayList<String> verduras = new ArrayList<>();
        verduras.add("pimiento rojo");
        verduras.add("cebolla");

        ArrayList<String> cosasRaras = new ArrayList<>();
        cosasRaras.add("ajo");
        cosasRaras.add("aceite");

        congelados.add(cereales);
        congelados.add(verduras);

        for (ArrayList<String> congelado : congelados) {
            for (String producto : congelado) {
                System.out.println(producto);
            }
        }

        HashMap <String, ArrayList<String>> congelados2 = new HashMap<>();
        
        congelados2.put("cer", cereales);
        congelados2.put("verd", verduras);
        congelados2.put("cositas", cosasRaras);

        for (String clave : congelados2.keySet()) {
            System.out.println(clave);
            for (String producto : congelados2.get(clave)) {
                System.out.println(producto);
            }
            
        }


        
    }
}
