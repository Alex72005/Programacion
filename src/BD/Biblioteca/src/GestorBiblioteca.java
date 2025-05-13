package BD.Biblioteca.src;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

//java "-Dfile.encoding=UTF-8" -cp "lib/mysql-connector-j-9.3.0.jar;../../../bin" BD.Biblioteca.src.GestorBiblioteca

public class GestorBiblioteca {
    static Scanner sc = new Scanner(System.in);
    static LibroDAO ldao = new LibroDAO();

    public static void main(String[] args) throws SQLException {
        int option;
        do {
            mostrarMenu();
            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    Libro nuevo = new Libro();
                    System.out.print("Titulo: ");
                    nuevo.setTitulo(sc.nextLine());
                    System.out.print("Autor: ");
                    nuevo.setAutor(sc.nextLine());
                    System.out.print("Año de Publicación: ");
                    nuevo.setAñoPublicacion(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Género: ");
                    nuevo.setGenero(sc.nextLine());
                    ldao.insertar(nuevo);
                    System.out.println("Cliente registrado.");
                    break;
                case 2:
                    ArrayList<Libro> libros = ldao.listar();
                    System.out.println("Lista de clientes");
                    for (Libro l : libros) {
                        System.out.println(l.getId() + ": " + l.getTitulo() + " " + l.getAutor() + ", "
                                + l.getAñoPublicacion() + ", " + l.getGenero() + ", " + l.isDisponible());
                    }
                    break;
                case 3:
                    Libro editar = new Libro();
                    System.out.print("ID del cliente a actualizar: ");
                    editar.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nuevo título: ");
                    editar.setTitulo(sc.nextLine());
                    System.out.print("Nuevo autor: ");
                    editar.setAutor(sc.nextLine());
                    System.out.print("Nuevo año de publicación: ");
                    editar.setAñoPublicacion(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nuevo género: ");
                    editar.setGenero(sc.nextLine());
                    ldao.actualizar(editar); // Actualiza el cliente en la base de datos
                    System.out.println("Cliente actualizado.");
                    break;
                case 4:
                    Libro eliminar = new Libro();
                    System.out.print("ID del libro a eliminar: ");
                    eliminar.setId(sc.nextInt()); // Solo necesitamos el ID
                    ldao.eliminar(eliminar.getId()); // Elimina el cliente usando su ID
                    System.out.println("Cliente eliminado.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (option != 0);
    }

    public static void mostrarMenu() {
        System.out.println("GESTOR DE BIBLIOTECA");
        System.out.println("1. Registrar nuevo libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Actualizar libro");
        System.out.println("4. Eliminar libro");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

}
