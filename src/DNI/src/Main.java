package DNI.src;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Persona[] personas = new Persona[100];
        Dni[] dnis = new Dni[100];
       
        Random random = new Random();

        for (int i = 0; i < dnis.length; i++){
            String numeros = Integer.toString(random.nextInt(99999999 + 1)); 
            while (numeros.length() < 8) {
                numeros = "0" + numeros; 
            }

            dnis[i] = new Dni(numeros);
        }
        
        for (int i = 0; i < personas.length; i++) {
            String nombre = "Nombre" + (i + 1); // Nombre de ejemplo
            String apellidos = "Apellido" + (i + 1); // Apellidos de ejemplo
            String fechaNac = "01-01-200" + (i % 10); // Fecha de nacimiento de ejemplo
            int edad = 20 + (i % 30); // Edad de ejemplo, 
            personas[i] = new Persona(nombre, apellidos, fechaNac, edad, dnis[i]); // Inicializar la persona en el array
        }

        // Imprimir las personas creadas
       for (int i = 0; i < personas.length; i++){
            if (personas[i].getDni().getLetra() == 'A') {
                System.out.println(personas[i]);
            }
       }
       
       
        

    }
}
