package Pruebas.Prueba_8.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        int opcion = 0;
        String linea;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Mostrar alumnos.txt");
            System.out.println("2.Mostrar notasPruebasPracticas.txt");
            System.out.println("3.Mostrar notasmedias.txt");
            System.out.println("4.Mostrar al alumno con mayor nota media");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    FileReader fr = null;
                    BufferedReader br = null;

                    try {
                        fr = new FileReader("alumnos.txt");
                        br = new BufferedReader(fr);

                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                    } catch (Exception e) {
                        System.out.println("Error al leer el fichero " + e.getMessage());
                    }

                    finally {
                        try {
                            br.close();
                            fr.close();
                        } catch (Exception e) {
                            System.out.println("Error al leer el fichero " + e.getMessage());
                        }
                    }
                    break;
                case 2:
                    FileReader fr2 = null;
                    BufferedReader br2 = null;

                    try {
                        fr2 = new FileReader("notasPruebasPracticas.txt");
                        br2 = new BufferedReader(fr2);

                        while ((linea = br2.readLine()) != null) {
                            System.out.println(linea);
                        }

                    } catch (Exception e) {
                        System.out.println("Error al leer el fichero " + e.getMessage());
                    }

                    finally {
                        try {
                            br2.close();
                            fr2.close();
                        } catch (Exception e) {
                            System.out.println("Error al leer el fichero " + e.getMessage());
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:
                    FileReader fr3 = null;
                    BufferedReader br3 = null;
                    double max = 0;
                    ArrayList<String> lineas = new ArrayList<String>();
                    String id2 = "";
                    String nota;
                    double notaMedia = 0;

                    try {
                        fr3 = new FileReader("src/pruebas/Prueba8/notasMedias.txt");
                        br3 = new BufferedReader(fr3);

                        while ((linea = br3.readLine()) != null) {
                            lineas.add(linea);
                        }

                        for (int i = 1; i < lineas.size(); i++) {
                            nota = lineas.get(i).charAt(4) + "" + lineas.get(i).charAt(5) + "" + lineas.get(i).charAt(6);
                            notaMedia = Double.parseDouble(nota);
                            if (notaMedia > max) {
                                id2 = lineas.get(i).charAt(0) + "" + lineas.get(i).charAt(1);
                                max = notaMedia;
                            }
                        }

                        System.out.println("El alumno con id " + id2 + " con la mayor nota media: " + max );
                       

                    } catch (Exception e) {
                        System.out.println("Error al leer el fichero " + e.getMessage());
                    }

                    finally {
                        try {
                            br3.close();
                            fr3.close();
                        } catch (Exception e) {
                            System.out.println("Error al leer el fichero " + e.getMessage());
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (opcion > 0);
        sc.close();
    }
}
