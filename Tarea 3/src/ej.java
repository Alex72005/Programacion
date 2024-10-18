import java.util.Scanner;
public class ej {
    public static void main(String[] args) throws Exception {
        int num = 0;
        do{        
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Suma, Resta, Multiplicación, Division");
            System.out.println("2.Cambio de signo");
            System.out.println("3.Media Aritmética");
            System.out.println("4.Hipotenusa");
            System.out.println("5.Segundos");
            System.out.println("6.Orden números creciente");
            System.out.println("7.Si un número es par o impar");
            System.out.println("8.Semanas, días y horas");
            System.out.println("9.Si un año es bisiesto o no");
            System.out.println("10.Indice masa muscular.");
            System.out.println("11.Factorial de un número");
            System.out.println("Introduce el número correspondiente al ejercicio que quieras realizar");
            num = sc.nextInt();
            switch (num) {
                case 0:
                    System.out.println("ERROR");
                    break;
                case 1:
                    System.out.println("1:Suma");
                    System.out.println("2:Resta");
                    System.out.println("3:Multiplicación");
                    System.out.println("4:Division");
                    System.out.println("Selecciona una de las opciones anteriores");
                    int opcion = sc.nextInt();
                    System.out.println("Introduce el primer número");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    int num2 = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            int suma = calcularSuma(num1, num2);
                            System.out.println(suma);
                            break;
                        case 2:
                            int resta = calcularResta(num1, num2);
                            System.out.println(resta);
                        case 3:
                            int multiplicacion = calcularProducto(num1, num2);
                            System.out.println(multiplicacion);
                        case 4:
                            int division = calcularDivision(num1, num2);
                            System.out.println(division);
                            break;
                        default:
                            break;
                    } 
                case 2:
                    System.out.println("Introduce el número al que quieras cambiarle el signo");
                    int num3 = sc.nextInt();
                    int signo = cambioSigno(num3);
                    System.out.println(signo);
                    break;          
                case 3:
                    System.out.println("Introduce el primer número");
                    int num4 = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    int num5 = sc.nextInt();
                    System.out.println("Introduce el tercer número");
                    int num6 = sc.nextInt();
                    int media = mediaAritmetica(num4, num5, num6);
                    System.out.println(media);
                    break;
                case 4:
                    System.out.println("Introduce el primer cateto");
                    int cat1 = sc.nextInt();
                    System.out.println("Introduce el segundo cateto");
                    int cat2 = sc.nextInt();
                    double hipotenusa = calculoHipotenusa(cat1,cat2);
                    System.out.println(hipotenusa);
                    break;
                case 5:
                    System.out.println("Introduce las horas");
                    int horas = sc.nextInt();
                    System.out.println("Introduce los minutos");
                    int min = sc.nextInt();
                    System.out.println("Introduce los segundos");
                    int seg = sc.nextInt();
                    int total = calculoSegundos(horas,min,seg);
                    System.out.println(total);
                    break;
                case 6:
                    System.out.println("Introduce el primer numero");
                    int num7 = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    int num8 = sc.nextInt();
                    System.out.println("Introduce el tercer número");
                    int num9 = sc.nextInt();
                    String orden = ordenCreciente(num7, num8, num9);
                    System.out.println(orden);
                    break;
                case 7:
                    System.out.println("Introduce el numero");
                    int num10 = sc.nextInt();
                    String par = numeroPar(num10);
                    System.out.println(par);
                    break;
                case 8:
                    System.out.println("Introduce el número de horas");
                    int horas2 = sc.nextInt();
                    String cambio = cambioHoras(horas2);
                    System.out.println(cambio);
                    break;
                case 9:
                    System.out.println("Introduce el año");
                    int anyo = sc.nextInt();
                    String bisiesto = añoBisiesto(anyo);
                    System.out.println(bisiesto);
                    break;
                case 10: 
                    System.out.println("Introduce el peso en kg");
                    double peso = sc.nextDouble();
                    System.out.println("Introduce la altura en metros");
                    double altura = sc.nextDouble();
                    double indice = indiceMasa(peso, altura);
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
                        System.out.println("Obesidad de tipo II");
                    }
                    else if (indice > 50){
                        System.out.println("Obesidad de tipo IV (extrema)");
                    }
                    else{
                        System.out.println("Dato incorrecto");
                    } 
                    break;
                case 11:
                    System.out.println("Introduce el numero");
                    int num11 = sc.nextInt();
                    int numFactorial = factorial(num11);
                    System.out.println(numFactorial);
                    break;
                default:            
                    System.out.println("Error");
                    break;
            }  
            sc.close();

            
        } while(num > 0);      
    }

    public static int calcularSuma(int x, int y) {
        return x + y;
    }
    public static int calcularResta(int x, int y) {
        return x - y;
    }
    public static int calcularProducto(int x, int y) {
        return x * y;
    }
    public static int calcularDivision(int x, int y) { 
        return x / y;
    }
    public static int cambioSigno(int x){
        return x * (-1);
    }
    public static int mediaAritmetica(int x, int y , int z){
        return (x+y+z) / 3;
    }
    public static double calculoHipotenusa(int x, int y){
        return Math.sqrt(x * x + y * y);
    }
    public static int calculoSegundos(int x, int y, int z){
        return (x*3600) + (y*60) + z;
    }
    public static String ordenCreciente(int x, int y, int z){
        if ((x < y)&&(y < z)){
            return "Los numeros se encuentran en orden ascendente";
        } 
        else {
            return "Los numeros se encuentran en orden descendente";
        }
    }
    public static String numeroPar(int x){
        if (x%2==0){
            return "El numero es par";
        }
        else {
            return "El numero es impar";
        }
    }
    public static String cambioHoras(int x){
        String total = "";
        int semanas = x / (7 * 24);
        int dias = x % (7 * 24) / 24;
        int horas = x % 24;
        
        total = semanas + " semanas " + dias + " días " + horas + " horas ";
        return total;
    }
    public static String añoBisiesto(int x){
        if (x % 4 == 0){
            return "El año es bisiesto";
        }
        else{
            return "El año no es bisiesto";
        }
    }
    public static double indiceMasa(double x, double y){
        return x / (y * y);
    }
    public static int factorial(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++){
            fact = fact * i;
        }
        return fact; 
    }
}
