package Tareas.Genericos.src;

public class Util {
    public static <T> void intercambiar(T[] array, int i, int j){
        T posicion = array[i];
        array[i] = array[j];
        array[j] = posicion;
    }
}
