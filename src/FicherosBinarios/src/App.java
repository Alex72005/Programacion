package FicherosBinarios.src;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*import java.io.FileReader;
import java.io.FileWriter;*/
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 5; i++) {
            Persona p = new Persona(i, "Nombre " + i, "Apellidos " + i, i+18);
            personas.add(p);
        }

        /*FileWriter fw = new FileWriter("personas.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < personas.size(); i++) {
            bw.write(personas.get(i).toString());
            bw.newLine();
        }

        bw.close();
        fw.close();

        FileReader fr = new FileReader("personas.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = "";

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }*/


        FileOutputStream fo = new FileOutputStream("personas.dat");
        ObjectOutputStream oo = new ObjectOutputStream(fo);


        for (int i = 0; i < personas.size(); i++) {
            oo.writeObject(personas.get(i));
        }

        oo.close();
        fo.close();

        FileInputStream fi = new FileInputStream("personas.dat");
        ObjectInputStream oi = new ObjectInputStream(fi);

        while (fi.available() > 0) {
           Persona p = (Persona)oi.readObject();
           if (p.getEdad() > 20) {
                System.out.println(p);
           }
        }

        oi.close();
        fi.close();   
    }
}