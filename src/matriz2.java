public class matriz2 {
    public static void main(String[] args) {
        // 4
        for (int i = 4; i >= 0 ;i--){
            for (int j = 0; j < 5; j++){
                if (i > j) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        //1
        for (int i = 4; i >= 0 ;i--){
            for (int j = 0; j < 5; j++){
                if (i < j) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    
    }

}
