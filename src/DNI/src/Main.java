package DNI.src;
public class Main {
    public static void main(String[] args) throws Exception {
       
       Persona[] personas = new Persona[100];
       Dni[] dni = new Dni[100];

       int num = 0;
       /* 
       for (int i = 0; i < 100; i++){
            num = (int)(Math.random() * 99999999) + 1;
            String numString = num + "";

        */

        for (int i = 0; i < personas.length; i++) {
            String nombre = "Nombre" + (i + 1); // Nombre de ejemplo
            String apellidos = "Apellido" + (i + 1); // Apellidos de ejemplo
            String fechaNac = "01-01-200" + (i % 10); // Fecha de nacimiento de ejemplo
            int edad = 20 + (i % 30); // Edad de ejemplo
            personas[i] = new Persona(nombre, apellidos, fechaNac, edad); // Inicializar la persona en el array
        }

        // Imprimir las personas creadas
        for (Persona p : personas) {
            System.out.println(p);
        }

       
       
        

    }
}
