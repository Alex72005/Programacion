package Pruebas.Prueba_9.src;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1.Mostrar alumnos.dat");
            System.out.println("2.Mostrar notas.dat");
            System.out.println("3.Mostrar notasMedias.dat");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    FileReader fr = null;
                    BufferedReader br = null;
                    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
                    try {
                        fr = new FileReader("src/Pruebas/Prueba_9/alumnos.txt");
                        br = new BufferedReader(fr);

                        String linea;

                        int id = 0;
                        String nombre1 = "";
                        String nombre2 = "";
                        String apellido1 = "";
                        String apellido2 = "";
                        String email = "";
                        String telefono = "";

                        while ((linea = br.readLine()) != null) {

                            id = 0;
                            nombre1 = "";
                            nombre2 = "";
                            apellido1 = "";
                            apellido2 = "";
                            email = "";
                            telefono = "";

                            id = Integer.parseInt(linea.charAt(0) + "" + linea.charAt(1));

                            for (int i = 4; i < 15; i++) {
                                nombre1 += linea.charAt(i);
                            }

                            for (int i = 15; i < 28; i++) {
                                nombre2 += linea.charAt(i);
                            }

                            for (int i = 29; i < 44; i++) {
                                apellido1 += linea.charAt(i);
                            }

                            for (int i = 45; i < 58; i++) {
                                apellido2 += linea.charAt(i);
                            }

                            for (int i = 59; i <= 90; i++) {
                                email += linea.charAt(i);
                            }

                            for (int i = 91; i < linea.length(); i++) {
                                telefono += linea.charAt(i);
                            }

                            Alumno alumno = new Alumno(id, nombre1, nombre2, apellido1, apellido2, email, telefono);
                            alumnos.add(alumno);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            br.close();
                            fr.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
                        fos = new FileOutputStream("src/Pruebas/Prueba_9/alumnos.dat");

                        for (Alumno alumno : alumnos) {
                            oos = new ObjectOutputStream(fos);
                            oos.writeObject(alumno);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            oos.close();
                            fos.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileInputStream fis = null;
                    ObjectInputStream ois = null;

                    try {
                        fis = new FileInputStream("src/Pruebas/Prueba_9/alumnos.dat");

                        while (fis.available() > 0) {
                            ois = new ObjectInputStream(fis);
                            System.out.println((Alumno) ois.readObject());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois.close();
                            fis.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 2:
                    FileReader fr2 = null;
                    BufferedReader br2 = null;
                    ArrayList<Notas> notasAlumnos = new ArrayList<Notas>();

                    try {
                        fr2 = new FileReader("src/Pruebas/Prueba_9/notas.txt");
                        br2 = new BufferedReader(fr2);
                        String li;

                        String id = "";
                        double nota1;
                        double nota2;
                        double nota3;
                        double nota4;
                        double nota5;
                        double nota6;

                        while ((li = br2.readLine()) != null) {
                            id = "";
                            nota1 = 0;
                            nota2 = 0;
                            nota3 = 0;
                            nota4 = 0;
                            nota5 = 0;
                            nota6 = 0;

                            id = li.charAt(0) + "" + li.charAt(1);
                            nota1 = Double.parseDouble(li.charAt(4) + "" + li.charAt(5));
                            nota2 = Double.parseDouble(li.charAt(8) + "" + li.charAt(9));
                            nota3 = Double.parseDouble(li.charAt(12) + "" + li.charAt(13));
                            nota4 = Double.parseDouble(li.charAt(16) + "" + li.charAt(17));
                            nota5 = Double.parseDouble(li.charAt(20) + "" + li.charAt(21));
                            nota6 = Double.parseDouble(li.charAt(24) + "" + li.charAt(25));

                            Notas notasAl = new Notas(id, nota1, nota2, nota3, nota4, nota5, nota6);
                            notasAlumnos.add(notasAl);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            br2.close();
                            fr2.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileOutputStream fos2 = null;
                    ObjectOutputStream oos2 = null;

                    try {
                        fos2 = new FileOutputStream("src/Pruebas/Prueba_9/notas.dat");

                        for (Notas n : notasAlumnos) {
                            oos2 = new ObjectOutputStream(fos2);
                            oos2.writeObject(n);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            oos2.close();
                            fos2.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileInputStream fis2 = null;
                    ObjectInputStream ois2 = null;

                    try {
                        fis2 = new FileInputStream("src/Pruebas/Prueba_9/notas.dat");

                        while (fis2.available() > 0) {
                            ois2 = new ObjectInputStream(fis2);
                            System.out.println((Notas) ois2.readObject());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois2.close();
                            fis2.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;
                case 3:
                
                    FileInputStream fis3 = null;
                    ObjectInputStream ois3 = null;
                    HashMap<Integer, AlumnoTotal> totalAlumnos = new HashMap<Integer, AlumnoTotal>();

                    try {
                        fis3 = new FileInputStream("src/Pruebas/Prueba_9/alumnos.dat");

                        while (fis3.available() > 0) {
                            ois3 = new ObjectInputStream(fis3);
                            int id = 0;
                            String nombre1;
                            String nombre2;
                            String apellido1;
                            String apellido2;
                            String email;
                            String telefono;


                            Alumno a = (Alumno)ois3.readObject();
                            id = a.getId();
                            nombre1 = a.getNombre1();
                            nombre2 = a.getNombre2();
                            apellido1 = a.getApellido1();
                            apellido2 = a.getApellido2();
                            email = a.getEmail();
                            telefono = a.getTelefono();

                            AlumnoTotal at = new AlumnoTotal(id, nombre1, nombre2, apellido1, apellido2, email, telefono, 0);
                            totalAlumnos.put(at.getId(), at);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            ois3.close();
                            fis3.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileInputStream fis4 = null;
                    ObjectInputStream ois4 = null;

                    try {
                        fis4 = new FileInputStream("src/Pruebas/Prueba_9/notas.dat");

                        while (fis4.available() > 0) {
                            ois4 = new ObjectInputStream(fis4);
                            int id = 0;
                            double nota1 = 0;
                            double nota2 = 0;
                            double nota3 = 0;
                            double nota4 = 0;
                            double nota5 = 0;
                            double nota6 = 0;
                            double media = 0;

                            Notas n = (Notas) ois4.readObject();

                            id = Integer.parseInt(n.getId());
                            nota1 = n.getNota1();
                            nota2 = n.getNota2();
                            nota3 = n.getNota3();
                            nota4 = n.getNota4();
                            nota5 = n.getNota5();
                            nota6 = n.getNota6();
                            media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;

                            if (totalAlumnos.containsKey(id)) {
                                AlumnoTotal al2 = totalAlumnos.get(id);
                                al2.setNotaMedia(media);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            ois4.close();
                            fis4.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileOutputStream fis5 = null;
                    ObjectOutputStream ois5 = null;

                    try {
                        fis5 = new FileOutputStream("src/Pruebas/Prueba_9/notasMedias.dat");

                        for (AlumnoTotal a : totalAlumnos.values()) {
                            ois5 = new ObjectOutputStream(fis5);
                            ois5.writeObject(a);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois5.close();
                            fis5.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileInputStream fis6 = null;
                    ObjectInputStream ois6 = null;

                    try {
                        fis6 = new FileInputStream("src/Pruebas/Prueba_9/notasMedias.dat");

                        while (fis6.available() > 0) {
                            ois6 = new ObjectInputStream(fis6);
                            System.out.println((AlumnoTotal) ois6.readObject());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois6.close();
                            fis6.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 3 && opcion != 0);
        sc.close();
    }
}