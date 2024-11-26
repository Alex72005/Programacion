package recursividad;

public class torresDeHanoi {
    public static void main(String[] args) {
        torres(5, 'A', 'C', 'B');
    }

    public static void torres(int n, char origen, char destino, char auxiliar){
        if (n == 0) {
            System.out.println("No hay discos");
        }

        else if (n == 1) {
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino); 
        }

        else{
            torres(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            torres(n - 1, auxiliar, destino, origen);
        }
    }
}
