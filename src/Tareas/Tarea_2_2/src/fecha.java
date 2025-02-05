package Tareas.Tarea_2_2.src;

import java.util.Scanner;
public class fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha = "";
        System.out.println("Introduzca la fecha para sumarle dos días");
        fecha = sc.next();
        boolean bisiesto = false;

        int dia = Integer.parseInt(fecha.charAt(0) + "" + fecha.charAt(1));
        int mes = Integer.parseInt(fecha.charAt(3) + "" + fecha.charAt(4));
        int anyo = Integer.parseInt(fecha.charAt(6) + "" + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9));

        int diaSuma = dia + 2;
        
        if (mes == 01 || mes == 03 || mes == 05 || mes == 07 || mes == 8 || mes == 10 || mes == 12) {
            if (dia == 30 || dia == 31){
                diaSuma = diaSuma - 31;
                mes++;
            }
        }
        if (mes == 04 || mes == 06 || mes == 9 || mes == 11) {
            if (dia == 29 || dia == 30) {
                diaSuma = diaSuma -30;
                mes++;
            }
        }

        if (mes == 13) {
            mes = 01;
            anyo++;
        }
        
        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)){
            bisiesto = true;
        }
        else{
            bisiesto = false;
        }
        if (mes == 02){
            if (bisiesto == true){
                diaSuma = diaSuma - 29;
                mes++;
            }
            else{
                diaSuma = diaSuma - 28;
                mes++;
            }
        }
        
        System.out.println(diaSuma + "/" + mes + "/" + anyo);
        sc.close();

    }
}
