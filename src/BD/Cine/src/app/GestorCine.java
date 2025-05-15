package BD.Cine.src.app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import BD.Cine.src.dao.*;
import BD.Cine.src.modelo.*;
import BD.Cine.src.util.ConexionBD;

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

    public static void buscarReservasPorFecha() {
        System.out.println("Introduce la fecha (YYYY-MM-DD):");
        String input = sc.nextLine();

        try {
            Date fecha = Date.valueOf(input);
            List<Reserva> reservas = rdao.buscarPorFecha(fecha);

            if (reservas.isEmpty()) {
                System.out.println("No hay reservas para esa fecha.");
            } else {
                System.out.println("\n--- Reservas en " + fecha + " ---");
                for (Reserva r : reservas) {
                    System.out.println(r);
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Formato de fecha inválido.");
        }
    }

    public static void buscarClientesPorInicial() {
        System.out.println("Introduce la letra inicial del nombre del cliente:");
        String letra = sc.nextLine();

        if (letra.length() != 1) {
            System.out.println("Debes introducir solo una letra.");
            return;
        }

        List<Reserva> reservas = rdao.buscarClientesPorInicial(letra);

        if (reservas.isEmpty()) {
            System.out.println("No se encontraron reservas con nombres que comiencen por esa letra.");
        } else {
            System.out.println("\n--- Reservas con nombres que empiezan por '" + letra.toUpperCase() + "' ---");
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }

    public static void eliminarReservasDeCliente() {
        System.out.println("Introduce el nombre completo del cliente:");
        String nombre = sc.nextLine();

        boolean eliminado = rdao.eliminarReservasPorCliente(nombre);

        if (eliminado) {
            System.out.println("Reservas del cliente eliminadas.");
        } else {
            System.out.println("No se encontraron reservas para ese cliente.");
        }
    }

    public static void eliminarReservasPorFecha() {
        System.out.println("Introduce la fecha de las reservas a eliminar (YYYY-MM-DD):");
        String fechaTexto = sc.nextLine();

        try {
            Date fecha = Date.valueOf(fechaTexto);
            boolean eliminado = rdao.eliminarReservasPorFecha(fecha);

            if (eliminado) {
                System.out.println("Reservas eliminadas para la fecha " + fecha);
            } else {
                System.out.println("No se encontraron reservas para esa fecha.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Formato de fecha inválido.");
        }
    }

    public static void mostrarClientesConReservasRepetidas() {
        Map<String, Integer> clientes = rdao.obtenerClientesConCantidadDeReservas();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes con reservas repetidas.");
        } else {
            System.out.println("--- Clientes con más de una reserva ---");
            for (Map.Entry<String, Integer> entry : clientes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " reservas");
            }
        }
    }

    // 9
    public static void listarReservasCompletas() {
        var lista = rdao.listarReservasCompletas();
        lista.forEach(System.out::println);
    }

    public static void mostrarReservasPorPelicula() {
        var mapa = rdao.contarReservasPorPelicula();
        mapa.forEach((titulo, total) -> System.out.println(titulo + ": " + total + " reservas"));
    }

    public static void mostrarAsientosPorSala() {
        var mapa = rdao.contarAsientosPorSala();
        mapa.forEach((sala, total) -> System.out.println("Sala " + sala + ": " + total + " asientos reservados"));
    }

    public static void mostrarSalasSinReservas() {
        var lista = rdao.obtenerSalasSinReservas();
        if (lista.isEmpty()) {
            System.out.println("Todas las salas tienen reservas.");
        } else {
            System.out.println("Salas sin reservas:");
            lista.forEach(System.out::println);
        }
    }

    public static void verificarReservasDePelicula() {
        System.out.print("ID de la película a verificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean tiene = rdao.peliculaTieneReservas(id);
        System.out.println(tiene ? "La película tiene reservas." : "La película no tiene reservas.");
    }

    public static void mostrarReservasPorSalaYFecha() {
        var mapa = rdao.contarReservasPorSalaYFecha();
        for (var entrada : mapa.entrySet()) {
            String sala = entrada.getKey();
            for (var fechaYTotal : entrada.getValue().entrySet()) {
                System.out.println("Sala " + sala + " | Fecha " + fechaYTotal.getKey() + " -> " + fechaYTotal.getValue()
                        + " reservas");
            }
        }
    }

    public static void mostrarPeliculasReservadasEnFecha() {
        System.out.print("Introduce la fecha (YYYY-MM-DD): ");
        Date fecha = Date.valueOf(sc.nextLine());
        var lista = rdao.obtenerPeliculasReservadasEnFecha(fecha);
        lista.forEach(System.out::println);
    }

    public static void mostrarClientesConVariasReservas() {
        var mapa = rdao.clientesConMultiplesReservas();
        mapa.forEach((nombre, total) -> System.out.println(nombre + ": " + total + " reservas"));
    }

    public static void mostrarReservasPorTitulo() {
        System.out.print("Introduce el título de la película: ");
        String titulo = sc.nextLine();
        var reservas = rdao.obtenerReservasPorTitulo(titulo);
        if (reservas.isEmpty()) {
            System.out.println("No se encontraron reservas para esa película.");
        } else {
            reservas.forEach(r -> System.out.println(r));
        }
    }

}