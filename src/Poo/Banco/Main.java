package Poo.Banco;
/*bidireccional */
public class Main {
    public static void main(String[] args) {
        Cliente d1 = new Cliente("Alejandro");
        CtaCte c1 = new CtaCte(0, d1);

        System.out.println(d1);
    }
}
