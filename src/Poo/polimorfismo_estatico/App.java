package Poo.polimorfismo_estatico;

public class App {
    public static void main(String[] args) {
        System.out.println("Polimorfismo estatico");

        SubclassOverload obj = new SubclassOverload();
        obj.demo(10);
        obj.demo(10, 20);
        obj.demo(5.5);

        Overload obj2 = new Overload();
        obj2.demo(10);
        obj2.demo(10, 20);
        
    }
}
