package Pruebas.Prueba_2.src;
public class ej1 {
    public static void main(String[] args) {
        /*int seg = 3661;
    
        int h,m,s = 0;
        int hr,mr,sr = 0;

        for(int i = seg; seg >= 0; seg--){

            h = seg/3600;   // 0
            hr = seg%3600;  // 1 segundo

            m = hr/60;   // 1 minuto
            mr = hr%60;  // 1 segundo
            
            System.out.println("Quedan "+h+" horas, "+m+" minutos y "+mr+" segundos");
        */
        
        int num = 500;
        for (int i = 1; i <= num;){
            num-=i;
            int min = (num / 60) % 60;
            int seg = num % 60;
            int horas = (num / 60) / 60;
            System.out.println("Quedan "+horas+" horas "+min+" minutos "+seg+" segundos");
        }
        
    }        
}