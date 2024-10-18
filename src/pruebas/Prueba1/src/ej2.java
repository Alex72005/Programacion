package pruebas.Prueba1.src;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double peso = 0;
        double altura = 0;
        double indice = 0;
        System.out.println("Introduzca el valor del peso en kg");
        peso = sc.nextDouble();
        System.out.println("Introduzca el valor de la altura en metros");
        altura = sc.nextDouble();

        indice = (peso/(altura*altura));

        if (indice < 18.5){
            System.out.println("Bajo peso");
        }
        else if (indice >= 18.5 && indice < 25){
            System.out.println("Normopeso");
        }
        else if (indice >= 25 && indice < 27){
            System.out.println("Sobrepeso grado I");
        }
        else if (indice >= 27 && indice < 30){
            System.out.println("Sobrepeso grado II");
        }
        else if (indice >= 30 && indice < 35){
            System.out.println("Obesidad de tipo I");
        }
        else if (indice >= 35 && indice < 40){
            System.out.println("Obesidad de tipo II");
        }
        else if (indice >= 40 && indice < 50){
            System.out.println("Obesidad de tipo III (mórbida)");
        }
        else if (indice > 50){
            System.out.println("Obesidad de tipo IV (extrema)");
        }
       else{
        System.out.println("Dato incorrecto");
       } 
       sc.close();

    }
}
