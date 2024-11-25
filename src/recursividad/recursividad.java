package recursividad;
public class recursividad{
    public static int metodoInfinito(int n){
        int t = metodoInfinito(n-1);
        return t;
    }

    public static int metodoInfinito1(int n){
        int t = metodoInfinito1(n - 1);
        if (n == 0) {
            return 1;
        }
        else{
            return t;
        }
    }

    public static void main(String[] args) {
        int i = metodoInfinito(4);
        System.out.println(i);
    }
}