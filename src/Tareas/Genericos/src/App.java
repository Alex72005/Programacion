package Tareas.Genericos.src;

public class App {
    public static void main(String[] args) throws Exception {
        String [] array = {"Alex","Victor","Miguel"};
        Integer [] array2 = {1,2,3};

        Util.intercambiar(array, 0, 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        Util.intercambiar(array2, 0, 1);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}

