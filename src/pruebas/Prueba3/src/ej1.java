package pruebas.Prueba3.src;
public class ej1 {
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7,8,9,10,1};
        int media = 0;
        int contador = 0;
        for(int i = 0; i < num.length; i++){
            if (i % 2 == 0) {
                media = media + num[i]; 
                contador++;
            }
        }
        int resultado = media / contador ;

        System.out.println("El resultado de la media es: "+resultado);
       
    }
    
}
