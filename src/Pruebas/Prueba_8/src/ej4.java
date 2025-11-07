package Pruebas.Prueba_8.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ej4 {
    public static void main(String[] args) throws Exception {
        FileReader frAlumnos = new FileReader("src/pruebas/Prueba8/alumnos.txt");
        BufferedReader brAlumnos = new BufferedReader(frAlumnos);

        FileWriter fwMedias = new FileWriter("src/pruebas/Prueba8/medias.txt");

        String alumnoString = "";
        int contAlumnos = 0;
        while ((alumnoString = brAlumnos.readLine()) != null) {
            contAlumnos++;

            if (contAlumnos != 1) {
                String idAlumno = "";
                // String emailAlumno = "";

                idAlumno = alumnoString.charAt(0) + "" + alumnoString.charAt(1);

                FileReader frNotas = new FileReader("src/pruebas/Prueba8/notasPruebasPracticas.txt");
                BufferedReader brNotas = new BufferedReader(frNotas);

                String notasString = "";
                int contNotas = 0;

                while ((notasString = brNotas.readLine()) != null) {
                    contNotas++;
                    String idAlumnoNotas = "";

                    if (contNotas != 1) {
                        idAlumnoNotas = notasString.charAt(0) + "" + notasString.charAt(1);
                        System.out.println(idAlumnoNotas);

                        if (idAlumno.equals(idAlumnoNotas)) {
                            // int nota1 = Integer.parseInt(notasString.charAt(4) + "" + notasString.charAt(5));

                            double media = 9.55;

                            fwMedias.write(idAlumno);
                            fwMedias.write(" ");
                            fwMedias.write(media + "");
                            fwMedias.write("\n");

                        }
                    }
                }
                brNotas.close();
            }
    
        }
        fwMedias.close();
        brAlumnos.close();
    }
}
