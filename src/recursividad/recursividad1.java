package recursividad;

public class recursividad1 {
    public static int metodoInfinito(int n){
        if (n == 0) return 1;
        int t = metodoInfinito(n-1);
        return n*t;
    }    

    public static void main(String[] args) {
        System.out.println(metodoInfinito(4));
    }
}
