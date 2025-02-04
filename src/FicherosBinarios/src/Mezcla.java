package FicherosBinarios.src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Mezcla {
    public static void main(String[] args) {

        HashMap<Integer,Alumno> alumnos = new HashMap<Integer,Alumno>();

        try {
            FileInputStream fi = new FileInputStream("src/FicherosBinarios/alumnos.bin");
            ObjectInputStream oi = new ObjectInputStream(fi);
            oi.readUTF();

            while (fi.available() > 0) {
                Alumno alumno = (Alumno)oi.readObject();
                alumnos.put(alumno.getId(), alumno);
            }

            oi.close();
            fi.close();
        } catch (Exception e) {
           e.printStackTrace();
        }

        try {
            FileInputStream fi2 = new FileInputStream("src/FicherosBinarios/notasMedias.bin");
            ObjectInputStream oi2 = new ObjectInputStream(fi2);
            oi2.readUTF();

            while (fi2.available() > 0) {
                int id = oi2.readInt();
                double nota = oi2.readDouble();
                if (alumnos.containsKey(id)) {
                    Alumno alumno2 = alumnos.get(id);
                    /*alumno2.nota = nota;*/
                    alumno2.setNota(nota);
                }
            }

            oi2.close();
            fi2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fo = new FileOutputStream("src/FicherosBinarios/conjunto.bin");
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            for (Alumno alumno : alumnos.values()) {
                oo.writeObject(alumno);
            }

            oo.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}