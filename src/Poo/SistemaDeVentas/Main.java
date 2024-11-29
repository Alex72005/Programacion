package Poo.SistemaDeVentas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Empleado e = new Empleado("Juan", 40, 1000);
        Gerente g = new Gerente("María", 30, 2000, "Recursos Humanos");
        Vendedor v = new Vendedor("Pedro", 20, 1500, 4000);

        empleados.add(e);
        empleados.add(g);
        empleados.add(v);

        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            System.out.println(emp.toString() + ", bonificacion: " + emp.calcularBonificacion());
             
            if (emp instanceof Gerente gerente) {
                gerente.dirigirReunion();
            }
            else if (emp instanceof Vendedor vendedor) {
                vendedor.vender(1000);
                System.out.println("Después de una nueva venta: " + vendedor.toString() + " y la bonificación nueva es: " + vendedor.calcularBonificacion());
            }
            
        }
       
    }
}
