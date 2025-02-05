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
                        fr = new FileReader("alumnos.txt");
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

                            for (int i = 4; i < 11; i++) {
                                nombre1 += linea.charAt(i);
                            }

                            for (int i = 15; i <= 24; i++) {
                                nombre2 += linea.charAt(i);
                            }

                            for (int i = 29; i <= 38; i++) {
                                apellido1 += linea.charAt(i);
                            }

                            for (int i = 45; i <= 54; i++) {
                                apellido2 += linea.charAt(i);
                            }

                            for (int i = 59; i <= 85; i++) {
                                email += linea.charAt(i);
                            }

                            for (int i = 91; i < linea.length(); i++) {
                                telefono += linea.charAt(i);
                            }

                            Alumno alumno = new Alumno(id, nombre1, nombre2, apellido1, apellido2, email, telefono, 0);
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
                        fos = new FileOutputStream("alumnos.dat");

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
                        fis = new FileInputStream("alumnos.dat");

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
                        fr2 = new FileReader("notas.txt");
                        br2 = new BufferedReader(fr2);
                        String li;

                        String id = "";
                        int nota1 = 0;
                        int nota2 = 0;
                        int nota3 = 0;
                        int nota4 = 0;
                        int nota5 = 0;
                        int nota6 = 0;

                        while ((li = br2.readLine()) != null) {
                            id = "";
                            nota1 = 0;
                            nota2 = 0;
                            nota3 = 0;
                            nota4 = 0;
                            nota5 = 0;
                            nota6 = 0;

                            id = li.charAt(0) + "" + li.charAt(1);
                            nota1 = Integer.parseInt(li.charAt(4) + "" + li.charAt(5));
                            nota2 = Integer.parseInt(li.charAt(8) + "" + li.charAt(9));
                            nota3 = Integer.parseInt(li.charAt(12) + "" + li.charAt(13));
                            nota4 = Integer.parseInt(li.charAt(16) + "" + li.charAt(17));
                            nota5 = Integer.parseInt(li.charAt(20) + "" + li.charAt(21));
                            nota6 = Integer.parseInt(li.charAt(24) + "" + li.charAt(25));

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
                        fos2 = new FileOutputStream("notas.dat");

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
                        fis2 = new FileInputStream("notas.dat");

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

                case 3:
                    FileInputStream fis3 = null;
                    ObjectInputStream ois3 = null;
                    HashMap<Integer, Alumno> totalAlumnos = new HashMap<Integer, Alumno>();

                    try {
                        fis3 = new FileInputStream("alumnos.dat");

                        while (fis3.available() > 0) {
                            ois3 = new ObjectInputStream(fis3);
                            Alumno al = (Alumno) ois3.readObject();
                            totalAlumnos.put(al.getId(), al);
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
                        fis4 = new FileInputStream("notas.dat");

                        while (fis4.available() > 0) {
                            ois4 = new ObjectInputStream(fis4);
                            int id = 0;
                            int nota1 = 0;
                            int nota2 = 0;
                            int nota3 = 0;
                            int nota4 = 0;
                            int nota5 = 0;
                            int nota6 = 0;
                            double media = 0;

                            Notas n = (Notas) ois4.readObject();

                            id = Integer.parseInt(n.getId());
                            nota1 = n.getNota1();
                            nota2 = n.getNota2();
                            nota3 = n.getNota3();
                            nota4 = n.getNota4();
                            nota5 = n.getNota5();
                            nota6 = n.getNota6();
                            media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6);

                            if (totalAlumnos.containsKey(id)) {
                                Alumno al2 = totalAlumnos.get(id);
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
                        fis5 = new FileOutputStream("notasMedias.dat");

                        for (Alumno a : totalAlumnos.values()) {
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
                        fis6 = new FileInputStream("notasMedias.dat");
                        
                        while (fis6.available() > 0) {
                            ois6 = new ObjectInputStream(fis6);
                            System.out.println((Alumno)ois6.readObject());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally{
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
