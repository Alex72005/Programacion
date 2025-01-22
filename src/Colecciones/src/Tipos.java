package Colecciones.src;

import java.util.LinkedList;

public class Tipos {
    public static void main(String[] args) {

        LinkedList<Double> lista = new LinkedList<Double>();

        lista.add(1.5);
        lista.add(5.5);
        lista.add(-1.5);

        System.out.println(lista);

        //Conocer el tamaño de la lista
        System.out.println(lista.size());

        //Añadir elemento en la posición indicada
        lista.add(1,-5.5);
        System.out.println(lista);

        //Obtener el elemento de la lista dada su posicion
        System.out.println(lista.get(0));

        //Borrado a partir de una posicion
        System.out.println(lista.remove(0));

        //Borrado del elemento indicado
        Double elemento = 1.5;
        lista.remove(elemento);

        //Borrado de todos los elementos de la lista 
        /*lista.clear();
        System.out.println(lista);*/

        //Actualizar el elemento dada una posicion
        lista.set(1, 8.8);
        System.out.println(lista);


        System.out.println(lista.contains(5.5));

        //Devuelve la posicion dado un valor de busqueda
        System.out.println(lista.indexOf(-1.5));

        //Saber si la lista esta vacía
        System.out.println(lista.isEmpty());

        lista.add(8.8);
        System.out.println(lista);

        System.out.println(lista.lastIndexOf(8.8));

        

    }
}
