public class seriesNumericas {
    public static void main(String[] args) throws Exception {
        /*serie numerica sumando de 2 en 2
        for (int i = 2; i < 13; i = i+2){
            System.out.println(i);

        }
        */
        /*
        int num = 5;
        for (int i = 0; i <= 6; i++){
            num = num + i; 
            System.out.println(num); 
        }
        */
       
        int num = 6;
        for (int i = 1; i <= 7; i++){
            if (i%2==0) {
                num = num *3;               
            }
            
            else {
                num = num + 2;
            }
        }
        
        /* 
        int numero = 6;
        boolean accion = false;
        for(int i = 0; i <= 10; i++){
            System.out.println(numero);

            if (accion == false) {
                numero = numero * 3;
            }
            if (accion == true){
                numero = numero + 2;
            }
            if (accion == false){
                accion = true;
            }
            else{
                accion = false;
            }
        }   
       */
    }
}

