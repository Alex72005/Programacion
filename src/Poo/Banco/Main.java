package Poo.Banco;
/*bidireccional */
public class Main {
    public static void main(String[] args) {
        Cliente d1 = new Cliente("Alejandro", "Santos");
        CtaCte c1 = new CtaCte(5000, d1);

        System.out.println(c1);
        System.out.println(d1);
    }
}
