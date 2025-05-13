package BD.Cine.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
}
