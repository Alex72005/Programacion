package Poo.ej2;

public class Empresa {
    private Empleado[] empleados;
    private int contadorEmpleados;

    public Empresa(int capacidad){
        empleados = new Empleado[capacidad];
        contadorEmpleados = 0;
    }

    public void agregarEmpleado(Empleado empleado){
        if (contadorEmpleados < empleados.length) {
            empleados[contadorEmpleados] = empleado;
            contadorEmpleados++;    
        }
        else{
            System.out.println("No se pueden agregar más empleados");
        }
    }

    public void mostrarEmpleados(){
        System.out.println("Empleados en la empresa: ");
        for (int i = 0; i < contadorEmpleados; i++) {
            System.out.println(empleados[i]);
        }
    }

    public void aumentarSalarioEmpleados(double porcentaje){
        for (int i = 0; i < contadorEmpleados; i++) {
            empleados[i].aumentarSalario(porcentaje);
        }
    }
}
