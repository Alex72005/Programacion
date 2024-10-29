package DNI.src;
public class Main {
    public static void main(String[] args) throws Exception {
       
        Persona p1 = new Persona("Alex", "Santos", "05/09/2005", 29);

        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        }

        else{
            System.out.println("Es menor de edad");
        }

        
        System.out.println(p1);

        Dni d1 = new Dni("12345678");
        System.out.println(d1);

        Dni d2 = new Dni("12345678", 'B');   
        System.out.println(d2); 

        Persona p2 = new Persona("Alex", "Santos", "05/09/2005", 19);
        Dni d3 = new Dni("31023506");
        p2.setDni(d3);
        System.out.println(p2.getDni());

    }
}
