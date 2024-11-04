package Poo.ej2;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa(20);

        Empleado empleado1 = new Empleado("Alejandro", "Santos", 1800, "Informático");
        Empleado empleado2 = new Empleado("Carlos", "Rodriguez", 1700, "Recursos humanos");

        empresa1.agregarEmpleado(empleado1);
        empresa1.agregarEmpleado(empleado2);

        empresa1.aumentarSalarioEmpleados(10);
        System.out.println("Los salarios actualizados son: " + empleado1.getSalario() + " y " + empleado2.getSalario());
        System.out.println(empleado1);


    }
}



