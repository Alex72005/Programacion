package Poo;
public class Main{
    public static void main(String[] args) {
       Coche c1 = new Coche("145BJK ","A4 " , "Audi ", "Negro ");
       Coche c2 = new Coche("1780HFK","308","Peugeut","Azul");

       c1.arrancar();
       c1.acelerar(20);
       c1.acelerar(80);
       c1.acelerar(50);
       c1.parar();
       System.out.println(c1);
       System.out.println(c2);
    }
}
