import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        String noentrega;
        int a = 1;
        System.out.print("Ingrese la cantidad de examenes realizados durante el curso: ");
        int examenes = xd.nextInt();
        if (examenes < 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        int sumaex = 0;
        int notaex;
        for (int i = examenes; i > 0; i--) {
            System.out.print("Nota de examen " + a + ": ");
            notaex = xd.nextInt();
            if (notaex < 0 || notaex > 10) {
                System.out.print("Nota no valida");
                System.exit(0);
            }
            if (notaex < 4) {
                System.out.print("Al tener menos de 4 en al menos un examen, el alumno esta suspenso");
                System.exit(0);
            }
            sumaex = sumaex + notaex;
            a++;
        }
        int b = 1;
        System.out.print("Ingrese la cantidad de prácticas realizados durante el curso: ");
        int practicas = xd.nextInt();
        if (practicas < 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        int sumapr = 0;
        int notapr;
        for (int i = practicas; i > 0; i--) {
            System.out.print("Nota de práctica " + b + ": ");
            notapr = xd.nextInt();
            if (notapr < 0 || notapr > 10) {
                System.out.print("Nota no valida");
                System.exit(0);
            }
            if (notapr == 0) {
                System.out.print("¿La nota de 0 ha sido causada por la no entrega de la tarea? (Y/N): ");
                noentrega = xd.next();
                switch (noentrega) {
                    case "Y":
                        System.out.print("El alumno esta SUSPENSO por no haber entregado todas las prácticas");
                        System.exit(0);
                        break;
                    case "N":
                        break;
                    default:
                        System.out.print("Entrada no valida");
                        System.exit(0);
                }
            }
            sumapr = sumapr + notapr;
            b++;
        }
        System.out.print("Inserte el número de expulsiones del alumno: ");
        int expulsiones = xd.nextInt();
        if (expulsiones < 0) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        if (expulsiones > 3) {
            System.out.print("El alumno esta SUSPENSO al haber sido expulsado mas de 3 veces");
            System.exit(0);
        }

        double mediaex = (double) sumaex / (double) examenes;
        double mediapr = (double) sumapr / (double) practicas;
        double media = 0.3 * mediapr + 0.7 * mediaex;
        System.out.println("La media final entre los examenes (valor de 70%)\n" +
                "y las practicas (valor de 30 %) es: " + media);

        if (media >= 0 && media < 5) {
            System.out.print("SUSPENSO.");
        }
        else if (media >= 5 && media < 6) {
            System.out.print("SUFICIENTE");
        }
        else if (media >= 6 && media < 7) {
            System.out.print("BIEN");
        }
        else if (media >= 7 && media < 9) {
            System.out.print("NOTABLE");
        }
        else if (media >= 9 && media <= 10) {
            System.out.print("SOBRESALIENTE");
        }

        xd.close();
    }
}