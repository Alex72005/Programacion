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
                    cdao.insertar(pedirContenido());
                    System.out.println("Contenido registrado");
                    break;
                case 2:
                    imprimirArrayList(cdao.listarPeliculas());
                    imprimirArrayList(cdao.listarSeries());
                    break;
                case 3:
                    String opcion = "hola";
                    int id = 0;
                    System.out.println("Dime que campo quieres actualizar");
                    opcion = sc.nextLine();
                    System.out.println("Dime el id del contenido que quieres actualizar");
                    id = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case "titulo":
                            System.out.println("Dime el titulo");
                            String titulo = sc.nextLine();
                            cdao.actualizarTitulo(titulo, id);
                            break;
                        case "tipo":
                            System.out.println("Dime el tipo");
                            String tipo = sc.nextLine();
                            cdao.actualizarTipo(tipo, id);
                            break;
                        case "genero":
                            System.out.println("Dime el genero");
                            String genero = sc.nextLine();
                            cdao.actualizarGenero(genero, id);
                            break;
                        case "duracion_min":
                            System.out.println("Dime la duracion en minutos");
                            int duracion = sc.nextInt();
                            sc.nextLine();
                            cdao.actualizarDuracion(duracion, id);
                            break;
                        case "estreno":
                            System.out.println("Dime el año del estreno");
                            String estreno = sc.nextLine();
                            cdao.actualizarEstreno(estreno, id);
                            break;
                        case "valoracion":
                            System.out.println("Dime la valoracion");
                            double valoracion = sc.nextDouble();
                            sc.nextLine();
                            cdao.actualizarValoracion(valoracion, id);
                            break;
                        default:
                            break;
                    }
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
                    cdao.buscarPorTitulo(tit);
                    break;
                case 7:
                    vdao.insertar(pedirValoracion());
                    System.out.println("Valoracion registrada");
                    break;
                case 8:
                    ArrayList<Contenido> s = vdao.mostrarSinValoracion();
                    imprimirArrayList(s);
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
        System.out.println("8. Mostrar contenidos sin valoracion");
        System.out.println("0. Salir");
    }

    public static Contenido pedirContenido() {
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
        return c;
    }

    public static Valoracion pedirValoracion() {
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
        return v;
    }

    public static void imprimirArrayList(ArrayList<Contenido> list) {
        for (Contenido contenido : list) {
            System.out.println(contenido);
        }
    }
}
