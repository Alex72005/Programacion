import java.util.Scanner;
public class prueba {
    public static void main(String[] args) throws Exception {
        /*  contar cuantos 6 salen 
        int dado1 = 4;
        int dado2 = 3;
        int dado3 = 6;
    
        if (dado1==6 && dado2==6 && dado3==6) {
            System.out.println("Excelente");
        }
        else if ((dado1==6 && dado2==6) || (dado1==6 && dado3==6) || (dado2==6 && dado3==6)){
            System.out.println("Muy bien");
        }
        else if ((dado1==6 && dado2!=6 && dado3!=6) || (dado1!=6 &&  dado2==6 && dado3!=6) || (dado1!=6 && dado2!=6 && dado3==6)){

            System.out.println("Regular");

        }
        else{

            System.out.println("Pésimo");
        }
        */
        /* SUMANDO LOS SEIS 
        int dado1 = 6;
        int dado2 = 6;
        int dado3 = 6;

        int cantidadDados = 0; 

        if(dado1==6){
            cantidadDados++;
    }
        if(dado1==6){
            cantidadDados++;
    }
        if(dado1==6){
            cantidadDados++;
    }

    switch (cantidadDados) {
        case 0:
            System.out.println("Pésimo");
            break;
        case 1:
            System.out.println("Muy bien");
            break;
        case 2:
            System.out.println("Regular");
            break;
        case 3:
            System.out.println("Excelente");
            break;
        default:
            System.out.println("Incorrecto");    
            break;
         */
        /*
         for (int i = 1; i<=100; i++){
            System.out.println("El número "+i);
         }
         */
        //tabla multiplicar numero
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el número para calcular su tabla de multiplicar");
        int numero = sc.nextInt();
        System.out.println("Tabla del "+numero);
        int multiplicacion = 0;
        for (int i = 0; i<=10; i++){
            multiplicacion = numero*i;
            System.out.println(numero + "*" + i + " = " + multiplicacion);
        
        }
        sc.close();

    }
}

