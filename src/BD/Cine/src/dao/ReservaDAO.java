package BD.Cine.src.dao;

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

import BD.Cine.src.modelo.*;
import BD.Cine.src.util.ConexionBD;

public class ReservaDAO {

    public void insertar(Reserva reserva) throws SQLException {
        Pelicula pelicula = PeliculaDAO.buscar(reserva.getPelicula().getId());
        Sala sala = SalaDAO.buscar(reserva.getSala().getId());

        if (reserva.getAsientosReservados() > reserva.getSala().getCapacidad()) {
            System.out.println("No se pueden reservar más asientos que la capacidad de la sala.");
        }

        if (pelicula == null || sala == null) {
            System.out.println("La película o la sala no existen.");
        }

        // if (estaSalaOcupada(sala.getId(), reserva.getFecha(), reserva.getHora())) {
        // System.out.println("La sala ya está reservada en esa fecha y hora.");
        // }

        java.util.Date hoy = new java.util.Date();
        if (reserva.getFecha().before(new java.sql.Date(hoy.getTime()))) {
            System.out.println("No se puede reservar una fecha ya pasada");
        }

        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Reservas (ID_Pelicula, ID_Sala, Fecha, Hora, Nombre_Cliente, Asientos_Reservados) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pelicula.getId());
        ps.setInt(2, sala.getId());
        ps.setDate(3, reserva.getFecha());
        ps.setTime(4, reserva.getHora());
        ps.setString(5, reserva.getNombreCliente());
        ps.setInt(6, reserva.getAsientosReservados());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Reserva> listar() throws SQLException {
        Connection con = ConexionBD.conectar();
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        String sql = "SELECT * FROM Reservas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); // donde guardo los datos de la consulta

        while (rs.next()) {
            Reserva reserva = new Reserva();
            reserva.setId(rs.getInt("ID_Reserva"));
            reserva.setId(rs.getInt("ID_Pelicula"));
            reserva.setId(rs.getInt("ID_Sala"));
            reserva.setFecha(rs.getDate("Fecha"));
            reserva.setHora(rs.getTime("Hora"));
            reserva.setNombreCliente(rs.getString("Nombre_Cliente"));
            reserva.setAsientosReservados(rs.getInt("Asientos_Reservados"));
            reservas.add(reserva);
        }

        ConexionBD.desconectar(con);
        return reservas;
    }

    public void actualizar(Reserva reserva) throws SQLException {
        Pelicula pelicula = PeliculaDAO.buscar(reserva.getPelicula().getId());
        Sala sala = SalaDAO.buscar(reserva.getSala().getId());

        if (reserva.getAsientosReservados() > reserva.getSala().getCapacidad()) {
            System.out.println("No se pueden reservar más asientos que la capacidad de la sala.");
        }

        if (pelicula == null || sala == null) {
            System.out.println("La película o la sala no existen.");
        }

        java.util.Date hoy = new java.util.Date();
        if (reserva.getFecha().before(new java.sql.Date(hoy.getTime()))) {
            System.out.println("No se puede reservar una fecha ya pasada");
        }

        Connection con = ConexionBD.conectar();
        String sql = "UPDATE reservas SET ID_Pelicula=?, ID_Sala=?, Fecha=?, Hora=?, Nombre_Cliente=?, Asientos_Reservados=? WHERE ID_Reserva=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pelicula.getId());
        ps.setInt(2, sala.getId());
        ps.setDate(3, reserva.getFecha());
        ps.setTime(4, reserva.getHora());
        ps.setString(5, reserva.getNombreCliente());
        ps.setInt(6, reserva.getAsientosReservados());
        ps.setInt(7, reserva.getId());
        ps.executeUpdate();
        System.out.println("Reserva actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void eliminar(int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Reservas WHERE ID_Reserva=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Reserva eliminada correctamente");
        ConexionBD.desconectar(con);
    }

    public ArrayList<Reserva> buscar(String titulo) throws SQLException {
        ArrayList<Reserva> reserva = new ArrayList<Reserva>();
        Connection con = ConexionBD.conectar();
        String sql = "SELECT r.* FROM Reservas r JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula WHERE p.Titulo LIKE ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + titulo + "%");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pelicula pelicula = PeliculaDAO.buscar(rs.getInt("ID_Pelicula"));
            Sala sala = SalaDAO.buscar(rs.getInt("ID_Sala"));

            Reserva r = new Reserva();
            r.setId(rs.getInt("ID_Reserva"));
            r.setPelicula(pelicula);
            r.setSala(sala);
            r.setFecha(rs.getDate("Fecha"));
            r.setHora(rs.getTime("Hora"));
            r.setNombreCliente(rs.getString("Nombre_Cliente"));
            r.setAsientosReservados(rs.getInt("Asientos_Reservados"));
            reserva.add(r);
        }

        return reserva;
    }


    
    // si la esta esta ocupada en ese dia y hora
    // private boolean estaSalaOcupada(int idSala, Date fecha, Time hora) {
    //     String sql = "SELECT COUNT(*) FROM Reservas WHERE ID_Sala = ? AND Fecha = ? AND Hora = ?";
    //     try (Connection conn = ConexionBD.conectar();
    //             PreparedStatement stmt = conn.prepareStatement(sql)) {
    //         stmt.setInt(1, idSala);
    //         stmt.setDate(2, fecha);
    //         stmt.setTime(3, hora);
    //         ResultSet rs = stmt.executeQuery();
    //         if (rs.next()) {
    //             return rs.getInt(1) > 0;
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    //     return false;
    // }

    // Buscar las reservas de una fecha concreta
    public List<Reserva> buscarPorFecha(Date fecha) {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE Fecha = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, fecha);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pelicula pelicula = PeliculaDAO.buscar(rs.getInt("ID_Pelicula"));
                Sala sala = SalaDAO.buscar(rs.getInt("ID_Sala"));

                Reserva r = new Reserva(
                        rs.getInt("ID_Reserva"),
                        pelicula,
                        sala,
                        rs.getDate("Fecha"),
                        rs.getTime("Hora"),
                        rs.getString("Nombre_Cliente"),
                        rs.getInt("Asientos_Reservados"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public List<Reserva> buscarClientesPorInicial(String letra) {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE UPPER(Nombre_Cliente) LIKE ?";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, letra.toUpperCase() + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = PeliculaDAO.buscar(rs.getInt("ID_Pelicula"));
                Sala sala = SalaDAO.buscar(rs.getInt("ID_Sala"));

                Reserva r = new Reserva(
                        rs.getInt("ID_Reserva"),
                        pelicula,
                        sala,
                        rs.getDate("Fecha"),
                        rs.getTime("Hora"),
                        rs.getString("Nombre_Cliente"),
                        rs.getInt("Asientos_Reservados"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Buscar reservas por nombre del cliente
    public List<Reserva> buscarPorNombreCliente(String nombre) {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE UPPER(Nombre_Cliente) = ?";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre.toUpperCase()); // Comparación insensible a mayúsculas

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = PeliculaDAO.buscar(rs.getInt("ID_Pelicula"));
                Sala sala = SalaDAO.buscar(rs.getInt("ID_Sala"));

                Reserva r = new Reserva(
                        rs.getInt("ID_Reserva"),
                        pelicula,
                        sala,
                        rs.getDate("Fecha"),
                        rs.getTime("Hora"),
                        rs.getString("Nombre_Cliente"),
                        rs.getInt("Asientos_Reservados"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Eliminar reservas de un cliente
    public boolean eliminarReservasPorCliente(String nombreCliente) {
        String sql = "DELETE FROM Reservas WHERE UPPER(Nombre_Cliente) = ?";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreCliente.toUpperCase());
            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean eliminarReservasPorFecha(Date fecha) {
        String sql = "DELETE FROM Reservas WHERE Fecha = ?";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, fecha);
            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Obtenet cientes que se repiten
    public List<String> obtenerClientesRepetidos() {
        List<String> lista = new ArrayList<>();
        String sql = "SELECT Nombre_Cliente FROM Reservas GROUP BY Nombre_Cliente HAVING COUNT(*) > 1";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getString("Nombre_Cliente"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Obtener clientes que se repiten con las reservas que tienen
    public Map<String, Integer> obtenerClientesConCantidadDeReservas() {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        String sql = "SELECT Nombre_Cliente, COUNT(*) AS total FROM Reservas GROUP BY Nombre_Cliente HAVING COUNT(*) > 1";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nombre = rs.getString("Nombre_Cliente");
                int total = rs.getInt("total");
                mapa.put(nombre, total);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mapa;
    }

    // Contar Reservas
    public int contarPorCliente(String nombreCliente) {
        String sql = "SELECT COUNT(*) FROM Reservas WHERE UPPER(Nombre_Cliente) = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreCliente.toUpperCase());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int contarPorSala(int idSala) {
        String sql = "SELECT COUNT(*) FROM Reservas WHERE ID_Sala = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int contarPorFecha(Date fecha) {
        String sql = "SELECT COUNT(*) FROM Reservas WHERE Fecha = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, fecha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int contarPorFechaYHora(Date fecha, Time hora) {
        String sql = "SELECT COUNT(*) FROM Reservas WHERE Fecha = ? AND Hora = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, fecha);
            stmt.setTime(2, hora);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 9
    // mostrar todas las reservas con todos los datos
    public List<String> listarReservasCompletas() {
        List<String> lista = new ArrayList<>();
        String sql = """
                    SELECT r.ID_Reserva, p.Titulo, s.Nombre AS Sala, r.Fecha, r.Hora, r.Nombre_Cliente, r.Asientos_Reservados
                    FROM Reservas r
                    JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula
                    JOIN Salas s ON r.ID_Sala = s.ID_Sala
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String info = "Reserva #" + rs.getInt("ID_Reserva") +
                        " | Película: " + rs.getString("Titulo") +
                        " | Sala: " + rs.getString("Sala") +
                        " | Fecha: " + rs.getDate("Fecha") +
                        " | Hora: " + rs.getTime("Hora") +
                        " | Cliente: " + rs.getString("Nombre_Cliente") +
                        " | Asientos: " + rs.getInt("Asientos_Reservados");
                lista.add(info);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Contar cuántas veces se ha reservado cada película
    public Map<String, Integer> contarReservasPorPelicula() {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        String sql = """
                    SELECT p.Titulo, COUNT(*) AS total
                    FROM Reservas r
                    JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula
                    GROUP BY p.Titulo
                    ORDER BY total DESC
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                mapa.put(rs.getString("Titulo"), rs.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mapa;
    }

    // Contar asientos reservados por sala
    public Map<String, Integer> contarAsientosPorSala() {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        String sql = """
                    SELECT s.Nombre, SUM(r.Asientos_Reservados) AS total
                    FROM Reservas r
                    JOIN Salas s ON r.ID_Sala = s.ID_Sala
                    GROUP BY s.Nombre
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                mapa.put(rs.getString("Nombre"), rs.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mapa;
    }

    // Mostrar salas sin reservas
    public List<String> obtenerSalasSinReservas() {
        List<String> lista = new ArrayList<>();
        String sql = """
                    SELECT s.Nombre
                    FROM Salas s
                    LEFT JOIN Reservas r ON s.ID_Sala = r.ID_Sala
                    WHERE r.ID_Sala IS NULL
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getString("Nombre"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Saber si se puede eliminar una película (tiene reservas)
    public boolean peliculaTieneReservas(int idPelicula) {
        String sql = "SELECT COUNT(*) FROM Reservas WHERE ID_Pelicula = ?";

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPelicula);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Contar reservas por sala y día
    public Map<String, Map<Date, Integer>> contarReservasPorSalaYFecha() {
        Map<String, Map<Date, Integer>> resultado = new LinkedHashMap<>();
        String sql = """
                    SELECT s.Nombre, r.Fecha, COUNT(*) AS total
                    FROM Reservas r
                    JOIN Salas s ON r.ID_Sala = s.ID_Sala
                    GROUP BY s.Nombre, r.Fecha
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String sala = rs.getString("Nombre");
                Date fecha = rs.getDate("Fecha");
                int total = rs.getInt("total");

                resultado.putIfAbsent(sala, new LinkedHashMap<>());
                resultado.get(sala).put(fecha, total);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    // Películas reservadas en una fecha concreta
    public List<String> obtenerPeliculasReservadasEnFecha(Date fecha) {
        List<String> lista = new ArrayList<>();
        String sql = """
                    SELECT DISTINCT p.Titulo
                    FROM Reservas r
                    JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula
                    WHERE r.Fecha = ?
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, fecha);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("Titulo"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Clientes con múltiples reservas
    public Map<String, Integer> clientesConMultiplesReservas() {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        String sql = """
                    SELECT Nombre_Cliente, COUNT(*) AS total
                    FROM Reservas
                    GROUP BY Nombre_Cliente
                    HAVING COUNT(*) > 1
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                mapa.put(rs.getString("Nombre_Cliente"), rs.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mapa;
    }

    // Reservas por película específica
    public List<Reserva> obtenerReservasPorTitulo(String titulo) {
        List<Reserva> lista = new ArrayList<>();
        String sql = """
                    SELECT r.*
                    FROM Reservas r
                    JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula
                    WHERE p.Titulo = ?
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pelicula pelicula = PeliculaDAO.buscar(rs.getInt("ID_Pelicula"));
                Sala sala = SalaDAO.buscar(rs.getInt("ID_Sala"));

                Reserva r = new Reserva(
                        rs.getInt("ID_Reserva"),
                        pelicula,
                        sala,
                        rs.getDate("Fecha"),
                        rs.getTime("Hora"),
                        rs.getString("Nombre_Cliente"),
                        rs.getInt("Asientos_Reservados"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public String peliculaMasReservada() {
        String sql = """
                    SELECT p.Titulo
                    FROM Reservas r
                    JOIN Peliculas p ON r.ID_Pelicula = p.ID_Pelicula
                    GROUP BY p.Titulo
                    ORDER BY COUNT(*) DESC
                    LIMIT 1
                """;

        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next())
                return rs.getString("Titulo");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // No haya reservas duplicadas
    // private boolean reservaDuplicada(Reserva r) {
    //     String sql = """
    //                 SELECT COUNT(*) FROM Reservas
    //                 WHERE ID_Pelicula = ? AND ID_Sala = ? AND Fecha = ? AND Hora = ? AND Nombre_Cliente = ?
    //             """;

    //     try (Connection conn = ConexionBD.conectar();
    //             PreparedStatement stmt = conn.prepareStatement(sql)) {

    //         stmt.setInt(1, r.getPelicula().getId());
    //         stmt.setInt(2, r.getSala().getId());
    //         stmt.setDate(3, r.getFecha());
    //         stmt.setTime(4, r.getHora());
    //         stmt.setString(5, r.getNombreCliente());

    //         ResultSet rs = stmt.executeQuery();
    //         if (rs.next())
    //             return rs.getInt(1) > 0;

    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    //     return false;
    // }

    //muestra las horas ocupadas de una sala un dia
    public List<Time> obtenerHorasOcupadas(int idSala, Date fecha) {
        List<Time> horas = new ArrayList<>();
        String sql = "SELECT Hora FROM Reservas WHERE ID_Sala = ? AND Fecha = ?";
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idSala);
            stmt.setDate(2, fecha);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                horas.add(rs.getTime("Hora"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horas;
    }

}
