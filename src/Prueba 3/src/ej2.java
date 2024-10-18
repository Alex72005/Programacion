public class ej2 {
    public static void main(String[] args) throws Exception {

        int[] array = {4,5,10,2,3};

        for (int i = 0 ; i < array.length; i++){
            for (int j = 0; j <= 10; j++){
                int producto = array[i] * j; 
                System.out.println(array[i] + "*" + j + "=" + producto);
            }
        }

    }

}
