public class edad {
    public static void main(String[] args) throws Exception {
        int edad = 5;

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        }
        else if (edad >=18 ) {
            System.out.println("Eres adulto");
        }
        else{
            System.out.println("Eres mayor de edad");
        }
        


        switch(edad){
            case 0:
            case 1:
            case 2:
            case 17:
                System.out.println("Menor de edad");
                break;


        }






    }
}