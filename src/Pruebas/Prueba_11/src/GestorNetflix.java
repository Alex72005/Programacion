package Pruebas.Prueba_11.src;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorNetflix {
    // javac -cp "lib/mysql-connector-j-9.3.0.jar" -d bin src/App.java
    // javac -cp "lib/mysql-connector-j-9.3.0.jar" -d ../../../bin src/*.java
    // Me coloco en la raiz y lo ejecuto
    // java "-Dfile.encoding=UTF-8" -cp
    // "lib/mysql-connector-j-9.3.0.jar;../../../bin" App
    // java "-Dfile.encoding=UTF-8" -cp "lib/mysql-connector-j-9.3.0.jar;bin" App
    static Scanner sc = new Scanner(System.in);
    static ContenidoDAO cdao = new ContenidoDAO();
    static ValoracionDAO vdao = new ValoracionDAO();

    public static void main(String[] args) throws Exception {
        int option = 0;
        do {
            mostrarMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    insertarContenido();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    System.out.println("Dime el campo que quieres actualizar");
                    String campoo = sc.nextLine();
                    actualizar(campoo);
                    break;
                case 4:
                    System.out.println("Dime 1 si quieres eliminar por id o dime 2 si quieres eliminar por titulo");
                    int o = sc.nextInt();
                    sc.nextLine();
                    switch (o) {
                        case 1:
                            System.out.println("Dime el id del contenido que quieres eliminar");
                            int id2 = sc.nextInt();
                            sc.nextLine();
                            cdao.eliminarPorID(id2);
                            break;
                        case 2:
                            System.out.println("Dime el titulo del contenido que quieres eliminar");
                            String t = sc.nextLine();
                            cdao.eliminarPorTitulo(t);
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    ArrayList<Contenido> mPe = cdao.mejoresPeliculas();
                    ArrayList<Contenido> mSe = cdao.mejoresSeries();
                    System.out.println("Mejores Peliculas");
                    for (Contenido p : mPe) {
                        System.out.println(p);
                    }
                    System.out.println("Mejores Series");
                    for (Contenido s : mSe) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.out.println("Dime el titulo del contenido que quieres buscar");
                    String tit = sc.nextLine();
                    Contenido co = cdao.buscarPorTitulo(tit);
                    System.out.println(co);
                    break;
                case 7:
                    Valoracion v = new Valoracion();
                    System.out.println("Id del contenido");
                    v.setId_contenido(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nombre del usuario");
                    v.setNombre_usuario(sc.nextLine());
                    System.out.println("Puntuacion");
                    v.setPuntuacion(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Comentario");
                    v.setComentario(sc.nextLine());
                    vdao.insertar(v);
                    System.out.println("Valoracion registrada");
                    break;
                case 8:
                    System.out.println("Digame el id del contenido que quiera saber su validación");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Valoracion> valoraciones = vdao.listarPorContenido(id2);
                    System.out.println(valoraciones);
                    break;
                case 9:
                    ArrayList<Contenido> s = vdao.mostrarSinValoracion();
                    for (Contenido contenido : s) {
                        System.out.println(contenido);
                    }
                    break;
                default:
                    break;
            }

        } while (option != 0);
    }

    public static void mostrarMenu() {
        System.out.println("GESTOR DE NETFLIX");
        System.out.println("1. Insertar nuevo contenido");
        System.out.println("2. Listar contenido por tipo");
        System.out.println("3. Actualizar el contenido");
        System.out.println("4. Eliminar contenido");
        System.out.println("5. Mostrar las 3 mejores peliculas y 3 mejores series");
        System.out.println("6. Buscar por titulo");
        System.out.println("7. Insertar nueva valoracion");
        System.out.println("8. Listar Validaciones por Contenido");
        System.out.println("9. Mostrar contenidos sin valoracion");
        System.out.println("0. Salir");
    }

    public static void insertarContenido() throws SQLException {
        Contenido c = new Contenido();
        System.out.println("Titulo");
        c.setTitulo(sc.nextLine());
        System.out.println("Tipo");
        c.setTipo(sc.nextLine());
        System.out.println("Genero");
        c.setGenero(sc.nextLine());
        System.out.println("Duracion en minutos");
        c.setDuracion_min(sc.nextInt());
        sc.nextLine();
        System.out.println("Año de estreno");
        c.setEstreno(sc.nextLine());
        System.out.println("Valoracion");
        c.setValoracion(sc.nextDouble());
        sc.nextLine();
        cdao.insertar(c);
        System.out.println("Contenido registrado");
    }

    public static ArrayList<Contenido> listar() throws SQLException {
        ArrayList<Contenido> peliculas = cdao.listarPeliculas();
        ArrayList<Contenido> series = cdao.listarSeries();
        ArrayList<Contenido> total = new ArrayList<>();

        for (Contenido contenido : peliculas) {
            total.add(contenido);
        }

        for (Contenido contenido : series) {
            total.add(contenido);
        }

        return total;
    }

    public static void actualizar(String campo) throws SQLException {       
        System.out.println("Dime el id");
        int id2 = sc.nextInt();
        sc.nextLine();
        switch (campo) {
            case "titulo":
                System.out.println("Dime el titulo");
                String titulo = sc.nextLine();
                cdao.actualizar(campo, titulo, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            case "tipo":
                System.out.println("Dime el tipo");
                String tipo = sc.nextLine();
                cdao.actualizar(campo, tipo, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            case "genero":
                System.out.println("Dime el genero");
                String genero = sc.nextLine();
                cdao.actualizar(campo, genero, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            case "duracion_min":
                System.out.println("Dime la duracion en minutos");
                int duracion = sc.nextInt();
                sc.nextLine();
                cdao.actualizar(campo, duracion, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            case "estreno":
                System.out.println("Dime el año del estreno");
                String estreno = sc.nextLine();
                cdao.actualizar(campo, estreno, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            case "valoracion":
                System.out.println("Dime la valoracion");
                double valoracion = sc.nextDouble();
                sc.nextLine();
                cdao.actualizar(campo, valoracion, id2);
                System.out.println("Campo " + campo + " actualizado correctamente.");
                break;
            default:
                break;
        }
        sc.close();
    }

}
