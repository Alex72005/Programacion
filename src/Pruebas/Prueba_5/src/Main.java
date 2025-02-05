package Pruebas.Prueba_5.src;

public class Main {
    public static void main(String[] args) throws Exception {
        Contrato c1 = new Contrato(1500.60, "Completo", "2 meses de vacaciones"); //valido
        Contrato c2 = new Contrato(0, "media jornada", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
        + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + 
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); //no valido

        Empleado e1 = new Empleado("Alejandro", "Santos Merina", "+34633414755", c1); //valido
        Empleado e2 = new Empleado("aa","bb","123456789",c2); // no valido
        
        System.out.println(e1);
        System.out.println(e2);

        System.out.println(c1);
        System.out.println(c2);
        
        
        System.out.println("Modifico un contrato y empleado con datos no validos");
        c1.setSalario(0);
        System.out.println(c1);
        e1.setApellidos("aa");
        System.out.println(e1);
        
        System.out.println("Modifico un contrato y empleado con datos válidos");
        c2.setTipoJornada("parcial");
        c2.setClaúsulas("1 mes de vacaciones");
        System.out.println(c2);
        e2.setNombre("Cristian");
        e2.setApellidos("Sanchez Gutierrez");
        System.out.println(e2);

        System.out.println(e1.getContrato().getSalario());
    }
}
