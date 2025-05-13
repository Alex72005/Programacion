package BD.Cine.src.app;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

import BD.Cine.src.dao.*;
import BD.Cine.src.modelo.*;

//java "-Dfile.encoding=UTF-8" -cp "lib/mysql-connector-j-9.3.0.jar;../../../bin" BD.Cine.src.GestorCine

public class GestorCine {
    static Scanner sc = new Scanner(System.in);
    static PeliculaDAO pdao = new PeliculaDAO();
    static SalaDAO sdao = new SalaDAO();
    static ReservaDAO rdao = new ReservaDAO();

    public static void main(String[] args) throws SQLException {
        int option = 0;
        do {
            mostrarMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    Pelicula nuevo = new Pelicula();
                    System.out.println("Titulo");
                    nuevo.setTitulo(sc.nextLine());
                    System.out.println("Género:");
                    nuevo.setGenero(sc.nextLine());
                    System.out.println("Duración en minutos:");
                    nuevo.setDuracion(sc.nextInt());
                    sc.nextLine();
                    pdao.insertar(nuevo);
                    System.out.println("Pelicula registrada.");
                    break;
                case 2:
                    ArrayList<Pelicula> peliculas = pdao.listar();
                    System.out.println("Lista de Peliculas");
                    for (Pelicula p : peliculas) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    Sala nueva = new Sala();
                    System.out.println("Nombre");
                    nueva.setNombre(sc.nextLine());
                    System.out.println("Capacidad:");
                    nueva.setCapacidad(sc.nextInt());
                    sc.nextLine();
                    sdao.insertar(nueva);
                    System.out.println("Sala registrada.");
                    break;
                case 4:
                    ArrayList<Sala> salas = sdao.listar();
                    System.out.println("Lista de Salas");
                    for (Sala s : salas) {
                        System.out.println(s.toString());
                    }
                    break;
                case 5:
                    Reserva reservaN = new Reserva();
                    System.out.println("Película:");

                    System.out.println("Sala:");

                    System.out.println("Fecha (YYYY-MM-DD):");
                    reservaN.setFecha(Date.valueOf(sc.nextLine()));
                    System.out.println("Hora (HH:MM:SS):");
                    reservaN.setHora(Time.valueOf(sc.nextLine()));
                    System.out.println("Nombre del cliente:");
                    reservaN.setNombreCliente(sc.nextLine());
                    System.out.println("Asientos reservados:");
                    reservaN.setAsientosReservados(sc.nextInt());
                    sc.nextLine();
                    rdao.insertar(reservaN);
                    System.out.println("Reserva registrada");
                    break;
                case 6:
                    ArrayList<Reserva> reservas = rdao.listar();
                    System.out.println("Lista de Reservas");
                    for (Reserva r : reservas) {
                        System.out.println(r.toString());
                    }
                    break;
                case 7:
                    System.out.println("Titulo de la pelicula");
                    String titulo = sc.nextLine();
                    ArrayList<Reserva> reserva = rdao.buscar(titulo);
                    if (reserva.isEmpty()) {
                        System.out.println("No hay reservas para ese título.");
                    } else {
                        System.out.println("Resultados de la búsqueda: ");
                        for (Reserva r : reserva) {
                            System.out.println(r.toString());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }

        } while (option != 0);
    }

    public static void mostrarMenu() {
        System.out.println("GESTOR DE CINE");
        System.out.println("1. Registrar nueva película");
        System.out.println("2. Listar películas");
        System.out.println("3. Registrar nueva sala");
        System.out.println("4. Listar salas");
        System.out.println("5. Registrar nueva reserva");
        System.out.println("6. Listar reservas");
        System.out.println("7. Buscar reservas por título de película");
        System.out.println("0. Salir");
    }

}
