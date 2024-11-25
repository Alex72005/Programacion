package recursividad;

public class fibonacci {
    public static int serieFibonacci(int n){
        if (n <= 1) return n;
        int t = serieFibonacci(n - 1) + serieFibonacci(n - 2);
        return t;
    }    
        
    public static void main(String[] args) {
        System.out.println(serieFibonacci(8));
    }
}
